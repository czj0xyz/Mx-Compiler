package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.*;
import ast.ASTVisitor;
import IR.IRValue.IRBasicValue;

public abstract class exprNode extends ASTNode {
    public BaseType type;
    public IRBasicValue val;
    exprNode(BaseType t,Position position) {
        super(position);
        this.type = t;
    }
    exprNode() {}

    public boolean isConst() {
        return false;
    }

    public boolean Assignable() {
        return false;
    }
    public boolean isNull() {
        return false;
    }
    public boolean isThis() {
        return false;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}