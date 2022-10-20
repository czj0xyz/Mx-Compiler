package ast.Stmt;

import java.util.ArrayList;

import Util.Position;
import Util.Type.*;
import ast.ASTVisitor;

public class func_listNode extends StmtNode{
    public ArrayList<BaseType> type = new ArrayList<>();
    public ArrayList<String> var = new ArrayList<>();

    public func_listNode(Position p) {
        super(p);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
