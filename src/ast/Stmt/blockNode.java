package ast.Stmt;

import Util.Position;

import java.util.ArrayList;
import ast.ASTVisitor;

public class blockNode extends StmtNode{
    public ArrayList<StmtNode> list = new ArrayList<>();
    public blockNode(Position position) {
        super(position);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
