// Generated from E:/上个大学怎么这么多事/编译器/Mx-Compiler/src/grammar\MxCompiler.g4 by ANTLR 4.10.1

    package antlr;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, NEW=36, THIS=37, CLASS=38, WHILE=39, 
		FOR=40, IF=41, ELSE=42, RETURN=43, VOID=44, BREAK=45, CONTINUE=46, TINT=47, 
		TBOOL=48, TSTRING=49, NULL=50, ID=51, INT=52, STRING=53, LINE_IGNORE=54, 
		BLOCK_IGNORE=55, WS=56, TRUE=57, FALSE=58;
	public static final int
		RULE_program = 0, RULE_def = 1, RULE_varDef = 2, RULE_assignment = 3, 
		RULE_statement = 4, RULE_arg_list = 5, RULE_expr = 6, RULE_value = 7, 
		RULE_typename = 8, RULE_return = 9, RULE_func_list = 10, RULE_func_ret = 11, 
		RULE_func_void = 12, RULE_funcDef = 13, RULE_if = 14, RULE_else = 15, 
		RULE_while = 16, RULE_for = 17, RULE_classDef = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "def", "varDef", "assignment", "statement", "arg_list", "expr", 
			"value", "typename", "return", "func_list", "func_ret", "func_void", 
			"funcDef", "if", "else", "while", "for", "classDef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'='", "'{'", "'}'", "'('", "')'", "'()'", "'.'", 
			"'['", "']'", "'++'", "'--'", "'+'", "'-'", "'!'", "'~'", "'*'", "'/'", 
			"'%'", "'<<'", "'>>'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
			"'&'", "'^'", "'|'", "'&&'", "'||'", "'->'", "'};'", "'new'", "'this'", 
			"'class'", "'while'", "'for'", "'if'", "'else'", "'return'", "'void'", 
			"'break'", "'continue'", "'int'", "'bool'", "'string'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NEW", "THIS", "CLASS", "WHILE", "FOR", "IF", "ELSE", "RETURN", "VOID", 
			"BREAK", "CONTINUE", "TINT", "TBOOL", "TSTRING", "NULL", "ID", "INT", 
			"STRING", "LINE_IGNORE", "BLOCK_IGNORE", "WS", "TRUE", "FALSE"
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
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << VOID) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				def();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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

	public static class DefContext extends ParserRuleContext {
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
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
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(46);
				varDef();
				setState(47);
				match(T__0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				funcDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				classDef();
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
			while (_la==T__1) {
				{
				{
				setState(55);
				match(T__1);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
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
			if (_la==T__2) {
				{
				setState(63);
				match(T__2);
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

	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				expr(0);
				setState(68);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				varDef();
				setState(71);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(BREAK);
				setState(75);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(CONTINUE);
				setState(77);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				while_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				for_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(81);
				match(T__3);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
					{
					{
					setState(82);
					statement();
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(88);
				match(T__4);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		enterRule(_localctx, 10, RULE_arg_list);
		int _la;
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__5);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << NEW) | (1L << THIS) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
					{
					setState(93);
					expr(0);
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(94);
						match(T__1);
						setState(95);
						expr(0);
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(103);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__7);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(108);
				match(ID);
				}
				break;
			case 2:
				{
				setState(109);
				match(ID);
				setState(110);
				arg_list();
				}
				break;
			case 3:
				{
				setState(111);
				match(NEW);
				setState(112);
				typename();
				}
				break;
			case 4:
				{
				setState(113);
				match(T__5);
				setState(114);
				expr(0);
				setState(115);
				match(T__6);
				}
				break;
			case 5:
				{
				setState(117);
				value();
				}
				break;
			case 6:
				{
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				expr(15);
				}
				break;
			case 7:
				{
				setState(120);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				expr(14);
				}
				break;
			case 8:
				{
				setState(122);
				_la = _input.LA(1);
				if ( !(_la==T__15 || _la==T__16) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(123);
				expr(13);
				}
				break;
			case 9:
				{
				setState(124);
				match(T__9);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(125);
					match(T__28);
					}
				}

				setState(128);
				match(T__10);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5 || _la==T__7) {
					{
					setState(129);
					func_list();
					}
				}

				setState(132);
				match(T__33);
				setState(133);
				match(T__3);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
					{
					{
					setState(134);
					statement();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(T__4);
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(141);
					arg_list();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(147);
						match(T__2);
						setState(148);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(150);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(151);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(153);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(156);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__21) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(159);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(162);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(165);
						match(T__28);
						setState(166);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(168);
						match(T__29);
						setState(169);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(171);
						match(T__30);
						setState(172);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						match(T__31);
						setState(175);
						expr(4);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(T__32);
						setState(178);
						expr(3);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(180);
						match(T__8);
						setState(181);
						match(ID);
						setState(183);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(182);
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
						setState(185);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(190); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(186);
								match(T__9);
								setState(187);
								expr(0);
								setState(188);
								match(T__10);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(192); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(195);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
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
				setState(200);
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
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_typename);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(T__9);
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THIS) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
						{
						setState(205);
						value();
						}
					}

					setState(208);
					match(T__10);
					}
					} 
				}
				setState(213);
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
		enterRule(_localctx, 18, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(RETURN);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << NEW) | (1L << THIS) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(215);
				expr(0);
				}
			}

			setState(218);
			match(T__0);
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
		enterRule(_localctx, 20, RULE_func_list);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__5);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << ID))) != 0)) {
					{
					setState(221);
					typename();
					setState(222);
					match(ID);
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__1) {
						{
						{
						setState(223);
						match(T__1);
						setState(224);
						typename();
						setState(225);
						match(ID);
						}
						}
						setState(231);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(234);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(T__7);
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
		enterRule(_localctx, 22, RULE_func_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			typename();
			setState(239);
			match(ID);
			setState(240);
			func_list();
			setState(241);
			match(T__3);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				{
				setState(242);
				statement();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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

	public static class Func_voidContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(MxCompilerParser.VOID, 0); }
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
		public Func_listContext func_list() {
			return getRuleContext(Func_listContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_func_void);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(VOID);
			setState(251);
			match(ID);
			setState(252);
			func_list();
			setState(253);
			match(T__3);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				{
				setState(254);
				statement();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
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
		enterRule(_localctx, 26, RULE_funcDef);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				func_void();
				}
				break;
			case TINT:
			case TBOOL:
			case TSTRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public TerminalNode ID() { return getToken(MxCompilerParser.ID, 0); }
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
		enterRule(_localctx, 28, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(IF);
			setState(267);
			match(T__5);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(268);
				match(ID);
				setState(269);
				match(T__2);
				}
				break;
			}
			setState(272);
			expr(0);
			}
			setState(274);
			match(T__6);
			setState(275);
			statement();
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(276);
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
		enterRule(_localctx, 30, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(ELSE);
			setState(280);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(WHILE);
			setState(283);
			match(T__5);
			setState(284);
			expr(0);
			setState(285);
			match(T__6);
			setState(286);
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
		enterRule(_localctx, 34, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(FOR);
			setState(289);
			match(T__5);
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(290);
				varDef();
				}
				break;
			case 2:
				{
				setState(291);
				expr(0);
				}
				break;
			}
			setState(294);
			match(T__0);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << NEW) | (1L << THIS) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(295);
				expr(0);
				}
			}

			setState(298);
			match(T__0);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << NEW) | (1L << THIS) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(299);
				expr(0);
				}
			}

			setState(302);
			match(T__6);
			setState(303);
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
		enterRule(_localctx, 36, RULE_classDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(CLASS);
			setState(306);
			match(ID);
			setState(307);
			match(T__3);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << ID))) != 0)) {
				{
				setState(322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(308);
					varDef();
					setState(309);
					match(T__0);
					}
					break;
				case 2:
					{
					setState(311);
					funcDef();
					}
					break;
				case 3:
					{
					{
					setState(312);
					match(ID);
					setState(313);
					match(T__7);
					setState(314);
					match(T__3);
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << NEW) | (1L << THIS) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << TINT) | (1L << TBOOL) | (1L << TSTRING) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << TRUE) | (1L << FALSE))) != 0)) {
						{
						{
						setState(315);
						statement();
						}
						}
						setState(320);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(321);
					match(T__4);
					}
					}
					break;
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			match(T__34);
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
		"\u0004\u0001:\u014a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004T\b\u0004\n\u0004\f\u0004W\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005d\t\u0005\u0003\u0005"+
		"f\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005j\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u007f\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0083\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0088\b\u0006\n\u0006"+
		"\f\u0006\u008b\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008f\b\u0006"+
		"\u0003\u0006\u0091\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b8\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006\u00bf\b\u0006"+
		"\u000b\u0006\f\u0006\u00c0\u0001\u0006\u0001\u0006\u0005\u0006\u00c5\b"+
		"\u0006\n\u0006\f\u0006\u00c8\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00cf\b\b\u0001\b\u0005\b\u00d2\b\b\n\b\f\b\u00d5\t"+
		"\b\u0001\t\u0001\t\u0003\t\u00d9\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e4\b\n\n\n\f\n\u00e7\t\n"+
		"\u0003\n\u00e9\b\n\u0001\n\u0001\n\u0003\n\u00ed\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00f4\b\u000b\n"+
		"\u000b\f\u000b\u00f7\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u0100\b\f\n\f\f\f\u0103\t\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0003\r\u0109\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u010f\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0116\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0125\b\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0129\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u012d\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u013d\b\u0012\n\u0012\f\u0012\u0140\t\u0012\u0001\u0012\u0005\u0012"+
		"\u0143\b\u0012\n\u0012\f\u0012\u0146\t\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0001\f\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\t\u0001\u0000\f\r\u0001"+
		"\u0000\u000e\u000f\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0014\u0001"+
		"\u0000\u0015\u0016\u0001\u0000\u0017\u001a\u0001\u0000\u001b\u001c\u0003"+
		"\u0000%%259:\u0002\u0000/133\u0177\u0000)\u0001\u0000\u0000\u0000\u0002"+
		"3\u0001\u0000\u0000\u0000\u00045\u0001\u0000\u0000\u0000\u0006>\u0001"+
		"\u0000\u0000\u0000\bZ\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000"+
		"\f\u0090\u0001\u0000\u0000\u0000\u000e\u00c9\u0001\u0000\u0000\u0000\u0010"+
		"\u00cb\u0001\u0000\u0000\u0000\u0012\u00d6\u0001\u0000\u0000\u0000\u0014"+
		"\u00ec\u0001\u0000\u0000\u0000\u0016\u00ee\u0001\u0000\u0000\u0000\u0018"+
		"\u00fa\u0001\u0000\u0000\u0000\u001a\u0108\u0001\u0000\u0000\u0000\u001c"+
		"\u010a\u0001\u0000\u0000\u0000\u001e\u0117\u0001\u0000\u0000\u0000 \u011a"+
		"\u0001\u0000\u0000\u0000\"\u0120\u0001\u0000\u0000\u0000$\u0131\u0001"+
		"\u0000\u0000\u0000&(\u0003\u0002\u0001\u0000\'&\u0001\u0000\u0000\u0000"+
		"(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*,\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,-\u0005\u0000"+
		"\u0000\u0001-\u0001\u0001\u0000\u0000\u0000./\u0003\u0004\u0002\u0000"+
		"/0\u0005\u0001\u0000\u000004\u0001\u0000\u0000\u000014\u0003\u001a\r\u0000"+
		"24\u0003$\u0012\u00003.\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u000056\u0003\u0010"+
		"\b\u00006;\u0003\u0006\u0003\u000078\u0005\u0002\u0000\u00008:\u0003\u0006"+
		"\u0003\u000097\u0001\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001"+
		"\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<\u0005\u0001\u0000\u0000"+
		"\u0000=;\u0001\u0000\u0000\u0000>A\u00053\u0000\u0000?@\u0005\u0003\u0000"+
		"\u0000@B\u0003\f\u0006\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000B\u0007\u0001\u0000\u0000\u0000CD\u0003\f\u0006\u0000DE\u0005\u0001"+
		"\u0000\u0000E[\u0001\u0000\u0000\u0000FG\u0003\u0004\u0002\u0000GH\u0005"+
		"\u0001\u0000\u0000H[\u0001\u0000\u0000\u0000I[\u0003\u001c\u000e\u0000"+
		"JK\u0005-\u0000\u0000K[\u0005\u0001\u0000\u0000LM\u0005.\u0000\u0000M"+
		"[\u0005\u0001\u0000\u0000N[\u0003 \u0010\u0000O[\u0003\"\u0011\u0000P"+
		"[\u0005\u0001\u0000\u0000QU\u0005\u0004\u0000\u0000RT\u0003\b\u0004\u0000"+
		"SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000X[\u0005\u0005\u0000\u0000Y[\u0003\u0012\t\u0000ZC\u0001\u0000"+
		"\u0000\u0000ZF\u0001\u0000\u0000\u0000ZI\u0001\u0000\u0000\u0000ZJ\u0001"+
		"\u0000\u0000\u0000ZL\u0001\u0000\u0000\u0000ZN\u0001\u0000\u0000\u0000"+
		"ZO\u0001\u0000\u0000\u0000ZP\u0001\u0000\u0000\u0000ZQ\u0001\u0000\u0000"+
		"\u0000ZY\u0001\u0000\u0000\u0000[\t\u0001\u0000\u0000\u0000\\e\u0005\u0006"+
		"\u0000\u0000]b\u0003\f\u0006\u0000^_\u0005\u0002\u0000\u0000_a\u0003\f"+
		"\u0006\u0000`^\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000e]\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gj\u0005\u0007\u0000\u0000hj\u0005\b\u0000"+
		"\u0000i\\\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\u000b\u0001"+
		"\u0000\u0000\u0000kl\u0006\u0006\uffff\uffff\u0000l\u0091\u00053\u0000"+
		"\u0000mn\u00053\u0000\u0000n\u0091\u0003\n\u0005\u0000op\u0005$\u0000"+
		"\u0000p\u0091\u0003\u0010\b\u0000qr\u0005\u0006\u0000\u0000rs\u0003\f"+
		"\u0006\u0000st\u0005\u0007\u0000\u0000t\u0091\u0001\u0000\u0000\u0000"+
		"u\u0091\u0003\u000e\u0007\u0000vw\u0007\u0000\u0000\u0000w\u0091\u0003"+
		"\f\u0006\u000fxy\u0007\u0001\u0000\u0000y\u0091\u0003\f\u0006\u000ez{"+
		"\u0007\u0002\u0000\u0000{\u0091\u0003\f\u0006\r|~\u0005\n\u0000\u0000"+
		"}\u007f\u0005\u001d\u0000\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0005"+
		"\u000b\u0000\u0000\u0081\u0083\u0003\u0014\n\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005\"\u0000\u0000\u0085\u0089\u0005\u0004\u0000"+
		"\u0000\u0086\u0088\u0003\b\u0004\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000"+
		"\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0005\u0005\u0000\u0000"+
		"\u008d\u008f\u0003\n\u0005\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090"+
		"k\u0001\u0000\u0000\u0000\u0090m\u0001\u0000\u0000\u0000\u0090o\u0001"+
		"\u0000\u0000\u0000\u0090q\u0001\u0000\u0000\u0000\u0090u\u0001\u0000\u0000"+
		"\u0000\u0090v\u0001\u0000\u0000\u0000\u0090x\u0001\u0000\u0000\u0000\u0090"+
		"z\u0001\u0000\u0000\u0000\u0090|\u0001\u0000\u0000\u0000\u0091\u00c6\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\n\f\u0000\u0000\u0093\u0094\u0005\u0003"+
		"\u0000\u0000\u0094\u00c5\u0003\f\u0006\f\u0095\u0096\n\u000b\u0000\u0000"+
		"\u0096\u0097\u0007\u0003\u0000\u0000\u0097\u00c5\u0003\f\u0006\f\u0098"+
		"\u0099\n\n\u0000\u0000\u0099\u009a\u0007\u0001\u0000\u0000\u009a\u00c5"+
		"\u0003\f\u0006\u000b\u009b\u009c\n\t\u0000\u0000\u009c\u009d\u0007\u0004"+
		"\u0000\u0000\u009d\u00c5\u0003\f\u0006\n\u009e\u009f\n\b\u0000\u0000\u009f"+
		"\u00a0\u0007\u0005\u0000\u0000\u00a0\u00c5\u0003\f\u0006\t\u00a1\u00a2"+
		"\n\u0007\u0000\u0000\u00a2\u00a3\u0007\u0006\u0000\u0000\u00a3\u00c5\u0003"+
		"\f\u0006\b\u00a4\u00a5\n\u0006\u0000\u0000\u00a5\u00a6\u0005\u001d\u0000"+
		"\u0000\u00a6\u00c5\u0003\f\u0006\u0007\u00a7\u00a8\n\u0005\u0000\u0000"+
		"\u00a8\u00a9\u0005\u001e\u0000\u0000\u00a9\u00c5\u0003\f\u0006\u0006\u00aa"+
		"\u00ab\n\u0004\u0000\u0000\u00ab\u00ac\u0005\u001f\u0000\u0000\u00ac\u00c5"+
		"\u0003\f\u0006\u0005\u00ad\u00ae\n\u0003\u0000\u0000\u00ae\u00af\u0005"+
		" \u0000\u0000\u00af\u00c5\u0003\f\u0006\u0004\u00b0\u00b1\n\u0002\u0000"+
		"\u0000\u00b1\u00b2\u0005!\u0000\u0000\u00b2\u00c5\u0003\f\u0006\u0003"+
		"\u00b3\u00b4\n\u0017\u0000\u0000\u00b4\u00b5\u0005\t\u0000\u0000\u00b5"+
		"\u00b7\u00053\u0000\u0000\u00b6\u00b8\u0003\n\u0005\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00c5"+
		"\u0001\u0000\u0000\u0000\u00b9\u00be\n\u0014\u0000\u0000\u00ba\u00bb\u0005"+
		"\n\u0000\u0000\u00bb\u00bc\u0003\f\u0006\u0000\u00bc\u00bd\u0005\u000b"+
		"\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\n\u0010\u0000\u0000\u00c3\u00c5\u0007\u0000\u0000"+
		"\u0000\u00c4\u0092\u0001\u0000\u0000\u0000\u00c4\u0095\u0001\u0000\u0000"+
		"\u0000\u00c4\u0098\u0001\u0000\u0000\u0000\u00c4\u009b\u0001\u0000\u0000"+
		"\u0000\u00c4\u009e\u0001\u0000\u0000\u0000\u00c4\u00a1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00a4\u0001\u0000\u0000\u0000\u00c4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00c4\u00aa\u0001\u0000\u0000\u0000\u00c4\u00ad\u0001\u0000\u0000"+
		"\u0000\u00c4\u00b0\u0001\u0000\u0000\u0000\u00c4\u00b3\u0001\u0000\u0000"+
		"\u0000\u00c4\u00b9\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\r\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0007\u0007\u0000\u0000"+
		"\u00ca\u000f\u0001\u0000\u0000\u0000\u00cb\u00d3\u0007\b\u0000\u0000\u00cc"+
		"\u00ce\u0005\n\u0000\u0000\u00cd\u00cf\u0003\u000e\u0007\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d2\u0005\u000b\u0000\u0000\u00d1\u00cc"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0011"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d8"+
		"\u0005+\u0000\u0000\u00d7\u00d9\u0003\f\u0006\u0000\u00d8\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u0013\u0001"+
		"\u0000\u0000\u0000\u00dc\u00e8\u0005\u0006\u0000\u0000\u00dd\u00de\u0003"+
		"\u0010\b\u0000\u00de\u00e5\u00053\u0000\u0000\u00df\u00e0\u0005\u0002"+
		"\u0000\u0000\u00e0\u00e1\u0003\u0010\b\u0000\u00e1\u00e2\u00053\u0000"+
		"\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ed\u0005\u0007\u0000\u0000\u00eb\u00ed\u0005\b\u0000\u0000"+
		"\u00ec\u00dc\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ed\u0015\u0001\u0000\u0000\u0000\u00ee\u00ef\u0003\u0010\b\u0000\u00ef"+
		"\u00f0\u00053\u0000\u0000\u00f0\u00f1\u0003\u0014\n\u0000\u00f1\u00f5"+
		"\u0005\u0004\u0000\u0000\u00f2\u00f4\u0003\b\u0004\u0000\u00f3\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"\u0005\u0000\u0000\u00f9\u0017\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		",\u0000\u0000\u00fb\u00fc\u00053\u0000\u0000\u00fc\u00fd\u0003\u0014\n"+
		"\u0000\u00fd\u0101\u0005\u0004\u0000\u0000\u00fe\u0100\u0003\b\u0004\u0000"+
		"\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000"+
		"\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005\u0005\u0000\u0000\u0105\u0019\u0001\u0000\u0000\u0000"+
		"\u0106\u0109\u0003\u0018\f\u0000\u0107\u0109\u0003\u0016\u000b\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109"+
		"\u001b\u0001\u0000\u0000\u0000\u010a\u010b\u0005)\u0000\u0000\u010b\u010e"+
		"\u0005\u0006\u0000\u0000\u010c\u010d\u00053\u0000\u0000\u010d\u010f\u0005"+
		"\u0003\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0003"+
		"\f\u0006\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0007"+
		"\u0000\u0000\u0113\u0115\u0003\b\u0004\u0000\u0114\u0116\u0003\u001e\u000f"+
		"\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000"+
		"\u0000\u0116\u001d\u0001\u0000\u0000\u0000\u0117\u0118\u0005*\u0000\u0000"+
		"\u0118\u0119\u0003\b\u0004\u0000\u0119\u001f\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0005\'\u0000\u0000\u011b\u011c\u0005\u0006\u0000\u0000\u011c\u011d"+
		"\u0003\f\u0006\u0000\u011d\u011e\u0005\u0007\u0000\u0000\u011e\u011f\u0003"+
		"\b\u0004\u0000\u011f!\u0001\u0000\u0000\u0000\u0120\u0121\u0005(\u0000"+
		"\u0000\u0121\u0124\u0005\u0006\u0000\u0000\u0122\u0125\u0003\u0004\u0002"+
		"\u0000\u0123\u0125\u0003\f\u0006\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0005\u0001\u0000\u0000"+
		"\u0127\u0129\u0003\f\u0006\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a"+
		"\u012c\u0005\u0001\u0000\u0000\u012b\u012d\u0003\f\u0006\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0007\u0000\u0000\u012f\u0130"+
		"\u0003\b\u0004\u0000\u0130#\u0001\u0000\u0000\u0000\u0131\u0132\u0005"+
		"&\u0000\u0000\u0132\u0133\u00053\u0000\u0000\u0133\u0144\u0005\u0004\u0000"+
		"\u0000\u0134\u0135\u0003\u0004\u0002\u0000\u0135\u0136\u0005\u0001\u0000"+
		"\u0000\u0136\u0143\u0001\u0000\u0000\u0000\u0137\u0143\u0003\u001a\r\u0000"+
		"\u0138\u0139\u00053\u0000\u0000\u0139\u013a\u0005\b\u0000\u0000\u013a"+
		"\u013e\u0005\u0004\u0000\u0000\u013b\u013d\u0003\b\u0004\u0000\u013c\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0143"+
		"\u0005\u0005\u0000\u0000\u0142\u0134\u0001\u0000\u0000\u0000\u0142\u0137"+
		"\u0001\u0000\u0000\u0000\u0142\u0138\u0001\u0000\u0000\u0000\u0143\u0146"+
		"\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0144"+
		"\u0001\u0000\u0000\u0000\u0147\u0148\u0005#\u0000\u0000\u0148%\u0001\u0000"+
		"\u0000\u0000#)3;AUZbei~\u0082\u0089\u008e\u0090\u00b7\u00c0\u00c4\u00c6"+
		"\u00ce\u00d3\u00d8\u00e5\u00e8\u00ec\u00f5\u0101\u0108\u010e\u0115\u0124"+
		"\u0128\u012c\u013e\u0142\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}