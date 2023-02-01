package ASM.ASMInst;

import ASM.Operand.ASMReg;

public class ASMLaInst extends ASMInst{
    public String label;

    public ASMLaInst(String label, ASMReg rd) {
        super();
        this.label = label;
        this.rd = rd;
    }

    @Override
    public String toString() {
        return "    la " + rd + ", " + label;
    }
}
