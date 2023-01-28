package Backend;

import IR.IRBlock;
import IR.IRFunc;
import IR.IRInst.*;
import IR.IRModule;
import IR.IRType.*;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRConst.*;
import IR.IRValue.IRGlobalVar;
import IR.IRValue.IRReg;
import Util.Scope.GlobalScope;
import Util.Scope.Scope;
import Util.Type.ArrayType;
import Util.Type.BaseType;
import Util.Type.ClassType;
import ast.ASTNode;
import ast.ASTVisitor;
import ast.ProgramNode;
import ast.Stmt.*;
import ast.expr.*;

import java.lang.reflect.Array;

public class IRbuilder implements ASTVisitor {
    public IRBlock curblock = null;
    public IRModule irModule = null;
    private Scope now;
    private GlobalScope globalScope;

    private IRFunc curFunc;
    public IRbuilder(GlobalScope g) {
        this.globalScope = g;
        irModule = new IRModule();
        now = new Scope(null,false,false);
    }

    public IRModule buildIR(ProgramNode rt) {
        visit(rt);
        return irModule;
    }

    private IRType TransType(BaseType type) {
        if(type instanceof ArrayType) {
            return new IRPtrType( TransType(( (ArrayType)type ).type) ,( (ArrayType)type ).sz - 1);
        } else if(type instanceof ClassType) {
            ClassType T = (ClassType) type;
            IRClassType bs = new IRClassType(T.name);
            for(int i=0;i<T.vars.size();i++) {
                bs.insert(T.vars_name.get(i),  TransType(T.vars.get(i)) );
            }
            return new IRPtrType( bs,0 );
        }else {
            switch (type.getType()) {
                case "int": return new IRIntType();
                case "bool": return new IRBoolType();
                case "void": return new IRVoidType();
                case "string": return new IRPtrType(new IRCharType(),1);
                default: return null;
            }
        }
    }

    private IRBasicValue LoadVal(IRBasicValue pointer) {
        IRReg reg = new IRReg(((IRPtrType)pointer.type).LoadTpye());
        curblock.push_back(new IRLoadInst(reg,pointer,reg.type));
        return reg;
    }

    public void visit(ProgramNode it){
        it.def.accept(this);
    }

    public void visit(AssignNode it){
        //String name,expr Node
        if(!now.in_class && !now.in_func) {// global var
//            IRGlobalVar val = new IRGlobalVar(it.name,TransType(now.getType(it.name)));
//            irModule.GlobalVar.add(val);
//            it.val = val;
        }else if(now.in_class) {//class var
        }else {
            IRReg PtrReg = new IRReg(new IRPtrType(TransType(now.getType(it.name)),0));
            curblock.push_back(new IRAllocaInst(PtrReg) );
            IRBasicValue val = null;
            if(it.expr != null) {
                it.expr.accept(this);
                it.val = it.expr.val;

                curblock.push_back(new IRStoreInst(it.expr.val,PtrReg,it.expr.val.type));
            }else it.val = null;

            it.Ptr = PtrReg;

            now.put_def_ir(PtrReg,it.name);
        }

    }

    public void visit(blockNode it){
        now = new Scope(now,now.in_class,now.in_func);
        for(var v:it.list) {
            v.accept(this);
        }
        now = now.parScope();
    }

    public void visit(breakNode it){}

    public void visit(classDefNode it){}

    public void visit(continueNode it){}

    public void visit(defNode it){
        for(var v: it.Def) v.accept(this);
    }

    public void visit(elseNode it){}

    public void visit(forNode it){}

    public void visit(func_listNode it){
        now = new Scope(now,now.in_class,true);
        for(int i = 0;i < it.type.size();i++) {
            var type = it.type.get(i);
            var name = it.var.get(i);
            IRType irType = TransType(type);
            IRReg PtrReg = new IRReg(new IRPtrType(irType,0));
            curblock.push_back(new IRAllocaInst(PtrReg) );
            curblock.push_back(new IRStoreInst(curFunc.arg_list.get(i),PtrReg,irType));
            now.put_def_ir(PtrReg,name);
        }
    }

    public void visit(funcDefNode it){
        curFunc = new IRFunc(it.name,TransType(it.ret));
        curblock = new IRBlock();
        curFunc.push_back(curblock);

        for(var v:it.list.type)
            curFunc.arg_list.add( new IRReg(TransType(v)) );

        it.list.accept(this);
        curFunc.RetType = TransType(it.ret);

        it.block.accept(this);

        now = now.parScope();
    }

    public void visit(IfNode it){}

    public void visit(returnNode it){
        if(it.value != null) it.value.accept(this);
        curblock.push_back(new IRRetInst(it.value == null? new IRConst(new IRVoidType()) :it.value.val));
    }

    public void visit(varDefNode it){

    }

    public void visit(whileNode it){}

    public void visit(ExprStmtNode it){
        it.expr.accept(this);
    }

    public void visit(arg_list it){}

    public void visit(arrayExpr it){}

    public void visit(assignExpr it){
        it.lexp.accept(this);
        it.rexp.accept(this);
        it.val = it.rexp.val;

        curblock.push_back( new IRStoreInst(it.rexp.val,it.lexp.Ptr,it.rexp.val.type) );

        it.Ptr = it.lexp.Ptr;
    }

    public void visit(binaryExpr it){
        it.lexp.accept(this);
        it.rexp.accept(this);
        if(it.lexp.type == null || it.rexp == null) {//have null
            return;
        }
        if(it.lexp.type.getType().equals("string")) {//string use call
            return;
        }
        it.val = new IRReg(TransType(it.lexp.type));
        if(it.opstr.equals("sgt") || it.opstr.equals("sge") || it.opstr.equals("sle")
        || it.opstr.equals("slt") || it.opstr.equals("eq") || it.opstr.equals("ne") ) {
            curblock.push_back(new IRCompareInst(it.lexp.val,it.rexp.val,it.val,it.opstr));
        }else {
            curblock.push_back(new IRCalcInst(it.lexp.val,it.rexp.val,it.val,it.opstr));
        }
    }

    public void visit(constNode it){
        if(it.isThis) {// this.

        }else if(it.isNull) {// null
            it.val = new IRNullConst(new IRVoidType());
        }else if(it.wh > 0) {
            IRBasicValue val = null;
            switch (it.wh) {
                case 1: val = new IRIntConst(it.num,new IRIntType());
                case 2: val = new IRStringConst(it.str,new IRPtrType(new IRCharType(), 1));
                default: val = new IRBoolConst(it.flg,new IRBoolType());
            }
            it.val = val;
        }else {//new int[12][][]()....

        }
    }

    public void visit(funcExpr it){}

    public void visit(memberExpr it){}

    public void visit(selfExpr it){
        IRReg rd = new IRReg(it.son.val.type);
        curblock.push_back(new IRSelfInst(it.son.val,rd,it.opstr));
        if(!it.Pre) {
            it.val = it.son.val;
            curblock.push_back(new IRStoreInst(rd,it.son.Ptr,rd.type));
            it.Ptr = null;
        }else if(it.opstr.equals("PlusPlus") || it.opstr.equals("MinusMinus")){
            it.Ptr = it.son.Ptr;
            curblock.push_back(new IRStoreInst(rd,it.Ptr,rd.type));
            it.val = rd;
        }else {
            it.Ptr = null;
            it.val = rd;
        }
    }

    public void visit(varNode it){
        it.Ptr = now.get_Addr(it.name);
        it.val = LoadVal(it.Ptr);
        it.type = now.getType(it.name);
    }

    public void visit(typeIDNode it){}

    public void visit(typenameNode it){}

    public void visit(lambdaNode it){}

    public void visit(exprNode it){}

}
