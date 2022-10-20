package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class funcExpr extends exprNode{
    public String name;
    public arg_list list;

    public funcExpr(String name_,arg_list l_, BaseType type, Position pos) {
        super(type,pos);
        this.name = name_;
        this.list = l_;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
