package com.compiler.javaantlr;

// Generated from exemploSlide.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exemploSlideParser}.
 */
public interface exemploSlideListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exemploSlideParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(exemploSlideParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploSlideParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(exemploSlideParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploSlideParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(exemploSlideParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploSlideParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(exemploSlideParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploSlideParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(exemploSlideParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploSlideParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(exemploSlideParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link exemploSlideParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(exemploSlideParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link exemploSlideParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(exemploSlideParser.FactorContext ctx);
}