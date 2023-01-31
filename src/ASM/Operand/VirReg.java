package ASM.Operand;

public class VirReg extends ASMReg {
    public int index;
    public VirReg(int index) {
        super();
        this.index = index;
    }

    @Override
    public String toString() {
        return "%" + Integer.toString(index);
    }
}
