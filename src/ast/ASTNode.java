package ast;

import Util.*;
public abstract class ASTNode {
    public Position position;

    public ASTNode(){}

    public ASTNode(Position position_) {
        position = position_;
    }
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

}
