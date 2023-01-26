package IR.IRValue.IRConst;

import IR.IRType.IRType;

public class IRStringConst extends IRConst {
    public String val;
    public IRStringConst(String v, IRType t) {
        super(t);
        val = v;
    }
}
