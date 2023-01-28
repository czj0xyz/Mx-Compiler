package IR;

import IR.IRInst.*;

public interface IRVisitor {
    void visit(IRCalcInst it);
    void visit(IRSelfInst it);
    void visit(IRBranchInst it);
    void visit(IRCompareInst it);
    void visit(IRRetInst it);
    void visit(IRLoadInst it);
    void visit(IRStoreInst it);
    void visit(IRAllocaInst it);
    void visit(IRCallInst it);
}
