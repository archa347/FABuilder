// Generated from FA.g4 by ANTLR 4.0
package fa.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface FAVisitor<T> extends ParseTreeVisitor<T> {
	T visitInputRead(FAParser.InputReadContext ctx);

	T visitAutomataDecl(FAParser.AutomataDeclContext ctx);

	T visitInputSym(FAParser.InputSymContext ctx);

	T visitTransition(FAParser.TransitionContext ctx);

	T visitStartState(FAParser.StartStateContext ctx);

	T visitFinalStates(FAParser.FinalStatesContext ctx);

	T visitStateDecl(FAParser.StateDeclContext ctx);

	T visitInputsDecl(FAParser.InputsDeclContext ctx);

	T visitFunction(FAParser.FunctionContext ctx);

	T visitInState(FAParser.InStateContext ctx);

	T visitTransitions(FAParser.TransitionsContext ctx);

	T visitFile(FAParser.FileContext ctx);

	T visitFState(FAParser.FStateContext ctx);

	T visitEpsilon(FAParser.EpsilonContext ctx);

	T visitStatesDecl(FAParser.StatesDeclContext ctx);

	T visitDestState(FAParser.DestStateContext ctx);
}