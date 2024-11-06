// Generated from c:/Users/nfout/OneDrive/Desktop/MIZZOU/FALL2024/Popl/GroupProject/Attempt_03/TMNH-PoPL-Project/TMNH.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TMNHParser}.
 */
public interface TMNHListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TMNHParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TMNHParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TMNHParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TMNHParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TMNHParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TMNHParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TMNHParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TMNHParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TMNHParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TMNHParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TMNHParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TMNHParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TMNHParser#math_op}.
	 * @param ctx the parse tree
	 */
	void enterMath_op(TMNHParser.Math_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TMNHParser#math_op}.
	 * @param ctx the parse tree
	 */
	void exitMath_op(TMNHParser.Math_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link TMNHParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(TMNHParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link TMNHParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(TMNHParser.Assign_opContext ctx);
}