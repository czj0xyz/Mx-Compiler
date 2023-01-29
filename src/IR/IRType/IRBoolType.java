package IR.IRType;

public class IRBoolType extends IRType{

    public IRBoolType(){
        super();
    }

    @Override
    public int Size() {
        return 1;
    }

    @Override
    public String toString() {
        return "i1";
    }
}
