package ast;

import ast.Stmt.*;
import ast.expr.*;

public interface ASTVisitor {
//    void visit(ASTNode it);
//    void visit(StmtNode it);
    void visit(ProgramNode it);
    void visit(AssignNode it);
    void visit(blockNode it);
    void visit(breakNode it);
    void visit(classDefNode  it);
    void visit(continueNode it);
    void visit(defNode it);
    void visit(elseNode it);
    void visit(forNode it);
    void visit(func_listNode it);
    void visit(funcDefNode it);
    void visit(IfNode it);
    void visit(lambdaNode it);
    void visit(returnNode it);
    void visit(varDefNode it);
    void visit(whileNode it);
    void visit(ExprStmtNode it);
    void visit(typeIDNode it);
    void visit(typenameNode it);
    void visit(arg_list it);
    void visit(arrayExpr it);
    void visit(assignExpr it);
    void visit(binaryExpr it);
    void visit(constNode it);
    void visit(exprNode it);
    void visit(funcExpr it);
    void visit(memberExpr it);
    void visit(selfExpr it);
    void visit(varNode it);
}
