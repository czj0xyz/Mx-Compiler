package ast.Stmt;

import Util.Position;
import ast.expr.*;
import ast.ASTVisitor;
public class returnNode extends StmtNode{
    public exprNode value;

    public returnNode(exprNode v, Position position) {
        super(position);
        this.value = v;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
