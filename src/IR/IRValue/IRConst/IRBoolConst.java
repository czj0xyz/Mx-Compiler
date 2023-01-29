package IR.IRValue.IRConst;

import IR.IRType.IRType;

public class IRBoolConst extends IRConst{
    public boolean val;
    public IRBoolConst(boolean v, IRType t) {
        super(t);
        val = v;
    }
    @Override
    public String toString_val() {
        return val ? "1" : "0";
    }

    @Override
    public String toString_type_val() {
        return type.toString() + " " + toString_val();
    }
}