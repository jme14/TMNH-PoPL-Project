// Generated from c:/Users/nfout/OneDrive/Desktop/POPL/TMNH-PoPL-Project/TMNH.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TMNHLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, VARIABLE=20, NUMBER=21, STRING=22, WHITESPACE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "VARIABLE", "NUMBER", "STRING", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", 
			"'='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'", 
			"'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "VARIABLE", "NUMBER", 
			"STRING", "WHITESPACE"
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


	public TMNHLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TMNH.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0005\u0013"+
		"e\b\u0013\n\u0013\f\u0013h\t\u0013\u0001\u0014\u0004\u0014k\b\u0014\u000b"+
		"\u0014\f\u0014l\u0001\u0014\u0001\u0014\u0004\u0014q\b\u0014\u000b\u0014"+
		"\f\u0014r\u0003\u0014u\b\u0014\u0001\u0015\u0001\u0015\u0005\u0015y\b"+
		"\u0015\n\u0015\f\u0015|\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0004"+
		"\u0016\u0081\b\u0016\u000b\u0016\f\u0016\u0082\u0001\u0016\u0001\u0016"+
		"\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ__a"+
		"z\u0001\u000009\u0004\u0000\n\n\r\r\"\"\'\'\u0003\u0000\n\n\r\r  \u008b"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/"+
		"\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00053\u0001\u0000"+
		"\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t7\u0001\u0000\u0000\u0000"+
		"\u000b9\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000f?\u0001"+
		"\u0000\u0000\u0000\u0011B\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000"+
		"\u0000\u0015G\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019"+
		"L\u0001\u0000\u0000\u0000\u001bN\u0001\u0000\u0000\u0000\u001dQ\u0001"+
		"\u0000\u0000\u0000\u001fT\u0001\u0000\u0000\u0000!W\u0001\u0000\u0000"+
		"\u0000#[\u0001\u0000\u0000\u0000%^\u0001\u0000\u0000\u0000\'b\u0001\u0000"+
		"\u0000\u0000)j\u0001\u0000\u0000\u0000+v\u0001\u0000\u0000\u0000-\u0080"+
		"\u0001\u0000\u0000\u0000/0\u0005+\u0000\u00000\u0002\u0001\u0000\u0000"+
		"\u000012\u0005-\u0000\u00002\u0004\u0001\u0000\u0000\u000034\u0005*\u0000"+
		"\u00004\u0006\u0001\u0000\u0000\u000056\u0005/\u0000\u00006\b\u0001\u0000"+
		"\u0000\u000078\u0005%\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005+"+
		"\u0000\u0000:;\u0005=\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005-"+
		"\u0000\u0000=>\u0005=\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?@\u0005"+
		"*\u0000\u0000@A\u0005=\u0000\u0000A\u0010\u0001\u0000\u0000\u0000BC\u0005"+
		"/\u0000\u0000CD\u0005=\u0000\u0000D\u0012\u0001\u0000\u0000\u0000EF\u0005"+
		"=\u0000\u0000F\u0014\u0001\u0000\u0000\u0000GH\u0005<\u0000\u0000H\u0016"+
		"\u0001\u0000\u0000\u0000IJ\u0005<\u0000\u0000JK\u0005=\u0000\u0000K\u0018"+
		"\u0001\u0000\u0000\u0000LM\u0005>\u0000\u0000M\u001a\u0001\u0000\u0000"+
		"\u0000NO\u0005>\u0000\u0000OP\u0005=\u0000\u0000P\u001c\u0001\u0000\u0000"+
		"\u0000QR\u0005=\u0000\u0000RS\u0005=\u0000\u0000S\u001e\u0001\u0000\u0000"+
		"\u0000TU\u0005!\u0000\u0000UV\u0005=\u0000\u0000V \u0001\u0000\u0000\u0000"+
		"WX\u0005a\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005d\u0000\u0000Z\"\u0001"+
		"\u0000\u0000\u0000[\\\u0005o\u0000\u0000\\]\u0005r\u0000\u0000]$\u0001"+
		"\u0000\u0000\u0000^_\u0005n\u0000\u0000_`\u0005o\u0000\u0000`a\u0005t"+
		"\u0000\u0000a&\u0001\u0000\u0000\u0000bf\u0007\u0000\u0000\u0000ce\u0007"+
		"\u0001\u0000\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g(\u0001\u0000\u0000"+
		"\u0000hf\u0001\u0000\u0000\u0000ik\u0007\u0002\u0000\u0000ji\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mt\u0001\u0000\u0000\u0000np\u0005.\u0000\u0000oq\u0007"+
		"\u0002\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000"+
		"\u0000tn\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u*\u0001\u0000"+
		"\u0000\u0000vz\u0005\"\u0000\u0000wy\b\u0003\u0000\u0000xw\u0001\u0000"+
		"\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"}~\u0005\"\u0000\u0000~,\u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0004"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u0016"+
		"\u0000\u0000\u0085.\u0001\u0000\u0000\u0000\u0007\u0000flrtz\u0082\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}