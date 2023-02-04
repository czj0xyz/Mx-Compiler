package ASM.ASMInst;

import ASM.Operand.ASMReg;
import ASM.Operand.VirReg;

public class ASMLaInst extends ASMInst{
    public String label;

    public ASMLaInst(String label, ASMReg rd) {
        super();
        this.label = label;
        this.rd = rd;
        def.add(rd);
    }

    @Override
    public String toString() {
        return "    la " + rd + ", " + label;
    }
}
