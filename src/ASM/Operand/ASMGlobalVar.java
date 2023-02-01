package ASM.Operand;

public class ASMGlobalVar extends ASMOperand {
    public String name;
    public int sz,st;

    public ASMGlobalVar(String name,int sz) {
        super();
        this.name = name;
        this.sz = sz;
        this.st = 0;
    }

    @Override
    public String toString() {
        String ret = name + ":\n";
        ret += "    ";

        if(sz == 1)ret += ".byte " + st;
        else if(sz==2)ret += ".half " + st;
        else ret += ".word " + st;
        return ret;
    }
}
