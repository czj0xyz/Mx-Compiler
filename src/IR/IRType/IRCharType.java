package IR.IRType;

public class IRCharType extends IRType{
    public IRCharType() {
        super();
    }

    @Override
    public int Size() {
        return 1;
    }

    @Override
    public String toString() {
        return "i8";
    }

}
