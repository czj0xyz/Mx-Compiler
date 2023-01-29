package IR.IRValue.IRConst;

import IR.IRType.IRType;

public class IRStringConst extends IRConst {
    public String val;
    public int id;
    public static int cnt = 0;
    public IRStringConst(String v, IRType t) {
        super(t);
        this.val = v;
        this.id = cnt++;
    }

    public String getString() {
        String res = "", ret = "";
        for(int i=0;i<val.length();i++){
            if(val.charAt(i) == '\\') {
                i++;
                if(val.charAt(i) == '\\') res += '\\';
                else if(val.charAt(i) == '\n') res += '\n';
                else res += '\"';
            }else res += val.charAt(i);
        }

        for(int i=0;i<val.length();i++){
            if(val.charAt(i) == '\\') ret += "\\\\";
            else if(val.charAt(i) == '\"') ret += "\\22";
            else if(val.charAt(i) == '\n') ret += "\\0A";
            else ret += val.charAt(i);
        }

        return ret;
    }

    @Override
    public String toString_val() {
        return "@String_" + Integer.toString(id);
    }

    @Override
    public String toString_type_val() {
        return  "[" + Integer.toString(val.length()+1) + " x i8] " + toString_val();
    }
}
