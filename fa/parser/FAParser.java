// Generated from FA.g4 by ANTLR 4.0
package fa.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FAParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, NAME=9, 
		SL_COMMENT=10, WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'automata'", "'&'", "'{'", "')'", "','", "'('", "':'", "'}'", 
		"NAME", "SL_COMMENT", "WS"
	};
	public static final int
		RULE_file = 0, RULE_automataDecl = 1, RULE_statesDecl = 2, RULE_stateDecl = 3, 
		RULE_inputsDecl = 4, RULE_inputSym = 5, RULE_startState = 6, RULE_finalStates = 7, 
		RULE_fState = 8, RULE_transitions = 9, RULE_transition = 10, RULE_function = 11, 
		RULE_inState = 12, RULE_destState = 13, RULE_inputRead = 14, RULE_epsilon = 15;
	public static final String[] ruleNames = {
		"file", "automataDecl", "statesDecl", "stateDecl", "inputsDecl", "inputSym", 
		"startState", "finalStates", "fState", "transitions", "transition", "function", 
		"inState", "destState", "inputRead", "epsilon"
	};

	@Override
	public String getGrammarFileName() { return "FA.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public FAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public AutomataDeclContext automataDecl() {
			return getRuleContext(AutomataDeclContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); automataDecl();
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

	public static class AutomataDeclContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FAParser.NAME, 0); }
		public TransitionsContext transitions() {
			return getRuleContext(TransitionsContext.class,0);
		}
		public StartStateContext startState() {
			return getRuleContext(StartStateContext.class,0);
		}
		public StatesDeclContext statesDecl() {
			return getRuleContext(StatesDeclContext.class,0);
		}
		public FinalStatesContext finalStates() {
			return getRuleContext(FinalStatesContext.class,0);
		}
		public InputsDeclContext inputsDecl() {
			return getRuleContext(InputsDeclContext.class,0);
		}
		public AutomataDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automataDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterAutomataDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitAutomataDecl(this);
		}
	}

	public final AutomataDeclContext automataDecl() throws RecognitionException {
		AutomataDeclContext _localctx = new AutomataDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_automataDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(1);
			setState(35); match(NAME);
			setState(36); match(6);
			setState(37); statesDecl();
			setState(38); match(5);
			setState(39); inputsDecl();
			setState(40); match(5);
			setState(41); startState();
			setState(42); match(5);
			setState(43); finalStates();
			setState(44); match(4);
			setState(45); match(3);
			setState(46); transitions();
			setState(47); match(8);
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

	public static class StatesDeclContext extends ParserRuleContext {
		public StateDeclContext stateDecl(int i) {
			return getRuleContext(StateDeclContext.class,i);
		}
		public List<StateDeclContext> stateDecl() {
			return getRuleContexts(StateDeclContext.class);
		}
		public StatesDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statesDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterStatesDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitStatesDecl(this);
		}
	}

	public final StatesDeclContext statesDecl() throws RecognitionException {
		StatesDeclContext _localctx = new StatesDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statesDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(6);
			setState(50); stateDecl();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(51); match(5);
				setState(52); stateDecl();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58); match(4);
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

	public static class StateDeclContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FAParser.NAME, 0); }
		public StateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterStateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitStateDecl(this);
		}
	}

	public final StateDeclContext stateDecl() throws RecognitionException {
		StateDeclContext _localctx = new StateDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stateDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(NAME);
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

	public static class InputsDeclContext extends ParserRuleContext {
		public List<InputSymContext> inputSym() {
			return getRuleContexts(InputSymContext.class);
		}
		public InputSymContext inputSym(int i) {
			return getRuleContext(InputSymContext.class,i);
		}
		public InputsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterInputsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitInputsDecl(this);
		}
	}

	public final InputsDeclContext inputsDecl() throws RecognitionException {
		InputsDeclContext _localctx = new InputsDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inputsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(6);
			setState(63); inputSym();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(64); match(5);
				setState(65); inputSym();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); match(4);
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

	public static class InputSymContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FAParser.NAME, 0); }
		public InputSymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputSym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterInputSym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitInputSym(this);
		}
	}

	public final InputSymContext inputSym() throws RecognitionException {
		InputSymContext _localctx = new InputSymContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inputSym);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(NAME);
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

	public static class StartStateContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FAParser.NAME, 0); }
		public StartStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterStartState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitStartState(this);
		}
	}

	public final StartStateContext startState() throws RecognitionException {
		StartStateContext _localctx = new StartStateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(NAME);
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

	public static class FinalStatesContext extends ParserRuleContext {
		public List<FStateContext> fState() {
			return getRuleContexts(FStateContext.class);
		}
		public FStateContext fState(int i) {
			return getRuleContext(FStateContext.class,i);
		}
		public FinalStatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalStates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterFinalStates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitFinalStates(this);
		}
	}

	public final FinalStatesContext finalStates() throws RecognitionException {
		FinalStatesContext _localctx = new FinalStatesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_finalStates);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(6);
			setState(78); fState();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(79); match(5);
				setState(80); fState();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86); match(4);
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

	public static class FStateContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FAParser.NAME, 0); }
		public FStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterFState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitFState(this);
		}
	}

	public final FStateContext fState() throws RecognitionException {
		FStateContext _localctx = new FStateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(NAME);
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

	public static class TransitionsContext extends ParserRuleContext {
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterTransitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitTransitions(this);
		}
	}

	public final TransitionsContext transitions() throws RecognitionException {
		TransitionsContext _localctx = new TransitionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); transition();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(91); transition();
				}
				}
				setState(96);
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

	public static class TransitionContext extends ParserRuleContext {
		public InStateContext inState() {
			return getRuleContext(InStateContext.class,0);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_transition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); inState();
			setState(98); match(7);
			setState(99); match(3);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(100); function();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106); match(8);
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

	public static class FunctionContext extends ParserRuleContext {
		public InputReadContext inputRead() {
			return getRuleContext(InputReadContext.class,0);
		}
		public DestStateContext destState() {
			return getRuleContext(DestStateContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(6);
			setState(109); inputRead();
			setState(110); match(5);
			setState(111); destState();
			setState(112); match(4);
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

	public static class InStateContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FAParser.NAME, 0); }
		public InStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterInState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitInState(this);
		}
	}

	public final InStateContext inState() throws RecognitionException {
		InStateContext _localctx = new InStateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(NAME);
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

	public static class DestStateContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FAParser.NAME, 0); }
		public DestStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterDestState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitDestState(this);
		}
	}

	public final DestStateContext destState() throws RecognitionException {
		DestStateContext _localctx = new DestStateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_destState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(NAME);
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

	public static class InputReadContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(FAParser.NAME, 0); }
		public EpsilonContext epsilon() {
			return getRuleContext(EpsilonContext.class,0);
		}
		public InputReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterInputRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitInputRead(this);
		}
	}

	public final InputReadContext inputRead() throws RecognitionException {
		InputReadContext _localctx = new InputReadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inputRead);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case 2:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); epsilon();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); match(NAME);
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

	public static class EpsilonContext extends ParserRuleContext {
		public EpsilonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_epsilon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).enterEpsilon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FAListener ) ((FAListener)listener).exitEpsilon(this);
		}
	}

	public final EpsilonContext epsilon() throws RecognitionException {
		EpsilonContext _localctx = new EpsilonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_epsilon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(2);
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

	public static final String _serializedATN =
		"\2\3\r\177\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t"+
		"\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4"+
		"\21\t\21\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\7\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\7\tT\n\t\f\t\16\tW\13\t\3\t\3\t\3\n\3\n\3\13\3\13\7\13_\n\13\f\13\16"+
		"\13b\13\13\3\f\3\f\3\f\3\f\7\fh\n\f\f\f\16\fk\13\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5\20{\n\20\3\21\3\21\3\21\2"+
		"\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2t\2\"\3\2\2\2\4$\3\2\2"+
		"\2\6\63\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20O\3\2\2"+
		"\2\22Z\3\2\2\2\24\\\3\2\2\2\26c\3\2\2\2\30n\3\2\2\2\32t\3\2\2\2\34v\3"+
		"\2\2\2\36z\3\2\2\2 |\3\2\2\2\"#\5\4\3\2#\3\3\2\2\2$%\7\3\2\2%&\7\13\2"+
		"\2&\'\7\b\2\2\'(\5\6\4\2()\7\7\2\2)*\5\n\6\2*+\7\7\2\2+,\5\16\b\2,-\7"+
		"\7\2\2-.\5\20\t\2./\7\6\2\2/\60\7\5\2\2\60\61\5\24\13\2\61\62\7\n\2\2"+
		"\62\5\3\2\2\2\63\64\7\b\2\2\649\5\b\5\2\65\66\7\7\2\2\668\5\b\5\2\67\65"+
		"\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\7\6\2\2"+
		"=\7\3\2\2\2>?\7\13\2\2?\t\3\2\2\2@A\7\b\2\2AF\5\f\7\2BC\7\7\2\2CE\5\f"+
		"\7\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\6"+
		"\2\2J\13\3\2\2\2KL\7\13\2\2L\r\3\2\2\2MN\7\13\2\2N\17\3\2\2\2OP\7\b\2"+
		"\2PU\5\22\n\2QR\7\7\2\2RT\5\22\n\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2VX\3\2\2\2WU\3\2\2\2XY\7\6\2\2Y\21\3\2\2\2Z[\7\13\2\2[\23\3\2\2\2"+
		"\\`\5\26\f\2]_\5\26\f\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\25\3"+
		"\2\2\2b`\3\2\2\2cd\5\32\16\2de\7\t\2\2ei\7\5\2\2fh\5\30\r\2gf\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\n\2\2m\27\3\2\2"+
		"\2no\7\b\2\2op\5\36\20\2pq\7\7\2\2qr\5\34\17\2rs\7\6\2\2s\31\3\2\2\2t"+
		"u\7\13\2\2u\33\3\2\2\2vw\7\13\2\2w\35\3\2\2\2x{\5 \21\2y{\7\13\2\2zx\3"+
		"\2\2\2zy\3\2\2\2{\37\3\2\2\2|}\7\4\2\2}!\3\2\2\2\b9FU`iz";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}