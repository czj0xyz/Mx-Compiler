// Generated from E:/上个大学怎么这么多事/编译器/Mx-Compiler/src/grammar\MxCompiler.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MxCompilerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT=7, FLOAT=8, NAME=9, 
		LINE_INGORE=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT", "FLOAT", "LETTER", 
			"START_LETTER", "NAME", "LINE_INGORE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'*'", "'/'", "'+'", "'-'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "INT", "FLOAT", "NAME", "LINE_INGORE", 
			"WS"
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


	public MxCompilerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MxCompiler.g4"; }

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
		"\u0004\u0000\u000bf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006*\b"+
		"\u0006\n\u0006\f\u0006-\t\u0006\u0001\u0006\u0003\u00060\b\u0006\u0001"+
		"\u0007\u0004\u00073\b\u0007\u000b\u0007\f\u00074\u0001\u0007\u0001\u0007"+
		"\u0005\u00079\b\u0007\n\u0007\f\u0007<\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007@\b\u0007\u000b\u0007\f\u0007A\u0003\u0007D\b\u0007\u0001"+
		"\b\u0003\bG\b\b\u0001\t\u0003\tJ\b\t\u0001\n\u0001\n\u0005\nN\b\n\n\n"+
		"\f\nQ\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"W\b\u000b\n\u000b\f\u000bZ\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0004\fa\b\f\u000b\f\f\fb\u0001\f\u0001\f\u0000\u0000"+
		"\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\u0000\u0013\u0000\u0015\t\u0017\n\u0019\u000b\u0001"+
		"\u0000\u0006\u0001\u000019\u0001\u000009\u0004\u000009AZ__az\u0003\u0000"+
		"AZ__az\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  l\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000"+
		"\u0005\u001f\u0001\u0000\u0000\u0000\u0007!\u0001\u0000\u0000\u0000\t"+
		"#\u0001\u0000\u0000\u0000\u000b%\u0001\u0000\u0000\u0000\r/\u0001\u0000"+
		"\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000"+
		"\u0013I\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017R"+
		"\u0001\u0000\u0000\u0000\u0019`\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		";\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005*\u0000"+
		"\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005/\u0000\u0000 "+
		"\u0006\u0001\u0000\u0000\u0000!\"\u0005+\u0000\u0000\"\b\u0001\u0000\u0000"+
		"\u0000#$\u0005-\u0000\u0000$\n\u0001\u0000\u0000\u0000%&\u0005=\u0000"+
		"\u0000&\f\u0001\u0000\u0000\u0000\'+\u0007\u0000\u0000\u0000(*\u0007\u0001"+
		"\u0000\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,0\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000.0\u00050\u0000\u0000/\'\u0001\u0000\u0000\u0000"+
		"/.\u0001\u0000\u0000\u00000\u000e\u0001\u0000\u0000\u000013\u0007\u0001"+
		"\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"6D\u0005.\u0000\u000079\u0007\u0001\u0000\u000087\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=?\u0005.\u0000"+
		"\u0000>@\u0007\u0001\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0001"+
		"\u0000\u0000\u0000C2\u0001\u0000\u0000\u0000C:\u0001\u0000\u0000\u0000"+
		"D\u0010\u0001\u0000\u0000\u0000EG\u0007\u0002\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HJ\u0007\u0003\u0000\u0000"+
		"IH\u0001\u0000\u0000\u0000J\u0014\u0001\u0000\u0000\u0000KO\u0003\u0013"+
		"\t\u0000LN\u0003\u0011\b\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0016"+
		"\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005/\u0000\u0000"+
		"ST\u0005/\u0000\u0000TX\u0001\u0000\u0000\u0000UW\t\u0000\u0000\u0000"+
		"VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[\\\u0007\u0004\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0006"+
		"\u000b\u0000\u0000^\u0018\u0001\u0000\u0000\u0000_a\u0007\u0005\u0000"+
		"\u0000`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0006"+
		"\f\u0000\u0000e\u001a\u0001\u0000\u0000\u0000\f\u0000+/4:ACFIOXb\u0001"+
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