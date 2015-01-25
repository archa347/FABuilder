package fa.automata;

import java.util.*;
import java.util.Map.Entry;
import java.awt.Dimension;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import fa.parser.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import com.mxgraph.layout.*;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxGraph;

public class Automaton extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1558952152792473093L;
	private String name;				//automaton name
	private Map<String, State> states;	//map of states to name
	private State current;				//not used
	private State start;				//the start state
	private List<String> alphabet;		//alphabet list
	
	//for NFA to DFA conversion
	private Map<String, State> dfaStates;			//name / state mapping for new dfa states
	private	Map<String, Set<State>> nfaTOdfa;		//a map of constituent NFA states for the new DFA
	private int count;
	private Stack<State> unmarked;					//stack of new DFA states to be processed
	private Set<State> dfastate;					//currently being built set of NFA states
	
	public Automaton(String n, Map<String,State> s, State t, List<String> i) {
		super(n);
		
		this.name = n;
		this.states = s;
		this.start = t;
		this.alphabet = i;
		
		

		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();
		
		graph.setAllowNegativeCoordinates(true);
		graph.getModel().beginUpdate();
		mxHierarchicalLayout layout = new mxHierarchicalLayout(graph);
		
		try
		{
			Map<String, Object> objects = new HashMap<String,Object>(); //hashmap to store state vertexes
			
			
			Set<String> statenames = this.states.keySet();				//gets the names from the states map
			Iterator<String> itr = statenames.iterator();
			int x = 0, y=0;
			Object root = graph.insertVertex(parent, null, null, 400, 200, 0, 0,"opacity=0");
			parent = root;
			
			Object invisible = graph.insertVertex(parent, null, null, x, y, 50,50,"opacity=0");
			
			//add a vertex  to graph for each state
			while (itr.hasNext()) {
				String statename = itr.next();
				if (this.states.get(statename).getf())
					objects.put(statename, graph.insertVertex(parent, statename, statename, x=x+20, y=y+20, 50, 50,"shape=doubleEllipse"));  //double walled if final state
				else objects.put(statename, graph.insertVertex(parent, statename, statename, x=x+20, y=y+20, 50, 50,"shape=ellipse")); 
			}
			
			graph.insertEdge(parent, null, null, invisible, objects.get(this.start.getName()));			//an anchor edge to try and control the positioning of the graph layout
			
			
			//iterate through transitions on alphabet for each state to insert edges
			itr = statenames.iterator();													
			while (itr.hasNext()) {
				String statename = itr.next();
				State state = this.states.get(statename); 
				for (int j=0; j < alphabet.size(); j++) {
					List<State> tmp = state.transit(alphabet.get(j));
					if (tmp != null)
					for (int k = 0; k < tmp.size(); k++) {
						graph.insertEdge(parent, null, alphabet.get(j), objects.get(statename), objects.get(tmp.get(k).getName()),"shape=curve;edgeStyle=loopEdgeStyle");
						
					}
				}
				List<State> tmp = state.transit("&");			//special epsilon
				if (tmp != null)
					for (int k = 0; k < tmp.size(); k++) {
						graph.insertEdge(parent, null, "&", objects.get(statename), objects.get(tmp.get(k).getName()),"shape=curve;edgeStyle=loopEdgeStyle");
					}
				layout.execute(parent);
			}
			
			
			
			
		}
		finally
		{
			//mxGraphComponent graphComponent = new mxGraphComponent(graph);
			graph.getModel().endUpdate();
		}
		
		
		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		getContentPane().add(graphComponent);
		
	}

	public String getName() {
		return this.name;
	}
	
	public List<String> getAlphabet() {
		return this.alphabet;
	}
	
	public State getStart() {
		return this.start;
	}
	
	public Map<String,State> getStates() {
		return this.states;
	}
	
	public static void main(String[] args) throws IOException{
		FileInputStream instr = new FileInputStream(args[0]);
		ANTLRInputStream in = new ANTLRInputStream(instr);
		FALexer lex = new FALexer(in); 
		CommonTokenStream tokens = new CommonTokenStream(lex); 
		FAParser parser = new FAParser(tokens); 
		parser.setBuildParseTree(true); 
		RuleContext tree = parser.file();
		
		//walk parse tree and construct FA
		ParseTreeWalker walker = new ParseTreeWalker();			
		FAbuilder builder = new FAbuilder();
		walker.walk(builder, tree);
		Automaton automaton = builder.automaton();
		
		//display the automaton
		automaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		automaton.setSize(800, 800);
		automaton.setVisible(true);
		
		//run NFA - DFA conversion, display DFA
		Automaton dfa = automaton.convertToDFA(automaton);
		dfa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dfa.setLocation(800, 0);
		dfa.setSize(1600, 900);
		dfa.setVisible(true);
		
		
	}
	
	public Automaton convertToDFA(Automaton n) {
		this.dfaStates = new HashMap<String, State>();
		this.nfaTOdfa = new HashMap<String, Set<State>>();
		this.alphabet = n.getAlphabet();
		this.unmarked = new Stack<State>();
		this.count = 0;
		String autoname = n.getName() + "DFA";
		String name = "q" + this.count;
		this.dfastate = new HashSet<State>();
		Set<State> start = eclosure(n.getStart());						//eclosure on start state
		this.dfaStates.put(name, new State(name)); //add new state to the map
		this.nfaTOdfa.put(name, start);
		this.unmarked.push(this.dfaStates.get(name));				//make new state unmarked
		Iterator<State> itr2 = start.iterator();			
		while (itr2.hasNext()) {										//iterate through list 
			if (itr2.next().getf() == true) { 							//if any final state in list, DFA state is final
				this.dfaStates.get(name).setf(true); break; }
		}
		count++;
		while (!this.unmarked.isEmpty()) {					//for each unmarked state
			State tmp = this.unmarked.pop();				//state "marked"
			Iterator<String> itr = this.alphabet.iterator();
			while (itr.hasNext()) {
				String input = itr.next();
				Set<State> newDFAstate = move(tmp,input);
				if (newDFAstate.size() > 0) {
					if (!nfaTOdfa.containsValue(newDFAstate)) {					//check if a new state has already been created from these same states
						name = "q" + this.count;							//generate new name
						count++;
						this.dfaStates.put(name, new State(name));				//add new state to DFA
						this.nfaTOdfa.put(name, newDFAstate);					//add set of NFA states for new state
						this.unmarked.push(dfaStates.get(name));				//label as unmarked
						tmp.addTransition(input, dfaStates.get(name));			//add a transition to new DFA state for input
						
						itr2 = newDFAstate.iterator();			
						while (itr2.hasNext()) {										//iterate through list 
							if (itr2.next().getf() == true) { 							//if any final state in list, DFA state is final
								this.dfaStates.get(name).setf(true); break; }
						}
					
					}
					else {
						Set<Entry<String, Set<State>>> e = nfaTOdfa.entrySet();
						Iterator<Entry<String,Set<State>>> itr3 = e.iterator();
						while (itr3.hasNext()) {										//get the key from the map that is the name of this state
							Entry<String, Set<State>> tmp2 = itr3.next();
							if (tmp2.getValue().equals(newDFAstate)) {
								tmp.addTransition(input, dfaStates.get(tmp2.getKey()));
							}
						}
					}
					
				}
				
			}
		}
		return new Automaton(autoname, this.dfaStates, this.dfaStates.get("q0"), this.alphabet);
	}
	
	public Set<State> eclosure(State s) {
		List<State> e = s.transit("&");						//list of states reachable by an epsilon transition
		this.dfastate.add(s);
		Iterator<State> itr = e.iterator();
		while (itr.hasNext()) {					
			State next = itr.next();					
			if (!dfastate.contains(next)) {				//prevent endless loops by seeing if state is already in the set for this closure
				eclosure(next);							//get e-closure for each state	
			}	
		}		
		return dfastate;
	}	
	
	public Set<State> move(State s, String i) {
		Set<State> states = this.nfaTOdfa.get(s.getName());
		Iterator<State> itr = states.iterator();
		this.dfastate = new HashSet<State>();			//start new dfastate before non-recursive call to eclosure to avoid loops
		while (itr.hasNext()) {
			List<State> tmp = itr.next().transit(i); //get list of states reachable from current state with input i
			Iterator<State> itr2 = tmp.iterator();
			while (itr2.hasNext()) {
				State next = itr2.next();
				eclosure(next);						//perform eclosure on current state
			}
		}
		return this.dfastate;									//return list for new DFA state
	}
	
	/*boolean checkDuplicate(Set<State> newDFAstate) {
		boolean check = false;
		for (int i = 0; i < count; i++) {					//go through every declared new state						
			check = false;
			Set<State> tmp = this.nfaTOdfa.get("q" + i);
			
			if (tmp.size() != newDFAstate.size()) {System.out.println(tmp.size() + " " + newDFAstate.size() + " Not equal, continuing"); continue; }	//check if NFA state list size for each DFA state is equal
			else check = true;
			for (int j = 0; j < newDFAstate.size(); j++) {
				System.out.println(tmp + " comparing to " + newDFAstate.get(j));
				if (!tmp.contains(newDFAstate.get(j))) {		//if states in the list are not the same, check is false, move to next list
						check = false;
						System.out.println("false, next list");
						break;
				}
			}
			if (check) break;						//completed inner for loop, current set tmp and newDFAstate set are equivalent, else continue to next set.
		}
		System.out.println("Duplicate Check is " + check);
		return check;
	}*/
}