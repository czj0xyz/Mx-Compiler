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

    public int allocReg, MaxUsed = 0;
    public int arg_listReg = 0;

    public int usedVirReg = 0;

    public HashMap<Integer, VirReg> pos = new HashMap<>();
    public HashMap<Integer, VirReg> Graph_pos = new HashMap<>();


    public ASMFunc(String name) {
        this.name = name;
        this.allocReg = 1;//use to store ra
    }

    public void add_block(ASMBlock b) {
        list.add(b);
    }

    public VirReg get_VirReg(IRReg reg) {
        if (!pos.containsKey(reg.id)) {
            pos.put(reg.id, new VirReg(allocReg++));
            Graph_pos.put(allocReg-1,pos.get(reg.id));
        }
        return pos.get(reg.id);
    }

    public VirReg get_VirReg(int id) {
        if(!Graph_pos.containsKey(id)) System.out.println("???? " + id);
        return Graph_pos.get(id);
    }

    public int Stack_Size() {//ra s0..11 arg_listReg usedVirReg
        return ( usedVirReg + arg_listReg) << 2;
    }


    public String toString() {
        String ret = "    .text\n" + "    .globl " + name + "\n";
        ret += name + ":\n";
        for(var v:list) ret += v;
        ret += RetBlock;
//        ret += "\n";
        return ret;
    }
}
