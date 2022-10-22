package ast.Stmt;

import Util.Position;
import ast.expr.*;
import ast.ASTVisitor;

public class lambdaNode extends StmtNode{
    public func_listNode list;
    public blockNode block;
    public arg_list arg;

    public lambdaNode(func_listNode list_,blockNode block_,arg_list arg_, Position position) {
        super(position);
        this.list = list_;
        this.block = block_;
        this.arg = arg_;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
