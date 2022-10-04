// Generated from E:/上个大学怎么这么多事/编译器/Mx-Compiler/src/grammar\MxCompiler.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxCompilerParser}.
 */
public interface MxCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MxCompilerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MxCompilerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(MxCompilerParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(MxCompilerParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(MxCompilerParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(MxCompilerParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MxCompilerParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MxCompilerParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MxCompilerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MxCompilerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(MxCompilerParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(MxCompilerParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MxCompilerParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MxCompilerParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MxCompilerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MxCompilerParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#typename}.
	 * @param ctx the parse tree
	 */
	void enterTypename(MxCompilerParser.TypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#typename}.
	 * @param ctx the parse tree
	 */
	void exitTypename(MxCompilerParser.TypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(MxCompilerParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(MxCompilerParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#func_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_list(MxCompilerParser.Func_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#func_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_list(MxCompilerParser.Func_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#func_ret}.
	 * @param ctx the parse tree
	 */
	void enterFunc_ret(MxCompilerParser.Func_retContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#func_ret}.
	 * @param ctx the parse tree
	 */
	void exitFunc_ret(MxCompilerParser.Func_retContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#func_void}.
	 * @param ctx the parse tree
	 */
	void enterFunc_void(MxCompilerParser.Func_voidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#func_void}.
	 * @param ctx the parse tree
	 */
	void exitFunc_void(MxCompilerParser.Func_voidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(MxCompilerParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(MxCompilerParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(MxCompilerParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(MxCompilerParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(MxCompilerParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(MxCompilerParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MxCompilerParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MxCompilerParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(MxCompilerParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(MxCompilerParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MxCompilerParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MxCompilerParser.ClassDefContext ctx);
}