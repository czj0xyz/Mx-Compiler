package ASM;

import ASM.Operand.ASMReg;
import ASM.Operand.VirReg;
import IR.IRValue.IRReg;

import java.util.ArrayList;
import java.util.HashMap;

public class ASMFunc {
    public String name;
    public ArrayList<ASMBlock> list = new ArrayList<>();
    public ArrayList<ASMReg> arg_list = new ArrayList<>();

    public ASMReg retASMReg = null;

    public ASMBlock RetBlock = null;

    public int allocReg;
    public int arg_listReg = 0;

    private HashMap<Integer, VirReg> pos = new HashMap<Integer, VirReg>();


    public ASMFunc(String name) {
        this.name = name;
        this.allocReg = 1;//use to store ra
    }

    public void add_block(ASMBlock b) {
        list.add(b);
    }

    public VirReg get_VirReg(IRReg reg) {
        if(!pos.containsKey(reg.id)) pos.put(reg.id,new VirReg(allocReg++));
        return pos.get(reg.id);
    }

    public int Stack_Size() {
        return (allocReg + arg_listReg) << 2;
    }


    public String toString() {
        String ret = "    .globl " + name + "\n";
        ret += name + ":\n";
        for(var v:list) ret += v;
        ret += RetBlock;
//        ret += "\n";
        return ret;
    }
}
