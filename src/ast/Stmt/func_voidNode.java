package ast.Stmt;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class func_voidNode extends StmtNode{
    public String name;
    public func_listNode list;
    public blockNode block;

    public func_voidNode(String n, func_listNode list_, blockNode b, Position p) {
        super(p);
        this.name=n;
        this.list=list_;
        this.block=b;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
