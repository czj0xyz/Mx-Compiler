package Frontend;

import Util.Scope.GlobalScope;
import Util.error.SemanticError;
import ast.*;
import ast.Stmt.*;
import ast.expr.*;
import Util.Type.*;


public class SymbolCollector  implements ASTVisitor {
    private GlobalScope all;
    public SymbolCollector(GlobalScope all_) {
        this.all = all_;
    }
    @Override public void visit(ProgramNode it) {
        it.def.accept(this);
        if(!all.containsfunc("main"))
            throw new SemanticError("Cannot find main function ",it.position);

        if(!all.getFunc("main").ret.getType().equals("int"))
            throw new SemanticError("main function must return int value ",it.position);
    }

    @Override public void visit(defNode it) {
        for(int i=0;i<it.Def.size();i++)
            it.Def.get(i).accept(this);
    }

    @Override public void visit(funcDefNode it) {
        //insert func
        var ad = new FuncType(it.position,it.name,it.ret);
        for(var v: it.list.type)ad.push(v);

        all.put_func(ad,it.name);
    }

    @Override public void visit(classDefNode it) {

        if(it.fl==true)
            throw new SemanticError("Self-construction function error: ",it.position);

        var c = new ClassType(it.position,it.name);

        for(var f:it.func){
            var ad = new FuncType(f.position,f.name,f.ret);
            for(var v: f.list.type)ad.push(v);
            c.putFunc(ad,ad.name,f.position);
        }
        c.putFunc(new FuncType(it.position, it.name, c),it.name,it.position);

        for(var v:it.var)
            for(var u:v.assi){
                c.pushMem(v.typename, u.name,u.position);
            }

        all.put_class(c,it.name,it.position);
    }

    @Override public void visit(AssignNode it) {}
    @Override public void visit(blockNode it) {}
    @Override public void visit(breakNode it) {}
    @Override public void visit(continueNode it) {}
    @Override public void visit(elseNode it) {}
    @Override public void visit(forNode it) {}
    @Override public void visit(func_listNode it) {}
    @Override public void visit(IfNode it) {}
    @Override public void visit(lambdaNode it) {}
    @Override public void visit(returnNode it) {}
    @Override public void visit(varDefNode it) {}
    @Override public void visit(whileNode it) {}
    @Override public void visit(ExprStmtNode it) {}
    @Override public void visit(typeIDNode it) {}
    @Override public void visit(typenameNode it) {}
    @Override public void visit(arg_list it) {}
    @Override public void visit(arrayExpr it) {}
    @Override public void visit(assignExpr it) {}
    @Override public void visit(binaryExpr it) {}
    @Override public void visit(constNode it) {}
    @Override public void visit(exprNode it) {}
    @Override public void visit(funcExpr it) {}
    @Override public void visit(memberExpr it) {}
    @Override public void visit(selfExpr it) {}
    @Override public void visit(varNode it) {}
}
