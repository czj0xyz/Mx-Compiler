package Frontend;

import Util.Position;
import Util.Type.*;
import ast.ProgramNode;
import ast.expr.*;
import grammar.MxCompilerParser;
import grammar.MxCompilerBaseVisitor;

import ast.ASTNode;
import ast.ProgramNode;
import ast.Stmt.*;

public class ASTbuilder extends MxCompilerBaseVisitor<ASTNode>{

    @Override
    public ASTNode visitProgram(MxCompilerParser.ProgramContext ctx) {
        ProgramNode ret = new ProgramNode(new Position(ctx));

        ret.def = (defNode) visit(ctx.children.get(0));

        return ret;
    }
    @Override
    public ASTNode visitDef(MxCompilerParser.DefContext ctx) {
        defNode ret = new defNode(new Position(ctx));
        for (int i = 0; i < ctx.children.size(); i++) {
            var son = ctx.children.get(i);
            if(son instanceof MxCompilerParser.VarDefContext)
                ret.Def.add( (varDefNode)visit(son) );
            else if(son instanceof MxCompilerParser.ClassDefContext)
                ret.Def.add( (classDefNode)visit(son) );
            else ret.Def.add( visit(son) );
        }
        return ret;
    }

    @Override
    public ASTNode visitVarDef(MxCompilerParser.VarDefContext ctx) {
        varDefNode ret = new varDefNode(new Position(ctx));

        var tmp = (typenameNode) visit(ctx.typename());

        ret.typename = tmp.t;

        for(var son : ctx.assignment())
            ret.assi.add( (AssignNode)visit(son) );
        return ret;
    }
    @Override
    public ASTNode visitAssignment(MxCompilerParser.AssignmentContext ctx) {
        var ret = new AssignNode(ctx.ID().toString(),(exprNode) visit(ctx.expr()),new Position(ctx));
        return ret;
    }
    @Override
    public ASTNode visitBlock(MxCompilerParser.BlockContext ctx) {
        var ret = new blockNode(new Position(ctx));

        for(var son : ctx.statement()) {
            var x = (StmtNode) visit(son);
            if(x!=null)ret.list.add(x);
        }

        return ret;
    }
    @Override
    public ASTNode visitStatement(MxCompilerParser.StatementContext ctx) {
        if(ctx.expr()!=null) return visit(ctx.expr());
        if(ctx.varDef()!=null) return visit(ctx.varDef());
        if(ctx.if_()!=null)return visit(ctx.if_());
        if(ctx.while_()!=null)return visit(ctx.while_());
        if(ctx.for_()!=null)return visit(ctx.for_());
        if(ctx.block()!=null)return visit(ctx.block());
        if(ctx.return_()!=null)return visit(ctx.return_());
        if(ctx.BREAK()!=null)return new breakNode(new Position(ctx));
        if(ctx.CONTINUE()!=null)return new continueNode(new Position(ctx));
        return null;
    }

    @Override
    public ASTNode visitArg_list(MxCompilerParser.Arg_listContext ctx) {
        var ret = new arg_list(new Position(ctx));
        for(var x: ctx.expr()) ret.list.add((exprNode) visit(x));
        return ret;
    }

    @Override
    public ASTNode visitSelfExpr(MxCompilerParser.SelfExprContext ctx) {
        var son = (exprNode)visit(ctx.expr());
        var ret = new selfExpr(son,son.type,new Position(ctx));
        return ret;
    }

    @Override
    public ASTNode visitArrayExpr(MxCompilerParser.ArrayExprContext ctx) {
        var son = (exprNode)visit(ctx.expr().get(0));
        var ret = new arrayExpr(son,son.type,new Position(ctx));
        for(int i=1;i<ctx.expr().size();i++)
            ret.list.add( (exprNode)visit(ctx.expr().get(i)) );
        return ret;
    }

    @Override
    public ASTNode visitMemberExpr(MxCompilerParser.MemberExprContext ctx) {
        var son = (exprNode)visit(ctx.expr());
        arg_list tmp = null;
        if(ctx.arg_list()!=null) tmp = (arg_list) visit(ctx.arg_list());
        var ret = new memberExpr(son,ctx.ID().toString(),tmp,son.type,new Position(ctx));
        return ret;
    }

    @Override
    public ASTNode visitLambdaExpr(MxCompilerParser.LambdaExprContext ctx) {
        func_listNode list = null;
        if(ctx.func_list()!=null)
            list = (func_listNode) visit(ctx.func_list());

        arg_list arg = null;
        if(ctx.arg_list()!=null)
            arg =  (arg_list) visit(ctx.arg_list());

        return new lambdaNode(list,(blockNode) visit(ctx.block()),arg,new Position(ctx));
    }

    @Override
    public ASTNode visitBinaryExpr_int(MxCompilerParser.BinaryExpr_intContext ctx) {
        var l = (exprNode) visit(ctx.expr().get(0));
        var r = (exprNode) visit(ctx.expr().get(1));
        return new binaryExpr(l,r,l.type,new Position(ctx),0);
    }
    @Override
    public ASTNode visitBinaryExpr_int_string(MxCompilerParser.BinaryExpr_int_stringContext ctx) {
        var l = (exprNode) visit(ctx.expr().get(0));
        var r = (exprNode) visit(ctx.expr().get(1));
        return new binaryExpr(l,r,l.type,new Position(ctx),1);
    }
    @Override
    public ASTNode visitBinaryExpr_all(MxCompilerParser.BinaryExpr_allContext ctx) {
        var l = (exprNode) visit(ctx.expr().get(0));
        var r = (exprNode) visit(ctx.expr().get(1));
        return new binaryExpr(l,r,l.type,new Position(ctx),2);
    }
    @Override
    public ASTNode visitBinaryExpr_int_bool(MxCompilerParser.BinaryExpr_int_boolContext ctx) {
        var l = (exprNode) visit(ctx.expr().get(0));
        var r = (exprNode) visit(ctx.expr().get(1));
        return new binaryExpr(l,r,l.type,new Position(ctx),3);
    }
    @Override
    public ASTNode visitBinaryExpr_bool(MxCompilerParser.BinaryExpr_boolContext ctx) {
        var l = (exprNode) visit(ctx.expr().get(0));
        var r = (exprNode) visit(ctx.expr().get(1));
        return new binaryExpr(l,r,l.type,new Position(ctx),4);
    }

    @Override
    public ASTNode visitAtomExpr(MxCompilerParser.AtomExprContext ctx) {
        if(ctx.ID()!=null)return new varNode(ctx.ID().toString(),new BaseType(),new Position(ctx));
        if(ctx.value()!=null) {
            int typeId=4;
            if(ctx.value().INT()!=null) typeId = 0;
            else if(ctx.value().TRUE()!=null||ctx.value().FALSE()!=null) typeId = 1;
            else if(ctx.value().STRING()!=null) typeId = 2;
            var type = new BaseType(typeId);
            var ret = new constNode(type,new Position(ctx));

            if(ctx.value().THIS()!=null)ret.isThis=true;
            else if(ctx.value().NULL()!=null)ret.isNull=true;

            return ret;
        }else if(ctx.NEW()==null) return (exprNode) visit(ctx.expr().get(0));
        else if(ctx.typename()!=null) {
            var tmp = (typenameNode) visit(ctx.typename());
            return new constNode(tmp.t,new Position(ctx));
        }else {
            var tmp = (typeIDNode) visit(ctx.typeID());
            BaseType ty = new ArrayType(tmp.t,ctx.LeftBracket().size());
            return new constNode(ty,new Position(ctx));
        }
    }
    @Override
    public ASTNode visitFuncExpr(MxCompilerParser.FuncExprContext ctx) {
        return new funcExpr(ctx.ID().toString(),(arg_list) visit(ctx.arg_list()),new BaseType(),new Position(ctx));
    }

    @Override
    public ASTNode visitAssignExpr(MxCompilerParser.AssignExprContext ctx){
        var l = (exprNode) visit(ctx.expr().get(0));
        var r = (exprNode) visit(ctx.expr().get(1));

        return new assignExpr(l,r,l.type,new Position(ctx));
    }

//    @Override
//    public ASTNode visitValue(MxCompilerParser.ValueContext ctx) {
//
//    }

    @Override
    public ASTNode visitTypeID(MxCompilerParser.TypeIDContext ctx) {
        int id=4;
        if(ctx.TINT()!=null)id=0;
        else if(ctx.TBOOL()!=null)id=1;
        else if(ctx.TSTRING()!=null)id=2;
        else if(ctx.ID()!=null)id=3;
        return new typeIDNode(id,new Position(ctx));
    }

    @Override
    public ASTNode visitTypename(MxCompilerParser.TypenameContext ctx) {
        return new typenameNode(((typeIDNode)visit(ctx.typeID())).t,ctx.LeftBracket().size(),new Position(ctx));
    }

    @Override
    public ASTNode visitReturn(MxCompilerParser.ReturnContext ctx) {
        return new returnNode((exprNode) visit(ctx.expr()) ,new Position(ctx));
    }

    @Override
    public ASTNode visitFunc_list(MxCompilerParser.Func_listContext ctx) {
        var ret = new func_listNode(new Position(ctx));
        for(int i=0;i<ctx.typename().size();i++) {
            var tmp = (typenameNode)visit(ctx.typename().get(i));
            ret.type.add(tmp.t);
        }

        for(int i=0;i<ctx.ID().size();i++)
            ret.var.add(ctx.ID().get(i).toString());
        return ret;
    }

    @Override
    public ASTNode visitFuncDef(MxCompilerParser.FuncDefContext ctx){
        var t = (typenameNode) visit(ctx.typename());
        return new funcDefNode(t.t,(func_listNode) visit(ctx.func_list()),
                (blockNode) visit(ctx.block()),ctx.ID().toString(),new Position(ctx));
    }

    @Override
    public ASTNode visitIf(MxCompilerParser.IfContext ctx) {
        var exp = (exprNode) visit(ctx.expr());
        var sta = (StmtNode) visit(ctx.statement());
        elseNode el = null;
        if(ctx.else_()!=null)el = (elseNode) visit(ctx.else_());
        return new IfNode(exp,sta,el,new Position(ctx));
    }

    @Override
    public ASTNode visitElse(MxCompilerParser.ElseContext ctx) {
        var sta = (StmtNode) visit(ctx.statement());
        return new elseNode(sta,new Position(ctx));
    }

    @Override
    public ASTNode visitWhile(MxCompilerParser.WhileContext ctx) {
        var exp = (exprNode) visit(ctx.expr());
        var sta = (StmtNode) visit(ctx.statement());
        return new whileNode(exp,sta,new Position(ctx));
    }

    @Override
    public ASTNode visitFor(MxCompilerParser.ForContext ctx){
        var condition = (exprNode) visit(ctx.conditionexpr);
        var stp = (exprNode) visit(ctx.stpexpr);
        exprNode init1 = null;
        if(ctx.initexpr != null) init1 = (exprNode) visit(ctx.initexpr);
        varDefNode init2 = null;
        if(ctx.initvar != null) init2 = (varDefNode) visit(ctx.initvar);
        var sta = (StmtNode) visit(ctx.statement());
        return new forNode(init2,init1,condition,stp,sta,new Position(ctx));
    }

    @Override
    public ASTNode visitClassDef(MxCompilerParser.ClassDefContext ctx) {
        Position p = new Position(ctx);
        String name = ctx.ID().get(0).toString();
        boolean fl = ctx.ID().size() <= 2;
        funcDefNode func = null;
        if(ctx.ID().size()>1) {
            var b = (blockNode) visit(ctx.block().get(0));
            func = new funcDefNode(new ClassType(p,name) ,new func_listNode(p), b, name , p);
        }
        var ret =new classDefNode(name,func,p,fl);
        for(int i=0;i<ctx.varDef().size();i++)
            ret.var.add((varDefNode) visit(ctx.varDef().get(i)));

        for(int i=0;i<ctx.funcDef().size();i++)
            ret.func.add((funcDefNode) visit(ctx.funcDef().get(i)));

        return ret;
    }

}
