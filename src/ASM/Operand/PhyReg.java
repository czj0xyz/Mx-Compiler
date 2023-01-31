package ASM.Operand;

public class PhyReg extends ASMReg {
    public String name;
    public PhyReg(String name) {
        super();
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
