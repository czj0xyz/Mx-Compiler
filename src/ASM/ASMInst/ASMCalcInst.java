package ASM.ASMInst;

import ASM.Operand.ASMReg;

public class ASMCalcInst extends ASMInst{
    public ASMReg rs1,rs2,rd;// rd = rs1 op rs2
    public String op;

    public ASMCalcInst(ASMReg rs1,ASMReg rs2,ASMReg rd,String op) {
        super();
        this.rs1 = rs1;
        this.rs2 = rs2;
        this.rd = rd;
        this.op = op;
    }

}
