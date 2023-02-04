package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;
import ASM.Operand.PhyReg;
import ASM.Operand.VirReg;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class ASMInst {
    public ASMReg rs1,rs2,rd;
    public ASMImm imm;

    public HashSet<ASMReg> use,def;

    public ASMInst() {
        use = new HashSet<>();
        def = new HashSet<>();
        rs1 = null;
        rs2 = null;
        rd = null;
        imm = null;
    }

    abstract public String toString();
}
