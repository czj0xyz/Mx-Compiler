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

    String op;

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
}
