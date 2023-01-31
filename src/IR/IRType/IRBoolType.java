package IR.IRType;

public class IRBoolType extends IRType{

    public IRBoolType(){
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
