// Generated from E:/上个大学怎么这么多事/编译器/Mx-Compiler/src/grammar\MxCompiler.g4 by ANTLR 4.10.1

    package antlr;

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
	 * Visit a parse tree produced by {@link MxCompilerParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(MxCompilerParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(MxCompilerParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MxCompilerParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MxCompilerParser.ExprContext ctx);
}