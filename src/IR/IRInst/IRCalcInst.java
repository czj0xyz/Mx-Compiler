package IR.IRInst;

import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

/*
    opcode
    add +
    sub -
    mul *
    div{u} /
    rem{u} %
    sll <<
    srl >>
    or  |
    xor ^
    and &
 */

public class IRCalcInst extends IRInst{
    public IRBasicValue rs1,rs2,rd;

    public String op;

    public IRCalcInst(IRBasicValue rs1,IRBasicValue rs2,IRBasicValue rd,String op) {
        super();
        this.rs1 = rs1;
        this.rs2 = rs2;
        this.rd = rd;
        this.op = op;
    }

    @Override
    public void accept(IRVisitor visitor){
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "    "  + rd.toString_val() + " = " + op + " " + rs1.type + " " + rs1.toString_val() + ", " + rs2.toString_val();
    }
}
