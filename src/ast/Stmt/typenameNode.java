package ast.Stmt;

import Util.Position;
import Util.Type.*;
import ast.ASTVisitor;

public class typenameNode extends StmtNode{
    public BaseType t;
    public int sz;

    public typenameNode(BaseType tx, int s, Position position) {
        super(position);
        if(s>0)this.t = new ArrayType(tx,s);
        else this.t = tx;
        this.sz = s;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
