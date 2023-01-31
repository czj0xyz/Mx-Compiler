package IR.IRInst;

import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRVisitor;

public class IRZextInst extends IRInst{
    public IRBasicValue rd,val;

    public IRZextInst(IRBasicValue rd,IRBasicValue val) {
        super();
        this.rd = rd;
        this.val = val;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "    " + rd.toString_val() + " = zext " + val.toString_type_val() + " to " + rd.type;
    }
}
