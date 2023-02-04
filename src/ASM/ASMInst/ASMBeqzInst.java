package ASM.ASMInst;

import ASM.Operand.ASMReg;
import ASM.Operand.VirReg;

public class ASMBeqzInst extends ASMInst{
    public String label;

    public ASMBeqzInst(ASMReg rs,String label) {
        super();
        this.rs1 = rs;
        this.label = label;
        use.add(rs);
    }
    @Override
    public String toString() {
        return "    beqz " + rs1 + ", " + label;
    }

}
