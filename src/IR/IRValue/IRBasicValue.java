package IR.IRValue;

import IR.IRType.IRType;

public abstract class IRBasicValue {

    public IRType type;

    public IRBasicValue(IRType t) {
        this.type = t;
    }

}
