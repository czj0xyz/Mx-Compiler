package ASM.Operand;

public class ASMImm extends ASMOperand{
    public int imm;

    public ASMImm(int val) {
        super();
        this.imm = val;
    }
    @Override
    public String toString() {
        return Integer.toString(imm);
    }
}
