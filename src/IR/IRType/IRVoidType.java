package IR.IRType;

public class IRVoidType extends IRType{
    public IRVoidType() {
        super();
    }
    @Override
    public int Size() {
        return 0;
    }

    @Override
    public String toString() {
        return "void";
    }
}
