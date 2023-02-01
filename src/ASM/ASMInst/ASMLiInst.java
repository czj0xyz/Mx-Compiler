package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;

public class ASMLiInst extends ASMInst{
    //rd = imm

    public ASMLiInst(ASMReg rd,ASMImm imm) {
        this.rd = rd;
        this.imm = imm;
    }

    @Override
    public String toString() {
        return "    li " + rd + ", " + imm;
    }
}
