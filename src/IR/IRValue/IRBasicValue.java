package IR.IRValue;

import IR.IRType.IRType;

public abstract class IRBasicValue {

    public IRType type;

    public IRBasicValue(IRType t) {
        this.type = t;
    }

    public String toString_val() {
        return "";
    }

    public String toString_type_val() {
        return "";
    }

}
