package IR.IRInst;

import Backend.IRPrinter;
import IR.IRType.IRPtrType;
import IR.IRValue.IRReg;
import IR.IRVisitor;

public class IRAllocaInst extends IRInst{
    public IRReg reg;
    public IRAllocaInst(IRReg reg) {
        super();
        this.reg = reg;
    }

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        assert reg.type instanceof IRPtrType;
        return "    "  + reg.toString_val() + " = alloca " + ((IRPtrType)reg.type).LoadType();
    }

}
