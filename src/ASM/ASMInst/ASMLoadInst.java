package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;

public class ASMLoadInst extends ASMInst{
    public int bit;
    public ASMReg rd,rs;
    public ASMImm imm;

    //rd = imm(rs)
    public ASMLoadInst(int bit,ASMReg rd,ASMReg rs,ASMImm imm) {
        super();
        this.bit = bit;
        this.rd = rd;
        this.rs = rs;
        this.imm = imm;
    }

}
