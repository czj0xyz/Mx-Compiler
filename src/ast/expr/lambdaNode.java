package ast.expr;

import Util.Position;
import Util.Type.*;
import ast.ASTVisitor;
import ast.Stmt.blockNode;
import ast.Stmt.func_listNode;
import ast.expr.*;

public class lambdaNode extends exprNode {
    public func_listNode list;
    public blockNode block;
    public arg_list arg;
    public boolean flg;

    public lambdaNode(func_listNode list_,blockNode block_,arg_list arg_, boolean flg_,Position position) {
        super(new BaseType(4),position);
        this.list = list_;
        this.block = block_;
        this.arg = arg_;
        this.flg = flg_;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}