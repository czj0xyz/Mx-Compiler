package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;
import ASM.Operand.VirReg;

public class ASMLoadInst extends ASMInst{
    public int bit;

    //rd = imm(rs1)
    public ASMLoadInst(int bit,ASMReg rd,ASMReg rs1,ASMImm imm) {
        super();
        this.bit = bit;
        this.rd = rd;
        this.rs1 = rs1;
        this.imm = imm;
        def.add(rd);
        use.add(rs1);
    }

    @Override
    public String toString() {
        String st = "l";
        if(bit ==  1) st += "b";
        else if(bit == 2)st += "h";
        else if(bit == 4)st += "w";
        else st += "d";
        return "    " + st + " " + rd + ", " + imm + "(" + rs1 + ")";
    }

}
