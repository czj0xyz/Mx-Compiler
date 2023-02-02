package IR.IRInst;

import IR.IRBlock;
import IR.IRType.IRPtrType;
import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRPhiInst extends IRInst{
    public IRReg rd,res1,res2;

    public IRBlock rs1,rs2;

    public IRPhiInst(IRReg rd,IRReg res1,IRReg res2,IRBlock rs1,IRBlock rs2) {
        super();
        this.rd = rd;
        this.res1 = res1;
        this.res2 = res2;
        this.rs1 = rs1;
        this.rs2 = rs2;
    }

    @Override
    public String toString() {
        return "   " + rd.toString_val() + " = phi " + rd.type
        + " [ " + res1.toString_val() + ", %" + rs1.get_label() + " ], [ "
        + res2.toString_val() + ", %" + rs2.get_label() + " ]";
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

}
