package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;

public class ASMLiInst extends ASMInst{
    public ASMReg rd;
    public ASMImm imm;
    //rd = imm

    public ASMLiInst(ASMReg rd,ASMImm imm) {
        this.rd = rd;
        this.imm = imm;
    }

}
