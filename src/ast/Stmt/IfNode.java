package ast.Stmt;
import Util.Position;
import ast.expr.*;
import ast.ASTVisitor;
public class IfNode extends StmtNode{

    public exprNode condition;
    public StmtNode statement;
    public elseNode el;

    public IfNode(exprNode condi, StmtNode sta, elseNode el_, Position p) {
        super(p);
        this.condition = condi;
        this.statement = sta;
        this.el = el_;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
