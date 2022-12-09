// Generated from java-escape by ANTLR 4.11.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MxCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

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
		RULE_program = 0, RULE_def = 1, RULE_varDef = 2, RULE_assignment = 3, 
		RULE_block = 4, RULE_statement = 5, RULE_arg_list = 6, RULE_exprstmt = 7, 
		RULE_expr = 8, RULE_value = 9, RULE_typeID = 10, RULE_typename = 11, RULE_return = 12, 
		RULE_func_list = 13, RULE_funcDef = 14, RULE_if = 15, RULE_else = 16, 
		RULE_while = 17, RULE_for = 18, RULE_classDef = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "def", "varDef", "assignment", "block", "statement", "arg_list", 
			"exprstmt", "expr", "value", "typeID", "typename", "return", "func_list", 
			"funcDef", "if", "else", "while", "for", "classDef"
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
	public String getGrammarFileName() { return "java-escape"; }

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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DefContext def() {
			return getRuleContext(DefContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MxCompilerParser.EOF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			def();
			setState(41);
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
	public static class DefContext extends ParserRuleContext {
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
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 291336L) != 0) {
				{
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					{
					setState(43);
					varDef();
					setState(44);
					match(Semi);
					}
					}
					break;
				case 2:
					{
					setState(46);
					funcDef();
					}
					break;
				case 3:
					{
					setState(47);
					classDef();
					}
					break;
				}
				}
				setState(52);
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
		enterRule(_localctx, 4, RULE_varDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			typename();
			setState(54);
			assignment();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(55);
				match(Comma);
				setState(56);
				assignment();
				}
				}
				setState(61);
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
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ID);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(63);
				match(Assign);
				setState(64);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(MxCompilerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxCompilerParser.RightBrace, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(LeftBrace);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 10709655925817206L) != 0) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ExprstmtContext exprstmt() {
			return getRuleContext(ExprstmtContext.class,0);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				exprstmt();
				setState(77);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				varDef();
				setState(80);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(BREAK);
				setState(84);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(CONTINUE);
				setState(86);
				match(Semi);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				while_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				for_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				match(Semi);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 12, RULE_arg_list);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(LeftParen);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1702456402608134L) != 0) {
					{
					setState(95);
					expr(0);
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(96);
						match(Comma);
						setState(97);
						expr(0);
						}
						}
						setState(102);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(105);
				match(RightParen);
				}
				break;
			case CloseParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprstmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterExprstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitExprstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitExprstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprstmtContext exprstmt() throws RecognitionException {
		ExprstmtContext _localctx = new ExprstmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MxCompilerParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(MxCompilerParser.MinusMinus, 0); }
		public TerminalNode Plus() { return getToken(MxCompilerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MxCompilerParser.Minus, 0); }
		public TerminalNode Not() { return getToken(MxCompilerParser.Not, 0); }
		public TerminalNode Tilde() { return getToken(MxCompilerParser.Tilde, 0); }
		public SelfExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterSelfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitSelfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitSelfExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpr_intContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Mul() { return getToken(MxCompilerParser.Mul, 0); }
		public TerminalNode Div() { return getToken(MxCompilerParser.Div, 0); }
		public TerminalNode Mod() { return getToken(MxCompilerParser.Mod, 0); }
		public TerminalNode LeftShift() { return getToken(MxCompilerParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(MxCompilerParser.RightShift, 0); }
		public BinaryExpr_intContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterBinaryExpr_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitBinaryExpr_int(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitBinaryExpr_int(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpr_int_boolContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode And() { return getToken(MxCompilerParser.And, 0); }
		public TerminalNode Caret() { return getToken(MxCompilerParser.Caret, 0); }
		public TerminalNode Or() { return getToken(MxCompilerParser.Or, 0); }
		public BinaryExpr_int_boolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterBinaryExpr_int_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitBinaryExpr_int_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitBinaryExpr_int_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(MxCompilerParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxCompilerParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxCompilerParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxCompilerParser.RightBracket, i);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitArrayExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpr_int_stringContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Plus() { return getToken(MxCompilerParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(MxCompilerParser.Minus, 0); }
		public BinaryExpr_int_stringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterBinaryExpr_int_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitBinaryExpr_int_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitBinaryExpr_int_string(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Dot() { return getToken(MxCompilerParser.Dot, 0); }
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public MemberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterMemberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitMemberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitMemberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExprContext extends ExprContext {
		public TerminalNode LeftBracket() { return getToken(MxCompilerParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(MxCompilerParser.RightBracket, 0); }
		public TerminalNode Arrow() { return getToken(MxCompilerParser.Arrow, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode And() { return getToken(MxCompilerParser.And, 0); }
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
		public LambdaExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterLambdaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitLambdaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode NEW() { return getToken(MxCompilerParser.NEW, 0); }
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(MxCompilerParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxCompilerParser.LeftBracket, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxCompilerParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxCompilerParser.RightBracket, i);
		}
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(MxCompilerParser.CloseParen, 0); }
		public TerminalNode LeftParen() { return getToken(MxCompilerParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(MxCompilerParser.RightParen, 0); }
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitAtomExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitAtomExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpr_allContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Less() { return getToken(MxCompilerParser.Less, 0); }
		public TerminalNode Greater() { return getToken(MxCompilerParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(MxCompilerParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(MxCompilerParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(MxCompilerParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(MxCompilerParser.NotEqual, 0); }
		public BinaryExpr_allContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterBinaryExpr_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitBinaryExpr_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitBinaryExpr_all(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpr_boolContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AndAnd() { return getToken(MxCompilerParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(MxCompilerParser.OrOr, 0); }
		public BinaryExpr_boolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterBinaryExpr_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitBinaryExpr_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitBinaryExpr_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Assign() { return getToken(MxCompilerParser.Assign, 0); }
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitAssignExpr(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(112);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				value();
				}
				break;
			case 3:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				match(NEW);
				setState(115);
				typeID();
				setState(120); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(116);
						match(LeftBracket);
						setState(117);
						expr(0);
						setState(118);
						match(RightBracket);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(122); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(124);
						match(LeftBracket);
						setState(125);
						match(RightBracket);
						}
						} 
					}
					setState(130);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 4:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(NEW);
				setState(132);
				typename();
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(133);
					match(CloseParen);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(LeftParen);
				setState(137);
				expr(0);
				setState(138);
				match(RightParen);
				}
				break;
			case 6:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(ID);
				setState(141);
				arg_list();
				}
				break;
			case 7:
				{
				_localctx = new SelfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(143);
				expr(15);
				}
				break;
			case 8:
				{
				_localctx = new SelfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(145);
				expr(14);
				}
				break;
			case 9:
				{
				_localctx = new SelfExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==Not || _la==Tilde) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(147);
				expr(13);
				}
				break;
			case 10:
				{
				_localctx = new LambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(LeftBracket);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==And) {
					{
					setState(149);
					match(And);
					}
				}

				setState(152);
				match(RightBracket);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen || _la==CloseParen) {
					{
					setState(153);
					func_list();
					}
				}

				setState(156);
				match(Arrow);
				setState(157);
				block();
				setState(158);
				arg_list();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpr_intContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(162);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(163);
						((BinaryExpr_intContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0) ) {
							((BinaryExpr_intContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(164);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new BinaryExpr_int_stringContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(166);
						((BinaryExpr_int_stringContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((BinaryExpr_int_stringContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(167);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new BinaryExpr_intContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(169);
						((BinaryExpr_intContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LeftShift || _la==RightShift) ) {
							((BinaryExpr_intContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(170);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new BinaryExpr_allContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(172);
						((BinaryExpr_allContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0) ) {
							((BinaryExpr_allContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(173);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new BinaryExpr_allContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(175);
						((BinaryExpr_allContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
							((BinaryExpr_allContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(176);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new BinaryExpr_int_boolContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(178);
						((BinaryExpr_int_boolContext)_localctx).op = match(And);
						setState(179);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new BinaryExpr_int_boolContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(181);
						((BinaryExpr_int_boolContext)_localctx).op = match(Caret);
						setState(182);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new BinaryExpr_int_boolContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(184);
						((BinaryExpr_int_boolContext)_localctx).op = match(Or);
						setState(185);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new BinaryExpr_boolContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(187);
						((BinaryExpr_boolContext)_localctx).op = match(AndAnd);
						setState(188);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new BinaryExpr_boolContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(190);
						((BinaryExpr_boolContext)_localctx).op = match(OrOr);
						setState(191);
						expr(4);
						}
						break;
					case 11:
						{
						_localctx = new AssignExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(192);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(193);
						match(Assign);
						setState(194);
						expr(2);
						}
						break;
					case 12:
						{
						_localctx = new MemberExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(195);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(196);
						match(Dot);
						setState(197);
						match(ID);
						setState(199);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
						case 1:
							{
							setState(198);
							arg_list();
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(201);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(206); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(202);
								match(LeftBracket);
								setState(203);
								expr(0);
								setState(204);
								match(RightBracket);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(208); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 14:
						{
						_localctx = new SelfExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(211);
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
				setState(216);
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
		enterRule(_localctx, 18, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2064388L) != 0) ) {
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
	public static class TypeIDContext extends ParserRuleContext {
		public TerminalNode TINT() { return getToken(MxCompilerParser.TINT, 0); }
		public TerminalNode TSTRING() { return getToken(MxCompilerParser.TSTRING, 0); }
		public TerminalNode TBOOL() { return getToken(MxCompilerParser.TBOOL, 0); }
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public TerminalNode VOID() { return getToken(MxCompilerParser.VOID, 0); }
		public TypeIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).enterTypeID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MxCompilerListener ) ((MxCompilerListener)listener).exitTypeID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MxCompilerVisitor ) return ((MxCompilerVisitor<? extends T>)visitor).visitTypeID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIDContext typeID() throws RecognitionException {
		TypeIDContext _localctx = new TypeIDContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 291328L) != 0) ) {
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
	public static class TypenameContext extends ParserRuleContext {
		public TypeIDContext typeID() {
			return getRuleContext(TypeIDContext.class,0);
		}
		public List<TerminalNode> LeftBracket() { return getTokens(MxCompilerParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(MxCompilerParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(MxCompilerParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(MxCompilerParser.RightBracket, i);
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
		enterRule(_localctx, 22, RULE_typename);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			typeID();
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					match(LeftBracket);
					setState(223);
					match(RightBracket);
					}
					} 
				}
				setState(228);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 24, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(RETURN);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1702456402608134L) != 0) {
				{
				setState(230);
				expr(0);
				}
			}

			setState(233);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 26, RULE_func_list);
		int _la;
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(LeftParen);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 291328L) != 0) {
					{
					setState(236);
					typename();
					setState(237);
					match(ID);
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(238);
						match(Comma);
						setState(239);
						typename();
						setState(240);
						match(ID);
						}
						}
						setState(246);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(249);
				match(RightParen);
				}
				break;
			case CloseParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncDefContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 28, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			typename();
			setState(254);
			match(ID);
			setState(255);
			func_list();
			setState(256);
			block();
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
		enterRule(_localctx, 30, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IF);
			setState(259);
			match(LeftParen);
			setState(260);
			expr(0);
			setState(261);
			match(RightParen);
			setState(262);
			statement();
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(263);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 32, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ELSE);
			setState(267);
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

	@SuppressWarnings("CheckReturnValue")
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
		enterRule(_localctx, 34, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(WHILE);
			setState(270);
			match(LeftParen);
			setState(271);
			expr(0);
			setState(272);
			match(RightParen);
			setState(273);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public VarDefContext initvar;
		public ExprContext initexpr;
		public ExprContext conditionexpr;
		public ExprContext stpexpr;
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
		enterRule(_localctx, 36, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(FOR);
			setState(276);
			match(LeftParen);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(277);
				((ForContext)_localctx).initvar = varDef();
				}
				break;
			case 2:
				{
				setState(278);
				((ForContext)_localctx).initexpr = expr(0);
				}
				break;
			}
			setState(281);
			match(Semi);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1702456402608134L) != 0) {
				{
				setState(282);
				((ForContext)_localctx).conditionexpr = expr(0);
				}
			}

			setState(285);
			match(Semi);
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1702456402608134L) != 0) {
				{
				setState(286);
				((ForContext)_localctx).stpexpr = expr(0);
				}
			}

			setState(289);
			match(RightParen);
			setState(290);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MxCompilerParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(MxCompilerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MxCompilerParser.ID, i);
		}
		public TerminalNode LeftBrace() { return getToken(MxCompilerParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(MxCompilerParser.RightBrace, 0); }
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
		enterRule(_localctx, 38, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(CLASS);
			setState(293);
			match(ID);
			setState(294);
			match(LeftBrace);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 291328L) != 0) {
				{
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(295);
					varDef();
					setState(296);
					match(Semi);
					}
					break;
				case 2:
					{
					setState(298);
					funcDef();
					}
					break;
				case 3:
					{
					{
					setState(299);
					match(ID);
					setState(300);
					match(CloseParen);
					setState(301);
					block();
					}
					}
					break;
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(RightBrace);
			setState(308);
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
		case 8:
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
			return precpred(_ctx, 24);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001;\u0137\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b\u0001"+
		"\n\u0001\f\u00014\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004"+
		"F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005]\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006c\b\u0006\n\u0006\f\u0006"+
		"f\t\u0006\u0003\u0006h\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006l\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0004\by\b\b\u000b\b\f\bz\u0001\b\u0001"+
		"\b\u0005\b\u007f\b\b\n\b\f\b\u0082\t\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u0087\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001"+
		"\b\u0001\b\u0003\b\u009b\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00a1"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00c8\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u00cf\b\b\u000b\b\f\b\u00d0\u0001\b\u0001\b\u0005\b\u00d5\b\b\n\b\f"+
		"\b\u00d8\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00e1\b\u000b\n\u000b\f\u000b\u00e4\t\u000b\u0001\f"+
		"\u0001\f\u0003\f\u00e8\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f3\b\r\n\r\f\r\u00f6\t\r\u0003\r"+
		"\u00f8\b\r\u0001\r\u0001\r\u0003\r\u00fc\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0109\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0118\b\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u011c\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0120\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u012f\b\u0013\n\u0013\f\u0013\u0132\t\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0000\u0001\u0010\u0014\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\t"+
		"\u0001\u0000*+\u0001\u0000%&\u0001\u000012\u0001\u0000\')\u0001\u0000"+
		"#$\u0001\u0000\u001f\"\u0001\u000089\u0002\u0000\u0002\u0002\u000f\u0014"+
		"\u0003\u0000\t\t\f\u000e\u0012\u0012\u015f\u0000(\u0001\u0000\u0000\u0000"+
		"\u00022\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006>"+
		"\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000"+
		"\u0000\fk\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010"+
		"\u00a0\u0001\u0000\u0000\u0000\u0012\u00d9\u0001\u0000\u0000\u0000\u0014"+
		"\u00db\u0001\u0000\u0000\u0000\u0016\u00dd\u0001\u0000\u0000\u0000\u0018"+
		"\u00e5\u0001\u0000\u0000\u0000\u001a\u00fb\u0001\u0000\u0000\u0000\u001c"+
		"\u00fd\u0001\u0000\u0000\u0000\u001e\u0102\u0001\u0000\u0000\u0000 \u010a"+
		"\u0001\u0000\u0000\u0000\"\u010d\u0001\u0000\u0000\u0000$\u0113\u0001"+
		"\u0000\u0000\u0000&\u0124\u0001\u0000\u0000\u0000()\u0003\u0002\u0001"+
		"\u0000)*\u0005\u0000\u0000\u0001*\u0001\u0001\u0000\u0000\u0000+,\u0003"+
		"\u0004\u0002\u0000,-\u00055\u0000\u0000-1\u0001\u0000\u0000\u0000.1\u0003"+
		"\u001c\u000e\u0000/1\u0003&\u0013\u00000+\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u0000"+
		"20\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0003\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000056\u0003\u0016\u000b\u00006;\u0003"+
		"\u0006\u0003\u000078\u00056\u0000\u00008:\u0003\u0006\u0003\u000097\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000>A\u0005\u0012\u0000\u0000?@\u00057\u0000\u0000@B\u0003\u0010"+
		"\b\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0007\u0001"+
		"\u0000\u0000\u0000CG\u0005\u001c\u0000\u0000DF\u0003\n\u0005\u0000ED\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"+
		"\u0000JK\u0005\u001d\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0003\u000e"+
		"\u0007\u0000MN\u00055\u0000\u0000N]\u0001\u0000\u0000\u0000OP\u0003\u0004"+
		"\u0002\u0000PQ\u00055\u0000\u0000Q]\u0001\u0000\u0000\u0000R]\u0003\u001e"+
		"\u000f\u0000ST\u0005\n\u0000\u0000T]\u00055\u0000\u0000UV\u0005\u000b"+
		"\u0000\u0000V]\u00055\u0000\u0000W]\u0003\"\u0011\u0000X]\u0003$\u0012"+
		"\u0000Y]\u00055\u0000\u0000Z]\u0003\b\u0004\u0000[]\u0003\u0018\f\u0000"+
		"\\L\u0001\u0000\u0000\u0000\\O\u0001\u0000\u0000\u0000\\R\u0001\u0000"+
		"\u0000\u0000\\S\u0001\u0000\u0000\u0000\\U\u0001\u0000\u0000\u0000\\W"+
		"\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u000b\u0001"+
		"\u0000\u0000\u0000^g\u0005\u0018\u0000\u0000_d\u0003\u0010\b\u0000`a\u0005"+
		"6\u0000\u0000ac\u0003\u0010\b\u0000b`\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000g_\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000il\u0005\u0019"+
		"\u0000\u0000jl\u0005\u001e\u0000\u0000k^\u0001\u0000\u0000\u0000kj\u0001"+
		"\u0000\u0000\u0000l\r\u0001\u0000\u0000\u0000mn\u0003\u0010\b\u0000n\u000f"+
		"\u0001\u0000\u0000\u0000op\u0006\b\uffff\uffff\u0000p\u00a1\u0005\u0012"+
		"\u0000\u0000q\u00a1\u0003\u0012\t\u0000rs\u0005\u0001\u0000\u0000sx\u0003"+
		"\u0014\n\u0000tu\u0005\u001a\u0000\u0000uv\u0003\u0010\b\u0000vw\u0005"+
		"\u001b\u0000\u0000wy\u0001\u0000\u0000\u0000xt\u0001\u0000\u0000\u0000"+
		"yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000"+
		"\u0000{\u0080\u0001\u0000\u0000\u0000|}\u0005\u001a\u0000\u0000}\u007f"+
		"\u0005\u001b\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000"+
		"\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u00a1\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0086\u0003\u0016\u000b"+
		"\u0000\u0085\u0087\u0005\u001e\u0000\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u00a1\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\u0018\u0000\u0000\u0089\u008a\u0003\u0010\b\u0000"+
		"\u008a\u008b\u0005\u0019\u0000\u0000\u008b\u00a1\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\u0012\u0000\u0000\u008d\u00a1\u0003\f\u0006\u0000\u008e"+
		"\u008f\u0007\u0000\u0000\u0000\u008f\u00a1\u0003\u0010\b\u000f\u0090\u0091"+
		"\u0007\u0001\u0000\u0000\u0091\u00a1\u0003\u0010\b\u000e\u0092\u0093\u0007"+
		"\u0002\u0000\u0000\u0093\u00a1\u0003\u0010\b\r\u0094\u0096\u0005\u001a"+
		"\u0000\u0000\u0095\u0097\u0005,\u0000\u0000\u0096\u0095\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0005\u001b\u0000\u0000\u0099\u009b\u0003\u001a\r\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0005:\u0000\u0000\u009d"+
		"\u009e\u0003\b\u0004\u0000\u009e\u009f\u0003\f\u0006\u0000\u009f\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a0o\u0001\u0000\u0000\u0000\u00a0q\u0001\u0000"+
		"\u0000\u0000\u00a0r\u0001\u0000\u0000\u0000\u00a0\u0083\u0001\u0000\u0000"+
		"\u0000\u00a0\u0088\u0001\u0000\u0000\u0000\u00a0\u008c\u0001\u0000\u0000"+
		"\u0000\u00a0\u008e\u0001\u0000\u0000\u0000\u00a0\u0090\u0001\u0000\u0000"+
		"\u0000\u00a0\u0092\u0001\u0000\u0000\u0000\u00a0\u0094\u0001\u0000\u0000"+
		"\u0000\u00a1\u00d6\u0001\u0000\u0000\u0000\u00a2\u00a3\n\f\u0000\u0000"+
		"\u00a3\u00a4\u0007\u0003\u0000\u0000\u00a4\u00d5\u0003\u0010\b\r\u00a5"+
		"\u00a6\n\u000b\u0000\u0000\u00a6\u00a7\u0007\u0001\u0000\u0000\u00a7\u00d5"+
		"\u0003\u0010\b\f\u00a8\u00a9\n\n\u0000\u0000\u00a9\u00aa\u0007\u0004\u0000"+
		"\u0000\u00aa\u00d5\u0003\u0010\b\u000b\u00ab\u00ac\n\t\u0000\u0000\u00ac"+
		"\u00ad\u0007\u0005\u0000\u0000\u00ad\u00d5\u0003\u0010\b\n\u00ae\u00af"+
		"\n\b\u0000\u0000\u00af\u00b0\u0007\u0006\u0000\u0000\u00b0\u00d5\u0003"+
		"\u0010\b\t\u00b1\u00b2\n\u0007\u0000\u0000\u00b2\u00b3\u0005,\u0000\u0000"+
		"\u00b3\u00d5\u0003\u0010\b\b\u00b4\u00b5\n\u0006\u0000\u0000\u00b5\u00b6"+
		"\u00050\u0000\u0000\u00b6\u00d5\u0003\u0010\b\u0007\u00b7\u00b8\n\u0005"+
		"\u0000\u0000\u00b8\u00b9\u0005-\u0000\u0000\u00b9\u00d5\u0003\u0010\b"+
		"\u0006\u00ba\u00bb\n\u0004\u0000\u0000\u00bb\u00bc\u0005.\u0000\u0000"+
		"\u00bc\u00d5\u0003\u0010\b\u0005\u00bd\u00be\n\u0003\u0000\u0000\u00be"+
		"\u00bf\u0005/\u0000\u0000\u00bf\u00d5\u0003\u0010\b\u0004\u00c0\u00c1"+
		"\n\u0002\u0000\u0000\u00c1\u00c2\u00057\u0000\u0000\u00c2\u00d5\u0003"+
		"\u0010\b\u0002\u00c3\u00c4\n\u0018\u0000\u0000\u00c4\u00c5\u0005;\u0000"+
		"\u0000\u00c5\u00c7\u0005\u0012\u0000\u0000\u00c6\u00c8\u0003\f\u0006\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c8\u00d5\u0001\u0000\u0000\u0000\u00c9\u00ce\n\u0011\u0000\u0000\u00ca"+
		"\u00cb\u0005\u001a\u0000\u0000\u00cb\u00cc\u0003\u0010\b\u0000\u00cc\u00cd"+
		"\u0005\u001b\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\n\u0010\u0000\u0000\u00d3\u00d5\u0007"+
		"\u0000\u0000\u0000\u00d4\u00a2\u0001\u0000\u0000\u0000\u00d4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00a8\u0001\u0000\u0000\u0000\u00d4\u00ab\u0001"+
		"\u0000\u0000\u0000\u00d4\u00ae\u0001\u0000\u0000\u0000\u00d4\u00b1\u0001"+
		"\u0000\u0000\u0000\u00d4\u00b4\u0001\u0000\u0000\u0000\u00d4\u00b7\u0001"+
		"\u0000\u0000\u0000\u00d4\u00ba\u0001\u0000\u0000\u0000\u00d4\u00bd\u0001"+
		"\u0000\u0000\u0000\u00d4\u00c0\u0001\u0000\u0000\u0000\u00d4\u00c3\u0001"+
		"\u0000\u0000\u0000\u00d4\u00c9\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u0011\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0007"+
		"\u0007\u0000\u0000\u00da\u0013\u0001\u0000\u0000\u0000\u00db\u00dc\u0007"+
		"\b\u0000\u0000\u00dc\u0015\u0001\u0000\u0000\u0000\u00dd\u00e2\u0003\u0014"+
		"\n\u0000\u00de\u00df\u0005\u001a\u0000\u0000\u00df\u00e1\u0005\u001b\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u0017\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e7\u0005\b\u0000\u0000\u00e6\u00e8\u0003\u0010\b\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u00055\u0000\u0000\u00ea"+
		"\u0019\u0001\u0000\u0000\u0000\u00eb\u00f7\u0005\u0018\u0000\u0000\u00ec"+
		"\u00ed\u0003\u0016\u000b\u0000\u00ed\u00f4\u0005\u0012\u0000\u0000\u00ee"+
		"\u00ef\u00056\u0000\u0000\u00ef\u00f0\u0003\u0016\u000b\u0000\u00f0\u00f1"+
		"\u0005\u0012\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00ec"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fc\u0005\u0019\u0000\u0000\u00fa\u00fc"+
		"\u0005\u001e\u0000\u0000\u00fb\u00eb\u0001\u0000\u0000\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u001b\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0003\u0016\u000b\u0000\u00fe\u00ff\u0005\u0012\u0000\u0000\u00ff\u0100"+
		"\u0003\u001a\r\u0000\u0100\u0101\u0003\b\u0004\u0000\u0101\u001d\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005\u0006\u0000\u0000\u0103\u0104\u0005"+
		"\u0018\u0000\u0000\u0104\u0105\u0003\u0010\b\u0000\u0105\u0106\u0005\u0019"+
		"\u0000\u0000\u0106\u0108\u0003\n\u0005\u0000\u0107\u0109\u0003 \u0010"+
		"\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000"+
		"\u0000\u0109\u001f\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u0007\u0000"+
		"\u0000\u010b\u010c\u0003\n\u0005\u0000\u010c!\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0005\u0004\u0000\u0000\u010e\u010f\u0005\u0018\u0000\u0000"+
		"\u010f\u0110\u0003\u0010\b\u0000\u0110\u0111\u0005\u0019\u0000\u0000\u0111"+
		"\u0112\u0003\n\u0005\u0000\u0112#\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0005\u0005\u0000\u0000\u0114\u0117\u0005\u0018\u0000\u0000\u0115\u0118"+
		"\u0003\u0004\u0002\u0000\u0116\u0118\u0003\u0010\b\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011b\u0005"+
		"5\u0000\u0000\u011a\u011c\u0003\u0010\b\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d\u011f\u00055\u0000\u0000\u011e\u0120\u0003\u0010\b"+
		"\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000"+
		"\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0005\u0019\u0000"+
		"\u0000\u0122\u0123\u0003\n\u0005\u0000\u0123%\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0005\u0003\u0000\u0000\u0125\u0126\u0005\u0012\u0000\u0000"+
		"\u0126\u0130\u0005\u001c\u0000\u0000\u0127\u0128\u0003\u0004\u0002\u0000"+
		"\u0128\u0129\u00055\u0000\u0000\u0129\u012f\u0001\u0000\u0000\u0000\u012a"+
		"\u012f\u0003\u001c\u000e\u0000\u012b\u012c\u0005\u0012\u0000\u0000\u012c"+
		"\u012d\u0005\u001e\u0000\u0000\u012d\u012f\u0003\b\u0004\u0000\u012e\u0127"+
		"\u0001\u0000\u0000\u0000\u012e\u012a\u0001\u0000\u0000\u0000\u012e\u012b"+
		"\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133"+
		"\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0005\u001d\u0000\u0000\u0134\u0135\u00055\u0000\u0000\u0135\'\u0001"+
		"\u0000\u0000\u0000\u001e02;AG\\dgkz\u0080\u0086\u0096\u009a\u00a0\u00c7"+
		"\u00d0\u00d4\u00d6\u00e2\u00e7\u00f4\u00f7\u00fb\u0108\u0117\u011b\u011f"+
		"\u012e\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}