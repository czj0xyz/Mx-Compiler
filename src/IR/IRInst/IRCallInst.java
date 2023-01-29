package IR.IRInst;

import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRVisitor;

import java.util.ArrayList;

public class IRCallInst extends IRInst{
    public String func_name;
    public IRType retType;
    public ArrayList<IRBasicValue> arg_list = new ArrayList<>();


    public IRCallInst(String name, IRType retType) {
        super();
        this.func_name = name;
        this.retType = retType;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "    "  + "";
    }
}
