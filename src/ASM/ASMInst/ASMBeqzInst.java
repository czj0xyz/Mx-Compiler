package ASM.ASMInst;

import ASM.Operand.ASMReg;

public class ASMBeqzInst extends ASMInst{
    public String label;

    public ASMBeqzInst(ASMReg rs,String label) {
        super();
        this.rs1 = rs;
        this.label = label;
    }
    @Override
    public String toString() {
        return "    beqz " + rs1 + ", " + label;
    }

}
