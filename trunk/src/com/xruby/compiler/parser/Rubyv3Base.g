grammar Rubyv3Base;

options {
        output=AST;
}

tokens {
  RPAREN_IN_METHOD_DEFINATION;
  BODY;
  CALL;
  ARG;
  COMPSTMT;
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
  LCURLY_BLOCK;
  COLON_WITH_NO_FOLLOWING_SPACE;
  REST_ARG_PREFIX;
  ASSIGN_WITH_NO_LEADING_SPACE;
  LPAREN_WITH_NO_LEADING_SPACE;
  FUNCTION;
  QUESTION;
  DIV_ASSIGN;
  DIV;
  MOD_ASSIGN;
  MOD;
  LEFT_SHIFT_ASSIGN;

  BLOCK_ARG_PREFIX;
  LEFT_SHIFT;
  UNARY_PLUS;
  UNARY_MINUS;

  LEADING_COLON2;
  LBRACK_ARRAY_ACCESS;
  EMPTY_ARRAY_ACCESS;
  UNARY_MINUS;
  BLOCK_ARG_PREFIX;
  STRING_BEFORE_EXPRESSION_SUBSTITUTION;
  STRING_AFTER_EXPRESSION_SUBSTITUTION;
  REGEX_BEFORE_EXPRESSION_SUBSTITUTION;
  COMMAND_OUTPUT_BEFORE_EXPRESSION_SUBSTITUTION;
  HERE_DOC_BEFORE_EXPRESSION_SUBSTITUTION;
  HERE_DOC_BETWEEN_EXPRESSION_SUBSTITUTION;
  HERE_DOC_AFTER_EXPRESSION_SUBSTITUTION;
  W_ARRAY;
  HEX;
  BINARY;
  OCTAL;
  ASCII_VALUE;
  LEADING_COLON2;
  SINGLE_QUOTE;
  DO_IN_CONDITION;

  IF_MODIFIER;
  UNLESS_MODIFIER;
  WHILE_MODIFIER;
  UNTIL_MODIFIER;
  RESCUE_MODIFIER;
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

@members {
  private int can_be_command_ = 0;

  protected void enterScope()	{assert(false);}
  protected void enterBlockScope()	{assert(false);}
  protected void leaveScope()	{assert(false);}
  protected void addVariable(Token id)	{assert(false);}
  protected void setIsInNestedMultipleAssign(boolean v)	{assert(false);}
  protected void tellLexerWeHaveFinishedParsingMethodparameters()	{assert(false);}
  protected void tellLexerWeHaveFinishedParsingSymbol()	{assert(false);}
  protected void tellLexerWeHaveFinishedParsingStringExpressionSubstituation()	{assert(false);}
  protected void tellLexerWeHaveFinishedParsingRegexExpressionSubstituation()	{assert(false);}
  protected void tellLexerWeHaveFinishedParsingHeredocExpressionSubstituation()	{assert(false);}

  boolean isNotAssign(int token_type) {
    switch (token_type) {
      case ASSIGN:
      case ASSIGN_WITH_NO_LEADING_SPACE:
      case PLUS_ASSIGN:
      case MINUS_ASSIGN:
      case STAR_ASSIGN:
      case DIV_ASSIGN:
      case MOD_ASSIGN:
      case POWER_ASSIGN:
      case BAND_ASSIGN:
      case BXOR_ASSIGN:
      case BOR_ASSIGN:
      case LEFT_SHIFT_ASSIGN:
      case RIGHT_SHIFT_ASSIGN:
      case LOGICAL_AND_ASSIGN:
      case LOGICAL_OR_ASSIGN:
        return false;
      default:
        return true;
    }
  }
}

@lexer::members {

  protected boolean expectOperator(int k)		{throw new Error("use Rubyv3Lexer");}
  protected boolean expectUnary()				{throw new Error("use Rubyv3Lexer");}
  protected boolean expectHash()				{throw new Error("use Rubyv3Lexer");}
  protected boolean expectHeredoc()				{throw new Error("use Rubyv3Lexer");}
  protected boolean expectLeadingColon2()		{throw new Error("use Rubyv3Lexer");}
  protected boolean expectArrayAccess()			{throw new Error("use Rubyv3Lexer");}
  protected boolean lastTokenIsDotOrColon2()	{throw new Error("use Rubyv3Lexer");}
  protected boolean lastTokenIsSemi()			{throw new Error("use Rubyv3Lexer");}
  protected boolean lastTokenIsKeywordDefOrColonWithNoFollowingSpace()	{throw new Error("use Rubyv3Lexer");}
  protected boolean lastTokenIsColonWithNoFollowingSpace()				{throw new Error("use Rubyv3Lexer");}
  protected boolean shouldIgnoreLinebreak()								{throw new Error("use Rubyv3Lexer");}
  protected int trackDelimiterCount(char next_char, char delimeter, int delimeter_count)	{throw new Error("use Rubyv3Lexer");}
  protected boolean isDelimiter(String next_line, String delimiter)		{throw new Error("use Rubyv3Lexer");}
  protected boolean isAsciiValueTerminator(int value)	{throw new Error("use Rubyv3Lexer");}
  protected boolean justSeenWhitespace()				{throw new Error("use Rubyv3Lexer");}
  protected void setSeenWhitespace()					{throw new Error("use Rubyv3Lexer");}
  protected boolean expressionSubstitutionIsNext()		{throw new Error("use Rubyv3Lexer");}
  protected boolean spaceIsNext()						{throw new Error("use Rubyv3Lexer");}
  protected void setCurrentSpecialStringDelimiter(char delimiter, int delimiter_count)	{throw new Error("use Rubyv3Lexer");}
  protected void updateCurrentSpecialStringDelimiterCount(int delimiter_count)			{throw new Error("use Rubyv3Lexer");}
}

program	:	expression;

expression
		:	andorExpression
		;
		
andorExpression
		:	notExpression
			(options{greedy=true;/*caused by command*/}:
				(	'and'^		(options{greedy=true;}:LINE_BREAK!)?
				|	'or'^		(options{greedy=true;}:LINE_BREAK!)?
				)
				notExpression
			)*
		;
notExpression
		:	'not'
			(options{greedy=true;}:LINE_BREAK!)?
			notExpression
		|	ternaryIfThenElseExpression
		;
		
ternaryIfThenElseExpression
		:	assignmentExpression
			(options{greedy=true;/*caused by command*/}:
				QUESTION^			(options{greedy=true;}:LINE_BREAK!)?
				ternaryIfThenElseExpression
				(COLON!|COLON_WITH_NO_FOLLOWING_SPACE!)				(options{greedy=true;}:LINE_BREAK!)?
				ternaryIfThenElseExpression
			)?
		;
		
assignmentExpression
		:	rangeExpression
			(options{greedy=true;/*caused by command*/}:
			{REST_ARG_PREFIX != input.LA(2)}?
				(	ASSIGN^				(options{greedy=true;}:LINE_BREAK!)?
				|	ASSIGN_WITH_NO_LEADING_SPACE^		(options{greedy=true;}:LINE_BREAK!)?
				|	PLUS_ASSIGN^		(options{greedy=true;}:LINE_BREAK!)?
				|	MINUS_ASSIGN^		(options{greedy=true;}:LINE_BREAK!)?
				|	STAR_ASSIGN^		(options{greedy=true;}:LINE_BREAK!)?
				|	DIV_ASSIGN^		(options{greedy=true;}:LINE_BREAK!)?
				|	MOD_ASSIGN^		(options{greedy=true;}:LINE_BREAK!)?
				|	POWER_ASSIGN^		(options{greedy=true;}:LINE_BREAK!)?
				|	BAND_ASSIGN^		(options{greedy=true;}:LINE_BREAK!)?
				|	BXOR_ASSIGN^		(options{greedy=true;}:LINE_BREAK!)?
				|	BOR_ASSIGN^		(options{greedy=true;}:LINE_BREAK!)?
				|	LEFT_SHIFT_ASSIGN^	(options{greedy=true;}:LINE_BREAK!)?
				|	RIGHT_SHIFT_ASSIGN^	(options{greedy=true;}:LINE_BREAK!)?
				|	LOGICAL_AND_ASSIGN^	(options{greedy=true;}:LINE_BREAK!)?
				|	LOGICAL_OR_ASSIGN^	(options{greedy=true;}:LINE_BREAK!)?
				)
				ternaryIfThenElseExpression
			)*
		;
		
rangeExpression
		:	logicalOrExpression
			(options{greedy=true;/*caused by command*/}:
				(	INCLUSIVE_RANGE^	(options{greedy=true;}:LINE_BREAK!)?
				|	EXCLUSIVE_RANGE^	(options{greedy=true;}:LINE_BREAK!)?
				)
				logicalOrExpression
			)* 
		;
		
logicalOrExpression
		:	logicalAndExpression
			(options{greedy=true;/*caused by command*/}:
				LOGICAL_OR^		(options{greedy=true;}:LINE_BREAK!)?
				logicalAndExpression
			)*
		;
		
logicalAndExpression
		:	equalityExpression
			(options{greedy=true;/*caused by command*/}:
				LOGICAL_AND^		(options{greedy=true;}:LINE_BREAK!)?
				equalityExpression
			)*
		;
		
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
		
orExpression
		:	andExpression
			(options{greedy=true;/*caused by command*/}:
				(	BXOR^			(options{greedy=true;}:LINE_BREAK!)?
				|	BOR^			(options{greedy=true;}:LINE_BREAK!)?
				)
				andExpression
			)*
		;
		
andExpression
		:	shiftExpression
			(options{greedy=true;/*caused by command*/}:
				BAND^			(options{greedy=true;}:LINE_BREAK!)?
				shiftExpression
			)*
		;
		
shiftExpression
		:	additiveExpression
			(options{greedy=true;/*caused by command*/}:
				(	LEFT_SHIFT^		(options{greedy=true;}:LINE_BREAK!)?
				|	RIGHT_SHIFT^	(options{greedy=true;}:LINE_BREAK!)?
				)
				additiveExpression
			)*
		;
		
additiveExpression
		:	multiplicativeExpression
			(options{greedy=true;/*caused by command*/}:
				(	PLUS^				(options{greedy=true;}:LINE_BREAK!)?
				|	MINUS^				(options{greedy=true;}:LINE_BREAK!)?
				)
				multiplicativeExpression
			)*
		;
		
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

command:unaryExpression;

//-(unary)  +(unary)
unaryExpression
		:	(	UNARY_PLUS^	(options{greedy=true;}:LINE_BREAK!)?
			|	UNARY_MINUS^	(options{greedy=true;}:LINE_BREAK!)?
			)*
			
			|primaryExpressionThatCanNotBeMethodName	
			
		;
predefinedValue
		:	'nil'
		|	'true'
		|	'false'
		|	'__FILE__'
		|	'__LINE__'
		;


numeric
		:	INTEGER
		|	HEX		
		|	BINARY
		|	OCTAL
		|	FLOAT
		|	ASCII_VALUE
		;

primaryExpressionThatCanBeMethodName
		:	FUNCTION	
		|	IDENTIFIER	
		|	'self'
		|	'super'
		|	CONSTANT
		|	LEADING_COLON2	CONSTANT
		|	'retry'
		|	'yield'
		|	LITERAL_defined
		|	'redo'
		|	EMPTY_ARRAY
		|	EMPTY_ARRAY_ACCESS
		|	UNARY_PLUS_MINUS_METHOD_NAME
		;
				
primaryExpressionThatCanNotBeMethodName
		:	INSTANCE_VARIABLE	
		|	GLOBAL_VARIABLE 
		|	CLASS_VARIABLE
		|	predefinedValue
		|	numeric
		/*|	literal
		|	arrayExpression
		|	hashExpression
		|	LPAREN^	compoundStatement RPAREN!
		|	LPAREN_WITH_NO_LEADING_SPACE^ compoundStatement RPAREN!
		|	ifExpression
		|	unlessExpression
		|	whileExpression			
		|	untilExpression			
		|	caseExpression		
		|	forExpression			
		|	exceptionHandlingExpression
		|	moduleDefination
		|	classDefination
		|	methodDefination*/
		;

primaryExpression
		:	primaryExpressionThatCanNotBeMethodName
		|	primaryExpressionThatCanBeMethodName	
		;
		
terminal
    :	SEMI
    |	LINE_BREAK
    ;

SEMI	:	';'		(options{greedy=true;}:(WHITE_SPACE_CAHR|SEMI))* {setText(";");};

LINE_BREAK	:	'\r'? '\n'	(options{greedy=true;}:('\n'!|SEMI!))* {setText("\n");} ;

LITERAL_undef	:	'undef'		;
LITERAL_alias	:	'alias'		;
LITERAL_do		: 	'do'		;
LITERAL_end		:	'end'		;
LITERAL_and		:	'and'		;
LITERAL_or		:	'or'		;
LITERAL_not		:	'not'		;
LITERAL_return	:	'return'	;
LITERAL_break	:	'break'		;
LITERAL_next	:	'next'		;
LITERAL_nil		:	'nil'		;
LITERAL_true	:	'true'		;
LITERAL_false	:	'false'		;
LITERAL_self	:	'self'		;
LITERAL_super	:	'super'		;
LITERAL_retry	:	'retry'		;
LITERAL_yield	:	'yield'		;
LITERAL_redo	:	'redo'		;
LITERAL_rescue	:	'rescue'	;
LITERAL_else	:	'else'		;
LITERAL_ensure	:	'ensure'	;
LITERAL_begin	:	'begin'		;
LITERAL_if		:	'if'		;
LITERAL_elsif	:	'elsif'		;
LITERAL_unless	:	'unless'	;
LITERAL_case	:	'case'		;
LITERAL_for		:	'for'		;
LITERAL_in		:	'in'		;
LITERAL_while	:	'while'		;
LITERAL_until	:	'until'		;
LITERAL_module	:	'module'	;
LITERAL_class	:	'class'		;
LITERAL_def		:	'def'		;
LITERAL_defined :	'defined?'	;
LITERAL_BEGIN	:	'BEGIN'		;
LITERAL_then	:	'then'		;
LITERAL_when	:	'when'		;
LITERAL_END		:	'END'		;
LITERAL___FILE__	:	'__FILE__'		;
LITERAL___LINE__	:	'__LINE__'		;

RCURLY	:	'}'		;

COMMA	:	','		;

COLON	:	':'		{if (!spaceIsNext()) {$type=COLON_WITH_NO_FOLLOWING_SPACE;}};


ASSIGN	:	'='		{if (!justSeenWhitespace()) {$type=ASSIGN_WITH_NO_LEADING_SPACE;}};

LPAREN	:	'('		{if (!justSeenWhitespace()) {$type=LPAREN_WITH_NO_LEADING_SPACE;}};

RPAREN	:	')'		;

IDENTIFIER
    :	('a'..'z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*		(	{if (lastTokenIsDotOrColon2()) {$type=FUNCTION;}}
                        |'?'	{$type=FUNCTION;}	//PREDICATE_FUNCTION
                        |'!'	{$type=FUNCTION;}	//DESTRUCTIVE_FUNCTION
                        )
    ;

CONSTANT
    :	('A'..'Z')	('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;


GLOBAL_VARIABLE
    :	'$'	('-')?	IDENTIFIER_CONSTANT_AND_KEYWORD? '#'?
    |	'$'	(options{greedy=true;}:'0'..'9')+
    |	'$'	('!'|'@'|'&'|'`'|'\''|'+'|'~'|'='|'/'|'\\'|','|';'|'.'|'<'|'>'|'*'|'$'|'?'|':'|'\"')
    ;


BOR					:	'|'		;

LOGICAL_OR			:	'||'	;

INSTANCE_VARIABLE
    :	'@'	IDENTIFIER_CONSTANT_AND_KEYWORD
    ;

CLASS_VARIABLE
    :	'@'	INSTANCE_VARIABLE
    ;

UNARY_PLUS_MINUS_METHOD_NAME
    :	//{lastTokenIsKeywordDefOrColonWithNoFollowingSpace() ||lastTokenIsDotOrColon2()}?
      ('+@'|'-@')
    ;

PLUS_ASSIGN			:	'+='	;

MINUS_ASSIGN		:	'-='	;

STAR_ASSIGN			:	'*='	;

POWER_ASSIGN		:	'**='	;

BAND_ASSIGN			:	'&='	;

BXOR_ASSIGN			:	'^='	;

BOR_ASSIGN			:	'|='	;

RIGHT_SHIFT_ASSIGN	:	'>>='	;

LOGICAL_AND_ASSIGN	:	'&&='	;

LOGICAL_OR_ASSIGN	:	'||='	;

LOGICAL_AND			:	'&&'	;

COMPARE				:	'<=>'	;

EQUAL				:	'=='	;

CASE_EQUAL			:	'==='	;

NOT_EQUAL			:	'!='	;

MATCH				:	'=~'	;

NOT_MATCH			:	'!~'	;

LESS_THAN			:	'<'		;

GREATER_THAN		:	'>'		;

LESS_OR_EQUAL		:	'<='	;

GREATER_OR_EQUAL	:	'>='	;

BXOR				:	'^'		;

BAND				:	'&'		{if (!expectOperator(1)) {$type=BLOCK_ARG_PREFIX;}};

RIGHT_SHIFT			:	'>>'	;

PLUS				:	'+'		{if (expectUnary())	{$type=UNARY_PLUS;}};

MINUS				:	'-'		{if (expectUnary())	{$type=UNARY_MINUS;}};

STAR	:	'*'		{if (!expectOperator(1)) {$type=REST_ARG_PREFIX;}};

POWER				:	'**'	;

BNOT				:	'~'		;

NOT					:	'!'		;

COLON2				:	'::'		{if (expectLeadingColon2())	{$type=LEADING_COLON2;}};

RBRACK				:	']'		;

ASSOC				:	'=>'	;

DOUBLE_QUOTE_STRING
    :	(delimiter='"')!
      ({input.LA(1)!= delimiter && !expressionSubstitutionIsNext()}?=> STRING_CHAR)*
      (end=.)!
      {
        setText(getText().substring(1, getText().length()-1));//discard '\"'
        
        if (end != delimiter)
        {
          $type=STRING_BEFORE_EXPRESSION_SUBSTITUTION;
          setCurrentSpecialStringDelimiter((char)delimiter, 1);
        }
      }
    ;


SINGLE_QUOTE_STRING
    :	'\''!
        (ESC
        |LINE_FEED
        |~('\''|'\\'|'\r'|'\n')
        )*
      '\''!
      {
      		setText(getText().substring(1, getText().length()-1));//discard '\''
      }
    ;

/*
fragment
STRING_BETWEEN_EXPRESSION_SUBSTITUTION[char delimiter, int delimiter_count]
    :	({(delimiter_count > 0) && (delimiter_count = trackDelimiterCount((char)input.LA(1), delimiter, delimiter_count)) != 0&& !expressionSubstitutionIsNext()}?	STRING_CHAR)*
      {
        //match and skip delimiter, there maybe no delimiter, e.g. ':#{cmd_name}'
        if (input.LA(1) != EOF)
        {
          _saveIndex=text.length();
          matchNot(EOF);
          text.setLength(_saveIndex);
        }

        if (0 == delimiter_count)
        {
          $type=STRING_AFTER_EXPRESSION_SUBSTITUTION;
        }
        else
        {
          updateCurrentSpecialStringDelimiterCount(delimiter_count);
        }
      }
    ;
*/

//DIVIDE and REGEX both starts with '/', here we use semantic predicate to disambiguate.
REGEX
    :	{!expectOperator(2)}?=>
      (delimiter='/')!
      ({input.LA(1) != delimiter}? =>	STRING_CHAR)*
      (end='/')!//skip delimiter
      {
      		setText(getText().substring(1, getText().length()-1));//discard '/'
      		
	      	if (end != delimiter)
	      	{
	      		$type=REGEX_BEFORE_EXPRESSION_SUBSTITUTION;
	      		setCurrentSpecialStringDelimiter((char)delimiter, 1);
	      	}
	      	else
	      	{
	      		mREGEX_MODIFIER();
	      	}
      }
     ;
     
  DIV_ASSIGN:	'/='	;
   DIV :	'/'	;
 

COMMAND_OUTPUT
    :	{!lastTokenIsKeywordDefOrColonWithNoFollowingSpace()}?
      delimiter='`'!
      ({input.LA(1) != delimiter && !expressionSubstitutionIsNext()}? =>	STRING_CHAR)*
      end=.!//skip delimiter
      {
      	  setText(getText().substring(1, getText().length()-1));//discard '`'
      	
        if (end != delimiter)
        {
          $type=COMMAND_OUTPUT_BEFORE_EXPRESSION_SUBSTITUTION;
          setCurrentSpecialStringDelimiter((char)delimiter, 1);
        }
      }
    |	'`'	{$type=SINGLE_QUOTE;}
    ;

//The first '-' after "<<" is alway interpreted as heredoc's special meaning, so be greedy
HERE_DOC_BEGIN
    :	{expectHeredoc()}?	'<<'!	HERE_DOC_DELIMITER
    ;

    LEFT_SHIFT_ASSIGN:	'<<='	;
   LEFT_SHIFT:	'<<';
/*
fragment
HERE_DOC_CONTENT[String delimiter, int type1, int type2]
    :	(next_line=ANYTHING_OTHER_THAN_LINE_FEED_AND_POUND	{if (expressionSubstitutionIsNext()) break;}
      LINE_FEED	{if (isDelimiter(next_line.getText(), delimiter)) break;}
      )+
      {
        if (expressionSubstitutionIsNext())
        {
          //eat '#'
          _saveIndex=text.length();
          matchNot(EOF);
          text.setLength(_saveIndex);
          $type=type1;
        }
        else
        {
          //skip delimiter
          text.setLength(text.length() - next_line.getText().length() - 1);
          $type=type2;
        }
      }
    ;
*/
INTEGER
    :	
    		'0'	(
          //Use semantic prediction to avoid 0.times
          {(input.LA(2)>='0')&&(input.LA(2)<='9')}? => FLOAT_WITH_LEADING_DOT {$type=FLOAT;}
          |/*none*/
        )
    |	NON_ZERO_DECIMAL	(
                  //Use semantic prediction to avoid things like "2..3", "2...3", "2.times"
                  {(input.LA(2)>='0')&&(input.LA(2)<='9')}? => FLOAT_WITH_LEADING_DOT {$type=FLOAT;}
                  |EXPONENT {$type=FLOAT;}
                  |/*none*/
                )

    |	'?'	(
          {isAsciiValueTerminator(input.LA(2))}?	(~('\\'|' '|'\n'|'\r'))	{$type=ASCII_VALUE;}
          |'\\'		~('C' | 'M')	{$type=ASCII_VALUE;}
          |('\\'	('C'|'M') '-')+	('a'..'z' | '?')	{$type=ASCII_VALUE;}
          |{$type=QUESTION;}	//If it does not "look like"(not depend on context!) integer, then it is QUESTION operator.
        )
    ;
    
   BINARY: '0'!	('b'!|'B'!)	BINARY_CONTENT	;
        HEX:	'0'!	('x'!|'X'!)	HEX_CONTENT	;
        FLOAT:	FLOAT_WITH_LEADING_DOT;
        OCTAL:'0'!	OCTAL_CONTENT;
    DOT:	'.'	;
    INCLUSIVE_RANGE:	'..';
    EXCLUSIVE_RANGE:	'...';

EMPTY_ARRAY		:	'[]'		{if (expectArrayAccess()) {$type=EMPTY_ARRAY_ACCESS;}};

LBRACK			:	'['		{if (expectArrayAccess()) {$type=LBRACK_ARRAY_ACCESS;}};

LCURLY_HASH		:	'{'		{if (!expectHash()) {$type=LCURLY_BLOCK;}};

//If we use "ignore=WHITE_SPACE_CAHR", can not shutdown the warnings.
fragment
PURE_LINE_BREAK
    :	LINE_FEED	(options{greedy=true;}:(LINE_FEED!|WHITE_SPACE_CAHR!))*
    ;

//'\r' is no longer used as line break since Mac OSX, but still in use in  C:\ruby\samples\hello.rb
fragment
LINE_FEED
    :	('\n'
      |	'\r'!	(options{greedy=true;}:'\n')?
      )
    ;

fragment
REGEX_MODIFIER
    :	('o'!	|	'x'!	|	'p'!	|	'n'!	|	'i'!	|	'u'!	|	'm'!	|	's'!)*
    ;

/*TODO
fragment
STRING_BETWEEN_EXPRESSION_SUBSTITUTION[char delimiter, int delimiter_count]
    :	({(delimiter_count > 0) && (delimiter_count = trackDelimiterCount(input.LA(1), delimiter, delimiter_count)) != 0&& !expressionSubstitutionIsNext()}?	STRING_CHAR)*
      {
        //match and skip delimiter, there maybe no delimiter, e.g. ':#{cmd_name}'
        if (LA(1) != EOF_CHAR)
        {
          int _saveIndex=text.length();
          match(delimiter);
          text.setLength(_saveIndex);
        }

        if (0 == delimiter_count)
        {
          $setType(STRING_AFTER_EXPRESSION_SUBSTITUTION);
        }
        else
        {
          updateCurrentSpecialStringDelimiterCount(delimiter_count);
        }
      }
    ;
*/

SPECIAL_STRING
@init
{
  int delimiter_count = 1;
}
    : 	'%'!	'q'!	delimiter1=.!
      ({(delimiter_count = trackDelimiterCount((char)input.LA(1), (char)delimiter1, delimiter_count)) != 0}?	STRING_CHAR)*
      .!//skip delimiter
      {$type=SINGLE_QUOTE_STRING;}
    |	'%'!	'Q'!	delimiter2=.!
      ({(delimiter_count = trackDelimiterCount((char)input.LA(1), (char)delimiter2, delimiter_count)) != 0 && !expressionSubstitutionIsNext()}?	STRING_CHAR)*
      {
        //match and skip delimiter
        int _saveIndex=text.length();
        match(delimiter2);
        text = text.substring(0, _saveIndex);

        if (0 == delimiter_count)
        {
          $type=DOUBLE_QUOTE_STRING;
        }
        else
        {
          $type=STRING_BEFORE_EXPRESSION_SUBSTITUTION;
          setCurrentSpecialStringDelimiter((char)delimiter2, delimiter_count);
        }
      }
    |	/*'%'!	'r'!	delimiter3=.!
      ({(delimiter_count = trackDelimiterCount((char)input.LA(1), (char)delimiter3, delimiter_count)) != 0 && !expressionSubstitutionIsNext()}?	STRING_CHAR)*
      {
        //match and skip delimiter
        _saveIndex=text.length();
        matchNot(EOF);
        text.setLength(_saveIndex);

        if (0 == delimiter_count)
        {
          mREGEX_MODIFIER();
          $type=REGEX;
        }
        else
        {
          $type=REGEX_BEFORE_EXPRESSION_SUBSTITUTION;
          setCurrentSpecialStringDelimiter((char)delimiter3, delimiter_count);
        }
      }
    |	'%'!	'x'!	delimiter4=.!
      ({(delimiter_count = trackDelimiterCount((char)input.LA(1), (char)delimiter4, delimiter_count)) != 0 && !expressionSubstitutionIsNext()}?	STRING_CHAR)*
      {
        //match and skip delimiter
        _saveIndex=text.length();
        matchNot(EOF);
        text.setLength(_saveIndex);

        if (0 == delimiter_count)
        {
          $type=COMMAND_OUTPUT;
        }
        else
        {
          $type=COMMAND_OUTPUT_BEFORE_EXPRESSION_SUBSTITUTION;
          setCurrentSpecialStringDelimiter((char)delimiter4, delimiter_count);
        }
      }
    |*/	'%'! ('w'!|'W'!)	delimiter5=.!
      ({(delimiter_count = trackDelimiterCount((char)input.LA(1), (char)delimiter5, delimiter_count)) != 0}?	STRING_CHAR)*
      .!	//skip delimiter
      {$type=W_ARRAY;}
    |	/*{!expectOperator(2)}?	'%'!
      {_saveIndex=text.length();}					//Ignore delimiter2 (for unknown reason, antlr does not do it for us, even if we specified !)
      delimiter6=~('=' | 'a'..'z' | 'A'..'Z' | '0'..'9')		//"%=" is always MOD_ASSIGN. English character is not allowed to avoid collison with %q %Q etc.
      {text.setLength(_saveIndex);}
      ({(delimiter_count = trackDelimiterCount((char)input.LA(1), (char)delimiter6, delimiter_count)) != 0 && !expressionSubstitutionIsNext()}?	STRING_CHAR)*
      {
        //match and skip delimiter
        _saveIndex=text.length();
        matchNot(EOF);
        text.setLength(_saveIndex);

        if (0 == delimiter_count)
        {
          $type=DOUBLE_QUOTE_STRING;
        }
        else
        {
          $type=STRING_BEFORE_EXPRESSION_SUBSTITUTION;
          setCurrentSpecialStringDelimiter((char)delimiter6, delimiter_count);
        }
      }*/
    ;
    
       MOD_ASSIGN:	 '%='	;
    MOD:	'%'		;

fragment
STRING_CHAR
    :	~('\r'|'\n'|'\\')
    |	LINE_FEED
    |	ESC
    ;

/*TODO
//The first '-' after "<<" is alway interpreted as heredoc's special meaning, so be greedy
HERE_DOC_BEGIN
    :	{expectHeredoc()}?	"<<"!	HERE_DOC_DELIMITER
    |	"<<="	{$setType(LEFT_SHIFT_ASSIGN);}
    |	"<<"		{$setType(LEFT_SHIFT);}
    ;

fragment
HERE_DOC_CONTENT[String delimiter, int type1, int type2]
    :	(next_line:ANYTHING_OTHER_THAN_LINE_FEED_AND_POUND	{if (expressionSubstitutionIsNext()) break;}
      LINE_FEED	{if (isDelimiter(next_line.getText(), delimiter)) break;}
      )+
      {
        if (expressionSubstitutionIsNext())
        {
          //eat '#'
          _saveIndex=text.length();
          match('#');
          text.setLength(_saveIndex);
          $setType(type1);
        }
        else
        {
          //skip delimiter
          text.setLength(text.length() - next_line.getText().length() - 1);
          $setType(type2);
        }
      }
    ;
*/

fragment
ANYTHING_OTHER_THAN_LINE_FEED_AND_POUND
    :	({!expressionSubstitutionIsNext()}?	~('\r'|'\n'))*
    ;

fragment
HERE_DOC_DELIMITER
    :	(options{greedy=true;}:'-')
        ((options{greedy=true;}:	~(' ' | '\n' | '\r' | '\'' | '"' | ',' | ')' | '=' | '.' | ';'))+
        |	'\''!	(~('\'' | '\r' | '\n'))+	'\''!
        |	'"'!	(~('"' | '\r' | '\n'))+	'"'!
        )
    ;

RDOC
    :	{getCharPositionInLine()==0}?	'=begin'
      LINE*
      {getCharPositionInLine()==0}?	'=end'
      {
        skip();
      }
    ;

fragment
ANYTHING_OTHER_THAN_LINE_FEED
    :	(~('\r'|'\n'))*
    ;

fragment
LINE
    :	ANYTHING_OTHER_THAN_LINE_FEED	LINE_FEED
    ;

//It's OK as long as the next char(whatever it is) is eaten
fragment
ESC
    :	'\\' .
    ;

fragment
IDENTIFIER_CONSTANT_AND_KEYWORD
    :	('a'..'z'|'A'..'Z'|'_')	(options{greedy=true;}:	'a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;

fragment
UNDER_SCORE
    :	'_'
    ;

fragment
FLOAT_WITH_LEADING_DOT
    :	'.'	('0'..'9')+	(EXPONENT)?
    ;

fragment
NON_ZERO_DECIMAL
    :	('1'..'9'	('0'..'9')*)
    ;

fragment
OCTAL_CONTENT
    :	('0'..'7')+
    ;

fragment
HEX_CONTENT
    :	('0'..'9'|'A'..'F'|'a'..'f')+
    ;

fragment
BINARY_CONTENT
    :	('0'|'1')+
    ;

fragment
EXPONENT
    :	('e'|'E')	('+'|'-')?	('0'..'9')+
    ;

COMMENT
    :	{!lastTokenIsColonWithNoFollowingSpace()}?	'#'	ANYTHING_OTHER_THAN_LINE_FEED
      {
        skip();
      }
    |	'#'!
      {
        $type=STRING_BEFORE_EXPRESSION_SUBSTITUTION;
        setCurrentSpecialStringDelimiter('#'/*useless*/, 0);
      }
    ;

fragment
WHITE_SPACE_CAHR
    :	' '
    |	'\t'
    |	'\f'
    |	'\13'
    ;

WHITE_SPACE
    :	(WHITE_SPACE_CAHR)+
      {
        setSeenWhitespace();
        skip();
      }
    ;

LINE_CONTINUATION
    :	'\\'	LINE_FEED	{skip();}
    ;

//Except the pysical end of file(antlr will detect it for us),
//the following special characters are treated as end of file as well.
END_OF_FILE
    :	('\u0000'		// NULL
            |'\u0004'	// ^D ('\004')
            |'\u001a'	// ^Z ('\032')
            )
            {$type=EOF;}
    ;
