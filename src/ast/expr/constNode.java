package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class constNode extends exprNode{
    public boolean isThis,isNull;


    public constNode(BaseType type, Position pos) {
        super(type,pos);
        this.isThis = this.isNull = false;
    }

    @Override public boolean isConst() {
        return true;
    }
    @Override
    public boolean isThis() {
        return isThis;
    }
    @Override
    public boolean isNull() {
        return isNull;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}