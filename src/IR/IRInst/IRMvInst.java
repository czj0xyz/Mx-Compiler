package IR.IRInst;

import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRMvInst extends IRInst{
    public IRReg rd;
    public IRBasicValue rs;

    public IRMvInst(IRBasicValue rs,IRReg rd) {
        super();
        this.rs = rs;
        this.rd = rd;
    }

    @Override
    public String toString() {
        assert false;
        return "    mv " + rs.toString_type_val() + " " + rd.toString_val();
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
