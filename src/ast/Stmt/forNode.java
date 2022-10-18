package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;
import ast.expr.*;

public class forNode extends StmtNode{
    exprNode init,check,stp;
    StmtNode loop;

    public forNode() {}

    public forNode(exprNode init_, exprNode check_, exprNode stp_, StmtNode lp_, Position position) {
        super(position);
        this.init = init_;
        this.check = check_;
        this.stp = stp_;
        this.loop = lp_;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
