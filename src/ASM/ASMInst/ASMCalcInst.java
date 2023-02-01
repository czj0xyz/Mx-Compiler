package ASM.ASMInst;

import ASM.Operand.ASMReg;

public class ASMCalcInst extends ASMInst{
    public String op;

    public ASMCalcInst(ASMReg rs1,ASMReg rs2,ASMReg rd,String op) {
        super();
        this.rs1 = rs1;
        this.rs2 = rs2;
        this.rd = rd;
        this.op = op;
    }

    @Override
    public String toString() {
        return "    " + op + " " + rd + ", " + rs1 + ", " + rs2;
    }

}
