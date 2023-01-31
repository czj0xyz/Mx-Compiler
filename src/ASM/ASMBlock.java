package ASM;

import ASM.ASMInst.ASMInst;

import java.util.LinkedList;

public class ASMBlock {
    public String label;
    public LinkedList<ASMInst> list = new LinkedList<>();

    public ASMBlock(String label) {
        this.label = label;
    }

    public String toString() {
        return "";
    }

    public void push_back(ASMInst inst){
        list.addLast(inst);
    }

    public void push_front(ASMInst inst){
        list.addFirst(inst);
    }
}
