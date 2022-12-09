package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class memberExpr extends exprNode{
    public exprNode rt;
    public String name;
    public arg_list list;

    public memberExpr(exprNode Rt,String name_, arg_list l_, BaseType type, Position pos) {
        super(type,pos);
        this.rt = Rt;
        this.name = name_;
        this.list = l_;
    }

    @Override public boolean Assignable() {
        if(list==null)return true;
        else return false;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
