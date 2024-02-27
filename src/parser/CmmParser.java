// Generated from C:/Users/UO287891/Desktop/dlp/DLPLAB/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;

    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;

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
		public Expression ast;
		public ExpressionContext e1;
		public Token ID;
		public Token DOUBLE_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token op;
		public ParamsContext params;
		public Token lp;
		public BuiltInTypeContext t1;
		public ExpressionContext e2;
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(77);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 2:
				{
				setState(79);
				match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null))); 
				}
				break;
			case 3:
				{
				setState(81);
				((ExpressionContext)_localctx).DOUBLE_CONSTANT = match(DOUBLE_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).DOUBLE_CONSTANT!=null?((ExpressionContext)_localctx).DOUBLE_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(83);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharacterLiteral(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 5:
				{
				setState(85);
				match(T__0);
				setState(86);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(87);
				match(T__2);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 6:
				{
				setState(90);
				((ExpressionContext)_localctx).op = match(T__12);
				setState(91);
				((ExpressionContext)_localctx).e1 = expression(5);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 7:
				{
				setState(94);
				((ExpressionContext)_localctx).op = match(T__17);
				setState(95);
				((ExpressionContext)_localctx).e1 = expression(4);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 8:
				{
				setState(98);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(99);
				match(T__0);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792421378L) != 0)) {
					{
					setState(100);
					((ExpressionContext)_localctx).params = params();
					}
				}

				setState(103);
				match(T__2);
				((ExpressionContext)_localctx).ast = 
				            new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).params.ast, new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				}
				break;
			case 9:
				{
				setState(105);
				((ExpressionContext)_localctx).lp = match(T__0);
				setState(106);
				((ExpressionContext)_localctx).t1 = builtInType();
				setState(107);
				match(T__2);
				setState(108);
				((ExpressionContext)_localctx).e1 = expression(1);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).lp.getLine(), ((ExpressionContext)_localctx).lp.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).t1.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(143);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(114);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(115);
						((ExpressionContext)_localctx).e2 = expression(10);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(119);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						((ExpressionContext)_localctx).e2 = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(124);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						((ExpressionContext)_localctx).e2 = expression(8);
						 ((ExpressionContext)_localctx).ast =  new LogicalOperator(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(129);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						((ExpressionContext)_localctx).e2 = expression(4);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(134);
						match(T__7);
						setState(135);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(137);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(138);
						match(T__15);
						setState(139);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(140);
						match(T__16);
						 ((ExpressionContext)_localctx).ast =  new Indexing(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					}
					} 
				}
				setState(147);
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
		public Statement ast;
		public Token if_;
		public ExpressionContext e1;
		public BlockContext b1;
		public BlockContext b2;
		public Token ID;
		public ParamsContext params;
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((StatementContext)_localctx).if_ = match(T__24);
				setState(149);
				match(T__0);
				setState(150);
				((StatementContext)_localctx).e1 = expression(0);
				setState(151);
				match(T__2);
				setState(152);
				((StatementContext)_localctx).b1 = block();
				((StatementContext)_localctx).ast =  new IfElse(((StatementContext)_localctx).if_.getLine(), ((StatementContext)_localctx).if_.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast);
				setState(158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(154);
					match(T__25);
					setState(155);
					((StatementContext)_localctx).b2 = block();
					((IfElse) _localctx.ast).setElseBlock(((StatementContext)_localctx).b2.ast);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((StatementContext)_localctx).ID = match(ID);
				setState(161);
				match(T__0);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792421378L) != 0)) {
					{
					setState(162);
					((StatementContext)_localctx).params = params();
					}
				}

				setState(165);
				match(T__2);
				setState(166);
				match(T__5);
				((StatementContext)_localctx).ast = 
				            new FunctionInvocation(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, ((StatementContext)_localctx).params.ast, new Variable(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1,(((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				expression(0);
				setState(169);
				match(T__26);
				setState(170);
				expression(0);
				setState(171);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(173);
				match(T__27);
				setState(174);
				params();
				setState(175);
				match(T__5);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(T__28);
				setState(178);
				params();
				setState(179);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				match(T__29);
				setState(182);
				match(T__0);
				setState(183);
				expression(0);
				setState(184);
				match(T__2);
				setState(185);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(T__6);
				setState(188);
				expression(0);
				setState(189);
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
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e2;
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
			setState(193);
			((ParamsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ParamsContext)_localctx).e1.ast);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(195);
				match(T__1);
				setState(196);
				((ParamsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ParamsContext)_localctx).e2.ast);
				}
				}
				setState(203);
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
		public List<Statement> ast = new ArrayList<>();
		public StatementContext s1;
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
			setState(222);
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
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(204);
						((BlockContext)_localctx).s1 = statement();
						_localctx.ast.add(((BlockContext)_localctx).s1.ast);
						}
						} 
					}
					setState(211);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(T__3);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1032705024130L) != 0)) {
					{
					{
					setState(213);
					((BlockContext)_localctx).s1 = statement();
					_localctx.ast.add(((BlockContext)_localctx).s1.ast);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
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
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				builtInType();
				setState(225);
				match(T__15);
				setState(226);
				match(INT_CONSTANT);
				setState(227);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__30);
				setState(230);
				match(T__3);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
					{
					{
					setState(231);
					varDefinition();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				match(T__4);
				setState(238);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
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
		public Type ast;
		public Token t1;
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_builtInType);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				((BuiltInTypeContext)_localctx).t1 = match(T__31);
				((BuiltInTypeContext)_localctx).ast =  new CharacterType(((BuiltInTypeContext)_localctx).t1.getLine(), ((BuiltInTypeContext)_localctx).t1.getCharPositionInLine()+1);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				((BuiltInTypeContext)_localctx).t1 = match(T__32);
				((BuiltInTypeContext)_localctx).ast =  new IntegerType(((BuiltInTypeContext)_localctx).t1.getLine(), ((BuiltInTypeContext)_localctx).t1.getCharPositionInLine()+1);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				((BuiltInTypeContext)_localctx).t1 = match(T__33);
				((BuiltInTypeContext)_localctx).ast =  new DoubleType(((BuiltInTypeContext)_localctx).t1.getLine(), ((BuiltInTypeContext)_localctx).t1.getCharPositionInLine()+1);
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
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
			case T__32:
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				builtInType();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
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
		"\u0004\u0001(\u00ff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"p\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0090\b\u0004\n\u0004\f\u0004\u0093\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u009f\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a4\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00c0\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c8\b\u0006\n\u0006\f\u0006"+
		"\u00cb\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d0\b"+
		"\u0007\n\u0007\f\u0007\u00d3\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u00d9\b\u0007\n\u0007\f\u0007\u00dc\t\u0007\u0001"+
		"\u0007\u0003\u0007\u00df\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00e9\b\b\n\b\f\b\u00ec\t\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00f1\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00f9\b\t\u0001\n\u0001\n\u0003\n\u00fd\b\n\u0001\n"+
		"\u0000\u0001\b\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0004\u0001\u0000\t\u000b\u0001\u0000\f\r\u0001\u0000\u000e\u000f"+
		"\u0001\u0000\u0013\u0018\u011c\u0000\u0019\u0001\u0000\u0000\u0000\u0002"+
		"2\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006C\u0001"+
		"\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\n\u00bf\u0001\u0000\u0000"+
		"\u0000\f\u00c1\u0001\u0000\u0000\u0000\u000e\u00de\u0001\u0000\u0000\u0000"+
		"\u0010\u00f0\u0001\u0000\u0000\u0000\u0012\u00f8\u0001\u0000\u0000\u0000"+
		"\u0014\u00fc\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001c3\u0003\u0004\u0002\u0000\u001d\u001e\u0003\u0014\n\u0000\u001e"+
		"\u001f\u0005%\u0000\u0000\u001f+\u0005\u0001\u0000\u0000 !\u0003\u0010"+
		"\b\u0000!(\u0005%\u0000\u0000\"#\u0005\u0002\u0000\u0000#$\u0003\u0010"+
		"\b\u0000$%\u0005%\u0000\u0000%\'\u0001\u0000\u0000\u0000&\"\u0001\u0000"+
		"\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000"+
		"+ \u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-.\u0005\u0003\u0000\u0000./\u0005\u0004\u0000\u0000/0\u0003\u0006"+
		"\u0003\u000001\u0005\u0005\u0000\u000013\u0001\u0000\u0000\u00002\u001c"+
		"\u0001\u0000\u0000\u00002\u001d\u0001\u0000\u0000\u00003\u0003\u0001\u0000"+
		"\u0000\u000045\u0003\u0010\b\u00005:\u0005%\u0000\u000067\u0005\u0002"+
		"\u0000\u000079\u0005%\u0000\u000086\u0001\u0000\u0000\u00009<\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u0006\u0000\u0000"+
		">\u0005\u0001\u0000\u0000\u0000?B\u0003\u0004\u0002\u0000@B\u0003\n\u0005"+
		"\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DJ\u0001"+
		"\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005\u0007\u0000\u0000"+
		"GH\u0003\b\u0004\u0000HI\u0005\u0006\u0000\u0000IK\u0001\u0000\u0000\u0000"+
		"JF\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0007\u0001\u0000"+
		"\u0000\u0000LM\u0006\u0004\uffff\uffff\u0000MN\u0005%\u0000\u0000Np\u0006"+
		"\u0004\uffff\uffff\u0000OP\u0005$\u0000\u0000Pp\u0006\u0004\uffff\uffff"+
		"\u0000QR\u0005&\u0000\u0000Rp\u0006\u0004\uffff\uffff\u0000ST\u0005\'"+
		"\u0000\u0000Tp\u0006\u0004\uffff\uffff\u0000UV\u0005\u0001\u0000\u0000"+
		"VW\u0003\b\u0004\u0000WX\u0005\u0003\u0000\u0000XY\u0006\u0004\uffff\uffff"+
		"\u0000Yp\u0001\u0000\u0000\u0000Z[\u0005\r\u0000\u0000[\\\u0003\b\u0004"+
		"\u0005\\]\u0006\u0004\uffff\uffff\u0000]p\u0001\u0000\u0000\u0000^_\u0005"+
		"\u0012\u0000\u0000_`\u0003\b\u0004\u0004`a\u0006\u0004\uffff\uffff\u0000"+
		"ap\u0001\u0000\u0000\u0000bc\u0005%\u0000\u0000ce\u0005\u0001\u0000\u0000"+
		"df\u0003\f\u0006\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gh\u0005\u0003\u0000\u0000hp\u0006\u0004\uffff"+
		"\uffff\u0000ij\u0005\u0001\u0000\u0000jk\u0003\u0012\t\u0000kl\u0005\u0003"+
		"\u0000\u0000lm\u0003\b\u0004\u0001mn\u0006\u0004\uffff\uffff\u0000np\u0001"+
		"\u0000\u0000\u0000oL\u0001\u0000\u0000\u0000oO\u0001\u0000\u0000\u0000"+
		"oQ\u0001\u0000\u0000\u0000oS\u0001\u0000\u0000\u0000oU\u0001\u0000\u0000"+
		"\u0000oZ\u0001\u0000\u0000\u0000o^\u0001\u0000\u0000\u0000ob\u0001\u0000"+
		"\u0000\u0000oi\u0001\u0000\u0000\u0000p\u0091\u0001\u0000\u0000\u0000"+
		"qr\n\t\u0000\u0000rs\u0007\u0000\u0000\u0000st\u0003\b\u0004\ntu\u0006"+
		"\u0004\uffff\uffff\u0000u\u0090\u0001\u0000\u0000\u0000vw\n\b\u0000\u0000"+
		"wx\u0007\u0001\u0000\u0000xy\u0003\b\u0004\tyz\u0006\u0004\uffff\uffff"+
		"\u0000z\u0090\u0001\u0000\u0000\u0000{|\n\u0007\u0000\u0000|}\u0007\u0002"+
		"\u0000\u0000}~\u0003\b\u0004\b~\u007f\u0006\u0004\uffff\uffff\u0000\u007f"+
		"\u0090\u0001\u0000\u0000\u0000\u0080\u0081\n\u0003\u0000\u0000\u0081\u0082"+
		"\u0007\u0003\u0000\u0000\u0082\u0083\u0003\b\u0004\u0004\u0083\u0084\u0006"+
		"\u0004\uffff\uffff\u0000\u0084\u0090\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\n\n\u0000\u0000\u0086\u0087\u0005\b\u0000\u0000\u0087\u0088\u0005%\u0000"+
		"\u0000\u0088\u0090\u0006\u0004\uffff\uffff\u0000\u0089\u008a\n\u0006\u0000"+
		"\u0000\u008a\u008b\u0005\u0010\u0000\u0000\u008b\u008c\u0003\b\u0004\u0000"+
		"\u008c\u008d\u0005\u0011\u0000\u0000\u008d\u008e\u0006\u0004\uffff\uffff"+
		"\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008fq\u0001\u0000\u0000\u0000"+
		"\u008fv\u0001\u0000\u0000\u0000\u008f{\u0001\u0000\u0000\u0000\u008f\u0080"+
		"\u0001\u0000\u0000\u0000\u008f\u0085\u0001\u0000\u0000\u0000\u008f\u0089"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\t\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005"+
		"\u0019\u0000\u0000\u0095\u0096\u0005\u0001\u0000\u0000\u0096\u0097\u0003"+
		"\b\u0004\u0000\u0097\u0098\u0005\u0003\u0000\u0000\u0098\u0099\u0003\u000e"+
		"\u0007\u0000\u0099\u009e\u0006\u0005\uffff\uffff\u0000\u009a\u009b\u0005"+
		"\u001a\u0000\u0000\u009b\u009c\u0003\u000e\u0007\u0000\u009c\u009d\u0006"+
		"\u0005\uffff\uffff\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009a"+
		"\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00c0"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005%\u0000\u0000\u00a1\u00a3\u0005"+
		"\u0001\u0000\u0000\u00a2\u00a4\u0003\f\u0006\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0003\u0000\u0000\u00a6\u00a7\u0005\u0006"+
		"\u0000\u0000\u00a7\u00c0\u0006\u0005\uffff\uffff\u0000\u00a8\u00a9\u0003"+
		"\b\u0004\u0000\u00a9\u00aa\u0005\u001b\u0000\u0000\u00aa\u00ab\u0003\b"+
		"\u0004\u0000\u00ab\u00ac\u0005\u0006\u0000\u0000\u00ac\u00c0\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005\u001c\u0000\u0000\u00ae\u00af\u0003\f\u0006"+
		"\u0000\u00af\u00b0\u0005\u0006\u0000\u0000\u00b0\u00c0\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\u001d\u0000\u0000\u00b2\u00b3\u0003\f\u0006\u0000"+
		"\u00b3\u00b4\u0005\u0006\u0000\u0000\u00b4\u00c0\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005\u001e\u0000\u0000\u00b6\u00b7\u0005\u0001\u0000\u0000"+
		"\u00b7\u00b8\u0003\b\u0004\u0000\u00b8\u00b9\u0005\u0003\u0000\u0000\u00b9"+
		"\u00ba\u0003\u000e\u0007\u0000\u00ba\u00c0\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005\u0007\u0000\u0000\u00bc\u00bd\u0003\b\u0004\u0000\u00bd\u00be"+
		"\u0005\u0006\u0000\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf\u0094"+
		"\u0001\u0000\u0000\u0000\u00bf\u00a0\u0001\u0000\u0000\u0000\u00bf\u00a8"+
		"\u0001\u0000\u0000\u0000\u00bf\u00ad\u0001\u0000\u0000\u0000\u00bf\u00b1"+
		"\u0001\u0000\u0000\u0000\u00bf\u00b5\u0001\u0000\u0000\u0000\u00bf\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c0\u000b\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0003\b\u0004\u0000\u00c2\u00c9\u0006\u0006\uffff\uffff\u0000\u00c3\u00c4"+
		"\u0005\u0002\u0000\u0000\u00c4\u00c5\u0003\b\u0004\u0000\u00c5\u00c6\u0006"+
		"\u0006\uffff\uffff\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\r\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0003"+
		"\n\u0005\u0000\u00cd\u00ce\u0006\u0007\uffff\uffff\u0000\u00ce\u00d0\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00df\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00da\u0005\u0004\u0000\u0000\u00d5\u00d6\u0003"+
		"\n\u0005\u0000\u00d6\u00d7\u0006\u0007\uffff\uffff\u0000\u00d7\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00df\u0005\u0005\u0000\u0000\u00de\u00d1\u0001"+
		"\u0000\u0000\u0000\u00de\u00d4\u0001\u0000\u0000\u0000\u00df\u000f\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0003\u0012\t\u0000\u00e1\u00e2\u0005\u0010"+
		"\u0000\u0000\u00e2\u00e3\u0005$\u0000\u0000\u00e3\u00e4\u0005\u0011\u0000"+
		"\u0000\u00e4\u00f1\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u001f\u0000"+
		"\u0000\u00e6\u00ea\u0005\u0004\u0000\u0000\u00e7\u00e9\u0003\u0004\u0002"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005\u0005\u0000\u0000\u00ee\u00f1\u0005%\u0000\u0000"+
		"\u00ef\u00f1\u0003\u0012\t\u0000\u00f0\u00e0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00e5\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1"+
		"\u0011\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005 \u0000\u0000\u00f3\u00f9"+
		"\u0006\t\uffff\uffff\u0000\u00f4\u00f5\u0005!\u0000\u0000\u00f5\u00f9"+
		"\u0006\t\uffff\uffff\u0000\u00f6\u00f7\u0005\"\u0000\u0000\u00f7\u00f9"+
		"\u0006\t\uffff\uffff\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f8\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u0013"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fd\u0003\u0012\t\u0000\u00fb\u00fd\u0005"+
		"#\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fd\u0015\u0001\u0000\u0000\u0000\u0017\u0019(+2:ACJeo"+
		"\u008f\u0091\u009e\u00a3\u00bf\u00c9\u00d1\u00da\u00de\u00ea\u00f0\u00f8"+
		"\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}