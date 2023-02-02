package Midend;

import IR.IRBlock;
import IR.IRFunc;
import IR.IRInst.*;
import IR.IRModule;
import IR.IRType.IRPtrType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class mem2reg extends IRVisitor {

    public IRModule irModule;

    public mem2reg(IRModule irModule) {
        this.irModule = irModule;
        solve();
    }

    private void solve() {
        for(var v: irModule.Func) visit(v);
    }

    HashMap<Integer, IRReg> St_Reg = new HashMap<>();

    private void visit(IRFunc func) {
        St_Reg.clear();

        for(var v:func.allocaInsts)
            St_Reg.put(v.reg.id,new IRReg(((IRPtrType)v.reg.type).LoadType()));

        for(var v:func.block)visit(v);

        visit(func.RetBlock);

    }

    HashMap<Integer, IRReg> New_Reg = new HashMap<>();
    HashMap<Integer, IRReg> Val_Reg = new HashMap<>();
    HashSet<Integer> Store = new HashSet<>();

    private LinkedList<IRInst> curblock = new LinkedList<>();
    private void visit(IRBlock block) {
        Store.clear();
        Val_Reg.clear();
        New_Reg.clear();

        curblock = new LinkedList<>();

        for(var v: block.list) v.accept(this);
        block.terminalInst.accept(this);

        for(var v: Store)
            curblock.addLast(new IRMvInst(New_Reg.get(v),St_Reg.get(v)));
        block.list = curblock;

    }

    IRBasicValue TransVal(IRBasicValue val) {
        if(!(val instanceof IRReg)) return val;
        int id = ((IRReg)val).id;
        if(!Val_Reg.containsKey(id)) return val;
        return Val_Reg.get(id);
    }

    @Override
    public void visit(IRCalcInst it) {
        curblock.addLast(new IRCalcInst(TransVal(it.rs1),TransVal(it.rs2),it.rd,it.op));
    }
    @Override
    public void visit(IRSelfInst it) {
        curblock.addLast(new IRSelfInst(TransVal(it.rs),it.rd,it.op));
    }
    @Override
    public void visit(IRBranchInst it) {
        assert (!(it.condition instanceof IRReg))
        || (!Val_Reg.containsKey(((IRReg)it.condition).id));
    }
    @Override
    public void visit(IRCompareInst it) {
        curblock.addLast(new IRCompareInst(TransVal(it.rs1),TransVal(it.rs2),it.rd,it.op));
    }
    @Override
    public void visit(IRRetInst it) {
        curblock.addLast(new IRRetInst(TransVal(it.ret)));
    }
    @Override
    public void visit(IRLoadInst it){}
    @Override
    public void visit(IRStoreInst it){}
    @Override
    public void visit(IRAllocaInst it){}
    @Override
    public void visit(IRCallInst it){}
    @Override
    public void visit(IRJumpInst it){}
    @Override
    public void visit(IRTruncInst it){}
    @Override
    public void visit(IRGEPInst it){}
    @Override
    public void visit(IRBitcastInst it){}
    @Override
    public void visit(IRZextInst it){}
    @Override
    public void visit(IRPhiInst it){}
    @Override
    public void visit(IRMvInst it){}
}
