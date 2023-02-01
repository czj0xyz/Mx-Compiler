package ASM;

import ASM.Operand.ASMGlobalVar;
import ASM.Operand.ASMString;
import IR.IRValue.IRConst.IRStringConst;
import IR.IRValue.IRGlobalVar;

import java.util.ArrayList;
import java.util.HashMap;

public class ASMModule {

    public ArrayList<ASMFunc> func_list = new ArrayList<>();
    public ArrayList<ASMGlobalVar> GlobalVar = new ArrayList<>();
    public ArrayList<ASMString> Strings = new ArrayList<>();

    public HashMap<String,ASMString> hv_str = new HashMap<>();
    public HashMap<String,Boolean> hv_glo = new HashMap<>();
    public int tt_str = 0;

    public ASMModule() {}

    public String toString() {
        String ret = "";

        ret += "    .section .data\n";
        for(var v:GlobalVar)
            ret += v + "\n";
        ret += "\n";

        ret += "    .section .rodata\n";
        for(var v: Strings)
            ret += v + "\n";
        ret += "\n";

        ret += "    .section .text\n";
        for(var v:func_list) ret += v + "\n";
        return ret;
    }

    public ASMString get_str(String str) {
        if(!hv_str.containsKey(str)) {
            ASMString v = new ASMString(str,tt_str++);
            hv_str.put(str, v);
            Strings.add(v);
        }
        return hv_str.get(str);
    }

    public void push_gloVar(String name,int sz) {
        if(!hv_glo.containsKey(name)) {
            hv_glo.put(name,true);
            GlobalVar.add(new ASMGlobalVar(name,sz));
        }
    }
}
