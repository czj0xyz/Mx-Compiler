package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;

public class ASMStoreInst extends ASMInst{
    public int bit;

    //rs2  <- imm(rs1)
    public ASMStoreInst(int bit,ASMReg rs1,ASMReg rs2,ASMImm imm) {
        super();
        this.bit = bit;
        this.rs1 = rs1;
        this.rs2 = rs2;
        this.imm = imm;
    }

    @Override
    public String toString() {
        String st = "s";
        if(bit ==  1) st += "b";
        else if(bit == 2)st += "h";
        else if(bit == 4)st += "w";
        else st += "d";
        return "    " + st + " " + rs2 + ", " + imm + "(" + rs1 + ")";
    }

}
