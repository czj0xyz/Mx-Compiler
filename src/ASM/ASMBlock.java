package ASM;

import ASM.ASMInst.ASMInst;

import java.util.LinkedList;

public class ASMBlock {
    public String label;
    public LinkedList<ASMInst> list = new LinkedList<>();

    public ASMBlock(String label) {
        this.label = label;
    }

    public void push_back(ASMInst inst){
        list.addLast(inst);
    }

    public void push_front(ASMInst inst){
        list.addFirst(inst);
    }

    public String toString() {
        String ret = label + ":\n";
        for(var v:list)ret += v + "\n";
        return ret;
    }
}
