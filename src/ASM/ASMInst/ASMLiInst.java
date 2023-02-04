package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;
import ASM.Operand.VirReg;

public class ASMLiInst extends ASMInst{
    //rd = imm

    public ASMLiInst(ASMReg rd,ASMImm imm) {
        this.rd = rd;
        this.imm = imm;
        def.add(rd);
    }

    @Override
    public String toString() {
        return "    li " + rd + ", " + imm;
    }
}
