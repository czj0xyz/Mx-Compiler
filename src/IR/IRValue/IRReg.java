package IR.IRValue;

import IR.IRType.IRType;

public class IRReg extends IRBasicValue{
    public int id;
    public static int reg_cnt;

    public IRReg(IRType t) {
        super(t);
        this.id = reg_cnt ++;
    }

}
