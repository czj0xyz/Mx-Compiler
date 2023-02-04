package ASM.ASMInst;

import ASM.ASMFunc;
import ASM.Operand.ASMReg;
import ASM.Operand.VirReg;

public class ASMMvInst extends ASMInst{

    public ASMMvInst(ASMReg rs1, ASMReg rd) {
        super();
        this.rs1 = rs1;
        this.rd = rd;
        use.add(rs1);
        def.add(rd);
    }

    @Override
    public String toString() {
        return "    mv " + rd + ", " + rs1;
    }
}
