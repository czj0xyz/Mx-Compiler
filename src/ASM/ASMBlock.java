package ASM;

import ASM.ASMInst.ASMInst;
import ASM.ASMInst.ASMMvInst;
import ASM.Operand.ASMReg;
import ASM.Operand.VirReg;
import IR.IRInst.IRInst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ASMBlock {
    public String label;
    public LinkedList<ASMInst> list = new LinkedList<>();

    public HashSet<ASMReg> use = new HashSet<>(),def = new HashSet<>();
    public HashSet<ASMReg> in = new HashSet<>(),out = new HashSet<>();

    public ArrayList<String> succ_str = new ArrayList<>();
    public ArrayList<ASMBlock> succ = new ArrayList<>();



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
        assert label != null;
        String ret = label + ":\n";
        for(var v:list)
            if(v instanceof ASMMvInst && v.rs1.toString().equals(v.rd.toString()) );
            else ret += v + "\n";
        return ret;
    }

    public void Update_use_def() {
        use.clear();
        def.clear();
        for(var inst: list) {
            for(var v:inst.use)
                if(!def.contains(v)) use.add(v);
            for(var v:inst.def) def.add(v);
        }
//        System.out.println(label + ":" + use.size() + ":" + def.size());
    }

    public boolean Update_live() {
        int in_sz = in.size(), out_sz = out.size();
        if(in.size() == 0) {
            for(var v:use) in.add(v);
        }
        for(var u: succ) {
            for(var v:u.in) out.add(v);
        }
        for(var v: out)if(!def.contains(v) && !in.contains(v))
            in.add(v);
        return in_sz != in.size() || out_sz != out.size();
    }
}