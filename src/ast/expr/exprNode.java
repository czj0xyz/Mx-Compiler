package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.*;

public abstract class exprNode extends ASTNode {
    public BaseType type;
    exprNode(BaseType t,Position position) {
        super(position);
        this.type = t;
    }
    exprNode() {}

    boolean isConst() {
        return false;
    }

    boolean Assignable() {
        return false;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}