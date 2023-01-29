package Backend;

import IR.*;
import IR.IRInst.*;

public class InstSelector implements IRVisitor{
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
}
