package IR;

import java.util.ArrayList;
import java.util.LinkedList;

import IR.IRInst.*;


public class IRBlock {
    public String label;
    public LinkedList<IRInst> list = new LinkedList<>();
    public IRInst terminalInst = null;
    public int id;
    public static int cnt = 0;
    public boolean hv_ret;

    public IRBlock(String label) {
        this.label = label;
        this.id = ++cnt;
        this.hv_ret = false;
    }

    public IRBlock(String label,IRInst b) {
        this.label = label;
        this.id = ++cnt;
        terminalInst = b;
        this.hv_ret = false;
    }

    public String get_label() {
        return label + "_" + Integer.toString(id);
    }

    public void push_back(IRInst v) {
        if(!hv_ret)list.addLast(v);
    }

    public void push_front(IRInst v) {
        list.addFirst(v);
    }

    public String toString() {

        String ret = get_label() + ": \n";

        for(var v:list) ret += v + "\n";

        if(terminalInst != null)ret += terminalInst + "\n";

        return ret;
    }

    public String toString(ArrayList<IRAllocaInst> insts) {

        String ret = get_label() + ": \n";

        for(var v:insts) ret += v + "\n";

        for(var v:list) ret += v + "\n";

        if(terminalInst != null)ret += terminalInst + "\n";

        return ret;
    }
}
