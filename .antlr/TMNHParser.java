// Generated from c:/Users/nfout/OneDrive/Desktop/POPL/TMNH-PoPL-Project/TMNH.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TMNHParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, IF=21, ELSE=22, ELIF=23, DIVIDE=24, MULTIPLY=25, 
		MOD=26, PLUS=27, MINUS=28, NUMBER=29, VARIABLE=30, STRING=31, TAB=32, 
		EOL=33, COLON=34, WHITESPACE=35;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_if_else_block = 2, RULE_line = 3, 
		RULE_statement = 4, RULE_assignment = 5, RULE_arithmetic = 6, RULE_expr = 7, 
		RULE_array = 8, RULE_list = 9, RULE_math_op = 10, RULE_assign_op = 11, 
		RULE_conditional_op = 12, RULE_expression = 13, RULE_scoped_code = 14, 
		RULE_if_statement = 15, RULE_elif_statement = 16, RULE_else_statement = 17, 
		RULE_logic_operators = 18, RULE_logic_value = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "if_else_block", "line", "statement", "assignment", 
			"arithmetic", "expr", "array", "list", "math_op", "assign_op", "conditional_op", 
			"expression", "scoped_code", "if_statement", "elif_statement", "else_statement", 
			"logic_operators", "logic_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "','", "'+='", "'-='", "'*='", "'/='", 
			"'='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'not'", "'and'", 
			"'or'", "'):'", "'if'", "'else'", "'elif'", "'/'", "'*'", "'%'", "'+'", 
			"'-'", null, null, null, null, null, "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "IF", "ELSE", "ELIF", 
			"DIVIDE", "MULTIPLY", "MOD", "PLUS", "MINUS", "NUMBER", "VARIABLE", "STRING", 
			"TAB", "EOL", "COLON", "WHITESPACE"
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
	public String getGrammarFileName() { return "TMNH.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TMNHParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TMNHParser.EOF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10471079938L) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(40);
					block();
					}
					break;
				case T__0:
				case MINUS:
				case NUMBER:
				case VARIABLE:
				case EOL:
					{
					setState(41);
					line();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public If_else_blockContext if_else_block() {
			return getRuleContext(If_else_blockContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			if_else_block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_else_blockContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public List<Elif_statementContext> elif_statement() {
			return getRuleContexts(Elif_statementContext.class);
		}
		public Elif_statementContext elif_statement(int i) {
			return getRuleContext(Elif_statementContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public List<TerminalNode> TAB() { return getTokens(TMNHParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(TMNHParser.TAB, i);
		}
		public If_else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else_block; }
	}

	public final If_else_blockContext if_else_block() throws RecognitionException {
		If_else_blockContext _localctx = new If_else_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_else_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			if_statement();
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TAB) {
						{
						{
						setState(53); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(52);
								match(TAB);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(55); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						setState(61);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(62);
					elif_statement();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAB) {
					{
					{
					setState(69); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(68);
							match(TAB);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(71); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(78);
				else_statement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(TMNHParser.EOL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048194L) != 0)) {
				{
				setState(81);
				statement();
				}
			}

			setState(84);
			match(EOL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				arithmetic(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(TMNHParser.VARIABLE, 0); }
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(VARIABLE);
			setState(92);
			assign_op();
			setState(93);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends ParserRuleContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(TMNHParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(TMNHParser.NUMBER, 0); }
		public TerminalNode VARIABLE() { return getToken(TMNHParser.VARIABLE, 0); }
		public TerminalNode MULTIPLY() { return getToken(TMNHParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(TMNHParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(TMNHParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(TMNHParser.PLUS, 0); }
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_arithmetic, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(96);
				match(T__0);
				setState(97);
				arithmetic(0);
				setState(98);
				match(T__1);
				}
				break;
			case MINUS:
				{
				setState(100);
				match(MINUS);
				setState(101);
				arithmetic(5);
				}
				break;
			case NUMBER:
				{
				setState(102);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				{
				setState(103);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(107);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(108);
								arithmetic(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(111); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(115);
								arithmetic(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(118); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode STRING() { return getToken(TMNHParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Conditional_opContext conditional_op() {
			return getRuleContext(Conditional_opContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(126);
				arithmetic(0);
				}
				break;
			case 2:
				{
				setState(127);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(128);
				array();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(131);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(132);
					conditional_op();
					setState(133);
					expr(5);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(TMNHParser.VARIABLE, 0); }
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(VARIABLE);
			setState(141);
			assign_op();
			setState(142);
			match(T__2);
			setState(143);
			list();
			setState(144);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			expr(0);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(147);
				match(T__4);
				setState(148);
				expr(0);
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Math_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(TMNHParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TMNHParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(TMNHParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(TMNHParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(TMNHParser.MOD, 0); }
		public Math_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_op; }
	}

	public final Math_opContext math_op() throws RecognitionException {
		Math_opContext _localctx = new Math_opContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_math_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 520093696L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_opContext extends ParserRuleContext {
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1984L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_opContext extends ParserRuleContext {
		public Conditional_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_op; }
	}

	public final Conditional_opContext conditional_op() throws RecognitionException {
		Conditional_opContext _localctx = new Conditional_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditional_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<Logic_valueContext> logic_value() {
			return getRuleContexts(Logic_valueContext.class);
		}
		public Logic_valueContext logic_value(int i) {
			return getRuleContext(Logic_valueContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Logic_operatorsContext> logic_operators() {
			return getRuleContexts(Logic_operatorsContext.class);
		}
		public Logic_operatorsContext logic_operators(int i) {
			return getRuleContext(Logic_operatorsContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(160);
				match(T__0);
				}
				break;
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(163);
				match(T__16);
				}
			}

			{
			setState(166);
			logic_value();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) {
				{
				{
				setState(167);
				logic_operators();
				setState(168);
				logic_value();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(175);
				match(T__1);
				}
				break;
			}
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(178);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(179);
						match(T__0);
						}
						break;
					}
					setState(182);
					expression();
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						setState(183);
						match(T__1);
						}
						break;
					}
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scoped_codeContext extends ParserRuleContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(TMNHParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(TMNHParser.TAB, i);
		}
		public Scoped_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scoped_code; }
	}

	public final Scoped_codeContext scoped_code() throws RecognitionException {
		Scoped_codeContext _localctx = new Scoped_codeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_scoped_code);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					{
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(191);
						match(TAB);
						}
						}
						setState(194); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TAB );
					}
					setState(198);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IF:
						{
						setState(196);
						block();
						}
						break;
					case T__0:
					case MINUS:
					case NUMBER:
					case VARIABLE:
					case EOL:
						{
						setState(197);
						line();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(202); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_statementContext extends ParserRuleContext {
		public Scoped_codeContext scoped_code() {
			return getRuleContext(Scoped_codeContext.class,0);
		}
		public TerminalNode EOL() { return getToken(TMNHParser.EOL, 0); }
		public TerminalNode IF() { return getToken(TMNHParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TMNHParser.COLON, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				{
				setState(204);
				match(IF);
				setState(205);
				expression();
				{
				setState(206);
				match(COLON);
				}
				}
				setState(208);
				match(EOL);
				}
				break;
			case 2:
				{
				{
				setState(210);
				match(IF);
				{
				setState(211);
				match(T__0);
				}
				setState(212);
				expression();
				{
				setState(213);
				match(T__19);
				}
				}
				setState(215);
				match(EOL);
				}
				break;
			}
			setState(219);
			scoped_code();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Elif_statementContext extends ParserRuleContext {
		public Scoped_codeContext scoped_code() {
			return getRuleContext(Scoped_codeContext.class,0);
		}
		public TerminalNode EOL() { return getToken(TMNHParser.EOL, 0); }
		public TerminalNode ELIF() { return getToken(TMNHParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(TMNHParser.COLON, 0); }
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				{
				setState(221);
				match(ELIF);
				setState(222);
				expression();
				{
				setState(223);
				match(COLON);
				}
				}
				setState(225);
				match(EOL);
				}
				break;
			case 2:
				{
				{
				setState(227);
				match(ELIF);
				{
				setState(228);
				match(T__0);
				}
				setState(229);
				expression();
				{
				setState(230);
				match(T__19);
				}
				}
				setState(232);
				match(EOL);
				}
				break;
			}
			setState(236);
			scoped_code();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TMNHParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(TMNHParser.COLON, 0); }
		public TerminalNode EOL() { return getToken(TMNHParser.EOL, 0); }
		public Scoped_codeContext scoped_code() {
			return getRuleContext(Scoped_codeContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(ELSE);
			setState(239);
			match(COLON);
			setState(240);
			match(EOL);
			setState(241);
			scoped_code();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_operatorsContext extends ParserRuleContext {
		public Logic_operatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operators; }
	}

	public final Logic_operatorsContext logic_operators() throws RecognitionException {
		Logic_operatorsContext _localctx = new Logic_operatorsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logic_operators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_valueContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(TMNHParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(TMNHParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(TMNHParser.STRING, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Logic_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_value; }
	}

	public final Logic_valueContext logic_value() throws RecognitionException {
		Logic_valueContext _localctx = new Logic_valueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logic_value);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
				arithmetic(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u00fc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000"+
		"\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0004\u00026\b\u0002\u000b\u0002\f\u00027\u0005"+
		"\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0002\u0005\u0002@\b\u0002"+
		"\n\u0002\f\u0002C\t\u0002\u0001\u0002\u0004\u0002F\b\u0002\u000b\u0002"+
		"\f\u0002G\u0005\u0002J\b\u0002\n\u0002\f\u0002M\t\u0002\u0001\u0002\u0003"+
		"\u0002P\b\u0002\u0001\u0003\u0003\u0003S\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004Z\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006i\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"n\b\u0006\u000b\u0006\f\u0006o\u0001\u0006\u0001\u0006\u0001\u0006\u0004"+
		"\u0006u\b\u0006\u000b\u0006\f\u0006v\u0005\u0006y\b\u0006\n\u0006\f\u0006"+
		"|\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0082\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u0088\b\u0007\n\u0007\f\u0007\u008b\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u0096\b\t\n\t\f\t\u0099"+
		"\t\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0003"+
		"\r\u00a2\b\r\u0001\r\u0003\r\u00a5\b\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u00ab\b\r\n\r\f\r\u00ae\t\r\u0001\r\u0003\r\u00b1\b\r\u0001\r"+
		"\u0001\r\u0003\r\u00b5\b\r\u0001\r\u0001\r\u0003\r\u00b9\b\r\u0005\r\u00bb"+
		"\b\r\n\r\f\r\u00be\t\r\u0001\u000e\u0004\u000e\u00c1\b\u000e\u000b\u000e"+
		"\f\u000e\u00c2\u0001\u000e\u0001\u000e\u0003\u000e\u00c7\b\u000e\u0004"+
		"\u000e\u00c9\b\u000e\u000b\u000e\f\u000e\u00ca\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00da\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00eb\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00fa\b\u0013\u0001\u0013\u0000\u0002\f\u000e"+
		"\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&\u0000\u0006\u0001\u0000\u0018\u001a\u0001\u0000"+
		"\u001b\u001c\u0001\u0000\u0018\u001c\u0001\u0000\u0006\n\u0001\u0000\u000b"+
		"\u0010\u0001\u0000\u0012\u0013\u010c\u0000,\u0001\u0000\u0000\u0000\u0002"+
		"1\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006R\u0001"+
		"\u0000\u0000\u0000\bY\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000"+
		"\fh\u0001\u0000\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000\u0010"+
		"\u008c\u0001\u0000\u0000\u0000\u0012\u0092\u0001\u0000\u0000\u0000\u0014"+
		"\u009a\u0001\u0000\u0000\u0000\u0016\u009c\u0001\u0000\u0000\u0000\u0018"+
		"\u009e\u0001\u0000\u0000\u0000\u001a\u00a1\u0001\u0000\u0000\u0000\u001c"+
		"\u00c8\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000\u0000\u0000 \u00ea"+
		"\u0001\u0000\u0000\u0000\"\u00ee\u0001\u0000\u0000\u0000$\u00f3\u0001"+
		"\u0000\u0000\u0000&\u00f9\u0001\u0000\u0000\u0000(+\u0003\u0002\u0001"+
		"\u0000)+\u0003\u0006\u0003\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-/\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"/0\u0005\u0000\u0000\u00010\u0001\u0001\u0000\u0000\u000012\u0003\u0004"+
		"\u0002\u00002\u0003\u0001\u0000\u0000\u00003A\u0003\u001e\u000f\u0000"+
		"46\u0005 \u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000"+
		"\u000095\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000>@\u0003 \u0010\u0000?;\u0001\u0000\u0000\u0000@C\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"BO\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0005 \u0000\u0000"+
		"ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IE\u0001\u0000"+
		"\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NP\u0003\"\u0011\u0000OK\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"P\u0005\u0001\u0000\u0000\u0000QS\u0003\b\u0004\u0000RQ\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0005!\u0000"+
		"\u0000U\u0007\u0001\u0000\u0000\u0000VZ\u0003\f\u0006\u0000WZ\u0003\n"+
		"\u0005\u0000XZ\u0003\u0010\b\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z\t\u0001\u0000\u0000\u0000[\\\u0005"+
		"\u001e\u0000\u0000\\]\u0003\u0016\u000b\u0000]^\u0003\u000e\u0007\u0000"+
		"^\u000b\u0001\u0000\u0000\u0000_`\u0006\u0006\uffff\uffff\u0000`a\u0005"+
		"\u0001\u0000\u0000ab\u0003\f\u0006\u0000bc\u0005\u0002\u0000\u0000ci\u0001"+
		"\u0000\u0000\u0000de\u0005\u001c\u0000\u0000ei\u0003\f\u0006\u0005fi\u0005"+
		"\u001d\u0000\u0000gi\u0005\u001e\u0000\u0000h_\u0001\u0000\u0000\u0000"+
		"hd\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000iz\u0001\u0000\u0000\u0000jk\n\u0004\u0000\u0000km\u0007\u0000\u0000"+
		"\u0000ln\u0003\f\u0006\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000py\u0001\u0000"+
		"\u0000\u0000qr\n\u0003\u0000\u0000rt\u0007\u0001\u0000\u0000su\u0003\f"+
		"\u0006\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000"+
		"xj\u0001\u0000\u0000\u0000xq\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\r\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0006\u0007\uffff\uffff\u0000"+
		"~\u0082\u0003\f\u0006\u0000\u007f\u0082\u0005\u001f\u0000\u0000\u0080"+
		"\u0082\u0003\u0010\b\u0000\u0081}\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0089"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\n\u0004\u0000\u0000\u0084\u0085\u0003"+
		"\u0018\f\u0000\u0085\u0086\u0003\u000e\u0007\u0005\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u000f\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u001e\u0000\u0000\u008d\u008e\u0003\u0016"+
		"\u000b\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0090\u0003\u0012"+
		"\t\u0000\u0090\u0091\u0005\u0004\u0000\u0000\u0091\u0011\u0001\u0000\u0000"+
		"\u0000\u0092\u0097\u0003\u000e\u0007\u0000\u0093\u0094\u0005\u0005\u0000"+
		"\u0000\u0094\u0096\u0003\u000e\u0007\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0013\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b\u0007\u0002\u0000"+
		"\u0000\u009b\u0015\u0001\u0000\u0000\u0000\u009c\u009d\u0007\u0003\u0000"+
		"\u0000\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0004\u0000"+
		"\u0000\u009f\u0019\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005\u0001\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005\u0011\u0000"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00ac\u0003&\u0013\u0000"+
		"\u00a7\u00a8\u0003$\u0012\u0000\u00a8\u00a9\u0003&\u0013\u0000\u00a9\u00ab"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00ab\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0005\u0002\u0000\u0000\u00b0\u00af"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00bc"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b4\u0007\u0005\u0000\u0000\u00b3\u00b5"+
		"\u0005\u0001\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0003\u001a\r\u0000\u00b7\u00b9\u0005\u0002\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b2\u0001\u0000\u0000\u0000\u00bb\u00be\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u001b\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0005 \u0000\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c7\u0003\u0002\u0001\u0000\u00c5\u00c7\u0003\u0006"+
		"\u0003\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u001d\u0001\u0000"+
		"\u0000\u0000\u00cc\u00cd\u0005\u0015\u0000\u0000\u00cd\u00ce\u0003\u001a"+
		"\r\u0000\u00ce\u00cf\u0005\"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0005!\u0000\u0000\u00d1\u00da\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\u0015\u0000\u0000\u00d3\u00d4\u0005\u0001\u0000\u0000"+
		"\u00d4\u00d5\u0003\u001a\r\u0000\u00d5\u00d6\u0005\u0014\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005!\u0000\u0000\u00d8\u00da"+
		"\u0001\u0000\u0000\u0000\u00d9\u00cc\u0001\u0000\u0000\u0000\u00d9\u00d2"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0003\u001c\u000e\u0000\u00dc\u001f\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005\u0017\u0000\u0000\u00de\u00df\u0003\u001a\r\u0000\u00df\u00e0\u0005"+
		"\"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005!"+
		"\u0000\u0000\u00e2\u00eb\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u0017"+
		"\u0000\u0000\u00e4\u00e5\u0005\u0001\u0000\u0000\u00e5\u00e6\u0003\u001a"+
		"\r\u0000\u00e6\u00e7\u0005\u0014\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005!\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ea\u00dd\u0001\u0000\u0000\u0000\u00ea\u00e3\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003\u001c\u000e\u0000"+
		"\u00ed!\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005\u0016\u0000\u0000\u00ef"+
		"\u00f0\u0005\"\u0000\u0000\u00f0\u00f1\u0005!\u0000\u0000\u00f1\u00f2"+
		"\u0003\u001c\u000e\u0000\u00f2#\u0001\u0000\u0000\u0000\u00f3\u00f4\u0007"+
		"\u0004\u0000\u0000\u00f4%\u0001\u0000\u0000\u0000\u00f5\u00fa\u0005\u001e"+
		"\u0000\u0000\u00f6\u00fa\u0005\u001d\u0000\u0000\u00f7\u00fa\u0005\u001f"+
		"\u0000\u0000\u00f8\u00fa\u0003\f\u0006\u0000\u00f9\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\'\u0001\u0000\u0000\u0000"+
		"\u001f*,7;AGKORYhovxz\u0081\u0089\u0097\u00a1\u00a4\u00ac\u00b0\u00b4"+
		"\u00b8\u00bc\u00c2\u00c6\u00ca\u00d9\u00ea\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}