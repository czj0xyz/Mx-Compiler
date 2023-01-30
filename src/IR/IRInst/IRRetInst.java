package IR.IRInst;

import IR.IRType.IRVoidType;
import IR.IRValue.IRBasicValue;
import IR.IRVisitor;

public class IRRetInst extends IRInst{

    public IRBasicValue ret;

    public IRRetInst(IRBasicValue ret) {
        super();
        this.ret = ret;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        if(ret.type instanceof IRVoidType)
            return  "    "  + "ret void";
        else return "    "  + "ret " + ret.toString_type_val();
    }
}
