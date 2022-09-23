// Generated from E:/上个大学怎么这么多事/编译器/Mx-Compiler/src/grammar\MxCompiler.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MxCompilerParser}.
 */
public interface MxCompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(MxCompilerParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(MxCompilerParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MxCompilerParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(MxCompilerParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MxCompilerParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(MxCompilerParser.SentenceContext ctx);
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
}