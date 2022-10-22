package Util.Type;

import Util.Position;

public class ArrayType extends BaseType{
    public int sz;
    public BaseType type;
    public ArrayType(BaseType t,int s) {
        super(t.getTypeId());
        this.sz=s;
    }

    @Override
    public String getType() {
        return type.getType() + "[]" + sz;
    }

    @Override
    public int getTypeId() {
        return type.getTypeId();
    }

    @Override
    public String getBaseType() {
        return type.getType();
    }

    @Override
    public BaseType ArrayAtom() {
        return type;
    }
}