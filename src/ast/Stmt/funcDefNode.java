package ast.Stmt;
import Util.Position;
import ast.ASTVisitor;
import ast.expr.*;

public class funcDefNode extends  StmtNode{
    public String name;
    public arg_list list;

    public funcDefNode(arg_list x,String name_,Position position) {
        super(position);

        this.name = name_;
        this.list = x;

    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
