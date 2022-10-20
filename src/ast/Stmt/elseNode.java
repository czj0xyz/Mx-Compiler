package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;
import ast.expr.exprNode;

public class elseNode extends StmtNode{
    public StmtNode statement;

    public elseNode(StmtNode sta, Position p) {
        super(p);
        this.statement = sta;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
