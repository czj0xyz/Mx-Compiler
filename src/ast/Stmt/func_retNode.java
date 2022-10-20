package ast.Stmt;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class func_retNode extends StmtNode{
    public BaseType type;
    public String name;
    public func_listNode list;
    public blockNode block;

    public func_retNode(BaseType t,String n,func_listNode list_,blockNode b,Position p) {
        super(p);
        this.type=t;
        this.name=n;
        this.list=list_;
        this.block=b;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
