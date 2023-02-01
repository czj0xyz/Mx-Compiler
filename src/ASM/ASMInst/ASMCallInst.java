package ASM.ASMInst;

import ASM.Operand.ASMImm;

public class ASMCallInst extends ASMInst {
    public String label;

    public ASMCallInst(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "    call " + label;
    }
}
