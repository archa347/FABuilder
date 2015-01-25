ReadMe

FA Finite Automata Builder
Written By Daniel Gallegos, CSC 151, CSUS, Spring 2013

I. Overview
The FA Finite Automata Builder takes a description of an FA in the form a text file.  The file is parsed and a finite automaton is built and displayed.  The FA is then run through a NFA - DFA conversion algorithm to create an equivalent DFA, which is then displayed.

II. Class Overview
	i. Package fa.parser
		a. FAbuilder.java - ANTLR listener implentation.  Walks through the parse tree of the input files, builds initial FA
		b. ANTLR lexer and parser classes
		c. FA.g4, ANTLR grammar used to generate parser/lexer/listener classes
	ii. fa.automata
		a. Automaton.java - The main class.  Contains fields and methods for the FA creation and conversion method.
		b. State.java - data type for an automatons state.  Contains information on transitions from that state.
	iii. com.mxgraph.view
		a. JGraphx open source graph visualization tool and associated classes.
		
III.  How to compile
From this directory, use command:
javac fa/automata/Automaton.java

or run batch file in this directory.

IV.  How to run
From this directory, use command:
java fa.automata.Automaton <filename>

or use run batch file in this directory