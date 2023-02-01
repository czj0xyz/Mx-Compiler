package ASM.Operand;

import ASM.ASMBlock;

public class ASMString extends ASMOperand {
    public int id;
    public String val;
    public ASMString(String val,int id) {
        super();
        this.id = id;
        this.val = val;
    }

    @Override
    public String toString() {
        String ret = ".LC_Mxstr" + id + ":\n";
        String res = "";
        for(int i=0;i<val.length();i++)
            if(val.charAt(i) == '\n') res += "\\n";
            else if(val.charAt(i) == '\t') res += "\\t";
            else if(val.charAt(i) == '\0');// res += "\\0";
            else if(val.charAt(i) == '\\') res += "\\\\";
            else if(val.charAt(i) == '\"') res += "\\\"";
            else res += val.charAt(i);

        ret += "    .string \"" + res + "\"";
        return ret;
    }
}
