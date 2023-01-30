package ast;

import IR.IRValue.IRBasicValue;
import IR.IRValue.IRReg;
import Util.*;
public abstract class ASTNode {
    public Position position;
    public IRBasicValue val;
    public IRBasicValue Ptr;

    public ASTNode(){
        this.val = null;
        this.Ptr = null;
    }

    public ASTNode(Position position_) {
        position = position_;
    }
    abstract public void accept(ASTVisitor visitor);

}
