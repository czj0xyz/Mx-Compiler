package IR.IRType;

public class IRArrayType extends IRType {
    public IRType Base;
    public int sz;

    public IRArrayType(IRType Base, int sz) {
        super();
        this.sz = sz;
        this.Base = Base;
    }

    @Override
    public String toString() {
        return "[ " + Integer.toString(sz) + " x " + Base + " ]";
    }
}
