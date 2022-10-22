// Generated from E:/上个大学怎么这么多事/编译器/MxCompiler/Mx-Compiler/src/grammar\MxCompiler.g4 by ANTLR 4.10.1
package grammar;
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
	 * Enter a parse tree produced by {@link MxCompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MxCompilerParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MxCompilerParser.BlockContext ctx);
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
	 * Enter a parse tree produced by the {@code SelfExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpr(MxCompilerParser.SelfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpr(MxCompilerParser.SelfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr_int}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr_int(MxCompilerParser.BinaryExpr_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr_int}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr_int(MxCompilerParser.BinaryExpr_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr_int_bool}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr_int_bool(MxCompilerParser.BinaryExpr_int_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr_int_bool}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr_int_bool(MxCompilerParser.BinaryExpr_int_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(MxCompilerParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(MxCompilerParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr_int_string}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr_int_string(MxCompilerParser.BinaryExpr_int_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr_int_string}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr_int_string(MxCompilerParser.BinaryExpr_int_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(MxCompilerParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(MxCompilerParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(MxCompilerParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(MxCompilerParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(MxCompilerParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(MxCompilerParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr_all}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr_all(MxCompilerParser.BinaryExpr_allContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr_all}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr_all(MxCompilerParser.BinaryExpr_allContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(MxCompilerParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(MxCompilerParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr_bool}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr_bool(MxCompilerParser.BinaryExpr_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr_bool}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr_bool(MxCompilerParser.BinaryExpr_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MxCompilerParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MxCompilerParser.AssignExprContext ctx);
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
	 * Enter a parse tree produced by {@link MxCompilerParser#typeID}.
	 * @param ctx the parse tree
	 */
	void enterTypeID(MxCompilerParser.TypeIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#typeID}.
	 * @param ctx the parse tree
	 */
	void exitTypeID(MxCompilerParser.TypeIDContext ctx);
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