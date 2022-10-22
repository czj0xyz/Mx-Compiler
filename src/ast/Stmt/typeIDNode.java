package ast.Stmt;

import Util.Position;
import Util.Type.*;
import ast.ASTVisitor;

public class typeIDNode extends StmtNode{
    public BaseType t;

    public typeIDNode(int id,Position position) {
        super(position);
        this.t = new BaseType(id);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
