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

    String op;

    public IRSelfInst(IRBasicValue val) {
        super();
        this.rs = val;
    }

    @Override
    public void accept(IRVisitor visitor){
        visitor.visit(this);
    }
}
