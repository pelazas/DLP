// Generated from C:/Users/Usuario/Desktop/dlp/lab/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, INT_CONSTANT=36, ID=37, DOUBLE_CONSTANT=38, 
		CHAR_CONSTANT=39, WS=40;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_varDefinition = 2, RULE_funcBlock = 3, 
		RULE_expression = 4, RULE_statement = 5, RULE_params = 6, RULE_block = 7, 
		RULE_type = 8, RULE_builtInType = 9, RULE_returnType = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "varDefinition", "funcBlock", "expression", 
			"statement", "params", "block", "type", "builtInType", "returnType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "';'", "'return'", "'.'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'&&'", "'||'", "'['", "']'", "'!'", "'>'", 
			"'>='", "'=='", "'<='", "'<'", "'!='", "'if'", "'else'", "'='", "'write'", 
			"'read'", "'while'", "'struct'", "'char'", "'int'", "'double'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INT_CONSTANT", "ID", "DOUBLE_CONSTANT", "CHAR_CONSTANT", "WS"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66571993088L) != 0)) {
				{
				{
				setState(22);
				definition();
				}
				}
				setState(27);
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
	public static class DefinitionContext extends ParserRuleContext {
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				varDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				returnType();
				setState(30);
				match(ID);
				setState(31);
				match(T__0);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
					{
					setState(32);
					type();
					setState(33);
					match(ID);
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(34);
						match(T__1);
						setState(35);
						type();
						setState(36);
						match(ID);
						}
						}
						setState(42);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(45);
				match(T__2);
				setState(46);
				match(T__3);
				setState(47);
				funcBlock();
				setState(48);
				match(T__4);
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
	public static class VarDefinitionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public VarDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinition; }
	}

	public final VarDefinitionContext varDefinition() throws RecognitionException {
		VarDefinitionContext _localctx = new VarDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			type();
			setState(53);
			match(ID);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(54);
				match(T__1);
				setState(55);
				match(ID);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncBlockContext extends ParserRuleContext {
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBlock; }
	}

	public final FuncBlockContext funcBlock() throws RecognitionException {
		FuncBlockContext _localctx = new FuncBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(65);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__30:
					case T__31:
					case T__32:
					case T__33:
						{
						setState(63);
						varDefinition();
						}
						break;
					case T__0:
					case T__6:
					case T__12:
					case T__17:
					case T__24:
					case T__27:
					case T__28:
					case T__29:
					case INT_CONSTANT:
					case ID:
					case DOUBLE_CONSTANT:
					case CHAR_CONSTANT:
						{
						setState(64);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(70);
				match(T__6);
				setState(71);
				expression(0);
				setState(72);
				match(T__5);
				}
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
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode DOUBLE_CONSTANT() { return getToken(CmmParser.DOUBLE_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(77);
				match(ID);
				}
				break;
			case 2:
				{
				setState(78);
				match(INT_CONSTANT);
				}
				break;
			case 3:
				{
				setState(79);
				match(DOUBLE_CONSTANT);
				}
				break;
			case 4:
				{
				setState(80);
				match(CHAR_CONSTANT);
				}
				break;
			case 5:
				{
				setState(81);
				match(T__0);
				setState(82);
				expression(0);
				setState(83);
				match(T__2);
				}
				break;
			case 6:
				{
				setState(85);
				match(T__12);
				setState(86);
				expression(5);
				}
				break;
			case 7:
				{
				setState(87);
				match(T__17);
				setState(88);
				expression(4);
				}
				break;
			case 8:
				{
				setState(89);
				match(ID);
				setState(90);
				match(T__0);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792421378L) != 0)) {
					{
					setState(91);
					params();
					}
				}

				setState(94);
				match(T__2);
				}
				break;
			case 9:
				{
				setState(95);
				match(T__0);
				setState(96);
				builtInType();
				setState(97);
				match(T__2);
				setState(98);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(102);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(103);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(106);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(109);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(112);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(115);
						match(T__7);
						setState(116);
						match(ID);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(118);
						match(T__15);
						setState(119);
						expression(0);
						setState(120);
						match(T__16);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class StatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__24);
				setState(128);
				match(T__0);
				setState(129);
				expression(0);
				setState(130);
				match(T__2);
				setState(131);
				block();
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(132);
					match(T__25);
					setState(133);
					block();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(ID);
				setState(137);
				match(T__0);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792421378L) != 0)) {
					{
					setState(138);
					params();
					}
				}

				setState(141);
				match(T__2);
				setState(142);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				expression(0);
				setState(144);
				match(T__26);
				setState(145);
				expression(0);
				setState(146);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(T__27);
				setState(149);
				params();
				setState(150);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				match(T__28);
				setState(153);
				params();
				setState(154);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				match(T__29);
				setState(157);
				match(T__0);
				setState(158);
				expression(0);
				setState(159);
				match(T__2);
				setState(160);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				match(T__6);
				setState(163);
				expression(0);
				setState(164);
				match(T__5);
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
	public static class ParamsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(168);
			expression(0);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(169);
				match(T__1);
				setState(170);
				expression(0);
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			int _alt;
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__6:
			case T__12:
			case T__17:
			case T__24:
			case T__25:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case INT_CONSTANT:
			case ID:
			case DOUBLE_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(176);
						statement();
						}
						} 
					}
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__3);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032705024130L) != 0)) {
					{
					{
					setState(183);
					statement();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public List<VarDefinitionContext> varDefinition() {
			return getRuleContexts(VarDefinitionContext.class);
		}
		public VarDefinitionContext varDefinition(int i) {
			return getRuleContext(VarDefinitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				builtInType();
				setState(193);
				match(T__15);
				setState(194);
				match(INT_CONSTANT);
				setState(195);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(T__30);
				setState(198);
				match(T__3);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
					{
					{
					setState(199);
					varDefinition();
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				match(T__4);
				setState(206);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				builtInType();
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
	public static class BuiltInTypeContext extends ParserRuleContext {
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_builtInType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
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
	public static class ReturnTypeContext extends ParserRuleContext {
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnType);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				builtInType();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__34);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0003\u0001"+
		",\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00029\b\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003B\b\u0003\n\u0003\f\u0003E\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003K\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004e\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004{\b\u0004"+
		"\n\u0004\f\u0004~\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0087\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u008c\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00a7\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ac\b"+
		"\u0006\n\u0006\f\u0006\u00af\t\u0006\u0001\u0007\u0005\u0007\u00b2\b\u0007"+
		"\n\u0007\f\u0007\u00b5\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b9"+
		"\b\u0007\n\u0007\f\u0007\u00bc\t\u0007\u0001\u0007\u0003\u0007\u00bf\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00c9\b\b\n\b\f\b\u00cc\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d1"+
		"\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0003\n\u00d7\b\n\u0001\n\u0000\u0001"+
		"\b\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0005"+
		"\u0001\u0000\t\u000b\u0001\u0000\f\r\u0001\u0000\u000e\u000f\u0001\u0000"+
		"\u0013\u0018\u0001\u0000 \"\u00f4\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u00022\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006C"+
		"\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\n\u00a6\u0001\u0000"+
		"\u0000\u0000\f\u00a8\u0001\u0000\u0000\u0000\u000e\u00be\u0001\u0000\u0000"+
		"\u0000\u0010\u00d0\u0001\u0000\u0000\u0000\u0012\u00d2\u0001\u0000\u0000"+
		"\u0000\u0014\u00d6\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001"+
		"\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001c3\u0003\u0004\u0002\u0000\u001d\u001e\u0003\u0014\n\u0000"+
		"\u001e\u001f\u0005%\u0000\u0000\u001f+\u0005\u0001\u0000\u0000 !\u0003"+
		"\u0010\b\u0000!(\u0005%\u0000\u0000\"#\u0005\u0002\u0000\u0000#$\u0003"+
		"\u0010\b\u0000$%\u0005%\u0000\u0000%\'\u0001\u0000\u0000\u0000&\"\u0001"+
		"\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		"()\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000+ \u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-.\u0005\u0003\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0003"+
		"\u0006\u0003\u000001\u0005\u0005\u0000\u000013\u0001\u0000\u0000\u0000"+
		"2\u001c\u0001\u0000\u0000\u00002\u001d\u0001\u0000\u0000\u00003\u0003"+
		"\u0001\u0000\u0000\u000045\u0003\u0010\b\u00005:\u0005%\u0000\u000067"+
		"\u0005\u0002\u0000\u000079\u0005%\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u0006"+
		"\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?B\u0003\u0004\u0002\u0000"+
		"@B\u0003\n\u0005\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DJ\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005\u0007"+
		"\u0000\u0000GH\u0003\b\u0004\u0000HI\u0005\u0006\u0000\u0000IK\u0001\u0000"+
		"\u0000\u0000JF\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0007"+
		"\u0001\u0000\u0000\u0000LM\u0006\u0004\uffff\uffff\u0000Me\u0005%\u0000"+
		"\u0000Ne\u0005$\u0000\u0000Oe\u0005&\u0000\u0000Pe\u0005\'\u0000\u0000"+
		"QR\u0005\u0001\u0000\u0000RS\u0003\b\u0004\u0000ST\u0005\u0003\u0000\u0000"+
		"Te\u0001\u0000\u0000\u0000UV\u0005\r\u0000\u0000Ve\u0003\b\u0004\u0005"+
		"WX\u0005\u0012\u0000\u0000Xe\u0003\b\u0004\u0004YZ\u0005%\u0000\u0000"+
		"Z\\\u0005\u0001\u0000\u0000[]\u0003\f\u0006\u0000\\[\u0001\u0000\u0000"+
		"\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^e\u0005\u0003"+
		"\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u0003\u0012\t\u0000ab\u0005\u0003"+
		"\u0000\u0000bc\u0003\b\u0004\u0001ce\u0001\u0000\u0000\u0000dL\u0001\u0000"+
		"\u0000\u0000dN\u0001\u0000\u0000\u0000dO\u0001\u0000\u0000\u0000dP\u0001"+
		"\u0000\u0000\u0000dQ\u0001\u0000\u0000\u0000dU\u0001\u0000\u0000\u0000"+
		"dW\u0001\u0000\u0000\u0000dY\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000"+
		"\u0000e|\u0001\u0000\u0000\u0000fg\n\t\u0000\u0000gh\u0007\u0000\u0000"+
		"\u0000h{\u0003\b\u0004\nij\n\b\u0000\u0000jk\u0007\u0001\u0000\u0000k"+
		"{\u0003\b\u0004\tlm\n\u0007\u0000\u0000mn\u0007\u0002\u0000\u0000n{\u0003"+
		"\b\u0004\bop\n\u0003\u0000\u0000pq\u0007\u0003\u0000\u0000q{\u0003\b\u0004"+
		"\u0004rs\n\n\u0000\u0000st\u0005\b\u0000\u0000t{\u0005%\u0000\u0000uv"+
		"\n\u0006\u0000\u0000vw\u0005\u0010\u0000\u0000wx\u0003\b\u0004\u0000x"+
		"y\u0005\u0011\u0000\u0000y{\u0001\u0000\u0000\u0000zf\u0001\u0000\u0000"+
		"\u0000zi\u0001\u0000\u0000\u0000zl\u0001\u0000\u0000\u0000zo\u0001\u0000"+
		"\u0000\u0000zr\u0001\u0000\u0000\u0000zu\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\t\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"\u0019\u0000\u0000\u0080\u0081\u0005\u0001\u0000\u0000\u0081\u0082\u0003"+
		"\b\u0004\u0000\u0082\u0083\u0005\u0003\u0000\u0000\u0083\u0086\u0003\u000e"+
		"\u0007\u0000\u0084\u0085\u0005\u001a\u0000\u0000\u0085\u0087\u0003\u000e"+
		"\u0007\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u00a7\u0001\u0000\u0000\u0000\u0088\u0089\u0005%\u0000"+
		"\u0000\u0089\u008b\u0005\u0001\u0000\u0000\u008a\u008c\u0003\f\u0006\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0003\u0000\u0000"+
		"\u008e\u00a7\u0005\u0006\u0000\u0000\u008f\u0090\u0003\b\u0004\u0000\u0090"+
		"\u0091\u0005\u001b\u0000\u0000\u0091\u0092\u0003\b\u0004\u0000\u0092\u0093"+
		"\u0005\u0006\u0000\u0000\u0093\u00a7\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005\u001c\u0000\u0000\u0095\u0096\u0003\f\u0006\u0000\u0096\u0097\u0005"+
		"\u0006\u0000\u0000\u0097\u00a7\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\u001d\u0000\u0000\u0099\u009a\u0003\f\u0006\u0000\u009a\u009b\u0005\u0006"+
		"\u0000\u0000\u009b\u00a7\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001e"+
		"\u0000\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u009f\u0003\b\u0004"+
		"\u0000\u009f\u00a0\u0005\u0003\u0000\u0000\u00a0\u00a1\u0003\u000e\u0007"+
		"\u0000\u00a1\u00a7\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u0007\u0000"+
		"\u0000\u00a3\u00a4\u0003\b\u0004\u0000\u00a4\u00a5\u0005\u0006\u0000\u0000"+
		"\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u007f\u0001\u0000\u0000\u0000"+
		"\u00a6\u0088\u0001\u0000\u0000\u0000\u00a6\u008f\u0001\u0000\u0000\u0000"+
		"\u00a6\u0094\u0001\u0000\u0000\u0000\u00a6\u0098\u0001\u0000\u0000\u0000"+
		"\u00a6\u009c\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a7\u000b\u0001\u0000\u0000\u0000\u00a8\u00ad\u0003\b\u0004\u0000\u00a9"+
		"\u00aa\u0005\u0002\u0000\u0000\u00aa\u00ac\u0003\b\u0004\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\r\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2\u0003"+
		"\n\u0005\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00bf\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b6\u00ba\u0005\u0004\u0000\u0000\u00b7\u00b9\u0003\n\u0005"+
		"\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bf\u0005\u0005\u0000\u0000\u00be\u00b3\u0001\u0000\u0000"+
		"\u0000\u00be\u00b6\u0001\u0000\u0000\u0000\u00bf\u000f\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0003\u0012\t\u0000\u00c1\u00c2\u0005\u0010\u0000\u0000"+
		"\u00c2\u00c3\u0005$\u0000\u0000\u00c3\u00c4\u0005\u0011\u0000\u0000\u00c4"+
		"\u00d1\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u001f\u0000\u0000\u00c6"+
		"\u00ca\u0005\u0004\u0000\u0000\u00c7\u00c9\u0003\u0004\u0002\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0005\u0005\u0000\u0000\u00ce\u00d1\u0005%\u0000\u0000\u00cf\u00d1"+
		"\u0003\u0012\t\u0000\u00d0\u00c0\u0001\u0000\u0000\u0000\u00d0\u00c5\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u0011\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0007\u0004\u0000\u0000\u00d3\u0013\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d7\u0003\u0012\t\u0000\u00d5\u00d7\u0005#"+
		"\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u0015\u0001\u0000\u0000\u0000\u0016\u0019(+2:ACJ\\"+
		"dz|\u0086\u008b\u00a6\u00ad\u00b3\u00ba\u00be\u00ca\u00d0\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}