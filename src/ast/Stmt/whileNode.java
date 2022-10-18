package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;
import ast.expr.*;

public class whileNode extends StmtNode{
    exprNode check;
    StmtNode loop;

    public whileNode(){}

    public whileNode(exprNode c, StmtNode l, Position position) {
        super(position);
        this.check = c;
        this.loop = l;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
