package IR.IRInst;

import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRLoadInst extends IRInst{

    public IRReg rd;
    public IRBasicValue src;
    public IRType type;

    public IRLoadInst(IRReg rd,IRBasicValue src,IRType type) {
        super();
        this.rd = rd;
        this.src = src;
        this.type = type;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "    "  + rd.toString_val() + " = load " + type + ", " + src.toString_type_val();
    }
}
