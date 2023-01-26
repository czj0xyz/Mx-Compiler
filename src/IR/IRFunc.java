package IR;

import IR.IRType.IRType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;

import java.util.ArrayList;
import java.util.LinkedList;

public class IRFunc {

    public LinkedList<IRBlock> block = new LinkedList<>();

    public ArrayList<IRType> arg_list = new ArrayList<>();

    public int Size;

    public IRReg ret_reg;

    public IRFunc(IRReg ret_reg) {
        this.ret_reg = ret_reg;
    }

    public void SetSize(int sz) {
        this.Size = sz;
    }

    public void push_back(IRBlock b) {
        block.add(b);
    }

    public void add_arg(IRType t) {
        arg_list.add(t);
    }

    public int Query_Sz() {
        int ret = Size;
        for(var v:arg_list) {
            ret += v.Size();
        }
        return ret;
    }
}
