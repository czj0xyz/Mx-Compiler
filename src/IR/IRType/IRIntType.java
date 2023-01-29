package IR.IRType;

public class IRIntType extends IRType{
    public IRIntType() {
        super();
    }

    @Override
    public int Size() {
        return 4;
    }

    @Override
    public String toString() {
        return "i32";
    }
}
