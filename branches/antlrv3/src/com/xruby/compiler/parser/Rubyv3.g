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
	
	LEFT_SHIFT;
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
	
	DIV;
	MOD;
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
        boolean result = false;
        if(parent != null) {
          result = parent.isDefinedVar(text);
        } else {
          return stm.isDefinedInCurrentScope(text);
        }
        if(result) {
          return true;
        } else {
          return false;
        }
        
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

    static final int STR_FUNC_ESCAPE=0x01;
    static final int STR_FUNC_EXPAND=0x02;
    static final int STR_FUNC_REGEXP=0x04;
    static final int STR_FUNC_QWORDS=0x08;
    static final int STR_FUNC_SYMBOL=0x10;
    static final int STR_FUNC_INDENT=0x20;

    private final int str_squote = 0;
    private final int str_dquote = STR_FUNC_EXPAND;
    private final int str_xquote = STR_FUNC_EXPAND;
    private final int str_regexp = STR_FUNC_REGEXP | STR_FUNC_ESCAPE | STR_FUNC_EXPAND;
    private final int str_ssym   = STR_FUNC_SYMBOL;
    private final int str_dsym   = STR_FUNC_SYMBOL | STR_FUNC_EXPAND;
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
       private static final boolean isIdentifierChar(int c) {
        return Character.isLetterOrDigit(c) || c == '_';
       }
        public static int nesting = 0;

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

/*
 * operator expression precedence
 * lowest->
 *		and or
 *		not
 *		? :
 *		= += -= *= /= %= &= ^= |= <<= >>= **=
 *		.. ...
 *		||
 *		&&
 *		<=> ==  === !=  =~  !~
 *		>  >=  <  <=
 *		|	 ^
 *		&
 *		<<  >>
 *		+  -
 *		*  /  %
 *		-(unary)  +(unary)  !  ~
 *		**
 *		[]
 *		::
 * highest<-
 */

expression
	:	 andorExpression|assignment_expression;
andorExpression
		:	notExpression (
				(	'and'^		(LINE_BREAK!)*
				|	'or'^		(LINE_BREAK!)*
				)
				notExpression
			)*
		;
notExpression
		:	'not'^
			(LINE_BREAK!)*
			notExpression
		|	ternaryIfThenElseExpression
		;
ternaryIfThenElseExpression
		:	rangeExpression
		;
//= += -= *= /= %= **= &= ^= |= <<= >>= &&= ||=
//.. ...
rangeExpression
		:	logicalOrExpression
			(options{greedy=true;/*caused by command*/}:
				(	INCLUSIVE_RANGE^	(options{greedy=true;}:LINE_BREAK!)?
				|	EXCLUSIVE_RANGE^	(options{greedy=true;}:LINE_BREAK!)?
				)
				logicalOrExpression
			)*
		;

//||
logicalOrExpression
		:	logicalAndExpression
			(options{greedy=true;/*caused by command*/}:
				LOGICAL_OR^		(options{greedy=true;}:LINE_BREAK!)?
				logicalAndExpression
			)*
		;

//&&
logicalAndExpression
		:	equalityExpression
			(options{greedy=true;/*caused by command*/}:
				LOGICAL_AND^		(options{greedy=true;}:LINE_BREAK!)?
				equalityExpression
			)*
		;

//<=> ==  === !=  =~  !~
equalityExpression
		:	relationalExpression
			(options{greedy=true;/*caused by command*/}:
				(	COMPARE^		(options{greedy=true;}:LINE_BREAK!)?
				|	EQUAL^			(options{greedy=true;}:LINE_BREAK!)?
				|	CASE_EQUAL^	(options{greedy=true;}:LINE_BREAK!)?
				|	NOT_EQUAL^		(options{greedy=true;}:LINE_BREAK!)?
				|	MATCH^			(options{greedy=true;}:LINE_BREAK!)?
				|	NOT_MATCH^		(options{greedy=true;}:LINE_BREAK!)?
				)
				relationalExpression
			)*
		;


//>  >=  <  <=
relationalExpression
		:	orExpression
			(options{greedy=true;/*caused by command*/}:
				(	LESS_THAN^			(options{greedy=true;}:LINE_BREAK!)?
				|	GREATER_THAN^		(options{greedy=true;}:LINE_BREAK!)?
				|	LESS_OR_EQUAL^		(options{greedy=true;}:LINE_BREAK!)?
				|	GREATER_OR_EQUAL^	(options{greedy=true;}:LINE_BREAK!)?
				)
				orExpression
			)*
		;

//|  ^
orExpression
		:	andExpression
			(options{greedy=true;/*caused by command*/}:
				(	BXOR^			(options{greedy=true;}:LINE_BREAK!)?
				|	BOR^			(options{greedy=true;}:LINE_BREAK!)?
				)
				andExpression
			)*
		;

//&
andExpression
		:	shiftExpression
			(options{greedy=true;/*caused by command*/}:
				BAND^			(options{greedy=true;}:LINE_BREAK!)?
				shiftExpression
			)*
		;



//<<  >>
shiftExpression
		:	additiveExpression
			(options{greedy=true;/*caused by command*/}:
				(	LEFT_SHIFT^		(options{greedy=true;}:LINE_BREAK!)?
				|	RIGHT_SHIFT^	(options{greedy=true;}:LINE_BREAK!)?
				)
				additiveExpression
			)*
		;



//+  -
additiveExpression
		:	multiplicativeExpression
			(options{greedy=true;/*caused by command*/}:
				(	PLUS^				(options{greedy=true;}:LINE_BREAK!)?
				|	MINUS^				(options{greedy=true;}:LINE_BREAK!)?
				)
				multiplicativeExpression
			)*
		;

//*  /  %
multiplicativeExpression
		:	powerExpression
			(options{greedy=true;/*caused by command*/}:
				(	STAR^			(options{greedy=true;}:LINE_BREAK!)?
				|	DIV^			(options{greedy=true;}:LINE_BREAK!)?
				|	MOD^			(options{greedy=true;}:LINE_BREAK!)?
				)
				powerExpression
			)*
		;


//**
powerExpression
		:	bnotExpression
			(options{greedy=true;/*caused by command*/}:
				POWER^			(options{greedy=true;}:LINE_BREAK!)?
				bnotExpression
			)*
		;

//!  ~
bnotExpression
		:	(	BNOT^			(options{greedy=true;}:LINE_BREAK!)?
			|	NOT^			(options{greedy=true;}:LINE_BREAK!)?
			)*
			command
		;
command
	:'expression0' | 'expression1' | 'expression2'|literal|ID|boolean_expression| block_expression|if_expression|unless_expression
	; //|       lhs SHIFT^ rhs ;	
assignment_expression
	:	lhs '='^ rhs {addVariable($lhs.text);};
lhs	:	ID;
rhs	:	expression;

//primary	:	literal| 'begin' program 'end'; //todo:more on this later

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

string	:	SINGLE_QUOTE_STRING|DOUBLE_QUOTE_STRING|heredoc_string;

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
	); //{expression = new DoubleQuoteStringExpression(input.substring(tokenStartCharIndex, getCharIndex() - 1));}; //todo: is this some ref like $s.text here?
                            
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
	:	'<<'{if(Character.isWhitespace(input.LT(1))) {$type = LEFT_SHIFT;}};  //mofidy type to SHIFT in BaseTokenStream if previous token is var	
HEREDOC_INDENT_BEGIN
	:	'<<-';
//SHFIT   //set in HEREDOC_BEGIN
//	: '<<';
heredoc_string
	:	HEREDOC_BEGIN HEREDOC_CONTENT|HEREDOC_INDENT_STRING;

HEREDOC_CONTENT
	:	'abc';
HEREDOC_INDENT_STRING
	@init{boolean heredoc_indent_string=false; String delimiter = null;int func = 0;StringBuffer tokens = new StringBuffer();}:(HEREDOC_INDENT_BEGIN{heredoc_indent_string=true;})
	   c=('\''|'"'|'`'|'0'..'9'|'a'..'z'|'A'..'Z'|'_'){
	    int end;
	    if (c == '\'' || c == '"' || c == '`') {
            if (c == '\'') {
                func |= str_squote;
            } else if (c == '"') {
                func |= str_dquote;
            } else {
                func |= str_xquote; 
            }

            
            end = c;
            while ((c = input.LT(1)) != EOF && c != end) {
                tokens.append((char)c);
                input.consume();
            }
            if (c == EOF) {
                throw new SyntaxException("unterminated here document identifier");
            }
            input.consume(); //consume the end character.	
        } else {
            /*if (!isIdentifierChar(c)) {
                throw new SyntaxException("shouldn't happen");
            }*/
            
            func |= str_dquote;
            tokens.append((char)c);
            while(true) {
            c = input.LT(1);
            if(c == Token.EOF || !isIdentifierChar(c)) {
                break;
            }
            tokens.append((char)c);
            input.consume();
            }
            
         } //we already consume the last character.
             
	   expression = new HeredocParser(this.parser, input, func, tokens.toString(), heredoc_indent_string).parseString();
	};  
        
ARRAY	:	'[]';
HASH	:	'{}';
RANGE	:	'a..b';
REGEX	:	'/abc/';
SYMBOL	:	':abc';

PLUS_ASSIGN			:	'+='	;
MINUS_ASSIGN		:	'-='		;
STAR_ASSIGN			:	'*='		;
DIV_ASSIGN		:	'/='		;
MOD_ASSIGN		:	'%='	;
POWER_ASSIGN		:	'**='	;
BAND_ASSIGN			:	'&='		;
BXOR_ASSIGN			:	'^='		;
BOR_ASSIGN			:	'|='		;
LEFT_SHIFT_ASSIGN	:	'<<='	;
RIGHT_SHIFT_ASSIGN	:	'>>='	;
LOGICAL_AND_ASSIGN	:	'&&='	;
LOGICAL_OR_ASSIGN	:	'||='	;
INCLUSIVE_RANGE     :	'..';
EXCLUSIVE_RANGE     :	'...';

ASSOC				:	'=>'		;
LOGICAL_AND			:	'&&'		;
LOGICAL_OR			:	'||'		;

//QUESTION			:	'?'		;
LPAREN				:	'('     ;
RPAREN				:	')'		;
LBRACK				:	'['		;
RBRACK				:	']'		;
EMPTY_ARRAY		:	'[]'		;
//LCURLY_HASH			:	'{'		;
//RCURLY				:	'}'		;
COMMA				:	','		;
COLON				:	':'		;
COLON2				:	'::'	;

NOT					:	'!'		;
BNOT				:	'~'		;
//DIV				:	'/'		;
PLUS				:	'+'		;
MINUS				:	'-'		;
//MOD				:	'%'		;
STAR				:	'*'		;	//'f * g' can parsed as 'f(*g)' or '(f) * (g)'
LESS_THAN			:	'<'		;
GREATER_THAN		:	'>'		;
BXOR				:	'^'		;
BOR					:	'|'		;
BAND				:	'&'		;
POWER				:	'**'		;
COMPARE				:	'<=>'	;
GREATER_OR_EQUAL	:	'>='		;
LESS_OR_EQUAL		:	'<='		;
EQUAL				:	'=='		;
CASE_EQUAL			:	'==='	;
NOT_EQUAL			:	'!='		;
MATCH				:	'=~'		;
NOT_MATCH			:	'!~'		;
//LEFT_SHIFT		:	'<<'		;
RIGHT_SHIFT			:	'>>'		;
