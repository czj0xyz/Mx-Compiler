package IR.IRInst;

import IR.IRType.IRType;
import IR.IRType.IRVoidType;
import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

import java.util.ArrayList;

public class IRCallInst extends IRInst{
    public String func_name;
    public IRType retType;
    public IRReg rd;
    public ArrayList<IRBasicValue> arg_list = new ArrayList<>();


    public IRCallInst(String name, IRType retType, IRReg rd) {
        super();
        this.func_name = name;
        this.retType = retType;
        this.rd = rd;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        String ret = "    ";
        if(retType instanceof IRVoidType)
            ret += "call void @" + func_name + "(";
        else ret += rd.toString_val() + " = call " + retType + " @" + func_name + "(";
        for(int i=0;i<arg_list.size();i++) {
            ret += arg_list.get(i).toString_type_val();
            if(i+1<arg_list.size())
                ret += ", ";
        }
        ret += ")";
        return ret;
    }
}
