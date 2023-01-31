package Backend;

import ASM.ASMBlock;
import ASM.ASMFunc;
import ASM.ASMInst.ASMRetInst;
import ASM.ASMInst.ASMStoreInst;
import ASM.ASMModule;
import ASM.Operand.PhyReg;
import IR.*;
import IR.IRInst.*;

public class InstSelector implements IRVisitor{
    private ASMBlock curblock = null;
    private ASMFunc curFunc = null;
    public ASMModule asmModule = null;

    private PhyReg zero = new PhyReg("zero");
    private PhyReg sp = new PhyReg("sp");
    private PhyReg ra = new PhyReg("ra");
    private PhyReg t0 = new PhyReg("t0");
    private PhyReg t1 = new PhyReg("t1");
    private PhyReg t2 = new PhyReg("t2");
    private PhyReg a0 = new PhyReg("a0");
    private PhyReg a1 = new PhyReg("a1");

    public InstSelector(ASMModule st,IRModule irModule) {
        this.asmModule = st;
        visit(irModule);
    }

    private void visit(IRModule irModule) {
        //GlobalVar
        //String
        //Func
        for(var v:irModule.Func) visit(v);
        visit(irModule.init);
    }

    private void visit(IRFunc func) {
        ASMFunc asmFunc = new ASMFunc(func.name);
        curFunc = asmFunc;
        for(var v: func.block) {
            ASMBlock asmBlock = new ASMBlock(v.get_label());
            curblock = asmBlock;
            visit(v);
            asmFunc.add_block(asmBlock);
        }
        for(var v: func.arg_list)
            asmFunc.arg_list.add( asmFunc.get_VirReg(v) );

        asmFunc.arg_listReg = Math.max(0,asmFunc.arg_list.size()-8);
        asmFunc.retASMReg = asmFunc.get_VirReg(func.retVal);

        asmFunc.RetBlock = curblock = new ASMBlock(func.RetBlock.get_label());
        visit(func.RetBlock);

        //change sp and store ra
//        asmFunc.list.get(0).push_front(new ASMStoreInst());
//        for(int i=0;i<asmFunc.arg_list;i++) {
//        }
//        asmFunc.RetBlock.push_back();

        asmFunc.RetBlock.push_back(new ASMRetInst());
    }

    private void visit(IRBlock block) {
        for(var v: block.list) v.accept(this);
    }

    @Override
    public void visit(IRCalcInst it){}
    @Override
    public void visit(IRSelfInst it){}
    @Override
    public void visit(IRBranchInst it){}
    @Override
    public void visit(IRCompareInst it){}
    @Override
    public void visit(IRRetInst it){}
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
}
