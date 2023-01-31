package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;

public class ASMStoreInst extends ASMInst{
    public int bit;
    public ASMReg rs1,rs2;
    public ASMImm imm;

    //rs2  <- imm(rs1)
    public ASMStoreInst(int bit,ASMReg rs1,ASMReg rs2,ASMImm imm) {
        super();
        this.bit = bit;
        this.rs1 = rs1;
        this.rs2 = rs2;
        this.imm = imm;
    }


}
