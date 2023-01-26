package IR.IRInst;

import IR.IRVisitor;

public class IRRetInst extends IRInst{

    public IRRetInst() {
        super();
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
