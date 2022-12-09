package ast.expr;

import Util.Position;
import Util.Type.BaseType;

import java.util.ArrayList;
import ast.ASTVisitor;

public class arrayExpr extends exprNode{
    public exprNode rt;

    public ArrayList<exprNode> list = new ArrayList<>();

    public arrayExpr(exprNode Rt , BaseType type, Position pos) {
        super(type,pos);
        this.rt = Rt;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean Assignable() {
        return true;
    }
}
