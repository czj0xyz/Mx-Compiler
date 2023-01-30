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
import Util.Type.FuncType;
import ast.ASTNode;
import ast.ASTVisitor;
import ast.ProgramNode;
import ast.Stmt.*;
import ast.expr.*;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class IRbuilder implements ASTVisitor {
    public IRBlock curblock = null;
    public IRModule irModule = null;
    private Scope now;
    private GlobalScope all;

    private Stack<IRBlock> IRLoopContinue = new Stack<>();
    private Stack<IRBlock> IRLoopBreak = new Stack<>();


    private IRFunc curFunc;
    public IRbuilder(GlobalScope g) {
        this.all = g;
        irModule = new IRModule();
        now = new Scope(null,false,false);
    }

    private HashMap<String, IRClassType> AST_IR_map = new HashMap<>();

    public IRModule buildIR(ProgramNode rt) {
        visit(rt);
        return irModule;
    }

    private IRType TransType(BaseType type) {
        if(type instanceof ArrayType) {
            return new IRPtrType( TransType(( (ArrayType)type ).type) ,( (ArrayType)type ).sz - 1);
        } else if(type instanceof ClassType) {
            ClassType T = (ClassType) type;
            if(!AST_IR_map.containsKey(T.name)){
                IRClassType bs = new IRClassType(T.name);
                for (int i = 0; i < T.vars.size(); i++) {
                    bs.insert(T.vars_name.get(i), TransType(T.vars.get(i)));
                }
                bs.builtin = (all.getClass(T.name)).hv_func(T.name);
                AST_IR_map.put(T.name,bs);
            }
            return new IRPtrType( AST_IR_map.get(T.name) ,0 );
        }else {
            switch (type.getType()) {
                case "int": return new IRIntType();
                case "bool": return new IRBoolType();
                case "void": return new IRVoidType();
                case "string": return new IRPtrType(new IRCharType(),0);
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
            var irType = TransType(now.getType(it.name));
            IRGlobalVar val = new IRGlobalVar(it.name, new IRPtrType(irType,0) );
            if(irType instanceof IRBoolType )
                val.init_val = new IRBoolConst(false,irType);
            else if(irType instanceof IRIntType)
                val.init_val = new IRIntConst(0,irType);
            else val.init_val = new IRNullConst(irType);

            irModule.GlobalVar.add(val);

            if(it.expr != null) {
                curblock = irModule.qblock();
                it.expr.accept(this);
                curblock.push_back( new IRStoreInst(it.expr.val,val,val.type) );
            }

            now.put_def_ir(val,it.name);
        }else if(now.in_class && !now.in_func) {//class var
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

    public void visit(breakNode it){
        curblock.terminalInst = new IRJumpInst( IRLoopBreak.peek() );
        curblock.hv_ret = true;
    }

    private IRPtrType curClass;
    private IRReg ThisReg;
    public void visit(classDefNode it){
        now = new Scope(now,true,false);
        all = new GlobalScope(all);

        all = new GlobalScope(all);
        for (var f : it.func) {
            var ad = new FuncType(f.position, f.name, f.ret);
            for (var v : f.list.type) ad.push(v);

            all.put_func(ad, ad.name);
        }

        for (var v : it.var)
            for (var u : v.assi)
                now.put_def(v.typename, u.name, u.position);

        now.in_class_def = all.getClass(it.name);
        curClass = new IRPtrType(TransType( all.getClass(it.name) ),0);
        irModule.ClassList.add(AST_IR_map.get(it.name));

        for(var f:it.func) f.accept(this);
//        for (var v : it.var) v.accept(this);
        if (it.self != null) it.self.accept(this);

        all = all.par;
        now = now.parScope();
    }

    public void visit(continueNode it){
        curblock.terminalInst = new IRJumpInst( IRLoopContinue.peek() );
        curblock.hv_ret = true;
    }

    public void visit(defNode it){
        for(var v: it.Def) v.accept(this);
    }

    public void visit(elseNode it){
        now = new Scope(now, now.in_class, now.in_func);
        if(it.statement!=null) it.statement.accept(this);
        now = now.parScope();
    }

    public void visit(forNode it){
        now = new Scope(now, now.in_class, now.in_func);
        IRBlock ForCheck = new IRBlock("for_check"), ForStep = new IRBlock("for_step");
        IRBlock ForBlock = new IRBlock("for_block"), ForDest = new IRBlock("for_dest");
        IRBlock lastblock = curblock;

        curFunc.push_back(ForCheck);
        curFunc.push_back(ForBlock);
        curFunc.push_back(ForDest);
        curFunc.push_back(ForStep);

        if(it.init != null) {
            it.init.accept(this);
        }
        if(it.init2 != null) {
            it.init2.accept(this);
        }

        if(it.check != null) {
            curblock = ForCheck;
            it.check.accept(this);
            assert !ForCheck.hv_ret;
            ForCheck.terminalInst = new IRBranchInst(it.check.val,ForBlock,ForDest);
            ForCheck.hv_ret = true;
        } else {
            ForCheck.terminalInst = new IRJumpInst(ForBlock);
            ForCheck.hv_ret = true;
        }

        now.loop_cnt ++;
        IRLoopContinue.push(ForStep);
        IRLoopBreak.push(ForDest);

        curblock = ForBlock;
        ForBlock.terminalInst = new IRJumpInst(ForStep);
        if(it.loop != null) it.loop.accept(this);

        IRLoopBreak.pop();
        IRLoopContinue.pop();
        now.loop_cnt --;

        curblock = ForStep;
        if(it.stp != null) it.stp.accept(this);
        ForStep.terminalInst = new IRJumpInst(ForCheck);

        ForDest.terminalInst = lastblock.terminalInst;
        lastblock.terminalInst = new IRJumpInst(ForCheck);

        curblock = ForDest;
        now = now.parScope();
    }

    public void visit(func_listNode it){
        now = new Scope(now,now.in_class,true);
        int tmp_ad = now.in_class ? 1 : 0;
        if(now.in_class) {
            ThisReg = new IRReg(new IRPtrType(curClass,0));
            curblock.push_back(new IRAllocaInst(ThisReg));
            curblock.push_back(new IRStoreInst(curFunc.arg_list.get(0), ThisReg, curClass));
        }
        for(int i = 0;i < it.type.size();i++) {
            var type = it.type.get(i);
            var name = it.var.get(i);
            IRType irType = TransType(type);
            IRReg PtrReg = new IRReg(new IRPtrType(irType,0));
            curblock.push_back(new IRAllocaInst(PtrReg) );
            curblock.push_back(new IRStoreInst(curFunc.arg_list.get(i + tmp_ad),PtrReg,irType));
            now.put_def_ir(PtrReg,name);
            now.put_def(type, it.var.get(i), it.position);
        }
    }

    public void visit(funcDefNode it){
        if(now.in_class) curFunc = new IRFunc( now.in_class_def.name+'.'+it.name , TransType(it.ret));
        else curFunc = new IRFunc(it.name,TransType(it.ret));

        curFunc.RetBlock = new IRBlock("return");
        if(curFunc.RetType instanceof IRVoidType) {
            curFunc.RetBlock.terminalInst = new IRRetInst(new IRConst(new IRVoidType()));
        }else {
            curFunc.retVal = new IRReg( new IRPtrType(curFunc.RetType,0) );
            IRReg retReg = new IRReg(curFunc.RetType );
            curFunc.RetBlock.push_back(new IRLoadInst(retReg, curFunc.retVal, curFunc.RetType));
            curFunc.RetBlock.terminalInst = new IRRetInst(retReg);
        }


        curblock = new IRBlock("entry");
        curFunc.push_back(curblock);
        curblock.terminalInst = new IRJumpInst(curFunc.RetBlock);
        if(!(curFunc.RetType instanceof IRVoidType)) {
            curblock.push_back(new IRAllocaInst(curFunc.retVal));
        }

        if(curFunc.name.equals("main")) {
            irModule.MainFn = curFunc;
            curblock.push_back(new IRCallInst("__init_for_global_variables",new IRVoidType(),null));
        }
        irModule.Func.add(curFunc);

        if(now.in_class) curFunc.arg_list.add( new IRReg(curClass) );
        for(var v:it.list.type)
            curFunc.arg_list.add( new IRReg(TransType(v)) );
        it.list.accept(this);

        it.block.accept(this);

        now = now.parScope();
    }

    public void visit(IfNode it){
        now = new Scope(now, now.in_class, now.in_func) ;
        it.condition.accept(this);
        IRBlock lastblock = curblock;

        IRBlock DestBlock = new IRBlock("if_end"), TrueBlock = new IRBlock("if_true"), FalseBlock = null;

        TrueBlock.terminalInst = new IRJumpInst(DestBlock);
        if(it.statement != null) {
            curblock = TrueBlock;
            it.statement.accept(this);
        }
        curFunc.push_back(TrueBlock);

        if(it.el != null) {
            FalseBlock = new IRBlock("if_false");
            curblock = FalseBlock;
            FalseBlock.terminalInst = new IRJumpInst(DestBlock);
            it.el.accept(this);
            curFunc.push_back(FalseBlock);
        }

        DestBlock.terminalInst = lastblock.terminalInst;
        IRBranchInst bra = new IRBranchInst(it.condition.val);
        if(it.el != null) {
            bra.Tblock = TrueBlock;
            bra.Fblock = FalseBlock;
        }else {
            bra.Tblock = TrueBlock;
            bra.Fblock = DestBlock;
        }
        lastblock.terminalInst = bra;
        curblock = DestBlock;

        curFunc.push_back(curblock);

        now = now.parScope();
    }

    public void visit(returnNode it){
        if(it.value != null) {
            it.value.accept(this);
            it.val = it.value.val;
            curblock.push_back(new IRStoreInst(it.val,curFunc.retVal,it.val.type));
        }
        curblock.terminalInst = (new IRJumpInst(curFunc.RetBlock));
        curblock.hv_ret = true;
    }

    public void visit(varDefNode it){
        for(var v:it.assi) {
//            if(!now.in_class && !now.in_func) all.Var.put_def(it.typename,v.name,v.position);
            if(now.in_class && !now.in_func);
            else now.put_def(it.typename,v.name,v.position);
        }
        for(var v:it.assi) {
            v.accept(this);
        }
    }

    public void visit(whileNode it){
        now = new Scope(now,now.in_class,now.in_func);

        IRBlock WhileCheck = new IRBlock("while_check");
        IRBlock WhileBlock = new IRBlock("while_block");
        IRBlock WhileDest = new IRBlock("while_dest");
        IRBlock lastblock = curblock;

        curFunc.push_back(WhileCheck);
        curFunc.push_back(WhileBlock);
        curFunc.push_back(WhileDest);

        curblock = WhileCheck;
        it.check.accept(this);
        WhileCheck.terminalInst = new IRBranchInst(it.check.val, WhileBlock, WhileDest);

        now.loop_cnt++;
        IRLoopBreak.push(WhileDest);
        IRLoopContinue.push(WhileCheck);

        curblock = WhileBlock;
        WhileBlock.terminalInst = new IRJumpInst(WhileCheck);
        if(it.loop != null) it.loop.accept(this);

        IRLoopContinue.pop();
        IRLoopBreak.pop();
        now.loop_cnt--;

        WhileDest.terminalInst = lastblock.terminalInst;
        lastblock.terminalInst = new IRJumpInst(WhileCheck);

        curblock = WhileDest;
        now = now.parScope();
    }

    public void visit(ExprStmtNode it){
        it.expr.accept(this);
    }

    public void visit(arg_list it){
        for(var v:it.list) v.accept(this);
    }

    public void visit(arrayExpr it){

    }

    public void visit(assignExpr it){
        it.lexp.accept(this);
        it.rexp.accept(this);
        it.val = it.rexp.val;

        curblock.push_back( new IRStoreInst(it.rexp.val,it.lexp.Ptr,it.rexp.val.type) );

        it.Ptr = it.lexp.Ptr;

        it.type = it.lexp.type;
    }

    public void visit(binaryExpr it){
        it.lexp.accept(this);
        it.rexp.accept(this);
        if(it.lexp.type == null || it.rexp == null) {//have null ??
            it.val = new IRReg(new IRBoolType());
            curblock.push_back(new IRCompareInst(it.lexp.val,it.rexp.val,it.val,it.opstr));
            it.type = new BaseType(1);
            return;
        }
        boolean flg = it.opstr.equals("sgt") || it.opstr.equals("sge") || it.opstr.equals("sle")
                || it.opstr.equals("slt") || it.opstr.equals("eq") || it.opstr.equals("ne");
        if(it.lexp.type.getType().equals("string")) {//string use call
            var call = new IRCallInst("__str_"+it.opstr,null,null);
            if(!flg) {//add
                call.retType = new IRPtrType(new IRCharType(),0);
                IRReg ret = new IRReg( new IRPtrType(new IRCharType(),0) );
                call.rd = ret;
                curblock.push_back(call);
                it.val = ret;
                it.type = new BaseType(2);
            }else {
                call.retType = new IRCharType();
                IRReg res = new IRReg(new IRCharType()) , ret = new IRReg(new IRBoolType());
                call.rd = res;
                curblock.push_back(call);
                curblock.push_back( new IRTruncInst(new IRBoolType(),res,ret) );
                it.val = ret;
                it.type = new BaseType(1);
            }
            call.arg_list.add(it.lexp.val);
            call.arg_list.add(it.rexp.val);
            return;
        }
        if( flg ) {
            it.val = new IRReg(new IRBoolType());
            curblock.push_back(new IRCompareInst(it.lexp.val,it.rexp.val,it.val,it.opstr));
            it.type = new BaseType(1);
        }else {
            it.val = new IRReg(TransType(it.lexp.type));
            curblock.push_back(new IRCalcInst(it.lexp.val,it.rexp.val,it.val,it.opstr));
            it.type = it.lexp.type;
        }
    }

    public void visit(constNode it){
        if(it.isThis) {// this.
            it.Ptr = ThisReg;
            it.val = LoadVal(ThisReg);
        }else if(it.isNull) {// null
            it.val = new IRNullConst(new IRVoidType());
        }else if(it.wh > 0) {
            IRBasicValue val = null;
            switch (it.wh) {
                case 1: val = new IRIntConst(it.num,new IRIntType()); break;
                case 2: val = new IRStringConst(it.str.substring(1,it.str.length() - 1),new IRPtrType(new IRArrayType(new IRCharType(),it.str.length() - 1),0)); break;
                default: val = new IRBoolConst(it.flg,new IRBoolType()); break;
            }
            it.val = val;
            if(it.wh == 2) {
                irModule.addStringConst((IRStringConst) val);
                var reg = new IRReg(new IRPtrType(new IRCharType(),0));
                IRGEPInst inst = new IRGEPInst(reg,((IRPtrType)val.type).LoadTpye(),val);
                inst.index.add(new IRIntConst(0,new IRIntType()));
                inst.index.add(new IRIntConst(0,new IRIntType()));
                curblock.push_back(inst);
                it.val = reg;
            }
        }else {//new int[12][][]()....
            if(it.type instanceof ArrayType) {
                for(var v:it.expr) v.accept(this);

            }else {
                IRType irType = TransType( all.getClass(it.type.getBaseType()) );
                IRClassType curC =(IRClassType) ((IRPtrType)irType).LoadTpye();
                IRType irStringType = new IRPtrType(new IRCharType(),0);
                IRReg rd = new IRReg(irStringType);

                IRCallInst inst = new IRCallInst("malloc", irStringType, rd);
                inst.arg_list.add( new IRIntConst(curC.Size(),new IRIntType()) );

                it.val = new IRReg(irType);
                curblock.push_back(inst);
                curblock.push_back(new IRBitcastInst(rd,irType,it.val));

                if(curC.builtin) {
                    IRCallInst builtin_call = new IRCallInst(curC.name+"."+curC.name,new IRVoidType(),null);
                    builtin_call.arg_list.add(it.val);
                    curblock.push_back(builtin_call);
                }
            }
        }
    }

    public void visit(funcExpr it){
        var retType = TransType( (all.getFunc(it.name)).ret );
        var rd = new IRReg(retType);
        IRCallInst call = new IRCallInst(it.name,retType,rd);
        it.list.accept(this);

        for(var v:it.list.list)call.arg_list.add(v.val);

        it.val = rd;
        curblock.push_back( call );
        it.type = all.getFunc(it.name).ret;
    }

    public void visit(memberExpr it){
        it.rt.accept(this);

        if(it.list != null) it.list.accept(this);
        if(it.rt.type instanceof ArrayType) {
            assert ((ArrayType)it.rt.type).sz > 0;
            //A.size()
            return;
        }else if(it.rt.type.getType().equals("string")){
            IRCallInst inst = new IRCallInst("__str_"+it.name,null,null);
            if(it.name.equals("substring")) {
                IRReg ret = new IRReg(new IRPtrType(new IRCharType(),0));
                inst.rd = ret;
                inst.retType = ret.type;
                inst.arg_list.add(it.list.list.get(0).val);
                inst.arg_list.add(it.list.list.get(1).val);
                it.type = new BaseType(2);
            }else {
                IRReg ret = new IRReg(new IRIntType());
                inst.rd = ret;
                inst.retType = ret.type;
                if(it.name.equals("ord")) {
                    inst.arg_list.add(it.list.list.get(0).val);
                }
                it.type = new BaseType(0);
            }
            it.val = inst.rd;
            return;
        }
        ClassType now = all.getClass( it.rt.type.getType() );
        if(it.list == null){//Class A , A.x A*
            IRClassType curC = (IRClassType) (((IRPtrType)it.rt.val.type).LoadTpye());
            IRReg rd = new IRReg(new IRPtrType(curC.ir_Type.get(it.name),0));
            IRGEPInst inst = new IRGEPInst(rd,curC,it.rt.val);
            inst.index.add(new IRIntConst(0,new IRIntType()));
            inst.index.add(new IRIntConst(curC.pos.get(it.name),new IRIntType()));
            curblock.push_back(inst);

            it.Ptr = rd;
            it.val = LoadVal(it.Ptr);
            it.type = now.getMem(it.name,it.position);
        }else {
            IRType irType = TransType(now.get_func_ret(it.name));
            IRReg rd = new IRReg(irType);

            IRCallInst inst = new IRCallInst(now.name+"."+it.name,irType,rd);
            inst.arg_list.add(it.rt.val);
            for(var v: it.list.list) inst.arg_list.add(v.val);
            curblock.push_back(inst);

            it.val = rd;
            it.type = now.get_func_ret(it.name);
        }
    }

    public void visit(selfExpr it){
        it.son.accept(this);
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
        it.type = it.son.type;
    }

    public void visit(varNode it){
        if(now.hv_ir(it.name)) {
            it.Ptr = now.get_Addr(it.name);
            it.val = LoadVal(it.Ptr);
        }else {//element in class
            IRClassType curC = AST_IR_map.get(now.in_class_def.name);
            IRType irType = TransType(now.in_class_def.getMem(it.name,null));
            IRReg rd = new IRReg( irType );

            IRGEPInst inst = new IRGEPInst(rd,((IRPtrType)ThisReg.type).LoadTpye(),ThisReg);

            inst.index.add(new IRIntConst(0,new IRIntType()));
            inst.index.add(new IRIntConst(0,new IRIntType()));
            inst.index.add(new IRIntConst( curC.pos.get(it.name) ,new IRIntType()));

            curblock.push_back(inst);

            it.Ptr = rd;
            it.val = LoadVal(it.Ptr);
        }
        it.type = now.getType(it.name);
    }

    public void visit(typeIDNode it){}

    public void visit(typenameNode it){}

    public void visit(lambdaNode it){}

    public void visit(exprNode it){}

}
