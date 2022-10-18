package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;

public class breakNode extends StmtNode{
    public breakNode(){}

    public breakNode(Position position) {
        super(position);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
