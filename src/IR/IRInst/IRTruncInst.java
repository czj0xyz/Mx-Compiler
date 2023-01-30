package IR.IRInst;

import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRTruncInst extends IRInst{
    public IRType dest;
    public IRBasicValue val;
    public IRReg rd;

    public IRTruncInst(IRType dest,IRBasicValue val,IRReg rd) {
        super();
        this.dest = dest;
        this.val = val;
        this.rd = rd;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "    " + rd.toString_val() + " = trunc " + val.toString_type_val() + " to " + dest;
    }

}
