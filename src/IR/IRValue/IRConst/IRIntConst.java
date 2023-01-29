package IR.IRValue.IRConst;

import IR.IRType.IRType;

public class IRIntConst extends IRConst{
    public int val;
    public IRIntConst(int v, IRType t) {
        super(t);
        val = v;
    }
    @Override
    public String toString_val() {
        return Integer.toString(val);
    }

    @Override
    public String toString_type_val() {
        return type.toString() + " " + toString_val();
    }
}
