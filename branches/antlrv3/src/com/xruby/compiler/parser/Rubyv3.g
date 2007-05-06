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
	ASSIGNMENT; //or just use '=' etc?
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

import com.xruby.compiler.codedom.*;

}
@members {
  private Rubyv3Parser parent = null;
  private SymbolTableManager stm = new SymbolTableManager(null);
  /*public boolean just_seen_var() {
          Token token = input.LT(1);
          if(token != null) {
            return stm.isDefinedInCurrentScope(token.getText());
          }
          return false;
  }*/
  public boolean isDefinedVar(String text) {
        return stm.isDefinedInCurrentScope(text);
  }
  public void addVariable(String s) {
        if(parent != null) {
           parent.addVariable(s);
           return;
        }
        stm.addVariable(s);
  }
  public Rubyv3Parser(TokenStream input, Rubyv3Parser parent) {
            super(input);
            ((Rubyv3Lexer) input.getTokenSource()).setParser(this);
            this.parent = parent;
  }
  /*public void init() {
    ((Rubyv3Lexer) input.getTokenSource()).setParser(this);
  }*/
  
}

@lexer::members {
        /** Override this method to change where error messages go */
        public void emitErrorMessage(String msg) {
		System.err.println(msg);
	}
	private Rubyv3Parser parser;
	public void setParser(Rubyv3Parser parser) {
        this.parser = parser;
        }
        public Rubyv3Parser getParser() {
          return this.parser;
        }
        
        private Expression expression;
        public void reset() {
		super.reset(); // reset all recognizer state variables
		expression = null;
	}
        public Token emit() {
	    MyToken t =
	        new MyToken(input, type, channel,
	                    tokenStartCharIndex, getCharIndex()-1);
	    t.setLine(tokenStartLine);
	    t.setText(text);
	    t.setCharPositionInLine(tokenStartCharPositionInLine);
	    t.expression = expression;
	    expression = null; //clear out expression
	    emit(t);
	    return t;
       }
       public static int nesting = 0;

	
	
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
        private int determineBegin(int begin) {
        int result = 0; //if collide with EOF, then we can use other value like -3,-7 
        if (begin == '[' || begin == '{' || begin == '(' || begin == '<') {
            result = begin;
        } 
        return result;
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
ID	:	('a'..'z' | 'A'..'Z') (('a'..'z' | 'A'..'Z') | ('0'..'9'))*
	;



expression
	:	'expression0' | 'expression1' | 'expression2'|literal|assignment_expression|ID|boolean_expression| block_expression|if_expression|unless_expression
	|       lhs SHIFT^ rhs ;
assignment_expression
	:	lhs '='^ rhs {addVariable($lhs.text);};
lhs	:	ID;
rhs	:	expression;

literal	:	INT|FLOAT|string|ARRAY|HASH|RANGE|SYMBOL|REGEX;
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
	:       '?'(CONTROL_PART|META_PART)* ('\u0000' .. '\u0091' | '\u0093'..'\u0255' | ESCAPE_INT_PART)
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

string	:	SINGLE_QUOTE_STRING|DOUBLE_QUOTE_STRING|HEREDOC_STRING;

SINGLE_QUOTE_STRING
	@init{int end=0; int nested=0;}:	'\'' SINGLE_STRING_CHAR* '\'' 
	| '%q' begin=. {System.out.println($begin); end=determineEnd($begin);begin=determineBegin($begin); } (tmp=.{System.out.println(tmp);
	                    if(tmp == EOF) {
	                      throw new SyntaxException("unterminated string meets end of file");
	                    } else if(tmp == '\\') {
	                      int c = input.LA(1);
	                      if(c == EOF) {
	                         throw new SyntaxException("unterminated string meets end of file");
	                      } else if (c == begin || c == end || c == '\\') {
	                         //tokens.add();
	                         input.consume();
	                      }
	                    }else if(tmp==begin) {
                                nested ++;
                            } else if(tmp==end)  {
                                
                                if(nested == 0) {
                                this.type=SINGLE_QUOTE_STRING;
                                return;
                                }
                                nested --;
                            }
                            })*;
fragment	
SINGLE_STRING_CHAR
  	:	'\\' . | ~ ('\\'|'\'') ;
fragment
DOUBLE_STRING_CHAR
	:	'\\' . | ~ ('\\'|'"');
DOUBLE_QUOTE_STRING
	@init{int end=0; int nested=0;}:	s=('"' {expression = new DoubleStringParser(this.parser, input, '"', 0).parseString();}  | '%Q' begin=. {end=determineEnd($begin);begin=determineBegin($begin); 
	expression = new DoubleStringParser(this.parser, input, end, begin).parseString(); } 
	/* (tmp=.{System.out.println(tmp); 
	                    if(tmp == EOF) {
	                      throw new SyntaxException("unterminated string meets end of file");
	                    } else if(tmp == '\\') {
	                      int c = input.LA(1);
	                      if(c == EOF) {
	                         throw new SyntaxException("unterminated string meets end of file");
	                      } else { //if (c == begin || c == end || c == '\\') {, for double quote string, always consume
	                         //tokens.add();
	                         input.consume();
	                      }
	                    }else if(tmp==begin) {
                                nested ++;
                            } else if(tmp==end)  {
                                
                                if(nested == 0) {
                                this.type=DOUBLE_QUOTE_STRING;
                                return;
                                }
                                nested --;
                            }
                            })* */); //{expression = new DoubleQuoteStringExpression(input.substring(tokenStartCharIndex, getCharIndex() - 1));}; //todo: is this some ref like $s.text here?
                            
LCURLY  : '{' {nesting++; System.out.println("meeting LCURLY with nesting:" + nesting);}
        ;
/** If we have a '}' with nesting level 0 then it must match the '{'
 *  (unseen by this grammar) that started an embedded Simple statement
 *  block within a javadoc comment.
 */
RCURLY  : '}'
          {
          if ( nesting<=0 ) {
                token=Token.EOF_TOKEN;
                System.out.println("exiting embedded simple with nesting:" + nesting);
          }
          else {
                nesting--;
          }
          }
        ;
fragment
ESCAPE_INT_PART //ESCAPE_INT_PART in ESCAPE_INT
	:	'\\' ('0'..'7' | '0'..'7' '0'..'7' | '0'..'7' '0'..'7' '0'..'7')
	|       '\\' 'x' (HEX_PART|HEX_PART HEX_PART) //validating semantic predicate seems does not work, just use enum directly, this is ugly.
	|       '\\' ~('0'..'7'|'x'|'c'|'M'|'C')
	;
                            
HEREDOC_BEGIN
	:	'<<';  //mofidy type to SHIFT in BaseTokenStream if previous token is var	
//SHFIT   //set in HEREDOC_BEGIN
//	: '<<';
HEREDOC_STRING
	:	'HEREDOC_STRING';       
ARRAY	:	'[]';
HASH	:	'{}';
RANGE	:	'a..b';
REGEX	:	'/abc/';
SYMBOL	:	':abc';
