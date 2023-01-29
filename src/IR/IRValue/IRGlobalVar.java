package IR.IRValue;

import IR.IRType.IRType;

public class IRGlobalVar extends IRBasicValue{
    public IRBasicValue val;

    public String name;

    public IRGlobalVar(String name, IRType type) {
        super(type);
        this.name = name;
    }

    @Override
    public String toString_val() {
        return "@" + name;
    }
    @Override
    public String toString_type_val() {
        return type.toString() + " " + toString_val();
    }

}