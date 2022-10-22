package ast.expr;

import Util.Position;
import Util.Type.*;
import ast.ASTVisitor;

public class varNode extends exprNode{
    public  String name;
    public varNode(String name_,BaseType type,Position pos) {
        super(type,pos);
        this.name = name_;
    }

    @Override public boolean Assignable() {
        return true;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
