package IR.IRInst;

import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRStoreInst extends IRInst{

    public IRBasicValue val,addr;
    public IRType type;

    public IRStoreInst(IRBasicValue val,IRBasicValue addr,IRType type) {
        super();
        this.val = val;
        this.addr = addr;
        this.type = type;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
