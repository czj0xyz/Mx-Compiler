package IR.IRValue.IRConst;

import IR.IRType.IRType;

public class IRBoolConst extends IRConst{
    public boolean val;
    public IRBoolConst(boolean v, IRType t) {
        super(t);
        val = v;
    }
}