package IR.IRValue.IRConst;

import IR.IRType.IRType;

public class IRIntConst extends IRConst{
    public int val;
    public IRIntConst(int v, IRType t) {
        super(t);
        val = v;
    }
}
