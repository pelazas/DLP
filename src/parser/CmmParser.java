// Generated from C:/Users/uo287891/IdeaProjects/DLP/src/parser/Cmm.g4 by ANTLR 4.13.1
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
		T__31=32, T__32=33, T__33=34, INT_CONSTANT=35, ID=36, DOUBLE_CONSTANT=37, 
		CHAR_CONSTANT=38, WS=39;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_varDefinition = 2, RULE_funcBlock = 3, 
		RULE_expression = 4, RULE_statement = 5, RULE_params = 6, RULE_arguments = 7, 
		RULE_block = 8, RULE_type = 9, RULE_builtInType = 10, RULE_structFields = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "varDefinition", "funcBlock", "expression", 
			"statement", "params", "arguments", "block", "type", "builtInType", "structFields"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'{'", "'}'", "';'", "'return'", "'.'", "'*'", 
			"'/'", "'%'", "'+'", "'-'", "'&&'", "'||'", "'['", "']'", "'!'", "'>'", 
			"'>='", "'=='", "'<='", "'<'", "'!='", "'if'", "'else'", "'='", "'write'", 
			"'read'", "'while'", "'struct'", "'char'", "'int'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "INT_CONSTANT", 
			"ID", "DOUBLE_CONSTANT", "CHAR_CONSTANT", "WS"
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
		public Program ast;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
				{
				{
				setState(24);
				definition();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
	public static class DefinitionContext extends ParserRuleContext {
		public Definition ast;
		public VarDefinitionContext v1;
		public VarDefinitionContext varDefinition() {
			return getRuleContext(VarDefinitionContext.class,0);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
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
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((DefinitionContext)_localctx).v1 = varDefinition();
				((DefinitionContext)_localctx).ast =  ((DefinitionContext)_localctx).v1.ast;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				builtInType();
				setState(36);
				match(ID);
				setState(37);
				match(T__0);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
					{
					setState(38);
					type();
					setState(39);
					match(ID);
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(40);
						match(T__1);
						setState(41);
						type();
						setState(42);
						match(ID);
						}
						}
						setState(48);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(51);
				match(T__2);
				setState(52);
				match(T__3);
				setState(53);
				funcBlock();
				setState(54);
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
		public List<Definition> ast;
		public TypeContext t1;
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(58);
			((VarDefinitionContext)_localctx).t1 = type();
			setState(59);
			match(ID);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(60);
				match(T__1);
				setState(61);
				match(ID);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(71);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__30:
					case T__31:
					case T__32:
					case T__33:
						{
						setState(69);
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
						setState(70);
						statement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(76);
				match(T__6);
				setState(77);
				expression(0);
				setState(78);
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
		public Token i;
		public Token d;
		public Token c;
		public Token op;
		public ArgumentsContext arguments;
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(83);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			case 2:
				{
				setState(85);
				((ExpressionContext)_localctx).i = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).i.getLine(),((ExpressionContext)_localctx).i.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null))); 
				}
				break;
			case 3:
				{
				setState(87);
				((ExpressionContext)_localctx).d = match(DOUBLE_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).d.getLine(),((ExpressionContext)_localctx).d.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).d!=null?((ExpressionContext)_localctx).d.getText():null)));
				}
				break;
			case 4:
				{
				setState(89);
				((ExpressionContext)_localctx).c = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharacterLiteral(((ExpressionContext)_localctx).c.getLine(),((ExpressionContext)_localctx).c.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null)));
				}
				break;
			case 5:
				{
				setState(91);
				match(T__0);
				setState(92);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(93);
				match(T__2);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 6:
				{
				setState(96);
				((ExpressionContext)_localctx).op = match(T__12);
				setState(97);
				((ExpressionContext)_localctx).e1 = expression(5);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 7:
				{
				setState(100);
				((ExpressionContext)_localctx).op = match(T__17);
				setState(101);
				((ExpressionContext)_localctx).e1 = expression(4);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 8:
				{
				setState(104);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(105);
				match(T__0);
				setState(106);
				((ExpressionContext)_localctx).arguments = arguments();
				setState(107);
				match(T__2);
				((ExpressionContext)_localctx).ast = 
				            new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).arguments.ast, new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				}
				break;
			case 9:
				{
				setState(110);
				((ExpressionContext)_localctx).lp = match(T__0);
				setState(111);
				((ExpressionContext)_localctx).t1 = builtInType();
				setState(112);
				match(T__2);
				setState(113);
				((ExpressionContext)_localctx).e1 = expression(1);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).lp.getLine(), ((ExpressionContext)_localctx).lp.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).t1.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(118);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(119);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						((ExpressionContext)_localctx).e2 = expression(10);
						((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(123);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(124);
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
						setState(125);
						((ExpressionContext)_localctx).e2 = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(129);
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
						setState(130);
						((ExpressionContext)_localctx).e2 = expression(8);
						 ((ExpressionContext)_localctx).ast =  new LogicalOperator(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(134);
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
						setState(135);
						((ExpressionContext)_localctx).e2 = expression(4);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(139);
						match(T__7);
						setState(140);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(142);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(143);
						match(T__15);
						setState(144);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(145);
						match(T__16);
						 ((ExpressionContext)_localctx).ast =  new Indexing(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public ArgumentsContext arguments;
		public ExpressionContext e2;
		public Token w;
		public Token r;
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
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((StatementContext)_localctx).if_ = match(T__24);
				setState(154);
				match(T__0);
				setState(155);
				((StatementContext)_localctx).e1 = expression(0);
				setState(156);
				match(T__2);
				setState(157);
				((StatementContext)_localctx).b1 = block();
				((StatementContext)_localctx).ast =  new IfElse(((StatementContext)_localctx).if_.getLine(), ((StatementContext)_localctx).if_.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(159);
					match(T__25);
					setState(160);
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
				setState(165);
				((StatementContext)_localctx).ID = match(ID);
				setState(166);
				match(T__0);
				setState(167);
				((StatementContext)_localctx).arguments = arguments();
				setState(168);
				match(T__2);
				setState(169);
				match(T__5);
				((StatementContext)_localctx).ast = 
				            new FunctionInvocation(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, ((StatementContext)_localctx).arguments.ast, new Variable(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1,(((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				((StatementContext)_localctx).e1 = expression(0);
				setState(173);
				match(T__26);
				setState(174);
				((StatementContext)_localctx).e2 = expression(0);
				setState(175);
				match(T__5);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				((StatementContext)_localctx).w = match(T__27);
				setState(179);
				((StatementContext)_localctx).e1 = expression(0);
				setState(180);
				match(T__5);
				 ((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).w.getLine(), ((StatementContext)_localctx).w.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				((StatementContext)_localctx).r = match(T__28);
				setState(184);
				((StatementContext)_localctx).e1 = expression(0);
				setState(185);
				match(T__5);
				((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).r.getLine(), ((StatementContext)_localctx).r.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				((StatementContext)_localctx).w = match(T__29);
				setState(189);
				match(T__0);
				setState(190);
				((StatementContext)_localctx).e1 = expression(0);
				setState(191);
				match(T__2);
				setState(192);
				((StatementContext)_localctx).b1 = block();
				((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).w.getLine(), ((StatementContext)_localctx).w.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				((StatementContext)_localctx).r = match(T__6);
				setState(196);
				((StatementContext)_localctx).e1 = expression(0);
				setState(197);
				match(T__5);
				((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).r.getLine(), ((StatementContext)_localctx).r.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast);
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
			setState(202);
			((ParamsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ParamsContext)_localctx).e1.ast);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(204);
				match(T__1);
				setState(205);
				((ParamsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ParamsContext)_localctx).e2.ast);
				}
				}
				setState(212);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ParamsContext p1;
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arguments);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__12:
			case T__17:
			case INT_CONSTANT:
			case ID:
			case DOUBLE_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				((ArgumentsContext)_localctx).p1 = params();
				((ArgumentsContext)_localctx).ast =  ((ArgumentsContext)_localctx).p1.ast;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			int _alt;
			setState(237);
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
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(219);
						((BlockContext)_localctx).s1 = statement();
						_localctx.ast.add(((BlockContext)_localctx).s1.ast);
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__3);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 517308948610L) != 0)) {
					{
					{
					setState(228);
					((BlockContext)_localctx).s1 = statement();
					_localctx.ast.add(((BlockContext)_localctx).s1.ast);
					}
					}
					setState(235);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(236);
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
		public Type ast;
		public BuiltInTypeContext b1;
		public Token i;
		public Token s;
		public StructFieldsContext sf;
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				((TypeContext)_localctx).b1 = builtInType();
				setState(240);
				match(T__15);
				setState(241);
				((TypeContext)_localctx).i = match(INT_CONSTANT);
				setState(242);
				match(T__16);
				((TypeContext)_localctx).ast =  new ArrayType(((TypeContext)_localctx).b1.ast.getLine(),((TypeContext)_localctx).b1.ast.getColumn(), LexerHelper.lexemeToInt((((TypeContext)_localctx).i!=null?((TypeContext)_localctx).i.getText():null)), ((TypeContext)_localctx).b1.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				((TypeContext)_localctx).s = match(T__30);
				setState(246);
				match(T__3);
				setState(247);
				((TypeContext)_localctx).sf = structFields();
				setState(248);
				match(T__4);
				((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).s.getLine(), ((TypeContext)_localctx).s.getCharPositionInLine()+1,((TypeContext)_localctx).sf.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				((TypeContext)_localctx).b1 = builtInType();
				_localctx.ast = ((TypeContext)_localctx).b1.ast
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
		enterRule(_localctx, 20, RULE_builtInType);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((BuiltInTypeContext)_localctx).t1 = match(T__31);
				((BuiltInTypeContext)_localctx).ast =  new CharacterType(((BuiltInTypeContext)_localctx).t1.getLine(), ((BuiltInTypeContext)_localctx).t1.getCharPositionInLine()+1);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				((BuiltInTypeContext)_localctx).t1 = match(T__32);
				((BuiltInTypeContext)_localctx).ast =  new IntegerType(((BuiltInTypeContext)_localctx).t1.getLine(), ((BuiltInTypeContext)_localctx).t1.getCharPositionInLine()+1);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
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
	public static class StructFieldsContext extends ParserRuleContext {
		public List<StructFieldType> ast = new ArrayList<>();
		public TypeContext t1;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public StructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFields; }
	}

	public final StructFieldsContext structFields() throws RecognitionException {
		StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_structFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
				{
				{
				setState(264);
				((StructFieldsContext)_localctx).t1 = type();
				setState(265);
				((StructFieldsContext)_localctx).ID = match(ID);
				setState(266);
				match(T__5);
				_localctx.ast.add(new StructFieldType(((StructFieldsContext)_localctx).t1.ast.getLine(), ((StructFieldsContext)_localctx).t1.ast.getColumn(), ((StructFieldsContext)_localctx).t1.ast, (((StructFieldsContext)_localctx).ID!=null?((StructFieldsContext)_localctx).ID.getText():null)));
				}
				}
				setState(273);
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
		"\u0004\u0001\'\u0113\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001-\b\u0001\n\u0001\f\u00010\t\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Q\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004u\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u0095\b\u0004\n\u0004\f\u0004\u0098\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a4\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00c9\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00d1\b\u0006\n\u0006\f\u0006\u00d4\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00da\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00df\b\b\n\b\f\b\u00e2\t\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0005\b\u00e8\b\b\n\b\f\b\u00eb\t\b\u0001\b\u0003\b\u00ee\b\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ff\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0107\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u010e\b\u000b\n"+
		"\u000b\f\u000b\u0111\t\u000b\u0001\u000b\u0000\u0001\b\f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0004\u0001\u0000\t\u000b"+
		"\u0001\u0000\f\r\u0001\u0000\u000e\u000f\u0001\u0000\u0013\u0018\u012d"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004"+
		":\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bt\u0001\u0000"+
		"\u0000\u0000\n\u00c8\u0001\u0000\u0000\u0000\f\u00ca\u0001\u0000\u0000"+
		"\u0000\u000e\u00d9\u0001\u0000\u0000\u0000\u0010\u00ed\u0001\u0000\u0000"+
		"\u0000\u0012\u00fe\u0001\u0000\u0000\u0000\u0014\u0106\u0001\u0000\u0000"+
		"\u0000\u0016\u010f\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001"+
		"\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f\u0001\u0001\u0000\u0000"+
		"\u0000 !\u0003\u0004\u0002\u0000!\"\u0006\u0001\uffff\uffff\u0000\"9\u0001"+
		"\u0000\u0000\u0000#$\u0003\u0014\n\u0000$%\u0005$\u0000\u0000%1\u0005"+
		"\u0001\u0000\u0000&\'\u0003\u0012\t\u0000\'.\u0005$\u0000\u0000()\u0005"+
		"\u0002\u0000\u0000)*\u0003\u0012\t\u0000*+\u0005$\u0000\u0000+-\u0001"+
		"\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u00001&\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000034\u0005\u0003\u0000\u000045\u0005"+
		"\u0004\u0000\u000056\u0003\u0006\u0003\u000067\u0005\u0005\u0000\u0000"+
		"79\u0001\u0000\u0000\u00008 \u0001\u0000\u0000\u00008#\u0001\u0000\u0000"+
		"\u00009\u0003\u0001\u0000\u0000\u0000:;\u0003\u0012\t\u0000;@\u0005$\u0000"+
		"\u0000<=\u0005\u0002\u0000\u0000=?\u0005$\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0006\u0000\u0000D\u0005\u0001\u0000\u0000\u0000EH\u0003\u0004\u0002"+
		"\u0000FH\u0003\n\u0005\u0000GE\u0001\u0000\u0000\u0000GF\u0001\u0000\u0000"+
		"\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JP\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005"+
		"\u0007\u0000\u0000MN\u0003\b\u0004\u0000NO\u0005\u0006\u0000\u0000OQ\u0001"+
		"\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"Q\u0007\u0001\u0000\u0000\u0000RS\u0006\u0004\uffff\uffff\u0000ST\u0005"+
		"$\u0000\u0000Tu\u0006\u0004\uffff\uffff\u0000UV\u0005#\u0000\u0000Vu\u0006"+
		"\u0004\uffff\uffff\u0000WX\u0005%\u0000\u0000Xu\u0006\u0004\uffff\uffff"+
		"\u0000YZ\u0005&\u0000\u0000Zu\u0006\u0004\uffff\uffff\u0000[\\\u0005\u0001"+
		"\u0000\u0000\\]\u0003\b\u0004\u0000]^\u0005\u0003\u0000\u0000^_\u0006"+
		"\u0004\uffff\uffff\u0000_u\u0001\u0000\u0000\u0000`a\u0005\r\u0000\u0000"+
		"ab\u0003\b\u0004\u0005bc\u0006\u0004\uffff\uffff\u0000cu\u0001\u0000\u0000"+
		"\u0000de\u0005\u0012\u0000\u0000ef\u0003\b\u0004\u0004fg\u0006\u0004\uffff"+
		"\uffff\u0000gu\u0001\u0000\u0000\u0000hi\u0005$\u0000\u0000ij\u0005\u0001"+
		"\u0000\u0000jk\u0003\u000e\u0007\u0000kl\u0005\u0003\u0000\u0000lm\u0006"+
		"\u0004\uffff\uffff\u0000mu\u0001\u0000\u0000\u0000no\u0005\u0001\u0000"+
		"\u0000op\u0003\u0014\n\u0000pq\u0005\u0003\u0000\u0000qr\u0003\b\u0004"+
		"\u0001rs\u0006\u0004\uffff\uffff\u0000su\u0001\u0000\u0000\u0000tR\u0001"+
		"\u0000\u0000\u0000tU\u0001\u0000\u0000\u0000tW\u0001\u0000\u0000\u0000"+
		"tY\u0001\u0000\u0000\u0000t[\u0001\u0000\u0000\u0000t`\u0001\u0000\u0000"+
		"\u0000td\u0001\u0000\u0000\u0000th\u0001\u0000\u0000\u0000tn\u0001\u0000"+
		"\u0000\u0000u\u0096\u0001\u0000\u0000\u0000vw\n\t\u0000\u0000wx\u0007"+
		"\u0000\u0000\u0000xy\u0003\b\u0004\nyz\u0006\u0004\uffff\uffff\u0000z"+
		"\u0095\u0001\u0000\u0000\u0000{|\n\b\u0000\u0000|}\u0007\u0001\u0000\u0000"+
		"}~\u0003\b\u0004\t~\u007f\u0006\u0004\uffff\uffff\u0000\u007f\u0095\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\n\u0007\u0000\u0000\u0081\u0082\u0007\u0002"+
		"\u0000\u0000\u0082\u0083\u0003\b\u0004\b\u0083\u0084\u0006\u0004\uffff"+
		"\uffff\u0000\u0084\u0095\u0001\u0000\u0000\u0000\u0085\u0086\n\u0003\u0000"+
		"\u0000\u0086\u0087\u0007\u0003\u0000\u0000\u0087\u0088\u0003\b\u0004\u0004"+
		"\u0088\u0089\u0006\u0004\uffff\uffff\u0000\u0089\u0095\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\n\n\u0000\u0000\u008b\u008c\u0005\b\u0000\u0000\u008c"+
		"\u008d\u0005$\u0000\u0000\u008d\u0095\u0006\u0004\uffff\uffff\u0000\u008e"+
		"\u008f\n\u0006\u0000\u0000\u008f\u0090\u0005\u0010\u0000\u0000\u0090\u0091"+
		"\u0003\b\u0004\u0000\u0091\u0092\u0005\u0011\u0000\u0000\u0092\u0093\u0006"+
		"\u0004\uffff\uffff\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094v\u0001"+
		"\u0000\u0000\u0000\u0094{\u0001\u0000\u0000\u0000\u0094\u0080\u0001\u0000"+
		"\u0000\u0000\u0094\u0085\u0001\u0000\u0000\u0000\u0094\u008a\u0001\u0000"+
		"\u0000\u0000\u0094\u008e\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000"+
		"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\t\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005\u0019\u0000\u0000\u009a\u009b\u0005\u0001\u0000"+
		"\u0000\u009b\u009c\u0003\b\u0004\u0000\u009c\u009d\u0005\u0003\u0000\u0000"+
		"\u009d\u009e\u0003\u0010\b\u0000\u009e\u00a3\u0006\u0005\uffff\uffff\u0000"+
		"\u009f\u00a0\u0005\u001a\u0000\u0000\u00a0\u00a1\u0003\u0010\b\u0000\u00a1"+
		"\u00a2\u0006\u0005\uffff\uffff\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a4\u00c9\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005$\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0001\u0000\u0000\u00a7\u00a8\u0003\u000e\u0007\u0000\u00a8"+
		"\u00a9\u0005\u0003\u0000\u0000\u00a9\u00aa\u0005\u0006\u0000\u0000\u00aa"+
		"\u00ab\u0006\u0005\uffff\uffff\u0000\u00ab\u00c9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0003\b\u0004\u0000\u00ad\u00ae\u0005\u001b\u0000\u0000\u00ae"+
		"\u00af\u0003\b\u0004\u0000\u00af\u00b0\u0005\u0006\u0000\u0000\u00b0\u00b1"+
		"\u0006\u0005\uffff\uffff\u0000\u00b1\u00c9\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u001c\u0000\u0000\u00b3\u00b4\u0003\b\u0004\u0000\u00b4\u00b5"+
		"\u0005\u0006\u0000\u0000\u00b5\u00b6\u0006\u0005\uffff\uffff\u0000\u00b6"+
		"\u00c9\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u001d\u0000\u0000\u00b8"+
		"\u00b9\u0003\b\u0004\u0000\u00b9\u00ba\u0005\u0006\u0000\u0000\u00ba\u00bb"+
		"\u0006\u0005\uffff\uffff\u0000\u00bb\u00c9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005\u001e\u0000\u0000\u00bd\u00be\u0005\u0001\u0000\u0000\u00be"+
		"\u00bf\u0003\b\u0004\u0000\u00bf\u00c0\u0005\u0003\u0000\u0000\u00c0\u00c1"+
		"\u0003\u0010\b\u0000\u00c1\u00c2\u0006\u0005\uffff\uffff\u0000\u00c2\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0007\u0000\u0000\u00c4\u00c5"+
		"\u0003\b\u0004\u0000\u00c5\u00c6\u0005\u0006\u0000\u0000\u00c6\u00c7\u0006"+
		"\u0005\uffff\uffff\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u0099"+
		"\u0001\u0000\u0000\u0000\u00c8\u00a5\u0001\u0000\u0000\u0000\u00c8\u00ac"+
		"\u0001\u0000\u0000\u0000\u00c8\u00b2\u0001\u0000\u0000\u0000\u00c8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00c8\u00bc\u0001\u0000\u0000\u0000\u00c8\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c9\u000b\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0003\b\u0004\u0000\u00cb\u00d2\u0006\u0006\uffff\uffff\u0000\u00cc\u00cd"+
		"\u0005\u0002\u0000\u0000\u00cd\u00ce\u0003\b\u0004\u0000\u00ce\u00cf\u0006"+
		"\u0006\uffff\uffff\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00cc"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\r\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003"+
		"\f\u0006\u0000\u00d6\u00d7\u0006\u0007\uffff\uffff\u0000\u00d7\u00da\u0001"+
		"\u0000\u0000\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u000f\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0003\n\u0005\u0000\u00dc\u00dd\u0006\b"+
		"\uffff\uffff\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00db\u0001"+
		"\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00ee\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e9\u0005"+
		"\u0004\u0000\u0000\u00e4\u00e5\u0003\n\u0005\u0000\u00e5\u00e6\u0006\b"+
		"\uffff\uffff\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ee\u0005"+
		"\u0005\u0000\u0000\u00ed\u00e0\u0001\u0000\u0000\u0000\u00ed\u00e3\u0001"+
		"\u0000\u0000\u0000\u00ee\u0011\u0001\u0000\u0000\u0000\u00ef\u00f0\u0003"+
		"\u0014\n\u0000\u00f0\u00f1\u0005\u0010\u0000\u0000\u00f1\u00f2\u0005#"+
		"\u0000\u0000\u00f2\u00f3\u0005\u0011\u0000\u0000\u00f3\u00f4\u0006\t\uffff"+
		"\uffff\u0000\u00f4\u00ff\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u001f"+
		"\u0000\u0000\u00f6\u00f7\u0005\u0004\u0000\u0000\u00f7\u00f8\u0003\u0016"+
		"\u000b\u0000\u00f8\u00f9\u0005\u0005\u0000\u0000\u00f9\u00fa\u0006\t\uffff"+
		"\uffff\u0000\u00fa\u00ff\u0001\u0000\u0000\u0000\u00fb\u00fc\u0003\u0014"+
		"\n\u0000\u00fc\u00fd\u0006\t\uffff\uffff\u0000\u00fd\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ef\u0001\u0000\u0000\u0000\u00fe\u00f5\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fb\u0001\u0000\u0000\u0000\u00ff\u0013\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0005 \u0000\u0000\u0101\u0107\u0006\n\uffff"+
		"\uffff\u0000\u0102\u0103\u0005!\u0000\u0000\u0103\u0107\u0006\n\uffff"+
		"\uffff\u0000\u0104\u0105\u0005\"\u0000\u0000\u0105\u0107\u0006\n\uffff"+
		"\uffff\u0000\u0106\u0100\u0001\u0000\u0000\u0000\u0106\u0102\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0015\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0003\u0012\t\u0000\u0109\u010a\u0005$\u0000"+
		"\u0000\u010a\u010b\u0005\u0006\u0000\u0000\u010b\u010c\u0006\u000b\uffff"+
		"\uffff\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u0108\u0001\u0000"+
		"\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0017\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0015\u001b.18@GIPt\u0094"+
		"\u0096\u00a3\u00c8\u00d2\u00d9\u00e0\u00e9\u00ed\u00fe\u0106\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}