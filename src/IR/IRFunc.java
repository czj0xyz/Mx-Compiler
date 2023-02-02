package IR;

import IR.IRInst.IRAllocaInst;
import IR.IRInst.IRRetInst;
import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;

import java.util.ArrayList;
import java.util.LinkedList;

public class IRFunc {
    public String name;

    public LinkedList<IRBlock> block = new LinkedList<>();
    public ArrayList<IRAllocaInst> allocaInsts = new ArrayList<>();

    public ArrayList<IRReg> arg_list = new ArrayList<>();

    public IRType RetType;
    public IRReg retVal;
    public IRBlock RetBlock;

    public IRFunc(String name,IRType RetType) {
        this.name = name;
        this.RetType = RetType;
    }

    public void push_back(IRBlock b) {
        block.add(b);
    }

    public void push_inst(IRAllocaInst inst) {
        allocaInsts.add(inst);
    }

    public void add_arg(IRReg t) {
        arg_list.add(t);
    }

    public String toString() {
        String ret = "define " + RetType + " @" + name + "(";
        for(int i=0;i < arg_list.size();i++) {
            ret += arg_list.get(i).toString_type_val();
            if(i+1 < arg_list.size())ret+=",";
        }
        ret += "){\n";
        boolean First = true;
        for(var v:block){
            if(First) ret += v.toString(allocaInsts);
            else ret += v;
            First = false;
        }
        ret += RetBlock;
        ret += "}";
        return ret;
    }
}
