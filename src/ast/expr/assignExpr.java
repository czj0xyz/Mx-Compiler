package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class assignExpr extends exprNode{
    public exprNode lexp,rexp;

    public assignExpr(exprNode l,exprNode r, BaseType type, Position pos) {
        super(type,pos);
        this.lexp = l;
        this.rexp = r;
    }

    @Override boolean Assignable() {
        return true;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
