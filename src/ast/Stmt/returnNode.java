package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;
import ast.expr.*;
public class returnNode extends StmtNode{
    public exprNode value;

    returnNode(exprNode v, Position position) {
        super(position);
        this.value = v;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
