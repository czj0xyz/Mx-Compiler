package IR;

import IR.IRInst.IRRetInst;
import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;

import java.util.ArrayList;
import java.util.LinkedList;

public class IRFunc {
    public String name;

    public LinkedList<IRBlock> block = new LinkedList<>();

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

        for(var v:block) ret += v;
        ret += RetBlock;
        ret += "}";
        return ret;
    }
}
