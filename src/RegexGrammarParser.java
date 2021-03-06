// Generated from C:/Users/rafae/Documents/ITESM/Octavo_Semestre/Compiladores/Examen Midterm/Final Entregable/src\RegexGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegexGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, CHAR=11, WS=12;
	public static final int
		RULE_s = 0, RULE_re = 1, RULE_union = 2, RULE_simpleRe = 3, RULE_concatenation = 4, 
		RULE_basicRe = 5, RULE_star = 6, RULE_plus = 7, RULE_elementaryRe = 8, 
		RULE_group = 9, RULE_any = 10, RULE_eos = 11, RULE_letra = 12, RULE_set = 13, 
		RULE_setItems = 14, RULE_setItem = 15, RULE_range = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "re", "union", "simpleRe", "concatenation", "basicRe", "star", "plus", 
			"elementaryRe", "group", "any", "eos", "letra", "set", "setItems", "setItem", 
			"range"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'|'", "'*'", "'+'", "'('", "')'", "'.'", "'$'", "'['", "']'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "CHAR", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RegexGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegexGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public ReContext re() {
			return getRuleContext(ReContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			re();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReContext extends ParserRuleContext {
		public ReContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_re; }
	 
		public ReContext() { }
		public void copyFrom(ReContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnionReContext extends ReContext {
		public UnionContext union() {
			return getRuleContext(UnionContext.class,0);
		}
		public UnionReContext(ReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitUnionRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleReReContext extends ReContext {
		public SimpleReContext simpleRe() {
			return getRuleContext(SimpleReContext.class,0);
		}
		public SimpleReReContext(ReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitSimpleReRe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReContext re() throws RecognitionException {
		ReContext _localctx = new ReContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_re);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new SimpleReReContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				simpleRe();
				}
				break;
			case 2:
				_localctx = new UnionReContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				union();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionContext extends ParserRuleContext {
		public SimpleReContext simpleRe() {
			return getRuleContext(SimpleReContext.class,0);
		}
		public ReContext re() {
			return getRuleContext(ReContext.class,0);
		}
		public UnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionContext union() throws RecognitionException {
		UnionContext _localctx = new UnionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_union);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			simpleRe();
			setState(41);
			match(T__0);
			setState(42);
			re();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleReContext extends ParserRuleContext {
		public SimpleReContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleRe; }
	 
		public SimpleReContext() { }
		public void copyFrom(SimpleReContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BasicReSimpleReContext extends SimpleReContext {
		public BasicReContext basicRe() {
			return getRuleContext(BasicReContext.class,0);
		}
		public BasicReSimpleReContext(SimpleReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitBasicReSimpleRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationSimpleReContext extends SimpleReContext {
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public ConcatenationSimpleReContext(SimpleReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitConcatenationSimpleRe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleReContext simpleRe() throws RecognitionException {
		SimpleReContext _localctx = new SimpleReContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleRe);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BasicReSimpleReContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(44);
				basicRe();
				}
				}
				break;
			case 2:
				_localctx = new ConcatenationSimpleReContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(45);
				concatenation();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcatenationContext extends ParserRuleContext {
		public BasicReContext basicRe() {
			return getRuleContext(BasicReContext.class,0);
		}
		public SimpleReContext simpleRe() {
			return getRuleContext(SimpleReContext.class,0);
		}
		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_concatenation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(48);
			basicRe();
			}
			{
			setState(49);
			simpleRe();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicReContext extends ParserRuleContext {
		public BasicReContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicRe; }
	 
		public BasicReContext() { }
		public void copyFrom(BasicReContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StarBasicReContext extends BasicReContext {
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public StarBasicReContext(BasicReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitStarBasicRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElementaryReBasicReContext extends BasicReContext {
		public ElementaryReContext elementaryRe() {
			return getRuleContext(ElementaryReContext.class,0);
		}
		public ElementaryReBasicReContext(BasicReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitElementaryReBasicRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusBasicReContext extends BasicReContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public PlusBasicReContext(BasicReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitPlusBasicRe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicReContext basicRe() throws RecognitionException {
		BasicReContext _localctx = new BasicReContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_basicRe);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new StarBasicReContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(51);
				star();
				}
				}
				break;
			case 2:
				_localctx = new PlusBasicReContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(52);
				plus();
				}
				}
				break;
			case 3:
				_localctx = new ElementaryReBasicReContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(53);
				elementaryRe();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StarContext extends ParserRuleContext {
		public ElementaryReContext elementaryRe() {
			return getRuleContext(ElementaryReContext.class,0);
		}
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			elementaryRe();
			}
			setState(57);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlusContext extends ParserRuleContext {
		public ElementaryReContext elementaryRe() {
			return getRuleContext(ElementaryReContext.class,0);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(59);
			elementaryRe();
			}
			setState(60);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementaryReContext extends ParserRuleContext {
		public ElementaryReContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementaryRe; }
	 
		public ElementaryReContext() { }
		public void copyFrom(ElementaryReContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetraElementaryReContext extends ElementaryReContext {
		public LetraContext letra() {
			return getRuleContext(LetraContext.class,0);
		}
		public LetraElementaryReContext(ElementaryReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitLetraElementaryRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnyElementaryReContext extends ElementaryReContext {
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public AnyElementaryReContext(ElementaryReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitAnyElementaryRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EosElementaryReContext extends ElementaryReContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public EosElementaryReContext(ElementaryReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitEosElementaryRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetElementaryReContext extends ElementaryReContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public SetElementaryReContext(ElementaryReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitSetElementaryRe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupElementaryReContext extends ElementaryReContext {
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public GroupElementaryReContext(ElementaryReContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitGroupElementaryRe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementaryReContext elementaryRe() throws RecognitionException {
		ElementaryReContext _localctx = new ElementaryReContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementaryRe);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				_localctx = new GroupElementaryReContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(62);
				group();
				}
				}
				break;
			case T__5:
				_localctx = new AnyElementaryReContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(63);
				any();
				}
				}
				break;
			case T__6:
				_localctx = new EosElementaryReContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(64);
				eos();
				}
				}
				break;
			case CHAR:
				_localctx = new LetraElementaryReContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(65);
				letra();
				}
				}
				break;
			case T__7:
				_localctx = new SetElementaryReContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(66);
				set();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupContext extends ParserRuleContext {
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
	 
		public GroupContext() { }
		public void copyFrom(GroupContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReGroupContext extends GroupContext {
		public ReContext re() {
			return getRuleContext(ReContext.class,0);
		}
		public ReGroupContext(GroupContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitReGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_group);
		try {
			_localctx = new ReGroupContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__3);
			{
			setState(70);
			re();
			}
			setState(71);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyContext extends ParserRuleContext {
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_any);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetraContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(RegexGrammarParser.CHAR, 0); }
		public LetraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letra; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitLetra(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetraContext letra() throws RecognitionException {
		LetraContext _localctx = new LetraContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_letra);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public SetItemsContext setItems() {
			return getRuleContext(SetItemsContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__7);
			{
			setState(80);
			setItems();
			}
			setState(81);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetItemsContext extends ParserRuleContext {
		public SetItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setItems; }
	 
		public SetItemsContext() { }
		public void copyFrom(SetItemsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetItemsSetItemsContext extends SetItemsContext {
		public SetItemContext setItem() {
			return getRuleContext(SetItemContext.class,0);
		}
		public SetItemsContext setItems() {
			return getRuleContext(SetItemsContext.class,0);
		}
		public SetItemsSetItemsContext(SetItemsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitSetItemsSetItems(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetItemSetItemsContext extends SetItemsContext {
		public SetItemContext setItem() {
			return getRuleContext(SetItemContext.class,0);
		}
		public SetItemSetItemsContext(SetItemsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitSetItemSetItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetItemsContext setItems() throws RecognitionException {
		SetItemsContext _localctx = new SetItemsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_setItems);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new SetItemSetItemsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(83);
				setItem();
				}
				}
				break;
			case 2:
				_localctx = new SetItemsSetItemsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(84);
				setItem();
				}
				{
				setState(85);
				setItems();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetItemContext extends ParserRuleContext {
		public SetItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setItem; }
	 
		public SetItemContext() { }
		public void copyFrom(SetItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LetraSetItemContext extends SetItemContext {
		public LetraContext letra() {
			return getRuleContext(LetraContext.class,0);
		}
		public LetraSetItemContext(SetItemContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitLetraSetItem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeSetItemContext extends SetItemContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public RangeSetItemContext(SetItemContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitRangeSetItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetItemContext setItem() throws RecognitionException {
		SetItemContext _localctx = new SetItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setItem);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new RangeSetItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(89);
				range();
				}
				}
				break;
			case 2:
				_localctx = new LetraSetItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(90);
				letra();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeContext extends ParserRuleContext {
		public List<LetraContext> letra() {
			return getRuleContexts(LetraContext.class);
		}
		public LetraContext letra(int i) {
			return getRuleContext(LetraContext.class,i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegexGrammarVisitor ) return ((RegexGrammarVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			letra();
			}
			setState(94);
			match(T__9);
			{
			setState(95);
			letra();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3"+
		"\2\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\5\79\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nF\n\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\5\20Z\n\20\3\21\3\21\5\21^\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\\\2$\3\2\2"+
		"\2\4(\3\2\2\2\6*\3\2\2\2\b\60\3\2\2\2\n\62\3\2\2\2\f8\3\2\2\2\16:\3\2"+
		"\2\2\20=\3\2\2\2\22E\3\2\2\2\24G\3\2\2\2\26K\3\2\2\2\30M\3\2\2\2\32O\3"+
		"\2\2\2\34Q\3\2\2\2\36Y\3\2\2\2 ]\3\2\2\2\"_\3\2\2\2$%\5\4\3\2%\3\3\2\2"+
		"\2&)\5\b\5\2\')\5\6\4\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\5\b\5\2+,\7"+
		"\3\2\2,-\5\4\3\2-\7\3\2\2\2.\61\5\f\7\2/\61\5\n\6\2\60.\3\2\2\2\60/\3"+
		"\2\2\2\61\t\3\2\2\2\62\63\5\f\7\2\63\64\5\b\5\2\64\13\3\2\2\2\659\5\16"+
		"\b\2\669\5\20\t\2\679\5\22\n\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\r"+
		"\3\2\2\2:;\5\22\n\2;<\7\4\2\2<\17\3\2\2\2=>\5\22\n\2>?\7\5\2\2?\21\3\2"+
		"\2\2@F\5\24\13\2AF\5\26\f\2BF\5\30\r\2CF\5\32\16\2DF\5\34\17\2E@\3\2\2"+
		"\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\23\3\2\2\2GH\7\6\2\2HI\5\4"+
		"\3\2IJ\7\7\2\2J\25\3\2\2\2KL\7\b\2\2L\27\3\2\2\2MN\7\t\2\2N\31\3\2\2\2"+
		"OP\7\r\2\2P\33\3\2\2\2QR\7\n\2\2RS\5\36\20\2ST\7\13\2\2T\35\3\2\2\2UZ"+
		"\5 \21\2VW\5 \21\2WX\5\36\20\2XZ\3\2\2\2YU\3\2\2\2YV\3\2\2\2Z\37\3\2\2"+
		"\2[^\5\"\22\2\\^\5\32\16\2][\3\2\2\2]\\\3\2\2\2^!\3\2\2\2_`\5\32\16\2"+
		"`a\7\f\2\2ab\5\32\16\2b#\3\2\2\2\b(\608EY]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}