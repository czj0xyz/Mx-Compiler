// Generated from E:/上个大学怎么这么多事/编译器/MxCompiler/Mx-Compiler/src/grammar\MxCompiler.g4 by ANTLR 4.10.1
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
	 * Visit a parse tree produced by {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MxCompilerParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MxCompilerParser.ValueContext ctx);
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
	 * Visit a parse tree produced by {@link MxCompilerParser#func_ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_ret(MxCompilerParser.Func_retContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#func_void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_void(MxCompilerParser.Func_voidContext ctx);
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