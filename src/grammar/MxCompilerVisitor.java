// Generated from java-escape by ANTLR 4.11.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MxCompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MxCompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MxCompilerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(MxCompilerParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(MxCompilerParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MxCompilerParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MxCompilerParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MxCompilerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(MxCompilerParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#exprstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprstmt(MxCompilerParser.ExprstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfExpr(MxCompilerParser.SelfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr_int}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr_int(MxCompilerParser.BinaryExpr_intContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr_int_bool}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr_int_bool(MxCompilerParser.BinaryExpr_int_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(MxCompilerParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr_int_string}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr_int_string(MxCompilerParser.BinaryExpr_int_stringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberExpr(MxCompilerParser.MemberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(MxCompilerParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(MxCompilerParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr_all}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr_all(MxCompilerParser.BinaryExpr_allContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(MxCompilerParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr_bool}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr_bool(MxCompilerParser.BinaryExpr_boolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExpr}
	 * labeled alternative in {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(MxCompilerParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MxCompilerParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#typeID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeID(MxCompilerParser.TypeIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#typename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypename(MxCompilerParser.TypenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(MxCompilerParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#func_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_list(MxCompilerParser.Func_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(MxCompilerParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(MxCompilerParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(MxCompilerParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(MxCompilerParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(MxCompilerParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(MxCompilerParser.ClassDefContext ctx);
}