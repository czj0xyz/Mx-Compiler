package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;

public abstract class ASMInst {
    public ASMReg rs1,rs2,rd;
    public ASMImm imm;

    public ASMInst() {
        rs1 = null;
        rs2 = null;
        rd = null;
        imm = null;
    }

    abstract public String toString();

}
