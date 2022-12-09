package ast;

import ast.Stmt.*;
import java.util.ArrayList;
import Util.*;

public class ProgramNode extends ASTNode {
    public defNode def;

    public ProgramNode(Position position){
        super(position);
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}
