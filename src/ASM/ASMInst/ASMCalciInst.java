package ASM.ASMInst;

import ASM.Operand.ASMImm;
import ASM.Operand.ASMReg;
import ASM.Operand.VirReg;

public class ASMCalciInst extends ASMInst{
    public String op;

    public ASMCalciInst(ASMReg rs1,ASMImm imm,ASMReg rd,String op) {
        super();
        this.rs1 = rs1;
        this.imm = imm;
        this.rd = rd;
        this.op = op;
        def.add(rd);
        use.add(rs1);
    }

    @Override
    public String toString() {
        if(imm == null)return "    " + op + " " + rd + ", " + rs1;
        else return "    " + op + " " + rd + ", " + rs1 + ", " + imm;
    }

}
