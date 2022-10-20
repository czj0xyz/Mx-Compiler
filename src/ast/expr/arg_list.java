package ast.expr;

import java.util.ArrayList;

import Util.Position;
import ast.ASTNode;
import ast.ASTVisitor;

public class arg_list extends ASTNode{
    public ArrayList<exprNode> list = new ArrayList<>();

    public arg_list(Position pos) {
        super(pos);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
