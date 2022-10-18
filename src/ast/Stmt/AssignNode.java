package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;
import ast.expr.*;
public class AssignNode extends StmtNode{
    String name;
    exprNode expr;
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
