package ASM.ASMInst;

import ASM.ASMFunc;
import ASM.Operand.ASMReg;

public class ASMMvInst extends ASMInst{
    public ASMReg rs,rd;

    public ASMMvInst(ASMReg rs, ASMReg rd) {
        super();
        this.rs = rs;
        this.rd = rd;
    }
}
