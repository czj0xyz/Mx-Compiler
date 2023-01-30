package IR.IRValue.IRConst;

import IR.IRType.IRType;

public class IRNullConst extends IRConst{
    public IRNullConst(IRType t) {
        super(t);
    }
    @Override
    public String toString_val() {
        return "null";
    }

    @Override
    public String toString_type_val() {
        return type + " null";
    }
}
