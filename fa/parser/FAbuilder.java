package fa.parser;

import java.util.*;

import fa.automata.*;


public class FAbuilder extends FABaseListener {
	private String name;
	private Map<String, State> states;
	private State current;
	private State start;
	private List<String> alphabet;
	private Automaton automaton;
	private String dest;
	private String input;
	
	public Automaton automaton() {
		return this.automaton;
	}
	
	/*@Override public void enterFile(FAParser.FileContext ctx) {
		this.automata = new HashMap<String, Automata>();
	}*/
	
	@Override public void enterAutomataDecl(FAParser.AutomataDeclContext ctx) { 
		this.name = ctx.NAME().getText();
	}
	
	@Override public void exitAutomataDecl(FAParser.AutomataDeclContext ctx) {
		this.automaton = new Automaton(this.name,this.states,this.start,this.alphabet);
	}
	
	@Override public void enterStatesDecl(FAParser.StatesDeclContext ctx) { 
		this.states = new HashMap<String,State>();
	}
	
	@Override public void enterStateDecl(FAParser.StateDeclContext ctx) {
		String n = ctx.NAME().getText();
		this.states.put(n, new State(n));
	}
	
	@Override public void enterInputsDecl(FAParser.InputsDeclContext ctx) {
		this.alphabet = new ArrayList<String>();
	}
	
	@Override public void enterInputSym(FAParser.InputSymContext ctx) {
		this.alphabet.add(ctx.NAME().getText());
	}
	
	@Override public void enterStartState(FAParser.StartStateContext ctx) { 
		this.start = this.states.get(ctx.NAME().getText());	
	}
	
	@Override public void enterFState(FAParser.FStateContext ctx) { 
		String n = ctx.NAME().getText();
		this.states.get(n).setf(true);
	}
	
	@Override public void enterInState(FAParser.InStateContext ctx) {
		String n = ctx.NAME().getText();
		this.current = this.states.get(n);
	}
	
	@Override public void enterFunction(FAParser.FunctionContext ctx) {
		this.dest = null;
		this.input = null;
	}
	
	@Override public void exitFunction(FAParser.FunctionContext ctx) {
		this.current.addTransition(input, this.states.get(dest));
	}
	
	@Override public void enterInputRead(FAParser.InputReadContext ctx) {
		this.input = ctx.getText();
	}
	
	@Override public void enterDestState(FAParser.DestStateContext ctx) {
		this.dest = ctx.NAME().getText();
	}
	
	@Override public void exitTransitions(FAParser.TransitionsContext ctx) {
		this.current = null;
	}

}
