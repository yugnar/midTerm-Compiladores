// Generated from C:/Users/rafae/Documents/ITESM/Octavo_Semestre/Compiladores/Examen Midterm/Final Entregable/src\RegexGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RegexGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RegexGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code SimpleReRe}
	 * labeled alternative in {@link RegexGrammarParser#re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleReRe(RegexGrammarParser.SimpleReReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnionRe}
	 * labeled alternative in {@link RegexGrammarParser#re}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionRe(RegexGrammarParser.UnionReContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexGrammarParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(RegexGrammarParser.UnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BasicReSimpleRe}
	 * labeled alternative in {@link RegexGrammarParser#simpleRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicReSimpleRe(RegexGrammarParser.BasicReSimpleReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConcatenationSimpleRe}
	 * labeled alternative in {@link RegexGrammarParser#simpleRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenationSimpleRe(RegexGrammarParser.ConcatenationSimpleReContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexGrammarParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(RegexGrammarParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarBasicRe}
	 * labeled alternative in {@link RegexGrammarParser#basicRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarBasicRe(RegexGrammarParser.StarBasicReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusBasicRe}
	 * labeled alternative in {@link RegexGrammarParser#basicRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusBasicRe(RegexGrammarParser.PlusBasicReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementaryReBasicRe}
	 * labeled alternative in {@link RegexGrammarParser#basicRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementaryReBasicRe(RegexGrammarParser.ElementaryReBasicReContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexGrammarParser#star}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(RegexGrammarParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexGrammarParser#plus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(RegexGrammarParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupElementaryRe}
	 * labeled alternative in {@link RegexGrammarParser#elementaryRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupElementaryRe(RegexGrammarParser.GroupElementaryReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyElementaryRe}
	 * labeled alternative in {@link RegexGrammarParser#elementaryRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyElementaryRe(RegexGrammarParser.AnyElementaryReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EosElementaryRe}
	 * labeled alternative in {@link RegexGrammarParser#elementaryRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEosElementaryRe(RegexGrammarParser.EosElementaryReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetraElementaryRe}
	 * labeled alternative in {@link RegexGrammarParser#elementaryRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetraElementaryRe(RegexGrammarParser.LetraElementaryReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetElementaryRe}
	 * labeled alternative in {@link RegexGrammarParser#elementaryRe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetElementaryRe(RegexGrammarParser.SetElementaryReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReGroup}
	 * labeled alternative in {@link RegexGrammarParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReGroup(RegexGrammarParser.ReGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexGrammarParser#any}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny(RegexGrammarParser.AnyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexGrammarParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(RegexGrammarParser.EosContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexGrammarParser#letra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetra(RegexGrammarParser.LetraContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexGrammarParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(RegexGrammarParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetItemSetItems}
	 * labeled alternative in {@link RegexGrammarParser#setItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetItemSetItems(RegexGrammarParser.SetItemSetItemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetItemsSetItems}
	 * labeled alternative in {@link RegexGrammarParser#setItems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetItemsSetItems(RegexGrammarParser.SetItemsSetItemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RangeSetItem}
	 * labeled alternative in {@link RegexGrammarParser#setItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeSetItem(RegexGrammarParser.RangeSetItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetraSetItem}
	 * labeled alternative in {@link RegexGrammarParser#setItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetraSetItem(RegexGrammarParser.LetraSetItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link RegexGrammarParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(RegexGrammarParser.RangeContext ctx);
}