package IR.IRInst;

import IR.IRValue.IRBasicValue;
import IR.IRVisitor;

public class IRRetInst extends IRInst{

    public IRBasicValue ret;

    public IRRetInst(IRBasicValue ret) {
        super();
        this.ret = ret;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
