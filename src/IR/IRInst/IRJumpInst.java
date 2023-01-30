package IR.IRInst;

import IR.IRBlock;
import IR.IRVisitor;
import ast.ASTVisitor;

public class IRJumpInst extends IRInst{
    public IRBlock to;
    public IRJumpInst(IRBlock to) {
        super();
        this.to = to;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "    br label %" + to.get_label();
    }

}
