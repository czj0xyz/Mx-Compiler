package IR.IRInst;

import IR.IRBlock;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRBranchInst extends IRInst{

    public IRBasicValue condition;
    public IRBlock Tblock,Fblock;

    public IRBranchInst(IRBasicValue reg) {
        super();
        this.condition = reg;
        this.Tblock = null;
        this.Fblock = null;
    }

    public IRBranchInst(IRBasicValue reg,IRBlock T,IRBlock F) {
        super();
        this.condition = reg;
        this.Tblock = T;
        this.Fblock = F;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "    br "  + condition.toString_type_val() + ", label %" + Tblock.get_label() + ", label %" + Fblock.get_label();
    }
}
