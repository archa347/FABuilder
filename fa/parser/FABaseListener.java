// Generated from FA.g4 by ANTLR 4.0
package fa.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class FABaseListener implements FAListener {
	@Override public void enterInputRead(FAParser.InputReadContext ctx) { }
	@Override public void exitInputRead(FAParser.InputReadContext ctx) { }

	@Override public void enterAutomataDecl(FAParser.AutomataDeclContext ctx) { }
	@Override public void exitAutomataDecl(FAParser.AutomataDeclContext ctx) { }

	@Override public void enterInputSym(FAParser.InputSymContext ctx) { }
	@Override public void exitInputSym(FAParser.InputSymContext ctx) { }

	@Override public void enterTransition(FAParser.TransitionContext ctx) { }
	@Override public void exitTransition(FAParser.TransitionContext ctx) { }

	@Override public void enterStartState(FAParser.StartStateContext ctx) { }
	@Override public void exitStartState(FAParser.StartStateContext ctx) { }

	@Override public void enterFinalStates(FAParser.FinalStatesContext ctx) { }
	@Override public void exitFinalStates(FAParser.FinalStatesContext ctx) { }

	@Override public void enterStateDecl(FAParser.StateDeclContext ctx) { }
	@Override public void exitStateDecl(FAParser.StateDeclContext ctx) { }

	@Override public void enterInputsDecl(FAParser.InputsDeclContext ctx) { }
	@Override public void exitInputsDecl(FAParser.InputsDeclContext ctx) { }

	@Override public void enterFunction(FAParser.FunctionContext ctx) { }
	@Override public void exitFunction(FAParser.FunctionContext ctx) { }

	@Override public void enterInState(FAParser.InStateContext ctx) { }
	@Override public void exitInState(FAParser.InStateContext ctx) { }

	@Override public void enterTransitions(FAParser.TransitionsContext ctx) { }
	@Override public void exitTransitions(FAParser.TransitionsContext ctx) { }

	@Override public void enterFile(FAParser.FileContext ctx) { }
	@Override public void exitFile(FAParser.FileContext ctx) { }

	@Override public void enterFState(FAParser.FStateContext ctx) { }
	@Override public void exitFState(FAParser.FStateContext ctx) { }

	@Override public void enterEpsilon(FAParser.EpsilonContext ctx) { }
	@Override public void exitEpsilon(FAParser.EpsilonContext ctx) { }

	@Override public void enterStatesDecl(FAParser.StatesDeclContext ctx) { }
	@Override public void exitStatesDecl(FAParser.StatesDeclContext ctx) { }

	@Override public void enterDestState(FAParser.DestStateContext ctx) { }
	@Override public void exitDestState(FAParser.DestStateContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}