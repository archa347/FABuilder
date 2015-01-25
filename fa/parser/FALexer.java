// Generated from FA.g4 by ANTLR 4.0
package fa.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FALexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, NAME=9, 
		SL_COMMENT=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'automata'", "'&'", "'{'", "')'", "','", "'('", "':'", "'}'", "NAME", 
		"SL_COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NAME", 
		"LETTER", "DIGIT", "SL_COMMENT", "WS"
	};


	public FALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FA.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11: SL_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 12: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\rR\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\6\n\67\n\n\r\n\16\n8\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r"+
		"C\n\r\f\r\16\rF\13\r\3\r\3\r\3\r\3\r\3\16\6\16M\n\16\r\16\16\16N\3\16"+
		"\3\16\3D\17\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1"+
		"\25\2\1\27\2\1\31\f\2\33\r\3\3\2\5\4C\\c|\3\62;\5\13\f\17\17\"\"S\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35"+
		"\3\2\2\2\5&\3\2\2\2\7(\3\2\2\2\t*\3\2\2\2\13,\3\2\2\2\r.\3\2\2\2\17\60"+
		"\3\2\2\2\21\62\3\2\2\2\23\66\3\2\2\2\25:\3\2\2\2\27<\3\2\2\2\31>\3\2\2"+
		"\2\33L\3\2\2\2\35\36\7c\2\2\36\37\7w\2\2\37 \7v\2\2 !\7q\2\2!\"\7o\2\2"+
		"\"#\7c\2\2#$\7v\2\2$%\7c\2\2%\4\3\2\2\2&\'\7(\2\2\'\6\3\2\2\2()\7}\2\2"+
		")\b\3\2\2\2*+\7+\2\2+\n\3\2\2\2,-\7.\2\2-\f\3\2\2\2./\7*\2\2/\16\3\2\2"+
		"\2\60\61\7<\2\2\61\20\3\2\2\2\62\63\7\177\2\2\63\22\3\2\2\2\64\67\5\25"+
		"\13\2\65\67\5\27\f\2\66\64\3\2\2\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29\24\3\2\2\2:;\t\2\2\2;\26\3\2\2\2<=\t\3\2\2=\30\3\2\2\2>"+
		"?\7\61\2\2?@\7\61\2\2@D\3\2\2\2AC\13\2\2\2BA\3\2\2\2CF\3\2\2\2DE\3\2\2"+
		"\2DB\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\f\2\2HI\3\2\2\2IJ\b\r\2\2J\32\3\2"+
		"\2\2KM\t\4\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\16"+
		"\3\2Q\34\3\2\2\2\7\2\668DN";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}