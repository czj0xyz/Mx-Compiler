package ast.Stmt;
import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class funcDefNode extends  StmtNode{
    public String name;
    public BaseType ret;
    public func_listNode list;
    public blockNode block;

    public funcDefNode(BaseType Ret, func_listNode x, blockNode block_, String name_, Position position) {
        super(position);

        this.name = name_;
        this.list = x;
        this.ret = Ret;
        this.block = block_;

    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
