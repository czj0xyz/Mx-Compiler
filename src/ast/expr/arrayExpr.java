package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

import java.util.ArrayList;

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

}