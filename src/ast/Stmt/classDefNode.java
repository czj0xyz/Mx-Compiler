package ast.Stmt;

import Util.Position;
import ast.ASTVisitor;
import ast.ASTNode;

import java.util.ArrayList;
public class classDefNode extends StmtNode{
    public String name;

    public ArrayList<funcDefNode> func = new ArrayList<>();
    public ArrayList<varDefNode> var = new ArrayList<>();

    public ASTNode self;
    boolean fl;

    public classDefNode(String name_,ASTNode func,Position position,boolean f) {
        super(position);

        this.name = name_;
        this.self = func;
        this.fl=f;

    }
    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
