package IR.IRValue;

import IR.IRType.IRType;

public class IRReg extends IRBasicValue{
    public int id,bid;

    public IRReg(IRType t, int id, int bid) {
        super(t);
        this.id = id;
        this.bid = bid;
    }

}
