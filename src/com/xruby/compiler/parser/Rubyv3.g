grammar Rubyv3;

options {
        output=AST;
}
tokens {
	// 'imaginary' tokens
	STATEMENT_LIST;
	STATEMENT;
	MODIFIER_LINE;
	IF;
	RPAREN_IN_METHOD_DEFINATION;
	BODY;
	CALL;
	ARG;
	
	SHIFT;
	//COMPSTMT;
	SYMBOL;
	BLOCK;
	MULTIPLE_ASSIGN;
	MULTIPLE_ASSIGN_WITH_EXTRA_COMMA;
	BLOCK_ARG;
	BLOCK_ARG_WITH_EXTRA_COMMA;
	MRHS;
	NESTED_LHS;
	SINGLETON_METHOD;
	STRING;
}

@rulecatch {
catch (RecognitionException e) {
throw e;
}
}
@lexer::rulecatch {
catch (RecognitionException e) {
throw e;
}
}

@header {
package com.xruby.compiler.parser;
}
@lexer::header {
package com.xruby.compiler.parser;

}
@lexer::members {
        /** Override this method to change where error messages go */
        public void emitErrorMessage(String msg) {
		System.err.println(msg);
	}
	private boolean just_seen_var=false;
	
	/*public Token emit() {
        IntToken t =
            new IntToken(input, type, channel,
                        tokenStartCharIndex, getCharIndex()-1);
        t.setLine(tokenStartLine);
        t.setText(text);
        t.setCharPositionInLine(tokenStartCharPositionInLine);
        emit(t);
        return t;
        }*/
        
        /*private Token createIntToken() {
          return new IntToken(input, channel, tokenStartCharIndex, getCharIndex()-1);
        }*/
        private Token createStringToken() {
                return new StringToken(input, channel, tokenStartCharIndex, getCharIndex()-1);
        }
        private int determineEnd(int begin) {
                int end = 0;
                if(begin == '[') {
                    end = ']';
                } else if(begin == '{') {
                    end = '}';
                } else if(begin == '(') {
                    end = ')';
                } else if(begin == '<'){
                    end = '>';
                } else {
                    end = begin;
                }
                return end;
        }
}
program
                :	terminal* |statement_list terminal*
		;

statement_list
		:	statement (terminal+ statement)* -> ^(STATEMENT_LIST statement*)
			;

/*terminal
		:	SEMI!
		|	LINE_BREAK!
		;*/
statement
	:	expression (modifier_line)*  -> ^(STATEMENT expression (modifier_line)*)              
	;

modifier_line
	:(IF_MODIFIER|UNLESS_MODIFIER|WHILE_MODIFIER|UNTIL_MODIFIER|RESCUE_MODIFIER)^ (line_break)* expression// -> ^(MODIFIER_LINE $modifier expression) 
		;
IF_MODIFIER     :  'if';
UNLESS_MODIFIER :  'unless';
WHILE_MODIFIER  :  'while';
UNTIL_MODIFIER  :  'until';
RESCUE_MODIFIER :  'resuce';

SEMI	:';'
	;


//OMIT_LINE_BREAK
//	:	LINE_BREAK* {skip();}
//	;
//emptyable_expression
//	:	expression|;
	
block_expression
	:	'begin' body 'end';
body	:	SEMI* |statement_list terminal*;  //nearly same as program
boolean_expression
	:	'false'|'nil'|'true';
if_expression
	:	'if'  e0=expression seperator
	        body0=body ('elsif' e1=expression seperator body1+=body)*
	        ('else' body2=body)?
	        'end' -> ^(IF $e0 $body0 $e1* $body1* $body2? )
	        //'if_e'
	        ;
seperator
	:LINE_BREAK+|':' LINE_BREAK* | LINE_BREAK* 'then' LINE_BREAK*;	
unless_expression
	:	'unless' boolean_expression ('then'|':'|line_break)
	        body 
	        ('else' body)?
	        'end';
terminal:	SEMI!|line_break;
line_break 
	:	 LINE_BREAK!;
LINE_BREAK
	:'\r'? '\n'
	;	
WS	:	(' ' | '\t') { skip(); }
	;
ID	:	('a'..'z' | 'A'..'Z') (('a'..'z' | 'A'..'Z') | ('0'..'9'))* {if("var".equals($text)) {System.out.println("just_seen_var:"+$text);just_seen_var=true;}}
	;



expression
	:	'expression0' | 'expression1' | 'expression2'|INT|ID|boolean_expression| block_expression|if_expression|unless_expression|assignment_expression;
assignment_expression
	:	lvalue '=' rvalue;
lvalue	:	ID;
rvalue	:	expression;

literal	:	NUMBER|string|ARRAY|HASH|RANGE|SYMBOL|REGEX;
INT
	:	'-'?(OCTAL|DECIMAL|HEX|BINARY| ESCAPE_INT)
	;
fragment
OCTAL	:	'0' '_'? ('0'..'7') ('_'? '0'..'7')*;
fragment
DECIMAL	:	
('0d')?('1'..'9') ('_'? '0'..'9')* ;
fragment
HEX	: '0x' HEX_PART ('_'? HEX_PART)* ;
fragment
HEX_PART
	:	('0'..'9'|'a'..'f'|'A'..'F')
	;

fragment
BINARY	:	'0b'('0'..'1') ('_'? '0'..'1')*;

fragment
ESCAPE_INT
	:       '?'(CONTROL_PART|META_PART)* ('\u0000' .. '\u0255')  
	;
fragment
CONTROL_PART
	:	('\\C-'|'\\c')
	;
fragment
META_PART
	:	'\\M-'
	;
FLOAT	:	'-'?( NON_LEADING0_NUMBER | '0') (EXP_PART | '.' LEADING0_NUMBER EXP_PART?);
fragment
NON_LEADING0_NUMBER
	:('1'..'9') ('_'? '0'..'9')*;	
fragment
LEADING0_NUMBER
	:('0'..'9') ('_'? '0'..'9')*;
fragment	
EXP_PART:	('e' | 'E') '-'? LEADING0_NUMBER;
NUMBER	:	INT|FLOAT;

string	:	SINGLE_QUOTE_STRING|DOUBLE_QUOTE_STRING|HEREDOC_STRING;

SINGLE_QUOTE_STRING
	@init{int end=0;}:	'\'' .* '\'' | '%q' begin=. {end=determineEnd($begin); System.out.println($begin);} (tmp=.{System.out.println(tmp); if(tmp==end) {this.type=SINGLE_QUOTE_STRING;return;}})*; // ;

DOUBLE_QUOTE_STRING
	@init{int end=0;}:	'"' .* '"' | '%Q' begin=. {end=determineEnd($begin); System.out.println($begin);} 
	(tmp=.{System.out.println(tmp); if(tmp==end) {this.type=DOUBLE_QUOTE_STRING;return;}})*; // ;;
HEREDOC_BEGIN
	:	'<<'{if(just_seen_var) {$type=SHIFT;}};	
//SHFIT   //set in HEREDOC_BEGIN
//	: '<<';
HEREDOC_STRING
	:	'HEREDOC_STRING';       
ARRAY	:	'[]';
HASH	:	'{}';
RANGE	:	'a..b';
REGEX	:	'/abc/';
SYMBOL	:	':abc';
