package ast.Stmt;

import Util.Position;
import ast.*;

public abstract class StmtNode extends ASTNode{
    public StmtNode(Position position) {
        super(position);
    }
    public StmtNode(){}

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
