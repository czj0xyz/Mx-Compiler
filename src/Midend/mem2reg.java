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

public class mem2reg implements IRVisitor {

    public IRModule irModule;

    public mem2reg(IRModule irModule) {
        this.irModule = irModule;
        solve();
    }

    private void solve() {
        for(var v: irModule.Func) visit(v);
        visit(irModule.init);
    }

    HashMap<Integer, IRReg> St_Reg = new HashMap<>();

    private void visit(IRFunc func) {
        St_Reg.clear();

        for(var v:func.allocaInsts)
            St_Reg.put(v.reg.id,new IRReg(((IRPtrType)v.reg.type).LoadType()));

        for(var v:func.block)visit(v);

        visit(func.RetBlock);

    }

    HashMap<Integer, IRBasicValue> Val_Reg = new HashMap<>();//contains val of alloca reg
    HashSet<Integer> Store = new HashSet<>();//alloca reg that need to be store

    private IRInst TerminalInst = null;

    private LinkedList<IRInst> curblock = new LinkedList<>();
    private void visit(IRBlock block) {
        Store.clear();
        Val_Reg.clear();

        curblock = new LinkedList<>();

        for(var v: block.list) v.accept(this);
        block.terminalInst.accept(this);
        block.terminalInst = TerminalInst;

        for(var v: Store)
            curblock.addLast(new IRMvInst(Val_Reg.get(v),St_Reg.get(v)));
        block.list = curblock;

    }

    IRBasicValue TransVal(IRBasicValue val) {
        if(!(val instanceof IRReg)) return val;
        int id = ((IRReg)val).id;
        if(!Val_Reg.containsKey(id)) return val;
        return Val_Reg.get(id);
    }
    @Override
    public void visit(IRLoadInst it){
        if(it.src instanceof IRReg && St_Reg.containsKey(((IRReg)it.src).id)) {
            int index = ((IRReg)it.src).id, index2 = ((IRReg)it.rd).id;
            if(!Store.contains(index)){
                Val_Reg.put(index2,St_Reg.get(index));
            }else {
                Val_Reg.put(index2,Val_Reg.get(index));
            }
        }else {
            curblock.addLast(new IRLoadInst(it.rd,TransVal(it.src),it.type));
        }
    }
    @Override
    public void visit(IRStoreInst it){
        if(it.addr instanceof IRReg && St_Reg.containsKey(((IRReg)it.addr).id)) {
            int index = ((IRReg)it.addr).id;
            if(!Store.contains(index))Store.add(index);
            if(!Val_Reg.containsKey(index)) {
                Val_Reg.put(index, TransVal(it.val) );
            }else {
                Val_Reg.replace(index, TransVal(it.val) );
            }
        }else {
            curblock.addLast(new IRStoreInst(TransVal(it.val),TransVal(it.addr),it.type));
        }
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
        TerminalInst = new IRBranchInst(TransVal(it.condition),it.Tblock,it.Fblock);
    }
    @Override
    public void visit(IRCompareInst it) {
        curblock.addLast(new IRCompareInst(TransVal(it.rs1),TransVal(it.rs2),it.rd,it.op));
    }
    @Override
    public void visit(IRRetInst it) {
        TerminalInst = new IRRetInst(TransVal(it.ret));
    }
    @Override
    public void visit(IRAllocaInst it){
        assert false;
    }
    @Override
    public void visit(IRCallInst it){
        IRCallInst ret = new IRCallInst(it.func_name,it.retType,it.rd);
        for(var v:it.arg_list) ret.arg_list.add(TransVal(v));
        curblock.addLast(ret);
    }
    @Override
    public void visit(IRJumpInst it){
        TerminalInst = new IRJumpInst(it.to);
    }
    @Override
    public void visit(IRTruncInst it){
        curblock.addLast(new IRTruncInst(it.dest,TransVal(it.val),it.rd));
    }
    @Override
    public void visit(IRGEPInst it){
        IRGEPInst inst = new IRGEPInst(it.rd,it.type,TransVal(it.src));
        for(var v:it.index) inst.index.add(TransVal(v));
        curblock.addLast(inst);
    }
    @Override
    public void visit(IRBitcastInst it){
        curblock.addLast(new IRBitcastInst(TransVal(it.val),it.toType,it.rd));
    }
    @Override
    public void visit(IRZextInst it){
        curblock.addLast(new IRZextInst(it.rd,TransVal(it.val)));
    }
    @Override
    public void visit(IRPhiInst it){
        assert false;
    }
    @Override
    public void visit(IRMvInst it){
        assert false;
    }
}
