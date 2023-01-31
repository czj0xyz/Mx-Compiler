package IR.IRType;

public class IRBitType extends IRType{
    public IRBitType(){
        super();
    }

    @Override
    public int Size() {
        assert false;
        return 1;
    }

    @Override
    public String toString() {
        return "i1";
    }
}
