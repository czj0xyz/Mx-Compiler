// Generated from E:/上个大学怎么这么多事/编译器/MxCompiler/Mx-Compiler/src/grammar\MxCompiler.g4 by ANTLR 4.10.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW=1, THIS=2, CLASS=3, WHILE=4, FOR=5, IF=6, ELSE=7, RETURN=8, VOID=9, 
		BREAK=10, CONTINUE=11, TINT=12, TBOOL=13, TSTRING=14, NULL=15, TRUE=16, 
		FALSE=17, ID=18, INT=19, STRING=20, LINE_IGNORE=21, BLOCK_IGNORE=22, WS=23, 
		LeftParen=24, RightParen=25, LeftBracket=26, RightBracket=27, LeftBrace=28, 
		RightBrace=29, CloseParen=30, Less=31, LessEqual=32, Greater=33, GreaterEqual=34, 
		LeftShift=35, RightShift=36, Plus=37, Minus=38, Mul=39, Div=40, Mod=41, 
		PlusPlus=42, MinusMinus=43, And=44, Or=45, AndAnd=46, OrOr=47, Caret=48, 
		Not=49, Tilde=50, Question=51, Colon=52, Semi=53, Comma=54, Assign=55, 
		Equal=56, NotEqual=57, Arrow=58, Dot=59;
	public static final int
		RULE_program = 0, RULE_varDef = 1, RULE_assignment = 2, RULE_statement = 3, 
		RULE_arg_list = 4, RULE_expr = 5, RULE_value = 6, RULE_typename = 7, RULE_return = 8, 
		RULE_func_list = 9, RULE_func_ret = 10, RULE_func_void = 11, RULE_funcDef = 12, 
		RULE_if = 13, RULE_else = 14, RULE_while = 15, RULE_for = 16, RULE_classDef = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varDef", "assignment", "statement", "arg_list", "expr", "value", 
			"typename", "return", "func_list", "func_ret", "func_void", "funcDef", 
			"if", "else", "while", "for", "classDef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'new'", "'this'", "'class'", "'while'", "'for'", "'if'", "'else'", 
			"'return'", "'void'", "'break'", "'continue'", "'int'", "'bool'", "'string'", 
			"'null'", "'true'", "'false'", null, null, null, null, null, null, "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'()'", "'<'", "'<='", "'>'", "'>='", 
			"'<<'", "'>>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'&'", 
			"'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", 
			"'='", "'=='", "'!='", "'->'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW", "THIS", "CLASS", "WHILE", "FOR", "IF", "ELSE", "RETURN", 
			"VOID", "BREAK", "CONTINUE", "TINT", "TBOOL", "TSTRING", "NULL", "TRUE", 
			"FALSE", "ID", "INT", "STRING", "LINE_IGNORE", "BLOCK_IGNORE", "WS", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "CloseParen", "Less", "LessEqual", "Greater", "GreaterEqual", 
			"LeftShift", "RightShift", "Plus", "Minus", "Mul", "Div", "Mod", "PlusPlus", 
			"MinusMinus", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", 
			"Question", "Colon", "Semi", "Comma", "Assign", "Equal", "NotEqual", 
			"Arrow", "Dot"
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
	public String getGrammarFileName() { return "MxCompiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MxCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MxCompilerParser.EOF, 0); }
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public List<ClassDefContext> classDef() {
			return getRuleContexts(ClassDefContext.class);
		}
		public ClassDefContext classDef(int i) {
			return getRuleContext(ClassDefContext.class,i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(MxCompilerParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MxCompilerParser.Semi, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << VOID) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << ID))) != 0)) {
				{
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					{
					setState(36);
					varDef();
					setState(37);
					match(Semi);
					}
					}
					break;
				case 2:
					{
					setState(39);
					funcDef();
					}
					break;
				case 3:
					{
					setState(40);
					classDef();
					}
					break;
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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

	public static class VarDefContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxCompilerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxCompilerParser.Comma, i);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			typename();
			setState(49);
			assignment();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(50);
				match(Comma);
				setState(51);
				assignment();
				}
				}
				setState(56);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public TerminalNode Assign() { return getToken(MxCompilerParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ID);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(58);
				match(Assign);
				setState(59);
				expr(0);
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

	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MxCompilerParser.Semi, 0); }
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(MxCompilerParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(MxCompilerParser.CONTINUE, 0); }
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(MxCompilerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxCompilerParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				expr(0);
				setState(63);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				varDef();
				setState(66);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				match(BREAK);
				setState(70);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				match(CONTINUE);
				setState(72);
				match(Semi);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				while_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				for_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				match(Semi);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				match(LeftBrace);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Semi))) != 0)) {
					{
					{
					setState(77);
					statement();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(RightBrace);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				return_();
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

	public static class Arg_listContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MxCompilerParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxCompilerParser.RightParen, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxCompilerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxCompilerParser.Comma, i);
		}
		public TerminalNode CloseParen() { return getToken(MxCompilerParser.CloseParen, 0); }
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitArg_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitArg_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arg_list);
		int _la;
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(LeftParen);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde))) != 0)) {
					{
					setState(88);
					expr(0);
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(89);
						match(Comma);
						setState(90);
						expr(0);
						}
						}
						setState(95);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(98);
				match(RightParen);
				}
				break;
			case CloseParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(CloseParen);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode NEW() { return getToken(MxCompilerParser.NEW, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(MxCompilerParser.LeftParen, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RightParen() { return getToken(MxCompilerParser.RightParen, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MxCompilerParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(MxCompilerParser.MinusMinus, 0); }
		public TerminalNode Plus() { return getToken(MxCompilerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MxCompilerParser.Minus, 0); }
		public TerminalNode Not() { return getToken(MxCompilerParser.Not, 0); }
		public TerminalNode Tilde() { return getToken(MxCompilerParser.Tilde, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(MxCompilerParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxCompilerParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxCompilerParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxCompilerParser.RightBracket, i);
		}
		public TerminalNode Arrow() { return getToken(MxCompilerParser.Arrow, 0); }
		public TerminalNode LeftBrace() { return getToken(MxCompilerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxCompilerParser.RightBrace, 0); }
		public TerminalNode And() { return getToken(MxCompilerParser.And, 0); }
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Assign() { return getToken(MxCompilerParser.Assign, 0); }
		public TerminalNode Mul() { return getToken(MxCompilerParser.Mul, 0); }
		public TerminalNode Div() { return getToken(MxCompilerParser.Div, 0); }
		public TerminalNode Mod() { return getToken(MxCompilerParser.Mod, 0); }
		public TerminalNode LeftShift() { return getToken(MxCompilerParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(MxCompilerParser.RightShift, 0); }
		public TerminalNode Less() { return getToken(MxCompilerParser.Less, 0); }
		public TerminalNode Greater() { return getToken(MxCompilerParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(MxCompilerParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(MxCompilerParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(MxCompilerParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(MxCompilerParser.NotEqual, 0); }
		public TerminalNode Caret() { return getToken(MxCompilerParser.Caret, 0); }
		public TerminalNode Or() { return getToken(MxCompilerParser.Or, 0); }
		public TerminalNode AndAnd() { return getToken(MxCompilerParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(MxCompilerParser.OrOr, 0); }
		public TerminalNode Dot() { return getToken(MxCompilerParser.Dot, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(103);
				match(ID);
				}
				break;
			case 2:
				{
				setState(104);
				match(ID);
				setState(105);
				arg_list();
				}
				break;
			case 3:
				{
				setState(106);
				match(NEW);
				setState(107);
				typename();
				}
				break;
			case 4:
				{
				setState(108);
				match(LeftParen);
				setState(109);
				expr(0);
				setState(110);
				match(RightParen);
				}
				break;
			case 5:
				{
				setState(112);
				value();
				}
				break;
			case 6:
				{
				setState(113);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				expr(15);
				}
				break;
			case 7:
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(116);
				expr(14);
				}
				break;
			case 8:
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==Not || _la==Tilde) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				expr(13);
				}
				break;
			case 9:
				{
				setState(119);
				match(LeftBracket);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(120);
					match(And);
					}
				}

				setState(123);
				match(RightBracket);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen || _la==CloseParen) {
					{
					setState(124);
					func_list();
					}
				}

				setState(127);
				match(Arrow);
				setState(128);
				match(LeftBrace);
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Semi))) != 0)) {
					{
					{
					setState(129);
					statement();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(135);
				match(RightBrace);
				setState(137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(136);
					arg_list();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(142);
						match(Assign);
						setState(143);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(145);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Div) | (1L << Mod))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(146);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(148);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(151);
						_la = _input.LA(1);
						if ( !(_la==LeftShift || _la==RightShift) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(154);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << LessEqual) | (1L << Greater) | (1L << GreaterEqual))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(157);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(158);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(160);
						match(And);
						setState(161);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(163);
						match(Caret);
						setState(164);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(166);
						match(Or);
						setState(167);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(169);
						match(AndAnd);
						setState(170);
						expr(4);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(172);
						match(OrOr);
						setState(173);
						expr(3);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(175);
						match(Dot);
						setState(176);
						match(ID);
						setState(178);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(177);
							arg_list();
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(185); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(181);
								match(LeftBracket);
								setState(182);
								expr(0);
								setState(183);
								match(RightBracket);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(187); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(190);
						_la = _input.LA(1);
						if ( !(_la==PlusPlus || _la==MinusMinus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MxCompilerParser.INT, 0); }
		public TerminalNode STRING() { return getToken(MxCompilerParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(MxCompilerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MxCompilerParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public TerminalNode THIS() { return getToken(MxCompilerParser.THIS, 0); }
		public TerminalNode NULL() { return getToken(MxCompilerParser.NULL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) ) {
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

	public static class TypenameContext extends ParserRuleContext {
		public TerminalNode TINT() { return getToken(MxCompilerParser.TINT, 0); }
		public TerminalNode TSTRING() { return getToken(MxCompilerParser.TSTRING, 0); }
		public TerminalNode TBOOL() { return getToken(MxCompilerParser.TBOOL, 0); }
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(MxCompilerParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxCompilerParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxCompilerParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxCompilerParser.RightBracket, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitTypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typename);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					match(LeftBracket);
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
						{
						setState(200);
						value();
						}
					}

					setState(203);
					match(RightBracket);
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(MxCompilerParser.RETURN, 0); }
		public TerminalNode Semi() { return getToken(MxCompilerParser.Semi, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(RETURN);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde))) != 0)) {
				{
				setState(210);
				expr(0);
				}
			}

			setState(213);
			match(Semi);
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

	public static class Func_listContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(MxCompilerParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxCompilerParser.RightParen, 0); }
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(MxCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MxCompilerParser.ID, i);
		}
		public List<TerminalNode> Comma() { return getTokens(MxCompilerParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(MxCompilerParser.Comma, i);
		}
		public TerminalNode CloseParen() { return getToken(MxCompilerParser.CloseParen, 0); }
		public Func_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterFunc_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitFunc_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitFunc_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_listContext func_list() throws RecognitionException {
		Func_listContext _localctx = new Func_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_list);
		int _la;
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(LeftParen);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << ID))) != 0)) {
					{
					setState(216);
					typename();
					setState(217);
					match(ID);
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(218);
						match(Comma);
						setState(219);
						typename();
						setState(220);
						match(ID);
						}
						}
						setState(226);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(229);
				match(RightParen);
				}
				break;
			case CloseParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(CloseParen);
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

	public static class Func_retContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(MxCompilerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxCompilerParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Func_retContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterFunc_ret(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitFunc_ret(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitFunc_ret(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_retContext func_ret() throws RecognitionException {
		Func_retContext _localctx = new Func_retContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			typename();
			setState(234);
			match(ID);
			setState(235);
			func_list();
			setState(236);
			match(LeftBrace);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Semi))) != 0)) {
				{
				{
				setState(237);
				statement();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(RightBrace);
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

	public static class Func_voidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MxCompilerParser.VOID, 0); }
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(MxCompilerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxCompilerParser.RightBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Func_voidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_void; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterFunc_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitFunc_void(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitFunc_void(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_voidContext func_void() throws RecognitionException {
		Func_voidContext _localctx = new Func_voidContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_void);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(VOID);
			setState(246);
			match(ID);
			setState(247);
			func_list();
			setState(248);
			match(LeftBrace);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Semi))) != 0)) {
				{
				{
				setState(249);
				statement();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(RightBrace);
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

	public static class FuncDefContext extends ParserRuleContext {
		public Func_voidContext func_void() {
			return getRuleContext(Func_voidContext.class,0);
		}
		public Func_retContext func_ret() {
			return getRuleContext(Func_retContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcDef);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				func_void();
				}
				break;
			case TINT:
			case TBOOL:
			case TSTRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				func_ret();
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

	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MxCompilerParser.IF, 0); }
		public TerminalNode LeftParen() { return getToken(MxCompilerParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MxCompilerParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(IF);
			setState(262);
			match(LeftParen);
			setState(263);
			expr(0);
			setState(264);
			match(RightParen);
			setState(265);
			statement();
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(266);
				else_();
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

	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MxCompilerParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ELSE);
			setState(270);
			statement();
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

	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MxCompilerParser.WHILE, 0); }
		public TerminalNode LeftParen() { return getToken(MxCompilerParser.LeftParen, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(MxCompilerParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(WHILE);
			setState(273);
			match(LeftParen);
			setState(274);
			expr(0);
			setState(275);
			match(RightParen);
			setState(276);
			statement();
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

	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MxCompilerParser.FOR, 0); }
		public TerminalNode LeftParen() { return getToken(MxCompilerParser.LeftParen, 0); }
		public List<TerminalNode> Semi() { return getTokens(MxCompilerParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MxCompilerParser.Semi, i);
		}
		public TerminalNode RightParen() { return getToken(MxCompilerParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(FOR);
			setState(279);
			match(LeftParen);
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(280);
				varDef();
				}
				break;
			case 2:
				{
				setState(281);
				expr(0);
				}
				break;
			}
			setState(284);
			match(Semi);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde))) != 0)) {
				{
				setState(285);
				expr(0);
				}
			}

			setState(288);
			match(Semi);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << LeftParen) | (1L << LeftBracket) | (1L << Plus) | (1L << Minus) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde))) != 0)) {
				{
				setState(289);
				expr(0);
				}
			}

			setState(292);
			match(RightParen);
			setState(293);
			statement();
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

	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MxCompilerParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(MxCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MxCompilerParser.ID, i);
		}
		public List<TerminalNode> LeftBrace() { return getTokens(MxCompilerParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(MxCompilerParser.LeftBrace, i);
		}
		public List<TerminalNode> RightBrace() { return getTokens(MxCompilerParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(MxCompilerParser.RightBrace, i);
		}
		public List<TerminalNode> Semi() { return getTokens(MxCompilerParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MxCompilerParser.Semi, i);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(MxCompilerParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(MxCompilerParser.CloseParen, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitClassDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(CLASS);
			setState(296);
			match(ID);
			setState(297);
			match(LeftBrace);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << ID))) != 0)) {
				{
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(298);
					varDef();
					setState(299);
					match(Semi);
					}
					break;
				case 2:
					{
					setState(301);
					funcDef();
					}
					break;
				case 3:
					{
					{
					setState(302);
					match(ID);
					setState(303);
					match(CloseParen);
					setState(304);
					match(LeftBrace);
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << LeftParen) | (1L << LeftBracket) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << Semi))) != 0)) {
						{
						{
						setState(305);
						statement();
						}
						}
						setState(310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(311);
					match(RightBrace);
					}
					}
					break;
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
			match(RightBrace);
			setState(318);
			match(Semi);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 23);
		case 12:
			return precpred(_ctx, 20);
		case 13:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0141\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u00015\b\u0001\n\u0001\f\u00018\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\\\b\u0004\n\u0004\f\u0004_\t\u0004"+
		"\u0003\u0004a\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004e\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005z\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005~\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0083\b\u0005\n\u0005"+
		"\f\u0005\u0086\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008a\b\u0005"+
		"\u0003\u0005\u008c\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b3\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00ba\b\u0005"+
		"\u000b\u0005\f\u0005\u00bb\u0001\u0005\u0001\u0005\u0005\u0005\u00c0\b"+
		"\u0005\n\u0005\f\u0005\u00c3\t\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00ca\b\u0007\u0001\u0007\u0005\u0007"+
		"\u00cd\b\u0007\n\u0007\f\u0007\u00d0\t\u0007\u0001\b\u0001\b\u0003\b\u00d4"+
		"\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00df\b\t\n\t\f\t\u00e2\t\t\u0003\t\u00e4\b\t\u0001\t\u0001"+
		"\t\u0003\t\u00e8\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ef"+
		"\b\n\n\n\f\n\u00f2\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00fb\b\u000b\n\u000b\f\u000b\u00fe"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u0104\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u010c\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u011b\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u011f\b"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0123\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0133\b\u0011\n\u0011\f\u0011\u0136\t\u0011\u0001\u0011"+
		"\u0005\u0011\u0139\b\u0011\n\u0011\f\u0011\u013c\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0000\u0001\n\u0012\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000"+
		"\t\u0001\u0000*+\u0001\u0000%&\u0001\u000012\u0001\u0000\')\u0001\u0000"+
		"#$\u0001\u0000\u001f\"\u0001\u000089\u0002\u0000\u0002\u0002\u000f\u0014"+
		"\u0002\u0000\f\u000e\u0012\u0012\u016e\u0000+\u0001\u0000\u0000\u0000"+
		"\u00020\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006U"+
		"\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\n\u008b\u0001\u0000"+
		"\u0000\u0000\f\u00c4\u0001\u0000\u0000\u0000\u000e\u00c6\u0001\u0000\u0000"+
		"\u0000\u0010\u00d1\u0001\u0000\u0000\u0000\u0012\u00e7\u0001\u0000\u0000"+
		"\u0000\u0014\u00e9\u0001\u0000\u0000\u0000\u0016\u00f5\u0001\u0000\u0000"+
		"\u0000\u0018\u0103\u0001\u0000\u0000\u0000\u001a\u0105\u0001\u0000\u0000"+
		"\u0000\u001c\u010d\u0001\u0000\u0000\u0000\u001e\u0110\u0001\u0000\u0000"+
		"\u0000 \u0116\u0001\u0000\u0000\u0000\"\u0127\u0001\u0000\u0000\u0000"+
		"$%\u0003\u0002\u0001\u0000%&\u00055\u0000\u0000&*\u0001\u0000\u0000\u0000"+
		"\'*\u0003\u0018\f\u0000(*\u0003\"\u0011\u0000)$\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000"+
		"\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000\u0000\u0001/\u0001"+
		"\u0001\u0000\u0000\u000001\u0003\u000e\u0007\u000016\u0003\u0004\u0002"+
		"\u000023\u00056\u0000\u000035\u0003\u0004\u0002\u000042\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007\u0003\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"9<\u0005\u0012\u0000\u0000:;\u00057\u0000\u0000;=\u0003\n\u0005\u0000"+
		"<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\u0005\u0001\u0000"+
		"\u0000\u0000>?\u0003\n\u0005\u0000?@\u00055\u0000\u0000@V\u0001\u0000"+
		"\u0000\u0000AB\u0003\u0002\u0001\u0000BC\u00055\u0000\u0000CV\u0001\u0000"+
		"\u0000\u0000DV\u0003\u001a\r\u0000EF\u0005\n\u0000\u0000FV\u00055\u0000"+
		"\u0000GH\u0005\u000b\u0000\u0000HV\u00055\u0000\u0000IV\u0003\u001e\u000f"+
		"\u0000JV\u0003 \u0010\u0000KV\u00055\u0000\u0000LP\u0005\u001c\u0000\u0000"+
		"MO\u0003\u0006\u0003\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000SV\u0005\u001d\u0000\u0000TV\u0003"+
		"\u0010\b\u0000U>\u0001\u0000\u0000\u0000UA\u0001\u0000\u0000\u0000UD\u0001"+
		"\u0000\u0000\u0000UE\u0001\u0000\u0000\u0000UG\u0001\u0000\u0000\u0000"+
		"UI\u0001\u0000\u0000\u0000UJ\u0001\u0000\u0000\u0000UK\u0001\u0000\u0000"+
		"\u0000UL\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\u0007\u0001"+
		"\u0000\u0000\u0000W`\u0005\u0018\u0000\u0000X]\u0003\n\u0005\u0000YZ\u0005"+
		"6\u0000\u0000Z\\\u0003\n\u0005\u0000[Y\u0001\u0000\u0000\u0000\\_\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`X\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0005\u0019"+
		"\u0000\u0000ce\u0005\u001e\u0000\u0000dW\u0001\u0000\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000e\t\u0001\u0000\u0000\u0000fg\u0006\u0005\uffff\uffff"+
		"\u0000g\u008c\u0005\u0012\u0000\u0000hi\u0005\u0012\u0000\u0000i\u008c"+
		"\u0003\b\u0004\u0000jk\u0005\u0001\u0000\u0000k\u008c\u0003\u000e\u0007"+
		"\u0000lm\u0005\u0018\u0000\u0000mn\u0003\n\u0005\u0000no\u0005\u0019\u0000"+
		"\u0000o\u008c\u0001\u0000\u0000\u0000p\u008c\u0003\f\u0006\u0000qr\u0007"+
		"\u0000\u0000\u0000r\u008c\u0003\n\u0005\u000fst\u0007\u0001\u0000\u0000"+
		"t\u008c\u0003\n\u0005\u000euv\u0007\u0002\u0000\u0000v\u008c\u0003\n\u0005"+
		"\rwy\u0005\u001a\u0000\u0000xz\u0005,\u0000\u0000yx\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0005\u001b"+
		"\u0000\u0000|~\u0003\u0012\t\u0000}|\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0005:\u0000\u0000"+
		"\u0080\u0084\u0005\u001c\u0000\u0000\u0081\u0083\u0003\u0006\u0003\u0000"+
		"\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000"+
		"\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000"+
		"\u0087\u0089\u0005\u001d\u0000\u0000\u0088\u008a\u0003\b\u0004\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008c\u0001\u0000\u0000\u0000\u008bf\u0001\u0000\u0000\u0000\u008bh\u0001"+
		"\u0000\u0000\u0000\u008bj\u0001\u0000\u0000\u0000\u008bl\u0001\u0000\u0000"+
		"\u0000\u008bp\u0001\u0000\u0000\u0000\u008bq\u0001\u0000\u0000\u0000\u008b"+
		"s\u0001\u0000\u0000\u0000\u008bu\u0001\u0000\u0000\u0000\u008bw\u0001"+
		"\u0000\u0000\u0000\u008c\u00c1\u0001\u0000\u0000\u0000\u008d\u008e\n\f"+
		"\u0000\u0000\u008e\u008f\u00057\u0000\u0000\u008f\u00c0\u0003\n\u0005"+
		"\f\u0090\u0091\n\u000b\u0000\u0000\u0091\u0092\u0007\u0003\u0000\u0000"+
		"\u0092\u00c0\u0003\n\u0005\f\u0093\u0094\n\n\u0000\u0000\u0094\u0095\u0007"+
		"\u0001\u0000\u0000\u0095\u00c0\u0003\n\u0005\u000b\u0096\u0097\n\t\u0000"+
		"\u0000\u0097\u0098\u0007\u0004\u0000\u0000\u0098\u00c0\u0003\n\u0005\n"+
		"\u0099\u009a\n\b\u0000\u0000\u009a\u009b\u0007\u0005\u0000\u0000\u009b"+
		"\u00c0\u0003\n\u0005\t\u009c\u009d\n\u0007\u0000\u0000\u009d\u009e\u0007"+
		"\u0006\u0000\u0000\u009e\u00c0\u0003\n\u0005\b\u009f\u00a0\n\u0006\u0000"+
		"\u0000\u00a0\u00a1\u0005,\u0000\u0000\u00a1\u00c0\u0003\n\u0005\u0007"+
		"\u00a2\u00a3\n\u0005\u0000\u0000\u00a3\u00a4\u00050\u0000\u0000\u00a4"+
		"\u00c0\u0003\n\u0005\u0006\u00a5\u00a6\n\u0004\u0000\u0000\u00a6\u00a7"+
		"\u0005-\u0000\u0000\u00a7\u00c0\u0003\n\u0005\u0005\u00a8\u00a9\n\u0003"+
		"\u0000\u0000\u00a9\u00aa\u0005.\u0000\u0000\u00aa\u00c0\u0003\n\u0005"+
		"\u0004\u00ab\u00ac\n\u0002\u0000\u0000\u00ac\u00ad\u0005/\u0000\u0000"+
		"\u00ad\u00c0\u0003\n\u0005\u0003\u00ae\u00af\n\u0017\u0000\u0000\u00af"+
		"\u00b0\u0005;\u0000\u0000\u00b0\u00b2\u0005\u0012\u0000\u0000\u00b1\u00b3"+
		"\u0003\b\u0004\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b3\u00c0\u0001\u0000\u0000\u0000\u00b4\u00b9\n\u0014"+
		"\u0000\u0000\u00b5\u00b6\u0005\u001a\u0000\u0000\u00b6\u00b7\u0003\n\u0005"+
		"\u0000\u00b7\u00b8\u0005\u001b\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b5\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00c0\u0001\u0000\u0000\u0000\u00bd\u00be\n\u0010\u0000\u0000"+
		"\u00be\u00c0\u0007\u0000\u0000\u0000\u00bf\u008d\u0001\u0000\u0000\u0000"+
		"\u00bf\u0090\u0001\u0000\u0000\u0000\u00bf\u0093\u0001\u0000\u0000\u0000"+
		"\u00bf\u0096\u0001\u0000\u0000\u0000\u00bf\u0099\u0001\u0000\u0000\u0000"+
		"\u00bf\u009c\u0001\u0000\u0000\u0000\u00bf\u009f\u0001\u0000\u0000\u0000"+
		"\u00bf\u00a2\u0001\u0000\u0000\u0000\u00bf\u00a5\u0001\u0000\u0000\u0000"+
		"\u00bf\u00a8\u0001\u0000\u0000\u0000\u00bf\u00ab\u0001\u0000\u0000\u0000"+
		"\u00bf\u00ae\u0001\u0000\u0000\u0000\u00bf\u00b4\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u000b\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0007\u0007\u0000\u0000\u00c5\r\u0001\u0000\u0000\u0000\u00c6"+
		"\u00ce\u0007\b\u0000\u0000\u00c7\u00c9\u0005\u001a\u0000\u0000\u00c8\u00ca"+
		"\u0003\f\u0006\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005"+
		"\u001b\u0000\u0000\u00cc\u00c7\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u000f\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d3\u0005\b\u0000\u0000\u00d2\u00d4\u0003\n"+
		"\u0005\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u00055\u0000"+
		"\u0000\u00d6\u0011\u0001\u0000\u0000\u0000\u00d7\u00e3\u0005\u0018\u0000"+
		"\u0000\u00d8\u00d9\u0003\u000e\u0007\u0000\u00d9\u00e0\u0005\u0012\u0000"+
		"\u0000\u00da\u00db\u00056\u0000\u0000\u00db\u00dc\u0003\u000e\u0007\u0000"+
		"\u00dc\u00dd\u0005\u0012\u0000\u0000\u00dd\u00df\u0001\u0000\u0000\u0000"+
		"\u00de\u00da\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00d8\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e8\u0005\u0019\u0000\u0000"+
		"\u00e6\u00e8\u0005\u001e\u0000\u0000\u00e7\u00d7\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u0013\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0003\u000e\u0007\u0000\u00ea\u00eb\u0005\u0012\u0000\u0000"+
		"\u00eb\u00ec\u0003\u0012\t\u0000\u00ec\u00f0\u0005\u001c\u0000\u0000\u00ed"+
		"\u00ef\u0003\u0006\u0003\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u001d\u0000\u0000\u00f4"+
		"\u0015\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\t\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0012\u0000\u0000\u00f7\u00f8\u0003\u0012\t\u0000\u00f8\u00fc\u0005"+
		"\u001c\u0000\u0000\u00f9\u00fb\u0003\u0006\u0003\u0000\u00fa\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100\u0005"+
		"\u001d\u0000\u0000\u0100\u0017\u0001\u0000\u0000\u0000\u0101\u0104\u0003"+
		"\u0016\u000b\u0000\u0102\u0104\u0003\u0014\n\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0104\u0019\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0005\u0006\u0000\u0000\u0106\u0107\u0005\u0018"+
		"\u0000\u0000\u0107\u0108\u0003\n\u0005\u0000\u0108\u0109\u0005\u0019\u0000"+
		"\u0000\u0109\u010b\u0003\u0006\u0003\u0000\u010a\u010c\u0003\u001c\u000e"+
		"\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"+
		"\u0000\u010c\u001b\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0007\u0000"+
		"\u0000\u010e\u010f\u0003\u0006\u0003\u0000\u010f\u001d\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0005\u0004\u0000\u0000\u0111\u0112\u0005\u0018\u0000"+
		"\u0000\u0112\u0113\u0003\n\u0005\u0000\u0113\u0114\u0005\u0019\u0000\u0000"+
		"\u0114\u0115\u0003\u0006\u0003\u0000\u0115\u001f\u0001\u0000\u0000\u0000"+
		"\u0116\u0117\u0005\u0005\u0000\u0000\u0117\u011a\u0005\u0018\u0000\u0000"+
		"\u0118\u011b\u0003\u0002\u0001\u0000\u0119\u011b\u0003\n\u0005\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011e\u00055\u0000\u0000\u011d\u011f\u0003\n\u0005\u0000\u011e\u011d"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0001\u0000\u0000\u0000\u0120\u0122\u00055\u0000\u0000\u0121\u0123\u0003"+
		"\n\u0005\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u0019"+
		"\u0000\u0000\u0125\u0126\u0003\u0006\u0003\u0000\u0126!\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0005\u0003\u0000\u0000\u0128\u0129\u0005\u0012\u0000"+
		"\u0000\u0129\u013a\u0005\u001c\u0000\u0000\u012a\u012b\u0003\u0002\u0001"+
		"\u0000\u012b\u012c\u00055\u0000\u0000\u012c\u0139\u0001\u0000\u0000\u0000"+
		"\u012d\u0139\u0003\u0018\f\u0000\u012e\u012f\u0005\u0012\u0000\u0000\u012f"+
		"\u0130\u0005\u001e\u0000\u0000\u0130\u0134\u0005\u001c\u0000\u0000\u0131"+
		"\u0133\u0003\u0006\u0003\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133"+
		"\u0136\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136"+
		"\u0134\u0001\u0000\u0000\u0000\u0137\u0139\u0005\u001d\u0000\u0000\u0138"+
		"\u012a\u0001\u0000\u0000\u0000\u0138\u012d\u0001\u0000\u0000\u0000\u0138"+
		"\u012e\u0001\u0000\u0000\u0000\u0139\u013c\u0001\u0000\u0000\u0000\u013a"+
		"\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b"+
		"\u013d\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0005\u001d\u0000\u0000\u013e\u013f\u00055\u0000\u0000\u013f#\u0001"+
		"\u0000\u0000\u0000\")+6<PU]`dy}\u0084\u0089\u008b\u00b2\u00bb\u00bf\u00c1"+
		"\u00c9\u00ce\u00d3\u00e0\u00e3\u00e7\u00f0\u00fc\u0103\u010b\u011a\u011e"+
		"\u0122\u0134\u0138\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}