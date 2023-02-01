package IR.IRInst;

import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import IR.IRVisitor;

/*
++ addi
-- addi
- neg
~ not
+ do nothing
 */
public class IRSelfInst extends IRInst{

    public IRBasicValue rs;
    public IRReg rd;

    public String op;

    public IRSelfInst(IRBasicValue rs,IRReg rd,String op) {
        super();
        this.rs = rs;
        this.rd = rd;
        this.op = op;
    }

    @Override
    public void accept(IRVisitor visitor){
        visitor.visit(this);
    }

    @Override
    public String toString() {
        if(op.equals("PlusPlus"))
            return "    " + rd.toString_val() + " = " + "add i32 1, " + rs.toString_val();
        else if(op.equals("MinusMinus"))
            return "    " + rd.toString_val() + " = " + "add i32 -1, " + rs.toString_val();
        else if(op.equals("neg"))
            return "    " + rd.toString_val() + " = " + "mul i32 -1, " + rs.toString_val();
        else
            return "    " + rd.toString_val() + " = " + op + " " + rs.toString_type_val();
    }
}
