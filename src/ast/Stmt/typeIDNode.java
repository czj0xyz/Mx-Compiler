package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;
import Util.Type.*;

public class typeIDNode extends StmtNode{
    public BaseType t;

    public typeIDNode(int id,Position position) {
        super(position);
        this.t = new BaseType(position,id);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
