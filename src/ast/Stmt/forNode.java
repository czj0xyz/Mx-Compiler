package ast.Stmt;

import Util.Position;
import ast.expr.*;
import ast.ASTVisitor;

public class forNode extends StmtNode{
    public exprNode init,check,stp;

    public varDefNode init2;
    public StmtNode loop;

    public forNode() {}

    public forNode(varDefNode init2_,exprNode init_, exprNode check_, exprNode stp_, StmtNode lp_, Position position) {
        super(position);
        this.init2 = init2_;
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
