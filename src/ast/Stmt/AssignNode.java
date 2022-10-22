package ast.Stmt;

import Util.Position;
import ast.expr.*;
import ast.ASTVisitor;
public class AssignNode extends StmtNode{
    public String name;
    public exprNode expr;
    public AssignNode(){}
    public AssignNode(String s, exprNode p, Position position){
        super(position);
        this.name = s;
        this.expr = p;
    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
