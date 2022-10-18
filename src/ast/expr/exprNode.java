package ast.expr;

import Util.Position;
import ast.*;

public abstract class exprNode extends ASTNode {
    exprNode(Position position) {
        super(position);
    }
    exprNode() {}

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
