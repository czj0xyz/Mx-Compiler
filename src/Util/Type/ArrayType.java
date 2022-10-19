package Util.Type;

import Util.Position;

public class ArrayType extends BaseType{
    public int sz;
    public BaseType type;
    public ArrayType(Position pos,BaseType t) {
        super(pos,t.getTypeId());
    }

    @Override
    public String getType() {
        return type.getType();
    }
}
