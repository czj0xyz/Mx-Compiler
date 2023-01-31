package IR.IRType;

import IR.IRValue.IRBasicValue;

public class IRPtrType extends IRType{
    public IRType type;
    int sz;

    public IRPtrType(IRType bs_type,int sz) {
        super();
        this.type = bs_type;
        this.sz = sz;
    }

    public IRType LoadType() {
        if(sz == 0)return type;
        else return new IRPtrType(type,sz-1);
    }

    @Override public int Size() {
        return 8;
    }

    @Override
    public String toString() {
        return type + "*".repeat(sz+1);
    }
}
