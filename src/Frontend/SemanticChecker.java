package Frontend;

import Util.Position;
import Util.Scope.GlobalScope;
import Util.Scope.Scope;
import Util.error.SemanticError;
import ast.*;
import ast.Stmt.*;
import ast.expr.*;
import Util.Type.*;

public class SemanticChecker implements ASTVisitor {
    private Scope now;
    private GlobalScope all;

    SemanticChecker() {
        all = new GlobalScope(null);
        now = new Scope();
    }

    @Override
    public void visit(ASTNode it){}

    @Override
    public void visit(ProgramNode it) {

        it.def.accept(this);
        if(!all.containsfunc("main"))
            throw new SemanticError("Cannot find main function ",it.position);
    }

    @Override
    public void visit(defNode it){
        for(int i=0;i<it.Def.size();i++)
            it.Def.get(i).accept(this);
    }

    @Override
    public void visit(func_listNode it){
        now = new Scope(now,now.in_class,true);
        for(int i=0;i<it.type.size();i++){
            var t=it.type.get(i);
            if(t.getTypeId() == 4 || t.getTypeId() == 3 && !all.containsClass(t.getBaseType()))
                throw new SemanticError("Invalid type : ",it.position);
            now.put_def(t,it.var.get(i),it.position);
        }
    }

    @Override
    public void visit(funcDefNode it){
        if(now.in_func)
            throw new SemanticError("Cannot define function in function : ",it.position);
        //insert func
        var ad = new FuncType(it.position,it.name,it.ret);
        for(var v: it.list.type)ad.push(v);
        all.put_func(ad,it.name);

        it.list.accept(this);
        now.func_ret = it.ret;
        it.block.accept(this);
        now = now.parScope();

    }

    @Override
    public void visit(classDefNode it){
        if(now.in_class || now.in_func)
            throw new SemanticError("Cannot define class in class or function : ",it.position);

        if(it.fl==true)
            throw new SemanticError("Too many self-construction function : ",it.position);

        var c = new ClassType(it.position,it.name);
        now = new Scope(now,true,false);
        all = new GlobalScope(all);

        for(var f:it.func){
            var ad = new FuncType(f.position,f.name,f.ret);
            for(var v: f.list.type)ad.push(v);
            c.putFunc(ad,ad.name,f.position);

            all.put_func(ad,ad.name);
        }
        c.putFunc(new FuncType(it.position, it.name, c),it.name,it.position);

        for(var v:it.var)
            for(var u:v.assi){
                c.pushMem(v.typename, u.name,u.position);

                now.put_def(v.typename,u.name,u.position);
            }
        all.par.put_class(c,it.name,it.position);

        for(var f: it.func)f.accept(this);
        for(var v: it.var)v.accept(this);
        if(it.self != null)it.self.accept(this);

        now = now.parScope();
        all = all.par;
    }

    @Override
    public void visit(AssignNode it){
        //find and check Type
        if(!now.containsVar(it.name))
            throw new SemanticError("Cannot find variable " + it.name +" ", it.position);
        if(it.expr!=null)it.expr.accept(this);
        if(it.expr.type.getType()!=now.getTypeName(it.name))
            throw new SemanticError("Type mismatched ", it.position);
    }

    @Override
    public void visit(blockNode it){
        now = new Scope(now,now.in_class,now.in_func);
        for(int i=0;i<it.list.size();i++)
            it.list.get(i).accept(this);
        now = now.parScope();
    }

    @Override
    public void visit(breakNode it){
        //check loop
        if(now.loop_cnt == 0)
            throw new SemanticError("Break not in loop ",it.position);
    }


    @Override
    public void visit(continueNode it){
        //check loop
        if(now.loop_cnt == 0)
            throw new SemanticError("Continue not in loop ",it.position);
    }


    @Override
    public void visit(elseNode it){
        if(it.statement!=null) it.statement.accept(this);
    }

    @Override
    public void visit(forNode it){
        now = new Scope(now,now.in_class,now.in_func);


        if(it.init!=null)it.init.accept(this);

        if(it.init2!=null)it.init2.accept(this);

        if(it.check!=null) {
            it.check.accept(this);
            if(it.check.type.getType() != "bool")
                throw new SemanticError("Type mismatched " , it.check.position);
        }

        if(it.stp!=null)it.init.accept(this);

        now.loop_cnt ++;
        if(it.loop != null) it.loop.accept(this);
        now.loop_cnt --;

        now = now.parScope();
    }

    @Override
    public void visit(IfNode it){
        now = new Scope(now,now.in_class,now.in_func);

        it.condition.accept(this);
        if(it.condition.type.getType() != "bool")
            throw new SemanticError("Type mismatched " , it.condition.position);
        if(it.statement!=null) it.statement.accept(this);
        if(it.el!=null) it.el.accept(this);

        now=now.parScope();
    }

    @Override
    public void visit(lambdaNode it){
        now = new Scope(now,now.in_class,now.in_func);

        if(it.list!=null) it.list.accept(this);
        it.block.accept(this);
        if(it.arg!=null) {
            it.arg.accept(this);
            if(it.list == null || it.list.type.size()!=it.arg.list.size())
                throw new SemanticError("Lambda function arguments mismatched ",it.position);
            for(int i=0;i<it.list.type.size();i++)
                if(it.list.type.get(i).getType() != it.arg.list.get(i).type.getType())
                    throw new SemanticError("Type mismatched ",it.position);
        }

        now=now.parScope();
    }

    @Override
    public void visit(returnNode it){
        if(it.value!=null) {
            it.value.accept(this);
            if(it.value.type.getType() != now.func_ret.getType())
                throw new SemanticError("Return type mismatched ",it.position);
        }else {
            if(now.func_ret.getType()!="void")
                throw new SemanticError("Return type mismatched ",it.position);
        }
    }

    @Override
    public void visit(varDefNode it){
        for(var v:it.assi) {
            now.put_def(it.typename,v.name,v.position);
            v.accept(this);
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
            if( v.type.getType() != "int" )
                throw new SemanticError("Type mismatched ",it.position);
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
        if(it.lexp.type.getType() != it.rexp.type.getType())
            throw new SemanticError("Type mismatched ",it.position);
        if(!it.lexp.Assignable())
            throw new SemanticError("Type mismatched ",it.position);
        it.type = it.lexp.type;
    }

    @Override
    public void visit(binaryExpr it){
        it.lexp.accept(this);
        it.rexp.accept(this);
        if(it.lexp.type.getType() != it.rexp.type.getType())
            throw new SemanticError("Type mismatched ",it.position);
        boolean flag = false;
        String s = it.lexp.type.getType();
        switch(it.op) {
            case _int: flag = s=="int";
            case _int_string: flag = s=="int" || s=="string";
            case _all: flag = s=="int" || s=="string" || s=="bool";
            case _int_bool: flag = s=="int" || s=="bool";
            case _bool: flag = s=="bool";
        }
        if(!flag)
            throw new SemanticError("Type mismatched ",it.position);
        it.type = it.lexp.type;
    }

    @Override
    public void visit(constNode it){}

    @Override
    public void visit(exprNode it){}

    @Override
    public void visit(funcExpr it){
        it.list.accept(this);
        if(!all.containsfunc(it.name))
            throw new SemanticError("Cannot find function "+it.name+" ",it.position);
        FuncType x = all.getFunc(it.name);
        if(x.arg_list.size() != it.list.list.size())
            throw new SemanticError("Function type mismatched"+it.name+" ",it.position);
        for(int i=0;i<x.arg_list.size();i++)
            if(x.arg_list.get(i).getType() != it.list.list.get(i).type.getType())
                throw new SemanticError("Function type mismatched"+it.name+" ",it.position);
        it.type = x.ret;
    }

    @Override
    public void visit(memberExpr it){

    }

    @Override
    public void visit(selfExpr it) {
        it.son.accept(this);
        if(!it.son.Assignable())
            throw new SemanticError("Type mismatched",it.position);
        it.type = it.son.type;
    }

    @Override
    public void visit(varNode it){
        if(!now.containsVar(it.name))
            throw new SemanticError("Cannot find variables ",it.position);
        it.type = now.getType(it.name);
    }
}

