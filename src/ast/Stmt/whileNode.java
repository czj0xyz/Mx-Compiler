package ast.Stmt;

import Util.Position;
import ast.expr.*;

import ast.ASTVisitor;
public class whileNode extends StmtNode{
    public exprNode check;
    public StmtNode loop;

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
