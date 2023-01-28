package IR;

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

}
