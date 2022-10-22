package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class selfExpr extends exprNode{
    public exprNode son;

    public selfExpr(exprNode _son, BaseType type, Position pos) {
        super(type,pos);
        this.son = _son;
    }

    @Override public boolean Assignable() {
        return true;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
