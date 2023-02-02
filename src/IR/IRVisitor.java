package IR;

import IR.IRInst.*;
import IR.IRType.IRType;

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
    void visit(IRJumpInst it);
    void visit(IRTruncInst it);
    void visit(IRGEPInst it);
    void visit(IRBitcastInst it);
    void visit(IRZextInst it);
    void visit(IRPhiInst it);
    void visit(IRMvInst it);
}
