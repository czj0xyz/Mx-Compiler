package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class selfExpr extends exprNode{
    public exprNode son;
    public BaseType op;
    public boolean modi,asi;
    public boolean Pre;
    public String opstr;
    public selfExpr(exprNode _son, BaseType type, boolean modi_, boolean Pre, Position pos) {
        super(type,pos);
        this.son = _son;
        this.modi = modi_;
        this.asi = false;
        this.Pre = Pre;
    }

    @Override public boolean Assignable() {
        return asi;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
