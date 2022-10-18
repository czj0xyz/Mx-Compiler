package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;

public class continueNode extends StmtNode{
    public continueNode(){}

    public continueNode(Position position) {
        super(position);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
