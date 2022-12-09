package ast.Stmt;

import Util.Position;
import Util.Type.*;
import ast.ASTVisitor;

public class typeIDNode extends StmtNode{
    public BaseType t;

    public typeIDNode(int id, String s ,Position position) {
        super(position);
        if(id!=3)this.t = new BaseType(id);
        else {
            this.t = new ClassType(position,s);
        }
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
