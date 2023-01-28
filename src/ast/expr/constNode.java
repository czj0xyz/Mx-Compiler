package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

import java.util.ArrayList;

public class constNode extends exprNode{
    public int wh;
    public boolean isThis,isNull;
    public ArrayList<exprNode> expr = new ArrayList<>();
    public int num;
    public String str;
    public boolean flg;


    public constNode(BaseType type, Position pos) {
        super(type,pos);
        this.isThis = this.isNull = false;
    }

    @Override public boolean Assignable() {
        if(isThis)return true;
        return false;
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