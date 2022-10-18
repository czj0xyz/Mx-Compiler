package ast.Stmt;

import Util.Position;
import Util.Type;
import ast.ASTVisitor;

import java.util.ArrayList;

public class varDefNode extends defNode{
    Type typename;
    ArrayList<AssignNode> assi = new ArrayList<>();

    public varDefNode(){}
    public varDefNode(Position position) {
        super(position);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
