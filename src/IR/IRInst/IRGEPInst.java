package IR.IRInst;

import IR.IRBlock;
import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

import java.util.ArrayList;

public class IRGEPInst extends IRInst{
    public IRReg rd;
    public IRType type;
    public IRBasicValue src;
    public ArrayList<IRBasicValue> index = new ArrayList<>();

    public IRGEPInst(IRReg rd, IRType type, IRBasicValue src) {
        super();
        this.rd = rd;
        this.type = type;
        this.src = src;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        String ret = "    " + rd.toString_val() + " = getelementptr " + type + ", " + src.toString_type_val();
        for(var v:index) ret += ", " + v.toString_type_val();
        return ret;
    }
}
