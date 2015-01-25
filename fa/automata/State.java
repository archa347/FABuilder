package fa.automata;

import java.util.*;

public class State {
	private String name;
	boolean f;
	private Map<String, List<State>> transitions;
	
	public State(String n) {
		this.name = n;
		this.transitions = new HashMap<String,List<State>>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean setf(boolean t) {
		this.f = t;
		return this.f;
	}
	
	public boolean getf() {
		return this.f;
	}
	
	public void addTransition(String i, State s) {
		
		List<State> transition = this.transitions.get(i);
		
		if (transition == null) transition = new ArrayList<State>();
		transition.add(s);
		this.transitions.put(i, transition);
	}
	
	public List<State> transit (String i) {
		List<State> s = this.transitions.get(i);
		if (s == null) return new ArrayList<State>();
		else return s;
	}
	
	public String toString() {
		return this.name;
	}
}
