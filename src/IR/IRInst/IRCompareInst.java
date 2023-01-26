package IR.IRInst;

import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

/*
>= sge
> sgt
<= sle
< slt
== eq
!= ne

 */

public class IRCompareInst extends IRInst{
    public IRBasicValue rs1,rs2,rd;

    public String op;

    public IRCompareInst(IRBasicValue rs1,IRBasicValue rs2,IRBasicValue rd,String op) {
        super();
        this.rs1 = rs1;
        this.rs2 = rs2;
        this.rd = rd;
        this.op = op;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

}
