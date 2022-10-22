package ast.Stmt;

import Util.Position;

import java.util.ArrayList;
import ast.ASTVisitor;
public class classDefNode extends StmtNode{
    public String name;

    public ArrayList<funcDefNode> func = new ArrayList<>();
    public ArrayList<varDefNode> var = new ArrayList<>();

    public funcDefNode self;
    public boolean fl;

    public classDefNode(String name_,funcDefNode func,Position position,boolean f) {
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
