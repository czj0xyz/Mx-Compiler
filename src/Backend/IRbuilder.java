package Backend;

import IR.IRBlock;
import IR.IRModule;
import IR.IRType.IRType;
import Util.Scope.GlobalScope;
import Util.Scope.Scope;
import Util.Type.BaseType;
import ast.ASTNode;
import ast.ASTVisitor;
import ast.ProgramNode;
import ast.Stmt.*;
import ast.expr.*;

public class IRbuilder implements ASTVisitor {
    public IRBlock curblock;
    public IRModule irModule;
    private Scope scope;
    private GlobalScope globalScope;

    private IRType AssignType;

    public IRbuilder(GlobalScope g) {
        this.globalScope = g;
        curblock = new IRBlock();
        scope = new Scope();
    }

    public IRModule buildIR(ProgramNode rt) {
        visit(rt);
        return irModule;
    }

    private IRType TransType(BaseType type) {
        return null;
    }

    public void visit(ProgramNode it){}

    public void visit(AssignNode it){}

    public void visit(blockNode it){}

    public void visit(breakNode it){}

    public void visit(classDefNode it){}

    public void visit(continueNode it){}

    public void visit(defNode it){}

    public void visit(elseNode it){}

    public void visit(forNode it){}

    public void visit(func_listNode it){}

    public void visit(funcDefNode it){}

    public void visit(IfNode it){}

    public void visit(lambdaNode it){}

    public void visit(returnNode it){}

    public void visit(varDefNode it){}

    public void visit(whileNode it){}

    public void visit(ExprStmtNode it){}

    public void visit(typeIDNode it){}

    public void visit(typenameNode it){}

    public void visit(arg_list it){}

    public void visit(arrayExpr it){}

    public void visit(assignExpr it){}

    public void visit(binaryExpr it){}

    public void visit(constNode it){}

    public void visit(exprNode it){}

    public void visit(funcExpr it){}

    public void visit(memberExpr it){}

    public void visit(selfExpr it){}

    public void visit(varNode it){}

}
