package IR.IRInst;

import IR.IRVisitor;

public abstract class IRInst {
    IRInst() {}

    abstract public void accept(IRVisitor visitor);

    public String toString() {
        return "";
    }
}
