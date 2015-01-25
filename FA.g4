grammar FA;

file : automataDecl ;

automataDecl : 'automata' NAME '(' statesDecl ',' inputsDecl ',' startState ',' finalStates ')' '{' transitions '}';

//State Declarations
statesDecl : '(' stateDecl (',' stateDecl)* ')';

stateDecl : NAME ;
//---------------------------------
//input declarations
inputsDecl: '(' inputSym (',' inputSym)* ')' ;

inputSym : NAME ;
//------------------------------
//start state 
startState : NAME ;
NAME  :   (LETTER | DIGIT)+ ;

//final state
finalStates : '(' fState (',' fState)* ')' ;

fState : NAME ;

//---------------------------
//transition functions
transitions : transition (transition)*;

transition : inState ':' '{' (function)* '}' ;

function: '(' inputRead ',' destState ')';

inState : NAME ;

destState: NAME ;

inputRead: epsilon | NAME ;

epsilon: '&';

//------------------------------

fragment LETTER : [a-zA-Z];
fragment DIGIT : [0-9];

SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;
	
WS  :   [ \t\n\r]+ -> skip ;