package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;

public class ASMCalciInst extends ASMInst{
    public ASMReg rs1,rd;// rd = rs1 op imm
    public String op;
    public ASMImm imm;

    public ASMCalciInst(ASMReg rs1,ASMImm imm,ASMReg rd,String op) {
        super();
        this.rs1 = rs1;
        this.imm = imm;
        this.rd = rd;
        this.op = op;
    }
}
