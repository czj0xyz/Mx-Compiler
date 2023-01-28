package IR.IRInst;

import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRAllocaInst extends IRInst{
    public IRReg reg;
    public IRAllocaInst(IRReg reg) {
        super();
        this.reg = reg;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

}
