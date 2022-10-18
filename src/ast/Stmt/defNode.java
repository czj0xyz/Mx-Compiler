package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;

public abstract class defNode extends StmtNode{
    public defNode(){}
    public defNode(Position position) {
        super(position);
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
