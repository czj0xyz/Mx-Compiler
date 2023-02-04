package ASM;

import ASM.Operand.ASMGlobalVar;
import ASM.Operand.ASMString;
import ASM.Operand.PhyReg;
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
    public HashMap<String,PhyReg> pos = new HashMap<>();

    public ASMModule() {
        pos.put("zero",new PhyReg("zero"));
        pos.put("ra",new PhyReg("ra"));
        pos.put("sp",new PhyReg("sp"));
        for(int i=0;i<=6;i++) pos.put("t" + i,new PhyReg("t"+i));
        for(int i=0;i<=11;i++) pos.put("s" + i,new PhyReg("s"+i));
        for(int i=0;i<=7;i++) pos.put("a" + i,new PhyReg("a"+i));
        this.sp = pos.get("sp");
        this.ra = pos.get("ra");
        this.t0 = pos.get("t0");
        this.t1 = pos.get("t1");
        this.t2 = pos.get("t2");
        this.t3 = pos.get("t3");
        this.t4 = pos.get("t4");
        this.a0 = pos.get("a0");
    }

    public PhyReg sp;
    public PhyReg ra;
    public PhyReg t0;
    public PhyReg t1;
    public PhyReg t2;
    public PhyReg t3;
    public PhyReg t4;
    public PhyReg a0;

    public String toString() {
        String ret = "";

        if(GlobalVar.size()>0)ret += "    .section .data\n";
        for(var v:GlobalVar)
            ret += v + "\n";
        ret += "\n";

        if(Strings.size()>0)ret += "    .section .rodata\n";
        for(var v: Strings)
            ret += v + "\n";
        ret += "\n";

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
