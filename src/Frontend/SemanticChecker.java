package Frontend;

import Util.Scope.GlobalScope;
import Util.Scope.Scope;
import Util.error.SemanticError;
import ast.*;
import ast.Stmt.*;
import ast.expr.*;
import Util.Type.*;

import java.util.ArrayList;
import java.util.Stack;

public class SemanticChecker implements ASTVisitor {
    private Scope now;
    private GlobalScope all;


    private int in_lambda;
    private Stack<BaseType> stk= new Stack<>();

    public SemanticChecker() {
        this.all = new GlobalScope(null);
        this.now = new Scope();
        this.in_lambda = 0;
    }

    public SemanticChecker(GlobalScope all_) {
        this.all = all_;
        this.now = new Scope();
        this.in_lambda = 0;
    }

    //    @Override
//    public void visit(ASTNode it){}
    @Override
    public void visit(typeIDNode it) {
    }

    @Override
    public void visit(typenameNode it) {
    }

    @Override
    public void visit(ProgramNode it) {

        it.def.accept(this);

    }

    @Override
    public void visit(defNode it) {
        for (int i = 0; i < it.Def.size(); i++)
            it.Def.get(i).accept(this);
    }

    @Override
    public void visit(func_listNode it) {
        now = new Scope(now, now.in_class, true);
        for (int i = 0; i < it.type.size(); i++) {
            var t = it.type.get(i);
            if (t.getTypeId() == 4 || t.getTypeId() == 3 && !all.containsClass(t.getBaseType()))
                throw new SemanticError("Invalid type : ", it.position);
            now.put_def(t, it.var.get(i), it.position);
        }
    }

    @Override
    public void visit(funcDefNode it) {
        if (now.in_func)
            throw new SemanticError("Cannot define function in function : ", it.position);
        //insert func
        if(all.containsClass(it.name)) {
            if(now.in_class&&now.in_class_def.getType().equals(it.name));
            else throw new SemanticError("Function shares the same name with class: " + it.name, it.position);
        }

        var ad = new FuncType(it.position, it.name, it.ret);
        for (var v : it.list.type) ad.push(v);

//        if(!now.in_class) all.put_func(ad,it.name);

        it.list.accept(this);
        now.func_ret = it.ret;
        if (it.ret.getTypeId() == 3 && !all.containsClass(it.ret.getBaseType()))
            throw new SemanticError("Class " + it.ret.getBaseType() + " doesn't exist : ", it.position);

        it.block.accept(this);
        now = now.parScope();
    }

    @Override
    public void visit(classDefNode it) {
        if (now.in_class || now.in_func)
            throw new SemanticError("Cannot define class in class or function : ", it.position);

        if (it.fl == true)
            throw new SemanticError("Self-construction function error: ", it.position);

        var c = new ClassType(it.position, it.name);

        if(all.containsfunc(it.name) || now.containsVar(it.name))
            throw new SemanticError("Class shares the same name with function or variable", it.position);

        now = new Scope(now, true, false);

        all = new GlobalScope(all);
        for (var f : it.func) {
            var ad = new FuncType(f.position, f.name, f.ret);
            for (var v : f.list.type) ad.push(v);
            c.putFunc(ad, ad.name, f.position);

            all.put_func(ad, ad.name);
        }
        if(it.self!=null) c.putFunc(new FuncType(it.position, it.name, c), it.name, it.position);


        for (var v : it.var)
            for (var u : v.assi) {
                c.pushMem(v.typename, u.name, u.position);

                now.put_def(v.typename, u.name, u.position);
            }
//        all.par.put_class(c,it.name,it.position);
        now.in_class_def = c;

        for (var f : it.func) f.accept(this);
        for (var v : it.var) v.accept(this);
        if (it.self != null) it.self.accept(this);

        now = now.parScope();
        all = all.par;
    }

    @Override
    public void visit(ExprStmtNode it) {
        it.expr.accept(this);
    }

//    @Override
    public void visit(AssignNode it) {
//        //find and check Type
//        if (!now.containsVar(it.name))
//            throw new SemanticError("Cannot find variable " + it.name + " ", it.position);
//
//        if (it.expr != null) {
//            it.expr.accept(this);
//            if (it.expr.type != null && !it.expr.type.getType().equals(now.getTypeName(it.name)))
//                throw new SemanticError("Type mismatched in AssignNode", it.position);
//        }
    }

    @Override
    public void visit(blockNode it) {
        now = new Scope(now, now.in_class, now.in_func);
        for (int i = 0; i < it.list.size(); i++)
            it.list.get(i).accept(this);
        now = now.parScope();
    }

    @Override
    public void visit(breakNode it) {
        //check loop
        if (now.loop_cnt == 0)
            throw new SemanticError("Break not in loop ", it.position);
    }


    @Override
    public void visit(continueNode it) {
        //check loop
        if (now.loop_cnt == 0)
            throw new SemanticError("Continue not in loop ", it.position);
    }


    @Override
    public void visit(elseNode it) {
        now = new Scope(now, now.in_class, now.in_func);
        if (it.statement != null) it.statement.accept(this);
        now = now.parScope();
    }

    @Override
    public void visit(forNode it) {
        now = new Scope(now, now.in_class, now.in_func);


        if (it.init != null) it.init.accept(this);

        if (it.init2 != null) it.init2.accept(this);

        if (it.check != null) {
            it.check.accept(this);
            if (it.check.type == null || !it.check.type.getType().equals("bool"))
                throw new SemanticError("Type mismatched in forNode", it.check.position);
        }

        if (it.stp != null) it.stp.accept(this);

        now.loop_cnt++;
        if (it.loop != null) it.loop.accept(this);
        now.loop_cnt--;

        now = now.parScope();
    }

    @Override
    public void visit(IfNode it) {
        now = new Scope(now, now.in_class, now.in_func);

        it.condition.accept(this);
        if (it.condition.type == null || !it.condition.type.getType().equals("bool"))
            throw new SemanticError("Type mismatched in IfNode", it.condition.position);
        if (it.statement != null) it.statement.accept(this);
        if (it.el != null) it.el.accept(this);

        now = now.parScope();
    }

    @Override
    public void visit(lambdaNode it) {
        GlobalScope last_all = all;
        Scope last_now = now;
        ArrayList<BaseType> vec = new ArrayList<>();

        it.arg.accept(this);
        for(int i=0;i<it.arg.list.size();i++)
            vec.add(it.arg.list.get(i).type);
        if (it.flg) {
            now = new Scope(last_all.Var,now.in_class,true);
            now.loop_cnt = last_now.loop_cnt;
            now.func_ret = last_now.func_ret;
            now.in_class_def = last_now.in_class_def;
            all = new GlobalScope(all);
        }else {
            all = new GlobalScope(null);
            now = new Scope(null,last_now.in_class,true);
        }

        if(it.list != null) {
            it.list.accept(this);
            if (it.list.type.size() != vec.size())
                throw new SemanticError("Lambda function arguments mismatched ", it.position);
            for (int i = 0; i < it.list.type.size(); i++) {
                if (vec.get(i) == null) continue;
                if (!it.list.type.get(i).getType().equals(vec.get(i).getType()))
                    throw new SemanticError("Type mismatched in lambdaNode", it.position);
            }
        }else if(vec.size()>0)
            throw new SemanticError("Type mismatched in lambdaNode", it.position);

        in_lambda++;
        int l = stk.size();
        it.block.accept(this);
        if(it.list != null)now=now.parScope();
        if(l==stk.size()) {
            it.type = new BaseType(4);
        }else {
            it.type = stk.peek();
            for(int i=stk.size()-l;i > 0;i--) {
                if(!it.type.getType().equals(stk.peek().getType()))
                    throw new SemanticError("Lambda return type error",it.position);
                stk.pop();
            }
        }
        in_lambda--;

        all = last_all;
        now = last_now;
    }

    @Override
    public void visit(returnNode it){
        if(it.value != null)it.value.accept(this);
        if(in_lambda > 0) {
            if(it.value == null)stk.push(new BaseType(4));
            else stk.push(it.value.type);
        }else {
            if (it.value != null) {
                if (it.value.type != null && !it.value.type.getType().equals(now.func_ret.getType()))
                    throw new SemanticError("Return type mismatched ", it.position);
            } else {
                if (!now.func_ret.getType().equals("void"))
                    throw new SemanticError("Return type mismatched ", it.position);
            }
        }
    }

    @Override
    public void visit(varDefNode it){
        if(it.typename.getBaseType().equals("void"))
            throw new SemanticError("Variable cannot be void ",it.position);
        for(var v:it.assi) {
            if(v.expr!=null) {
                v.expr.accept(this);
                if(v.expr.type==null && it.typename.Primitive())
                    throw new SemanticError("Null cannot be assigned to primitive type variable", it.position);
                if(v.expr.type!=null && !v.expr.type.getType().equals(it.typename.getType()))
                    throw new SemanticError("Type mismatched in varDef", it.position);
            }

//            v.accept(this);
            if(now.in_class && !now.in_func);
            else now.put_def(it.typename,v.name,v.position);

            if(!now.in_class && !now.in_func) all.Var.put_def(it.typename,v.name,v.position);

            if(all.containsClass(v.name))
                throw new SemanticError("Variable shares the same name with class " + v.name, it.position);
        }
    }

    @Override
    public void visit(whileNode it){
        now = new Scope(now,now.in_class,now.in_func);

        it.check.accept(this);
        now.loop_cnt++;
        if(it.loop != null)it.loop.accept(this);
        now.loop_cnt--;

        now=now.parScope();
    }

    @Override
    public void visit(arg_list it){
        for(var v: it.list)v.accept(this);
    }

    @Override
    public void visit(arrayExpr it){
        it.rt.accept(this);
        for(var v: it.list){
            v.accept(this);
            if(v.type==null || !v.type.getType().equals("int"))
                throw new SemanticError("Type mismatched in arrayExpr",it.position);
        }
        String s = it.rt.type.getType();
        boolean flag = false;
        int sz=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == ']') flag = true;
            else if(flag) sz=sz*10+c-'0';
        }
        if(flag == false || sz<it.list.size())
            throw new SemanticError("Array type mismatched ",it.position);
        else {
            if(sz == it.list.size()) it.type = it.rt.type.ArrayAtom();
            else it.type = new ArrayType(it.rt.type.ArrayAtom(),sz - it.list.size());
        }
    }

    @Override
    public void visit(assignExpr it){
        it.lexp.accept(this);
        it.rexp.accept(this);
        if(!it.lexp.Assignable())
            throw new SemanticError("Type mismatched in assignExpr",it.position);

        if(it.rexp.type==null && it.lexp.type.Primitive())
            throw new SemanticError("Null cannot be assigned to primitive type variable",it.position);

        if(it.rexp.type!=null && !it.lexp.type.getType().equals(it.rexp.type.getType()))
            throw new SemanticError("Type mismatched in assignExpr",it.position);
        it.type = it.lexp.type;
    }

    @Override
    public void visit(binaryExpr it){
        it.lexp.accept(this);
        it.rexp.accept(this);
        if(it.lexp.type == null || it.rexp.type == null) {
            switch (it.op) {
                case _all: break;
                default: throw new SemanticError("Null can only exist in == and != ",it.position);
            }
            it.type = new BaseType(1);
            return;
        }
        if(!it.lexp.type.getType().equals(it.rexp.type.getType()))
            throw new SemanticError("Type mismatched in binaryExpr1",it.position);
        if(it.lexp.type instanceof ArrayType)
            throw new SemanticError("Array type mismatched in binaryExpr2",it.position);

        boolean flag = false;
        String s = it.lexp.type.getType();
        BaseType t = it.lexp.type;
        switch(it.op) {
            case _int: flag = s.equals("int");break;
            case _int_string:
                flag = s.equals("int") || s.equals("string");
                if(it.bl_int_string) t = new BaseType(1);
            break;
//            case _all: flag = s.equals("int") || s.equals("bool") || s.equals("string"); t = new BaseType(1);break;
            case _all: t = new BaseType(1); flag = true; break;
            case _int_bool: flag = s.equals("int") || s.equals("bool");break;
            case _bool: flag = s.equals("bool");break;
        }
        if(!flag)
            throw new SemanticError("Type mismatched in binaryExpr3",it.position);
        it.type = t;
    }

    @Override
    public void visit(constNode it) {
        if(it.isThis) {
            if(!now.in_class)
                throw new SemanticError("This can only be used in class ",it.position);
            it.type = now.in_class_def;
        }else if(it.isNull)it.type = null;
        else {
            if(it.type.getBaseType().equals("void"))
                throw new SemanticError("New expression cannot apply to void ",it.position);
            boolean flg=it.type instanceof ArrayType;
            BaseType bs;

            if(it.type.getTypeId() != 3) bs = new BaseType(it.type.getTypeId());
            else {
                if(!all.containsClass( it.type.getBaseType() ))
                    throw new SemanticError("Cannot find the class "+it.type.getBaseType(),it.position);
                bs = all.getClass( it.type.getBaseType() );
            }

            if(flg) bs = new ArrayType(bs,((ArrayType) it.type).sz);
            it.type = bs;
        }
        for(var v : it.expr) {
            v.accept(this);
            if(v.type.getTypeId() != 0)
                throw new SemanticError("Array size must be int ",it.position);
        }
    }

    @Override
    public void visit(exprNode it){}

    @Override
    public void visit(funcExpr it){
        it.list.accept(this);
        if(!all.containsfunc(it.name))
            throw new SemanticError("Cannot find function "+it.name+" ",it.position);
        FuncType x = all.getFunc(it.name);
        ArrayList<BaseType> hv = new ArrayList<>();
        for(var v:it.list.list)hv.add(v.type);
        x.check(hv);
        it.type = x.ret;
    }

    @Override
    public void visit(memberExpr it){
        it.rt.accept(this);

        if(it.list!=null) it.list.accept(this);
        if(it.rt.type instanceof ArrayType && ((ArrayType)it.rt.type).sz > 0){
            if(it.name.equals("size") && it.list!=null && it.list.list.size()==0 ){
                it.type = new BaseType(0);
                return;
            }
            throw new SemanticError("Array member function error ",it.position);
        }
        if(it.rt.type.getType().equals("string")){
            if(it.list==null)throw new SemanticError("String member function error ",it.position);
            int sz=0;
            for(var v:it.list.list)
                if(!v.type.getType().equals("int"))
                    throw new SemanticError("String member function error ",it.position);
                else sz++;
            if((it.name.equals("parseInt") || it.name.equals("length")) && sz==0 ){
                it.type = new BaseType(0);
                return;
            }
            if(it.name.equals("ord") && sz==1 ){
                it.type = new BaseType(0);
                return;
            }
            if(it.name.equals("substring") && sz==2){
                it.type = new BaseType(2);
                return;
            }
            throw new SemanticError("String member function error ",it.position);
        }
        if( !all.containsClass( it.rt.type.getType() ) )
            throw new SemanticError(" No class type "+it.rt.type.getType()+" ",it.position);
        ClassType now = all.getClass( it.rt.type.getType() );
        if(it.list == null) {
            it.type = now.getMem(it.name,it.position);
        }else {
            it.list.accept(this);
            ArrayList<BaseType> hv = new ArrayList<>();
            for(var v:it.list.list) hv.add(v.type);
            it.type = now.check_func(hv,it.name,it.position);
        }
    }

    @Override
    public void visit(selfExpr it) {
        it.son.accept(this);
        if(it.modi && !it.son.Assignable())
            throw new SemanticError("Type mismatched in selfExpr",it.position);

        if(!it.op.getType().equals( it.son.type.getType())) {
            if(it.op.getType().equals("bool")&&it.son.type.getType().equals("int"));
            else throw new SemanticError("Type mismatched in selfExpr", it.position);
        }

        it.type = it.son.type;
    }

    @Override
    public void visit(varNode it){

        if(!now.containsVar(it.name))
            throw new SemanticError("Cannot find variables ",it.position);
        it.type = now.getType(it.name);
    }
}