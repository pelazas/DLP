// Generated from C:/Users/UO287891/Desktop/dlp/DLPLAB/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;

    import ast.*;
    import ast.definitions.*;
    import ast.expressions.*;
    import ast.statements.*;
    import ast.types.*;
    import util.*;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT_CONSTANT=37, ID=38, 
		DOUBLE_CONSTANT=39, CHAR_CONSTANT=40, WS=41;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_funDefinition = 2, RULE_varDefinitions = 3, 
		RULE_funcBlock = 4, RULE_funParams = 5, RULE_expression = 6, RULE_statement = 7, 
		RULE_params = 8, RULE_arguments = 9, RULE_block = 10, RULE_type = 11, 
		RULE_builtInType = 12, RULE_returnType = 13, RULE_structFields = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "funDefinition", "varDefinitions", "funcBlock", "funParams", 
			"expression", "statement", "params", "arguments", "block", "type", "builtInType", 
			"returnType", "structFields"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'main'", "'('", "')'", "'{'", "'}'", "','", "';'", "'['", 
			"']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", 
			"'=='", "'<='", "'<'", "'!='", "'&&'", "'||'", "'if'", "'else'", "'='", 
			"'write'", "'read'", "'while'", "'return'", "'struct'", "'char'", "'int'", 
			"'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
		public List<Definition> definitions = new ArrayList<>();
		public VarDefinitionsContext v1;
		public FunDefinitionContext f1;
		public MainContext m1;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<VarDefinitionsContext> varDefinitions() {
			return getRuleContexts(VarDefinitionsContext.class);
		}
		public VarDefinitionsContext varDefinitions(int i) {
			return getRuleContext(VarDefinitionsContext.class,i);
		}
		public List<FunDefinitionContext> funDefinition() {
			return getRuleContexts(FunDefinitionContext.class);
		}
		public FunDefinitionContext funDefinition(int i) {
			return getRuleContext(FunDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(36);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(30);
						((ProgramContext)_localctx).v1 = varDefinitions();
						_localctx.definitions.addAll(((ProgramContext)_localctx).v1.ast);
						}
						break;
					case 2:
						{
						setState(33);
						((ProgramContext)_localctx).f1 = funDefinition();
						_localctx.definitions.add(((ProgramContext)_localctx).f1.ast);
						}
						break;
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(41);
			((ProgramContext)_localctx).m1 = main();
			setState(42);
			match(EOF);

			            _localctx.definitions.add(((ProgramContext)_localctx).m1.ast);
			            ((ProgramContext)_localctx).ast =  new Program(0, 0, _localctx.definitions);
			          
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
	public static class MainContext extends ParserRuleContext {
		public FuncDefinition ast;
		public VoidType t;
		public Token i;
		public Token m;
		public FuncBlockContext fB;
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((MainContext)_localctx).i = match(T__0);
			((MainContext)_localctx).t =  new VoidType(((MainContext)_localctx).i.getLine(), ((MainContext)_localctx).i.getCharPositionInLine()+1);
			setState(47);
			((MainContext)_localctx).m = match(T__1);
			setState(48);
			match(T__2);
			setState(49);
			match(T__3);
			setState(50);
			match(T__4);
			setState(51);
			((MainContext)_localctx).fB = funcBlock();
			setState(52);
			match(T__5);
			((MainContext)_localctx).ast =  new FuncDefinition(((MainContext)_localctx).i.getLine(), ((MainContext)_localctx).i.getCharPositionInLine()+1,
			                new FunctionType(((MainContext)_localctx).i.getLine(), ((MainContext)_localctx).i.getCharPositionInLine()+1, _localctx.t, new ArrayList<>()),
			                (((MainContext)_localctx).m!=null?((MainContext)_localctx).m.getText():null),
			                ((MainContext)_localctx).fB.ast.getVarDefinitions(),
			                ((MainContext)_localctx).fB.ast.getStatements()); 
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
	public static class FunDefinitionContext extends ParserRuleContext {
		public FuncDefinition ast;
		public ReturnTypeContext b1;
		public Token i1;
		public FunParamsContext fP;
		public FuncBlockContext fB;
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public FunParamsContext funParams() {
			return getRuleContext(FunParamsContext.class,0);
		}
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public FunDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funDefinition; }
	}

	public final FunDefinitionContext funDefinition() throws RecognitionException {
		FunDefinitionContext _localctx = new FunDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((FunDefinitionContext)_localctx).b1 = returnType();
			setState(56);
			((FunDefinitionContext)_localctx).i1 = match(ID);
			setState(57);
			match(T__2);
			setState(58);
			((FunDefinitionContext)_localctx).fP = funParams();
			setState(59);
			match(T__3);
			setState(60);
			match(T__4);
			setState(61);
			((FunDefinitionContext)_localctx).fB = funcBlock();
			setState(62);
			match(T__5);
			((FunDefinitionContext)_localctx).ast =  new FuncDefinition(((FunDefinitionContext)_localctx).b1.ast.getLine(), ((FunDefinitionContext)_localctx).b1.ast.getColumn(),
			                                       new FunctionType(((FunDefinitionContext)_localctx).b1.ast.getLine(), ((FunDefinitionContext)_localctx).b1.ast.getColumn(), ((FunDefinitionContext)_localctx).b1.ast, ((FunDefinitionContext)_localctx).fP.ast),
			                                       (((FunDefinitionContext)_localctx).i1!=null?((FunDefinitionContext)_localctx).i1.getText():null),
			                                       ((FunDefinitionContext)_localctx).fB.ast.getVarDefinitions(),
			                                       ((FunDefinitionContext)_localctx).fB.ast.getStatements()); 
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
	public static class VarDefinitionsContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public TypeContext t1;
		public Token i1;
		public Token i2;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public VarDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefinitions; }
	}

	public final VarDefinitionsContext varDefinitions() throws RecognitionException {
		VarDefinitionsContext _localctx = new VarDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((VarDefinitionsContext)_localctx).t1 = type(0);
			setState(66);
			((VarDefinitionsContext)_localctx).i1 = match(ID);
			_localctx.ast.add(new VariableDefinition(((VarDefinitionsContext)_localctx).t1.ast.getLine(), ((VarDefinitionsContext)_localctx).t1.ast.getColumn(), ((VarDefinitionsContext)_localctx).t1.ast, (((VarDefinitionsContext)_localctx).i1!=null?((VarDefinitionsContext)_localctx).i1.getText():null)));
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(68);
				match(T__6);
				setState(69);
				((VarDefinitionsContext)_localctx).i2 = match(ID);
				_localctx.ast.add(new VariableDefinition(((VarDefinitionsContext)_localctx).t1.ast.getLine(), ((VarDefinitionsContext)_localctx).t1.ast.getColumn(), ((VarDefinitionsContext)_localctx).t1.ast, (((VarDefinitionsContext)_localctx).i2!=null?((VarDefinitionsContext)_localctx).i2.getText():null)));
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__7);
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
		public StmtVarDfnDTO ast;
		public List<VariableDefinition> variableDefinitions = new ArrayList<>();
		public List<Statement> statements = new ArrayList<>();
		public VarDefinitionsContext v1;
		public StatementContext s1;
		public List<VarDefinitionsContext> varDefinitions() {
			return getRuleContexts(VarDefinitionsContext.class);
		}
		public VarDefinitionsContext varDefinitions(int i) {
			return getRuleContext(VarDefinitionsContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBlock; }
	}

	public final FuncBlockContext funcBlock() throws RecognitionException {
		FuncBlockContext _localctx = new FuncBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) {
				{
				{
				setState(78);
				((FuncBlockContext)_localctx).v1 = varDefinitions();

				            for(Definition v: ((FuncBlockContext)_localctx).v1.ast){
				                VariableDefinition var = (VariableDefinition) v;
				                _localctx.variableDefinitions.add(var);
				            }
				          
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2069704486920L) != 0)) {
				{
				{
				setState(86);
				((FuncBlockContext)_localctx).s1 = statement();

				            for(Statement stmt: ((FuncBlockContext)_localctx).s1.ast){
				                _localctx.statements.add(stmt);
				            }
				          
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((FuncBlockContext)_localctx).ast =  new StmtVarDfnDTO(_localctx.variableDefinitions, _localctx.statements);
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
	public static class FunParamsContext extends ParserRuleContext {
		public List<VariableDefinition> ast = new ArrayList<>();
		public TypeContext t1;
		public Token i1;
		public TypeContext t2;
		public Token i2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public FunParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funParams; }
	}

	public final FunParamsContext funParams() throws RecognitionException {
		FunParamsContext _localctx = new FunParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funParams);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((FunParamsContext)_localctx).t1 = type(0);
				setState(97);
				((FunParamsContext)_localctx).i1 = match(ID);
				_localctx.ast.add(new VariableDefinition(((FunParamsContext)_localctx).t1.ast.getLine(), ((FunParamsContext)_localctx).t1.ast.getColumn(), ((FunParamsContext)_localctx).t1.ast, (((FunParamsContext)_localctx).i1!=null?((FunParamsContext)_localctx).i1.getText():null)));
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(99);
					match(T__6);
					setState(100);
					((FunParamsContext)_localctx).t2 = type(0);
					setState(101);
					((FunParamsContext)_localctx).i2 = match(ID);
					_localctx.ast.add(new VariableDefinition(((FunParamsContext)_localctx).t2.ast.getLine(), ((FunParamsContext)_localctx).t2.ast.getColumn(), ((FunParamsContext)_localctx).t2.ast, (((FunParamsContext)_localctx).i2!=null?((FunParamsContext)_localctx).i2.getText():null)));
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext e1;
		public Token lp;
		public BuiltInTypeContext t1;
		public Token op;
		public Token ID;
		public ArgumentsContext arguments;
		public Token i;
		public Token d;
		public Token c;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode DOUBLE_CONSTANT() { return getToken(CmmParser.DOUBLE_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(113);
				match(T__2);
				setState(114);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(115);
				match(T__3);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 2:
				{
				setState(118);
				((ExpressionContext)_localctx).lp = match(T__2);
				setState(119);
				((ExpressionContext)_localctx).t1 = builtInType();
				setState(120);
				match(T__3);
				setState(121);
				((ExpressionContext)_localctx).e1 = expression(12);
				((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).lp.getLine(), ((ExpressionContext)_localctx).lp.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).t1.ast);
				}
				break;
			case 3:
				{
				setState(124);
				((ExpressionContext)_localctx).op = match(T__11);
				setState(125);
				((ExpressionContext)_localctx).e1 = expression(11);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 4:
				{
				setState(128);
				((ExpressionContext)_localctx).op = match(T__12);
				setState(129);
				((ExpressionContext)_localctx).e1 = expression(10);
				((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).op.getLine(), ((ExpressionContext)_localctx).op.getCharPositionInLine()+1, ((ExpressionContext)_localctx).e1.ast);
				}
				break;
			case 5:
				{
				setState(132);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(133);
				match(T__2);
				setState(134);
				((ExpressionContext)_localctx).arguments = arguments();
				setState(135);
				match(T__3);
				((ExpressionContext)_localctx).ast = 
				                    new FunctionInvocation(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1, ((ExpressionContext)_localctx).arguments.ast, new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)));
				}
				break;
			case 6:
				{
				setState(138);
				((ExpressionContext)_localctx).i = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).i.getLine(),((ExpressionContext)_localctx).i.getCharPositionInLine()+1, LexerHelper.lexemeToInt((((ExpressionContext)_localctx).i!=null?((ExpressionContext)_localctx).i.getText():null))); 
				}
				break;
			case 7:
				{
				setState(140);
				((ExpressionContext)_localctx).d = match(DOUBLE_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(((ExpressionContext)_localctx).d.getLine(),((ExpressionContext)_localctx).d.getCharPositionInLine()+1, LexerHelper.lexemeToReal((((ExpressionContext)_localctx).d!=null?((ExpressionContext)_localctx).d.getText():null)));
				}
				break;
			case 8:
				{
				setState(142);
				((ExpressionContext)_localctx).c = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharacterLiteral(((ExpressionContext)_localctx).c.getLine(),((ExpressionContext)_localctx).c.getCharPositionInLine()+1, LexerHelper.lexemeToChar((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getText():null)));
				}
				break;
			case 9:
				{
				setState(144);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(149);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(150);
						((ExpressionContext)_localctx).e2 = expression(10);
						((ExpressionContext)_localctx).ast =  OperationFactory.createOperation(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(154);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__16) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						((ExpressionContext)_localctx).e2 = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(159);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						((ExpressionContext)_localctx).e2 = expression(8);
						((ExpressionContext)_localctx).ast =  new Comparison(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(163);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(164);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						((ExpressionContext)_localctx).e2 = expression(7);
						 ((ExpressionContext)_localctx).ast =  new LogicalOperator(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast );
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(168);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(169);
						match(T__8);
						setState(170);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(171);
						match(T__9);
						 ((ExpressionContext)_localctx).ast =  new Indexing(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), ((ExpressionContext)_localctx).e1.ast, ((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(174);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(175);
						match(T__10);
						setState(176);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).e1.ast);
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public List<Statement> ast = new ArrayList<>();
		public Token if_;
		public ExpressionContext e1;
		public BlockContext b1;
		public BlockContext b2;
		public Token ID;
		public ArgumentsContext arguments;
		public ExpressionContext e2;
		public Token w;
		public ParamsContext params;
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((StatementContext)_localctx).if_ = match(T__25);
				setState(184);
				match(T__2);
				setState(185);
				((StatementContext)_localctx).e1 = expression(0);
				setState(186);
				match(T__3);
				setState(187);
				((StatementContext)_localctx).b1 = block();
				_localctx.ast.add(new IfElse(((StatementContext)_localctx).if_.getLine(), ((StatementContext)_localctx).if_.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast));
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(189);
					match(T__26);
					setState(190);
					((StatementContext)_localctx).b2 = block();
					((IfElse)_localctx.ast.get(0)).setElseBlock(((StatementContext)_localctx).b2.ast);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				((StatementContext)_localctx).ID = match(ID);
				setState(196);
				match(T__2);
				setState(197);
				((StatementContext)_localctx).arguments = arguments();
				setState(198);
				match(T__3);
				setState(199);
				match(T__7);
				_localctx.ast.add(new FunctionInvocation(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1, ((StatementContext)_localctx).arguments.ast, new Variable(((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1,(((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null))));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				((StatementContext)_localctx).e1 = expression(0);
				setState(203);
				match(T__27);
				setState(204);
				((StatementContext)_localctx).e2 = expression(0);
				setState(205);
				match(T__7);
				 _localctx.ast.add(new Assignment(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn(), ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e2.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				((StatementContext)_localctx).w = match(T__28);
				setState(209);
				((StatementContext)_localctx).params = params();
				setState(210);
				match(T__7);

				            for(Expression e: ((StatementContext)_localctx).params.ast){
				                _localctx.ast.add(new Write(((StatementContext)_localctx).w.getLine(), ((StatementContext)_localctx).w.getCharPositionInLine()+1, e));
				            }
				          
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				((StatementContext)_localctx).r = match(T__29);
				setState(214);
				((StatementContext)_localctx).params = params();
				setState(215);
				match(T__7);

				            for(Expression e: ((StatementContext)_localctx).params.ast){
				                _localctx.ast.add(new Read(((StatementContext)_localctx).r.getLine(), ((StatementContext)_localctx).r.getCharPositionInLine()+1,e));
				            }
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				((StatementContext)_localctx).w = match(T__30);
				setState(219);
				match(T__2);
				setState(220);
				((StatementContext)_localctx).e1 = expression(0);
				setState(221);
				match(T__3);
				setState(222);
				((StatementContext)_localctx).b1 = block();
				_localctx.ast.add(new While(((StatementContext)_localctx).w.getLine(), ((StatementContext)_localctx).w.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).b1.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				((StatementContext)_localctx).r = match(T__31);
				setState(226);
				((StatementContext)_localctx).e1 = expression(0);
				setState(227);
				match(T__7);
				_localctx.ast.add(new Return(((StatementContext)_localctx).r.getLine(), ((StatementContext)_localctx).r.getCharPositionInLine()+1, ((StatementContext)_localctx).e1.ast));
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
		enterRule(_localctx, 16, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(232);
			((ParamsContext)_localctx).e1 = expression(0);
			_localctx.ast.add(((ParamsContext)_localctx).e1.ast);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(234);
				match(T__6);
				setState(235);
				((ParamsContext)_localctx).e2 = expression(0);
				_localctx.ast.add(((ParamsContext)_localctx).e2.ast);
				}
				}
				setState(242);
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
		enterRule(_localctx, 18, RULE_arguments);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__11:
			case T__12:
			case INT_CONSTANT:
			case ID:
			case DOUBLE_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				((ArgumentsContext)_localctx).p1 = params();
				((ArgumentsContext)_localctx).ast =  ((ArgumentsContext)_localctx).p1.ast;
				}
				break;
			case T__3:
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
		enterRule(_localctx, 20, RULE_block);
		int _la;
		try {
			int _alt;
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__11:
			case T__12:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case INT_CONSTANT:
			case ID:
			case DOUBLE_CONSTANT:
			case CHAR_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						((BlockContext)_localctx).s1 = statement();
						_localctx.ast.addAll(((BlockContext)_localctx).s1.ast);
						}
						} 
					}
					setState(256);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__4);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2069704486920L) != 0)) {
					{
					{
					setState(258);
					((BlockContext)_localctx).s1 = statement();
					_localctx.ast.addAll(((BlockContext)_localctx).s1.ast);
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
				match(T__5);
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
		public TypeContext t1;
		public Token s;
		public StructFieldsContext sf;
		public BuiltInTypeContext b1;
		public Token i;
		public StructFieldsContext structFields() {
			return getRuleContext(StructFieldsContext.class,0);
		}
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				{
				setState(270);
				((TypeContext)_localctx).s = match(T__32);
				setState(271);
				match(T__4);
				setState(272);
				((TypeContext)_localctx).sf = structFields();
				setState(273);
				match(T__5);
				((TypeContext)_localctx).ast =  new StructType(((TypeContext)_localctx).s.getLine(), ((TypeContext)_localctx).s.getCharPositionInLine()+1,((TypeContext)_localctx).sf.ast);
				}
				break;
			case T__33:
			case T__34:
			case T__35:
				{
				setState(276);
				((TypeContext)_localctx).b1 = builtInType();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).b1.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.t1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(281);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(282);
					match(T__8);
					setState(283);
					((TypeContext)_localctx).i = match(INT_CONSTANT);
					setState(284);
					match(T__9);

					                      ((TypeContext)_localctx).ast =  ArrayFactory.createArray(((TypeContext)_localctx).t1.ast, LexerHelper.lexemeToInt((((TypeContext)_localctx).i!=null?((TypeContext)_localctx).i.getText():null)));
					                   
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 24, RULE_builtInType);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((BuiltInTypeContext)_localctx).t1 = match(T__33);
				((BuiltInTypeContext)_localctx).ast =  new CharacterType(((BuiltInTypeContext)_localctx).t1.getLine(), ((BuiltInTypeContext)_localctx).t1.getCharPositionInLine()+1);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				((BuiltInTypeContext)_localctx).t1 = match(T__34);
				((BuiltInTypeContext)_localctx).ast =  new IntegerType(((BuiltInTypeContext)_localctx).t1.getLine(), ((BuiltInTypeContext)_localctx).t1.getCharPositionInLine()+1);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				((BuiltInTypeContext)_localctx).t1 = match(T__35);
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
		public Type ast;
		public BuiltInTypeContext b1;
		public Token t1;
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
		enterRule(_localctx, 26, RULE_returnType);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				((ReturnTypeContext)_localctx).b1 = builtInType();
				((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).b1.ast;
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				((ReturnTypeContext)_localctx).t1 = match(T__0);
				((ReturnTypeContext)_localctx).ast =  new VoidType(((ReturnTypeContext)_localctx).t1.getLine(), ((ReturnTypeContext)_localctx).t1.getCharPositionInLine()+1);
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
		public Token n1;
		public Token n2;
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public StructFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFields; }
	}

	public final StructFieldsContext structFields() throws RecognitionException {
		StructFieldsContext _localctx = new StructFieldsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_structFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) {
				{
				{
				setState(306);
				((StructFieldsContext)_localctx).t1 = type(0);
				setState(307);
				((StructFieldsContext)_localctx).n1 = match(ID);
				_localctx.ast.add(new StructFieldType(((StructFieldsContext)_localctx).t1.ast.getLine(), ((StructFieldsContext)_localctx).t1.ast.getColumn(), ((StructFieldsContext)_localctx).t1.ast, (((StructFieldsContext)_localctx).n1!=null?((StructFieldsContext)_localctx).n1.getText():null)));
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(309);
					match(T__6);
					setState(310);
					((StructFieldsContext)_localctx).n2 = match(ID);
					_localctx.ast.add(new StructFieldType(((StructFieldsContext)_localctx).t1.ast.getLine(), ((StructFieldsContext)_localctx).t1.ast.getColumn(), ((StructFieldsContext)_localctx).t1.ast, (((StructFieldsContext)_localctx).n2!=null?((StructFieldsContext)_localctx).n2.getText():null)));
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				match(T__7);
				}
				}
				setState(323);
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
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11:
			return type_sempred((TypeContext)_localctx, predIndex);
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
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u0145\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000%\b\u0000"+
		"\n\u0000\f\u0000(\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003H\b\u0003\n\u0003\f\u0003K\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004Z\b\u0004\n\u0004\f\u0004]\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005i\b\u0005\n\u0005\f\u0005l\t\u0005"+
		"\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0093\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b3\b\u0006\n\u0006"+
		"\f\u0006\u00b6\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00c2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00e7\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00ef\b\b\n\b\f\b\u00f2\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00f8\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00fd\b\n"+
		"\n\n\f\n\u0100\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0106\b\n\n"+
		"\n\f\n\u0109\t\n\u0001\n\u0003\n\u010c\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u0118\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u011f\b\u000b\n\u000b\f\u000b"+
		"\u0122\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u012a\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0131\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u0139\b\u000e\n\u000e\f\u000e\u013c\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0140\b\u000e\n\u000e\f\u000e\u0143\t\u000e\u0001\u000e\u0000"+
		"\u0002\f\u0016\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0004\u0001\u0000\u000e\u0010\u0002\u0000"+
		"\f\f\u0011\u0011\u0001\u0000\u0012\u0017\u0001\u0000\u0018\u0019\u015d"+
		"\u0000&\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00047"+
		"\u0001\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\bS\u0001\u0000"+
		"\u0000\u0000\nn\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000"+
		"\u000e\u00e6\u0001\u0000\u0000\u0000\u0010\u00e8\u0001\u0000\u0000\u0000"+
		"\u0012\u00f7\u0001\u0000\u0000\u0000\u0014\u010b\u0001\u0000\u0000\u0000"+
		"\u0016\u0117\u0001\u0000\u0000\u0000\u0018\u0129\u0001\u0000\u0000\u0000"+
		"\u001a\u0130\u0001\u0000\u0000\u0000\u001c\u0141\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0003\u0006\u0003\u0000\u001f \u0006\u0000\uffff\uffff\u0000"+
		" %\u0001\u0000\u0000\u0000!\"\u0003\u0004\u0002\u0000\"#\u0006\u0000\uffff"+
		"\uffff\u0000#%\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000\u0000"+
		"$!\u0001\u0000\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000)*\u0003\u0002\u0001\u0000*+\u0005\u0000\u0000\u0001+,\u0006"+
		"\u0000\uffff\uffff\u0000,\u0001\u0001\u0000\u0000\u0000-.\u0005\u0001"+
		"\u0000\u0000./\u0006\u0001\uffff\uffff\u0000/0\u0005\u0002\u0000\u0000"+
		"01\u0005\u0003\u0000\u000012\u0005\u0004\u0000\u000023\u0005\u0005\u0000"+
		"\u000034\u0003\b\u0004\u000045\u0005\u0006\u0000\u000056\u0006\u0001\uffff"+
		"\uffff\u00006\u0003\u0001\u0000\u0000\u000078\u0003\u001a\r\u000089\u0005"+
		"&\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0003\n\u0005\u0000;<\u0005"+
		"\u0004\u0000\u0000<=\u0005\u0005\u0000\u0000=>\u0003\b\u0004\u0000>?\u0005"+
		"\u0006\u0000\u0000?@\u0006\u0002\uffff\uffff\u0000@\u0005\u0001\u0000"+
		"\u0000\u0000AB\u0003\u0016\u000b\u0000BC\u0005&\u0000\u0000CI\u0006\u0003"+
		"\uffff\uffff\u0000DE\u0005\u0007\u0000\u0000EF\u0005&\u0000\u0000FH\u0006"+
		"\u0003\uffff\uffff\u0000GD\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\b\u0000\u0000M\u0007\u0001"+
		"\u0000\u0000\u0000NO\u0003\u0006\u0003\u0000OP\u0006\u0004\uffff\uffff"+
		"\u0000PR\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000RU\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000T[\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0003\u000e\u0007\u0000"+
		"WX\u0006\u0004\uffff\uffff\u0000XZ\u0001\u0000\u0000\u0000YV\u0001\u0000"+
		"\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^_\u0006\u0004\uffff\uffff\u0000_\t\u0001\u0000\u0000\u0000`a\u0003\u0016"+
		"\u000b\u0000ab\u0005&\u0000\u0000bj\u0006\u0005\uffff\uffff\u0000cd\u0005"+
		"\u0007\u0000\u0000de\u0003\u0016\u000b\u0000ef\u0005&\u0000\u0000fg\u0006"+
		"\u0005\uffff\uffff\u0000gi\u0001\u0000\u0000\u0000hc\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000ko\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0001"+
		"\u0000\u0000\u0000n`\u0001\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"o\u000b\u0001\u0000\u0000\u0000pq\u0006\u0006\uffff\uffff\u0000qr\u0005"+
		"\u0003\u0000\u0000rs\u0003\f\u0006\u0000st\u0005\u0004\u0000\u0000tu\u0006"+
		"\u0006\uffff\uffff\u0000u\u0093\u0001\u0000\u0000\u0000vw\u0005\u0003"+
		"\u0000\u0000wx\u0003\u0018\f\u0000xy\u0005\u0004\u0000\u0000yz\u0003\f"+
		"\u0006\fz{\u0006\u0006\uffff\uffff\u0000{\u0093\u0001\u0000\u0000\u0000"+
		"|}\u0005\f\u0000\u0000}~\u0003\f\u0006\u000b~\u007f\u0006\u0006\uffff"+
		"\uffff\u0000\u007f\u0093\u0001\u0000\u0000\u0000\u0080\u0081\u0005\r\u0000"+
		"\u0000\u0081\u0082\u0003\f\u0006\n\u0082\u0083\u0006\u0006\uffff\uffff"+
		"\u0000\u0083\u0093\u0001\u0000\u0000\u0000\u0084\u0085\u0005&\u0000\u0000"+
		"\u0085\u0086\u0005\u0003\u0000\u0000\u0086\u0087\u0003\u0012\t\u0000\u0087"+
		"\u0088\u0005\u0004\u0000\u0000\u0088\u0089\u0006\u0006\uffff\uffff\u0000"+
		"\u0089\u0093\u0001\u0000\u0000\u0000\u008a\u008b\u0005%\u0000\u0000\u008b"+
		"\u0093\u0006\u0006\uffff\uffff\u0000\u008c\u008d\u0005\'\u0000\u0000\u008d"+
		"\u0093\u0006\u0006\uffff\uffff\u0000\u008e\u008f\u0005(\u0000\u0000\u008f"+
		"\u0093\u0006\u0006\uffff\uffff\u0000\u0090\u0091\u0005&\u0000\u0000\u0091"+
		"\u0093\u0006\u0006\uffff\uffff\u0000\u0092p\u0001\u0000\u0000\u0000\u0092"+
		"v\u0001\u0000\u0000\u0000\u0092|\u0001\u0000\u0000\u0000\u0092\u0080\u0001"+
		"\u0000\u0000\u0000\u0092\u0084\u0001\u0000\u0000\u0000\u0092\u008a\u0001"+
		"\u0000\u0000\u0000\u0092\u008c\u0001\u0000\u0000\u0000\u0092\u008e\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u00b4\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\n\t\u0000\u0000\u0095\u0096\u0007\u0000"+
		"\u0000\u0000\u0096\u0097\u0003\f\u0006\n\u0097\u0098\u0006\u0006\uffff"+
		"\uffff\u0000\u0098\u00b3\u0001\u0000\u0000\u0000\u0099\u009a\n\b\u0000"+
		"\u0000\u009a\u009b\u0007\u0001\u0000\u0000\u009b\u009c\u0003\f\u0006\t"+
		"\u009c\u009d\u0006\u0006\uffff\uffff\u0000\u009d\u00b3\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\n\u0007\u0000\u0000\u009f\u00a0\u0007\u0002\u0000\u0000"+
		"\u00a0\u00a1\u0003\f\u0006\b\u00a1\u00a2\u0006\u0006\uffff\uffff\u0000"+
		"\u00a2\u00b3\u0001\u0000\u0000\u0000\u00a3\u00a4\n\u0006\u0000\u0000\u00a4"+
		"\u00a5\u0007\u0003\u0000\u0000\u00a5\u00a6\u0003\f\u0006\u0007\u00a6\u00a7"+
		"\u0006\u0006\uffff\uffff\u0000\u00a7\u00b3\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\n\u000e\u0000\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u00ab"+
		"\u0003\f\u0006\u0000\u00ab\u00ac\u0005\n\u0000\u0000\u00ac\u00ad\u0006"+
		"\u0006\uffff\uffff\u0000\u00ad\u00b3\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\n\r\u0000\u0000\u00af\u00b0\u0005\u000b\u0000\u0000\u00b0\u00b1\u0005"+
		"&\u0000\u0000\u00b1\u00b3\u0006\u0006\uffff\uffff\u0000\u00b2\u0094\u0001"+
		"\u0000\u0000\u0000\u00b2\u0099\u0001\u0000\u0000\u0000\u00b2\u009e\u0001"+
		"\u0000\u0000\u0000\u00b2\u00a3\u0001\u0000\u0000\u0000\u00b2\u00a8\u0001"+
		"\u0000\u0000\u0000\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\r\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u001a\u0000\u0000\u00b8\u00b9\u0005\u0003"+
		"\u0000\u0000\u00b9\u00ba\u0003\f\u0006\u0000\u00ba\u00bb\u0005\u0004\u0000"+
		"\u0000\u00bb\u00bc\u0003\u0014\n\u0000\u00bc\u00c1\u0006\u0007\uffff\uffff"+
		"\u0000\u00bd\u00be\u0005\u001b\u0000\u0000\u00be\u00bf\u0003\u0014\n\u0000"+
		"\u00bf\u00c0\u0006\u0007\uffff\uffff\u0000\u00c0\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c2\u00e7\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005&\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0003\u0000\u0000\u00c5\u00c6\u0003\u0012\t\u0000\u00c6"+
		"\u00c7\u0005\u0004\u0000\u0000\u00c7\u00c8\u0005\b\u0000\u0000\u00c8\u00c9"+
		"\u0006\u0007\uffff\uffff\u0000\u00c9\u00e7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0003\f\u0006\u0000\u00cb\u00cc\u0005\u001c\u0000\u0000\u00cc\u00cd"+
		"\u0003\f\u0006\u0000\u00cd\u00ce\u0005\b\u0000\u0000\u00ce\u00cf\u0006"+
		"\u0007\uffff\uffff\u0000\u00cf\u00e7\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005\u001d\u0000\u0000\u00d1\u00d2\u0003\u0010\b\u0000\u00d2\u00d3\u0005"+
		"\b\u0000\u0000\u00d3\u00d4\u0006\u0007\uffff\uffff\u0000\u00d4\u00e7\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\u001e\u0000\u0000\u00d6\u00d7\u0003"+
		"\u0010\b\u0000\u00d7\u00d8\u0005\b\u0000\u0000\u00d8\u00d9\u0006\u0007"+
		"\uffff\uffff\u0000\u00d9\u00e7\u0001\u0000\u0000\u0000\u00da\u00db\u0005"+
		"\u001f\u0000\u0000\u00db\u00dc\u0005\u0003\u0000\u0000\u00dc\u00dd\u0003"+
		"\f\u0006\u0000\u00dd\u00de\u0005\u0004\u0000\u0000\u00de\u00df\u0003\u0014"+
		"\n\u0000\u00df\u00e0\u0006\u0007\uffff\uffff\u0000\u00e0\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0005 \u0000\u0000\u00e2\u00e3\u0003\f\u0006"+
		"\u0000\u00e3\u00e4\u0005\b\u0000\u0000\u00e4\u00e5\u0006\u0007\uffff\uffff"+
		"\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00e6\u00c3\u0001\u0000\u0000\u0000\u00e6\u00ca\u0001\u0000\u0000"+
		"\u0000\u00e6\u00d0\u0001\u0000\u0000\u0000\u00e6\u00d5\u0001\u0000\u0000"+
		"\u0000\u00e6\u00da\u0001\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e7\u000f\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003\f\u0006\u0000"+
		"\u00e9\u00f0\u0006\b\uffff\uffff\u0000\u00ea\u00eb\u0005\u0007\u0000\u0000"+
		"\u00eb\u00ec\u0003\f\u0006\u0000\u00ec\u00ed\u0006\b\uffff\uffff\u0000"+
		"\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u0011\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0003\u0010\b\u0000\u00f4"+
		"\u00f5\u0006\t\uffff\uffff\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f3\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u0013\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0003\u000e\u0007\u0000\u00fa\u00fb\u0006\n\uffff\uffff\u0000\u00fb"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd"+
		"\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff\u010c\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0101\u0107\u0005\u0005\u0000\u0000\u0102"+
		"\u0103\u0003\u000e\u0007\u0000\u0103\u0104\u0006\n\uffff\uffff\u0000\u0104"+
		"\u0106\u0001\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0106"+
		"\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u010a\u010c\u0005\u0006\u0000\u0000\u010b"+
		"\u00fe\u0001\u0000\u0000\u0000\u010b\u0101\u0001\u0000\u0000\u0000\u010c"+
		"\u0015\u0001\u0000\u0000\u0000\u010d\u010e\u0006\u000b\uffff\uffff\u0000"+
		"\u010e\u010f\u0005!\u0000\u0000\u010f\u0110\u0005\u0005\u0000\u0000\u0110"+
		"\u0111\u0003\u001c\u000e\u0000\u0111\u0112\u0005\u0006\u0000\u0000\u0112"+
		"\u0113\u0006\u000b\uffff\uffff\u0000\u0113\u0118\u0001\u0000\u0000\u0000"+
		"\u0114\u0115\u0003\u0018\f\u0000\u0115\u0116\u0006\u000b\uffff\uffff\u0000"+
		"\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u010d\u0001\u0000\u0000\u0000"+
		"\u0117\u0114\u0001\u0000\u0000\u0000\u0118\u0120\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\n\u0003\u0000\u0000\u011a\u011b\u0005\t\u0000\u0000\u011b"+
		"\u011c\u0005%\u0000\u0000\u011c\u011d\u0005\n\u0000\u0000\u011d\u011f"+
		"\u0006\u000b\uffff\uffff\u0000\u011e\u0119\u0001\u0000\u0000\u0000\u011f"+
		"\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0001\u0000\u0000\u0000\u0121\u0017\u0001\u0000\u0000\u0000\u0122"+
		"\u0120\u0001\u0000\u0000\u0000\u0123\u0124\u0005\"\u0000\u0000\u0124\u012a"+
		"\u0006\f\uffff\uffff\u0000\u0125\u0126\u0005#\u0000\u0000\u0126\u012a"+
		"\u0006\f\uffff\uffff\u0000\u0127\u0128\u0005$\u0000\u0000\u0128\u012a"+
		"\u0006\f\uffff\uffff\u0000\u0129\u0123\u0001\u0000\u0000\u0000\u0129\u0125"+
		"\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u0019"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0003\u0018\f\u0000\u012c\u012d\u0006"+
		"\r\uffff\uffff\u0000\u012d\u0131\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		"\u0001\u0000\u0000\u012f\u0131\u0006\r\uffff\uffff\u0000\u0130\u012b\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u001b\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0003\u0016\u000b\u0000\u0133\u0134\u0005"+
		"&\u0000\u0000\u0134\u013a\u0006\u000e\uffff\uffff\u0000\u0135\u0136\u0005"+
		"\u0007\u0000\u0000\u0136\u0137\u0005&\u0000\u0000\u0137\u0139\u0006\u000e"+
		"\uffff\uffff\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0139\u013c\u0001"+
		"\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001"+
		"\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0005\b\u0000\u0000\u013e\u0140\u0001\u0000"+
		"\u0000\u0000\u013f\u0132\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000"+
		"\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000"+
		"\u0000\u0000\u0142\u001d\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0017$&IS[jn\u0092\u00b2\u00b4\u00c1\u00e6\u00f0\u00f7\u00fe"+
		"\u0107\u010b\u0117\u0120\u0129\u0130\u013a\u0141";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}