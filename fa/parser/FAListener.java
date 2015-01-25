// Generated from FA.g4 by ANTLR 4.0
package fa.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface FAListener extends ParseTreeListener {
	void enterInputRead(FAParser.InputReadContext ctx);
	void exitInputRead(FAParser.InputReadContext ctx);

	void enterAutomataDecl(FAParser.AutomataDeclContext ctx);
	void exitAutomataDecl(FAParser.AutomataDeclContext ctx);

	void enterInputSym(FAParser.InputSymContext ctx);
	void exitInputSym(FAParser.InputSymContext ctx);

	void enterTransition(FAParser.TransitionContext ctx);
	void exitTransition(FAParser.TransitionContext ctx);

	void enterStartState(FAParser.StartStateContext ctx);
	void exitStartState(FAParser.StartStateContext ctx);

	void enterFinalStates(FAParser.FinalStatesContext ctx);
	void exitFinalStates(FAParser.FinalStatesContext ctx);

	void enterStateDecl(FAParser.StateDeclContext ctx);
	void exitStateDecl(FAParser.StateDeclContext ctx);

	void enterInputsDecl(FAParser.InputsDeclContext ctx);
	void exitInputsDecl(FAParser.InputsDeclContext ctx);

	void enterFunction(FAParser.FunctionContext ctx);
	void exitFunction(FAParser.FunctionContext ctx);

	void enterInState(FAParser.InStateContext ctx);
	void exitInState(FAParser.InStateContext ctx);

	void enterTransitions(FAParser.TransitionsContext ctx);
	void exitTransitions(FAParser.TransitionsContext ctx);

	void enterFile(FAParser.FileContext ctx);
	void exitFile(FAParser.FileContext ctx);

	void enterFState(FAParser.FStateContext ctx);
	void exitFState(FAParser.FStateContext ctx);

	void enterEpsilon(FAParser.EpsilonContext ctx);
	void exitEpsilon(FAParser.EpsilonContext ctx);

	void enterStatesDecl(FAParser.StatesDeclContext ctx);
	void exitStatesDecl(FAParser.StatesDeclContext ctx);

	void enterDestState(FAParser.DestStateContext ctx);
	void exitDestState(FAParser.DestStateContext ctx);
}