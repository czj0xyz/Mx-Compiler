package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;
import ast.expr.*;

public class ExprStmtNode extends StmtNode{
    public exprNode expr;
    public ExprStmtNode(exprNode exp_,Position position) {
        super(position);
        this.expr = exp_;
    }
    public ExprStmtNode(){}

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
