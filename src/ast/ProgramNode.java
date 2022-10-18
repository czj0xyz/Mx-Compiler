package ast;

import ast.Stmt.*;
import java.util.ArrayList;
import Util.*;

public class ProgramNode extends StmtNode {
    ArrayList<defNode> defs = new ArrayList<>();
    ProgramNode(){}

    ProgramNode(Position position){
        super(position);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
