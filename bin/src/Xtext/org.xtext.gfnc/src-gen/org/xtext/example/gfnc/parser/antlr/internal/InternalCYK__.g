lexer grammar InternalCYK;

@header {
package org.xtext.example.gfnc.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T__11 : 'W' ;
T__12 : ':' ;
T__13 : 'G' ;
T__14 : '->' ;
T__15 : '|' ;
T__16 : '_' ;
T__17 : 'a' ;
T__18 : 'b' ;
T__19 : 'c' ;
T__20 : 'd' ;
T__21 : 'e' ;
T__22 : 'f' ;
T__23 : 'g' ;
T__24 : 'h' ;
T__25 : 'i' ;
T__26 : 'j' ;
T__27 : 'k' ;
T__28 : 'l' ;
T__29 : 'm' ;
T__30 : 'n' ;
T__31 : 'o' ;
T__32 : 'p' ;
T__33 : 'q' ;
T__34 : 'r' ;
T__35 : 's' ;
T__36 : 't' ;
T__37 : 'v' ;
T__38 : 'w' ;
T__39 : 'x' ;
T__40 : 'y' ;
T__41 : 'z' ;
T__42 : 'A' ;
T__43 : 'B' ;
T__44 : 'C' ;
T__45 : 'D' ;
T__46 : 'E' ;
T__47 : 'F' ;
T__48 : 'H' ;
T__49 : 'I' ;
T__50 : 'J' ;
T__51 : 'K' ;
T__52 : 'L' ;
T__53 : 'M' ;
T__54 : 'N' ;
T__55 : 'O' ;
T__56 : 'P' ;
T__57 : 'Q' ;
T__58 : 'R' ;
T__59 : 'S' ;
T__60 : 'T' ;
T__61 : 'U' ;
T__62 : 'V' ;
T__63 : 'X' ;
T__64 : 'Y' ;
T__65 : 'Z' ;

// $ANTLR src "../org.xtext.gfnc/src-gen/org/xtext/example/gfnc/parser/antlr/internal/InternalCYK.g" 1092
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../org.xtext.gfnc/src-gen/org/xtext/example/gfnc/parser/antlr/internal/InternalCYK.g" 1094
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.gfnc/src-gen/org/xtext/example/gfnc/parser/antlr/internal/InternalCYK.g" 1096
RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

// $ANTLR src "../org.xtext.gfnc/src-gen/org/xtext/example/gfnc/parser/antlr/internal/InternalCYK.g" 1098
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.xtext.gfnc/src-gen/org/xtext/example/gfnc/parser/antlr/internal/InternalCYK.g" 1100
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.gfnc/src-gen/org/xtext/example/gfnc/parser/antlr/internal/InternalCYK.g" 1102
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.gfnc/src-gen/org/xtext/example/gfnc/parser/antlr/internal/InternalCYK.g" 1104
RULE_ANY_OTHER : .;
