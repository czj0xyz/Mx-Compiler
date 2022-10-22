package ast.Stmt;

import Util.Position;
import ast.ASTNode;
import ast.ASTVisitor;
import ast.ProgramNode;

import java.util.ArrayList;

public class defNode extends StmtNode{
    public ArrayList<ASTNode> Def = new ArrayList<>();
    public defNode(){}
    public defNode(Position position) {
        super(position);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
