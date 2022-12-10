package ast.expr;

import Util.Position;
import Util.Type.BaseType;
import ast.ASTVisitor;

public class binaryExpr extends exprNode{

    public enum operator{
        _int,
        _int_string,
        _all,
        _int_bool,
        _bool;
    };

    public exprNode lexp,rexp;
    public operator op;
    public boolean bl_int_string;

    public binaryExpr(exprNode l,exprNode r, BaseType type, Position pos,int op_) {
        super(type,pos);
        this.lexp = l;
        this.rexp = r;
        switch (op_) {
            case 0: this.op = operator._int; break;
            case 1: this.op = operator._int_string; break;
            case 2: this.op = operator._all; break;
            case 3: this.op = operator._int_bool; break;
            default: this.op = operator._bool; break;
        }
        this.bl_int_string=false;
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}