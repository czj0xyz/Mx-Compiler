package IR.IRInst;

import IR.IRBlock;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRBranchInst extends IRInst{

    public IRBasicValue condition;
    public IRBlock Tblock,Fblock,destblock;

    IRBranchInst(IRBasicValue reg) {
        super();
        this.condition = reg;
        this.Tblock = null;
        this.Fblock = null;
        this.destblock = null;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
