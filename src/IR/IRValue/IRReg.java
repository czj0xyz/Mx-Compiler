package IR.IRValue;

import IR.IRType.IRType;

public class IRReg extends IRBasicValue{
    public int id;
    public static int reg_cnt = 0;

    public IRReg(IRType t) {
        super(t);
        this.id = ++ reg_cnt;
    }

    @Override
    public String toString_val() {
        return "%" + Integer.toString(id);
    }

    @Override
    public String toString_type_val() {
        return type.toString() + " " + toString_val();
    }
}
