// Generated from C:/Users/UO287891/Desktop/dlp/DLPLAB/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_CONSTANT=1, ID=2, DOUBLE_CONSTANT=3, CHAR_CONSTANT=4, WS=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "DIGIT", "SIGN", "WHITE_SPACES", "NEW_LINE", "ONE_LINE_COMMENT", 
			"MULTIPLE_LINE_COMMENT", "TABULAR", "INT_CONSTANT", "ID", "DOUBLE_CONSTANT", 
			"CHAR_CONSTANT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_CONSTANT", "ID", "DOUBLE_CONSTANT", "CHAR_CONSTANT", "WS"
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


	public CmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cmm.g4"; }

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
		"\u0004\u0000\u0005\u0097\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u0003#\b\u0003"+
		"\u000b\u0003\f\u0003$\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"*\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005/\b\u0005\n\u0005"+
		"\f\u00052\t\u0005\u0003\u00054\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005:\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006?\b\u0006\n\u0006\f\u0006B\t\u0006\u0003\u0006D\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006L\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\bS\b\b\n\b\f\bV\t\b\u0003\bX\b\b\u0001\t\u0001\t\u0003\t\\\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\ta\b\t\n\t\f\td\t\t\u0001\n\u0005\ng\b\n\n\n"+
		"\f\nj\t\n\u0001\n\u0001\n\u0005\nn\b\n\n\n\f\nq\t\n\u0001\n\u0001\n\u0003"+
		"\nu\b\n\u0001\n\u0003\nx\b\n\u0001\n\u0001\n\u0001\n\u0003\n}\b\n\u0001"+
		"\n\u0001\n\u0003\n\u0081\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008b"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0092\b\f\u000b"+
		"\f\f\f\u0093\u0001\f\u0001\f\u0000\u0000\r\u0001\u0000\u0003\u0000\u0005"+
		"\u0000\u0007\u0000\t\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0001"+
		"\u0013\u0002\u0015\u0003\u0017\u0004\u0019\u0005\u0001\u0000\u0006\u0002"+
		"\u0000AZaz\u0001\u000009\u0002\u0000++--\u0002\u0000\n\n\r\r\u0001\u0000"+
		"19\u0002\u0000EEee\u00a8\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0001\u001b"+
		"\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005\u001f"+
		"\u0001\u0000\u0000\u0000\u0007\"\u0001\u0000\u0000\u0000\t)\u0001\u0000"+
		"\u0000\u0000\u000b+\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000"+
		"\u000fM\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000\u0013["+
		"\u0001\u0000\u0000\u0000\u0015\u0080\u0001\u0000\u0000\u0000\u0017\u008a"+
		"\u0001\u0000\u0000\u0000\u0019\u0091\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0007\u0000\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0007\u0001\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0007"+
		"\u0002\u0000\u0000 \u0006\u0001\u0000\u0000\u0000!#\u0005 \u0000\u0000"+
		"\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%\b\u0001\u0000\u0000\u0000&*\u0007\u0003"+
		"\u0000\u0000\'(\u0005\r\u0000\u0000(*\u0005\n\u0000\u0000)&\u0001\u0000"+
		"\u0000\u0000)\'\u0001\u0000\u0000\u0000*\n\u0001\u0000\u0000\u0000+,\u0005"+
		"/\u0000\u0000,3\u0005/\u0000\u0000-/\t\u0000\u0000\u0000.-\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u0000"+
		"30\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000049\u0001\u0000\u0000"+
		"\u00005:\u0003\t\u0004\u000067\u0005E\u0000\u000078\u0005O\u0000\u0000"+
		"8:\u0005F\u0000\u000095\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u0000"+
		":\f\u0001\u0000\u0000\u0000;<\u0005/\u0000\u0000<C\u0005*\u0000\u0000"+
		"=?\t\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0005*\u0000\u0000FK\u0005/\u0000"+
		"\u0000GL\u0003\t\u0004\u0000HI\u0005E\u0000\u0000IJ\u0005O\u0000\u0000"+
		"JL\u0005F\u0000\u0000KG\u0001\u0000\u0000\u0000KH\u0001\u0000\u0000\u0000"+
		"L\u000e\u0001\u0000\u0000\u0000MN\u0005\t\u0000\u0000N\u0010\u0001\u0000"+
		"\u0000\u0000OX\u00050\u0000\u0000PT\u0007\u0004\u0000\u0000QS\u0003\u0003"+
		"\u0001\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WO\u0001\u0000\u0000\u0000WP\u0001\u0000\u0000"+
		"\u0000X\u0012\u0001\u0000\u0000\u0000Y\\\u0003\u0001\u0000\u0000Z\\\u0005"+
		"_\u0000\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\b\u0001"+
		"\u0000\u0000\u0000]a\u0003\u0001\u0000\u0000^a\u0003\u0003\u0001\u0000"+
		"_a\u0005_\u0000\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c\u0014\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000eg\u0003\u0003\u0001\u0000fe\u0001\u0000\u0000\u0000"+
		"gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000ko\u0005.\u0000"+
		"\u0000ln\u0003\u0003\u0001\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pw\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rt\u0007\u0005\u0000\u0000"+
		"su\u0003\u0005\u0002\u0000ts\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0003\u0011\b\u0000wr\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u0081\u0001\u0000\u0000\u0000yz\u0003"+
		"\u0011\b\u0000z|\u0007\u0005\u0000\u0000{}\u0003\u0005\u0002\u0000|{\u0001"+
		"\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u007f\u0003\u0011\b\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"h\u0001\u0000\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0081\u0016\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\'\u0000\u0000\u0083\u0084\t\u0000"+
		"\u0000\u0000\u0084\u008b\u0005\'\u0000\u0000\u0085\u0086\u0005\'\u0000"+
		"\u0000\u0086\u0087\u0005\\\u0000\u0000\u0087\u0088\u0003\u0011\b\u0000"+
		"\u0088\u0089\u0005\'\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"\u0082\u0001\u0000\u0000\u0000\u008a\u0085\u0001\u0000\u0000\u0000\u008b"+
		"\u0018\u0001\u0000\u0000\u0000\u008c\u0092\u0003\t\u0004\u0000\u008d\u0092"+
		"\u0003\u000b\u0005\u0000\u008e\u0092\u0003\u0007\u0003\u0000\u008f\u0092"+
		"\u0003\u000f\u0007\u0000\u0090\u0092\u0003\r\u0006\u0000\u0091\u008c\u0001"+
		"\u0000\u0000\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0006\f\u0000\u0000\u0096\u001a\u0001\u0000"+
		"\u0000\u0000\u0017\u0000$)039@CKTW[`bhotw|\u0080\u008a\u0091\u0093\u0001"+
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