package ASM.ASMInst;

public class ASMJumpInst extends ASMInst{

    public String label;

    public ASMJumpInst(String label) {
        this.label = label;
    }

    //j
    @Override
    public String toString() {
        return "    j " + label;
    }
}