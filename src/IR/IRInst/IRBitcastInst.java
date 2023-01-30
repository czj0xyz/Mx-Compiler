package IR.IRInst;

import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRBitcastInst extends IRInst{
    public IRBasicValue val;
    public IRType toType;
    public IRBasicValue rd;

    public IRBitcastInst(IRBasicValue val, IRType toType, IRBasicValue rd) {
        super();
        this.val = val;
        this.toType = toType;
        this.rd = rd;
    }

    @Override
    public String toString() {
        return "    " + rd.toString_val() + " = bitcast " + val.toString_type_val() + " to " + toType;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
