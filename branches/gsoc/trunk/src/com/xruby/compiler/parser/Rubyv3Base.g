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
	INCLUSIVE_RANGE;
	EXCLUSIVE_RANGE;
	BLOCK_ARG_PREFIX;
	LEFT_SHIFT;
	UNARY_PLUS;
	UNARY_MINUS;
	DOT;
	LEADING_COLON2;
	LBRACK_ARRAY_ACCESS;
	EMPTY_ARRAY_ACCESS;
	UNARY_PLUS;
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
	FLOAT;
	ASCII_VALUE;
	LEADING_COLON2;
	SINGLE_QUOTE;
	DO_IN_CONDITION;
	
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

	protected boolean expectOperator(int k)		{assert(false);return false;}
	protected boolean expectUnary()			{assert(false);return false;}
	protected boolean expectHash()					{assert(false);return false;}
	protected boolean expectHeredoc()				{assert(false);return false;}
	protected boolean expectLeadingColon2()		{assert(false);return false;}
	protected boolean expectArrayAccess()				{assert(false);return false;}
	protected boolean lastTokenIsDotOrColon2()		{assert(false);return false;}
	protected boolean lastTokenIsSemi()				{assert(false);return false;}
	protected boolean lastTokenIsKeywordDefOrColonWithNoFollowingSpace()			{assert(false);return false;}
	protected boolean lastTokenIsColonWithNoFollowingSpace()			{assert(false);return false;}
	protected boolean shouldIgnoreLinebreak()			{assert(false);return false;}
	protected int trackDelimiterCount(char next_char, char delimeter, int delimeter_count)	{assert(false);return 0;}
	protected boolean isDelimiter(String next_line, String delimiter)	{assert(false);return false;}
	protected boolean isAsciiValueTerminator(char value)	{assert(false);return false;}
	protected boolean justSeenWhitespace()	{assert(false);return false;}
	protected void setSeenWhitespace()			{assert(false);}
	protected boolean expressionSubstitutionIsNext()	{assert(false);;return false;}
	protected boolean spaceIsNext()	{assert(false);return false;}
	protected void setCurrentSpecialStringDelimiter(char delimiter, int delimiter_count)	{assert(false);}
	protected void updateCurrentSpecialStringDelimiterCount(int delimiter_count)	{assert(false);}
}

program	:	compoundStatement? EOF	
		;
		
compoundStatement

		:	terminal	statements  
		|	statements
		;

statements
		:	statement ( terminal statement )*
		;

terminal
		:	SEMI
		|	LINE_BREAK
		;
		
statement
		:	statementWithoutModifier (IF_MODIFIER|UNLESS_MODIFIER|WHILE_MODIFIER|UNTIL_MODIFIER|RESCUE_MODIFIER) (LINE_BREAK)* expression
		;
		
fragment
statementWithoutModifier
		:		aliasStatement
			|	undefStatement
			|	keyword_BEGIN 	LCURLY_BLOCK compoundStatement? RCURLY	
			|	keyword_END 	LCURLY_BLOCK compoundStatement? RCURLY	
			|	expression
			
			
		;
		
mrhs
		:	(expression	COMMA expression
			|	REST_ARG_PREFIX	expression
			)
		
		;
		
fragment
lparen
		:	LPAREN_WITH_NO_LEADING_SPACE
		|	LPAREN
		;
		
		
fragment
undef_parameter
		:	IDENTIFIER	ASSIGN_WITH_NO_LEADING_SPACE?
		|	CONSTANT	ASSIGN_WITH_NO_LEADING_SPACE?
		|	FUNCTION	ASSIGN_WITH_NO_LEADING_SPACE?
		|	symbol
		|	keywordAsMethodName
		|	operatorAsMethodname
		;

undefStatement
		:	'undef'	(options{greedy=true;}:LINE_BREAK)?
			undef_parameter	(COMMA	undef_parameter)*
		;

aliasStatement
		:	'alias'	(options{greedy=true;}:LINE_BREAK)?
			(GLOBAL_VARIABLE 	(LINE_BREAK)?	GLOBAL_VARIABLE 
			|undef_parameter	(LINE_BREAK)?	undef_parameter
			)
		;

/*		
codeBlock
		:	('do'	(options{greedy=true;}:LINE_BREAK!)?		{enterBlockScope();}
				blockContent
				'end'			{leaveScope();}
			|	LCURLY_BLOCK!	{enterBlockScope();}
				blockContent
				RCURLY!			{leaveScope();}
			)
			
		;
*/		
//TODO should be mlhs
block_vars
@init
{
	boolean has_extra_comma = false;
}
		:		
REST_ARG_PREFIX	(dotColonOrArrayAccess)?


		;

fragment
blockContent
		:	(BOR	(block_vars)?	BOR!
			|LOGICAL_OR
			)?	(compoundStatement)?
		
		;
symbol
		:	COLON_WITH_NO_FOLLOWING_SPACE
					(IDENTIFIER	(options{greedy=true;}:ASSIGN_WITH_NO_LEADING_SPACE)?
					|FUNCTION	(options{greedy=true;}:ASSIGN_WITH_NO_LEADING_SPACE)?
					|CONSTANT	(options{greedy=true;}:ASSIGN_WITH_NO_LEADING_SPACE)?
					|GLOBAL_VARIABLE 
					|INSTANCE_VARIABLE
					|CLASS_VARIABLE
					|UNARY_PLUS_MINUS_METHOD_NAME
					|operatorAsMethodname
					|keyword
					|string)
			{tellLexerWeHaveFinishedParsingSymbol();}

		;



		
keyword
		:	keywordAsMethodName
		|	'nil'
		|	'self'
		|	'true'
		|	'false'
		|	'__FILE__'
		|	'__LINE__'
		;
operatorAsMethodname
		:	LEFT_SHIFT
		|	RIGHT_SHIFT
		|	EQUAL
		|	CASE_EQUAL
		|	GREATER_THAN
		|	GREATER_OR_EQUAL
		|	LESS_THAN
		|	LESS_OR_EQUAL
		|	PLUS
		|	MINUS
		|	STAR
		|	DIV
		|	MOD
		|	POWER
		|	BAND
		|	BOR
		|	BXOR
		|	(EMPTY_ARRAY	|EMPTY_ARRAY_ACCESS)	(options{greedy=true;}:ASSIGN_WITH_NO_LEADING_SPACE)?
		|	MATCH
		|	COMPARE
		|	BNOT
		|	SINGLE_QUOTE
		;

keywordAsMethodName
		:	'and'
		|	'def'
		|	'end'
		|	'in'
		|	'or'
		|	'unless'
		|	'begin'
		|	'defined?'
		|	'ensure'
		|	'module'
		|	'redo'
		|	'super'
		|	'until'
		|	'BEGIN'
		|	'break'
		|	'do'
		|	'next'
		|	'rescue'
		|	'then'
		|	'when'
		|	'END'
		|	'case'
		|	'else'
		|	'for'
		|	'retry'
		|	'while'
		|	'alias'
		|	'class'
		|	'elsif'
		|	'if'
		|	'not'
		|	'return'
		|	'undef'
		|	'yield'
		;
expression  : andorExpression
			;
			
//and or
andorExpression
		:	notExpression
			(options{greedy=true;/*caused by command*/}:
				(	'and'		(options{greedy=true;}:LINE_BREAK!)?
				|	'or'		(options{greedy=true;}:LINE_BREAK!)?
				)
				notExpression
			)*
		;
		
//not
notExpression
		:	'not'
			(options{greedy=true;}:LINE_BREAK!)?
			notExpression
		|	ternaryIfThenElseExpression
		;
		
ternaryIfThenElseExpression
		:	assignmentExpression
			(options{greedy=true;/*caused by command*/}:
				QUESTION			(options{greedy=true;}:LINE_BREAK!)?
				ternaryIfThenElseExpression
				(COLON!|COLON_WITH_NO_FOLLOWING_SPACE!)				(options{greedy=true;}:LINE_BREAK!)?
				ternaryIfThenElseExpression
			)?
		;
		
//= += -= *= /= %= **= &= ^= |= <<= >>= &&= ||=
assignmentExpression
		:	rangeExpression
			(options{greedy=true;/*caused by command*/}:
			//{REST_ARG_PREFIX != LA(2)}?
				(	ASSIGN^				(options{greedy=true;}:LINE_BREAK!)?
				//|	a=ASSIGN_WITH_NO_LEADING_SPACE^	{{#a.setType(ASSIGN);}}	(options{greedy=true;}:LINE_BREAK!)?
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
@init
{
	boolean seen_arguments = false;
	boolean seen_block = false;
	boolean is_function = false;
}
		:	dotColonOrArrayAccess	


		|	('return'|'break'|'next')	//(options{greedy=true;/*caused by command*/}:methodInvocationArgumentWithoutParen[false])?
		;
		
dotColonOrArrayAccess
		:	unaryExpression
			(options{greedy=true;/*caused by command*/}:
				(DOT^		methodCall
				|COLON2^	methodCall
				|LBRACK_ARRAY_ACCESS^
					(arrayReferenceArgument)?
					RBRACK!
				|EMPTY_ARRAY_ACCESS
				)
				{can_be_command_ = 1;}
			)*
		;

//-(unary)  +(unary)
unaryExpression
		:	(	UNARY_PLUS^	(options{greedy=true;}:LINE_BREAK!)?
			|	UNARY_MINUS^	(options{greedy=true;}:LINE_BREAK!)?
			)*
			(methodCall
			|primaryExpressionThatCanNotBeMethodName	{can_be_command_ = 0;}
			)
		;
		
methodCall
@init
{
	can_be_command_ = 1;
	boolean seen_arguments = false;
	boolean seen_block = false;
	boolean is_function = false;
}
		:	primaryExpressionThatCanBeMethodName

		;
		
//cruby can accept LPAREN in some situation but gives a warning:
//"don't put space before argument parentheses"
methodInvocationArgumentWithParen
@init
{
//super and super() are different, the former takes implicit parameters from the calling method
boolean has_arg = false;
}
		:	LPAREN_WITH_NO_LEADING_SPACE!
				(methodInvocationArgumentWithoutParen[true]	{has_arg = true;})?
				(LINE_BREAK!)?
			RPAREN!
	
		;
		
methodInvocationArgumentWithoutParen[boolean should_ignore_line_break]
@init
{
boolean seen_star_or_band = false;
}
		:	(normalMethodInvocationArgument[should_ignore_line_break]
			(options{greedy=true;/*caused by command*/}:
				COMMA!	
				normalMethodInvocationArgument[should_ignore_line_break]
			)*
			({seen_star_or_band}?	restMethodInvocationArgument
			|{seen_star_or_band}?	blockMethodInvocationArgument
			)?
			|	restMethodInvocationArgument
			|	blockMethodInvocationArgument
			)
		;

normalMethodInvocationArgument[boolean should_ignore_line_break]
		:	expression	(options{greedy=true;/*caused by command*/}:ASSOC^	expression)?	({should_ignore_line_break}?	LINE_BREAK!)?
		;
		
restMethodInvocationArgument
		:	REST_ARG_PREFIX	expression	(options{greedy=true;/*caused by command*/}:COMMA!	blockMethodInvocationArgument)?
		;

blockMethodInvocationArgument
		:	BLOCK_ARG_PREFIX	expression
		;

predefinedValue
		:	'nil'
		|	'true'
		|	'false'
		|	'__FILE__'
		|	'__LINE__'
		;
		
string
		:	DOUBLE_QUOTE_STRING
		|	SINGLE_QUOTE_STRING
		;
		
regex
		:	REGEX
		
		;
		
command_output
		:	COMMAND_OUTPUT
		;
		
literal
		:	regex
		//|	(options{greedy=true;/*caused by command*/}:string)+{ #literal = #([STRING, "STRING"], #literal); }
		//|	heredoc
		|	command_output
		|	symbol
		|	W_ARRAY
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
		:	FUNCTION	{can_be_command_ = 2;}
		|	IDENTIFIER		//this is OK: p = 1; p 1
		|	'self'
		|	'super'		{can_be_command_ = 2;}
		|	CONSTANT
		|	LEADING_COLON2	CONSTANT
		|	'retry'
		|	'yield'		{can_be_command_ = 2;}
		|	keyword_defined
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
		|	literal
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
		|	methodDefination
		;
		
primaryExpression
		:	primaryExpressionThatCanNotBeMethodName
		|	primaryExpressionThatCanBeMethodName	
		;
		
arrayReferenceArgument
		:	keyValuePair
			
		|	REST_ARG_PREFIX	expression	(LINE_BREAK!)?
		;
		
arrayExpression
		:	LBRACK^
				(arrayReferenceArgument)?
			RBRACK!
		;
		
keyValuePair
		:	expression	(ASSOC	expression)?	(LINE_BREAK!)?
		;
		
hashExpression
		:	LCURLY_HASH^
				(
					keyValuePair
					(COMMA!	keyValuePair)*
					(COMMA!)?
				)?
			RCURLY!
		;
		
bodyStatement
			:	(compoundStatement
				('rescue' exceptionList thenOrTermialOrColon (compoundStatement)?)*
				('else' (compoundStatement)?)?
				('ensure' (compoundStatement)?)?
			|	('rescue' exceptionList thenOrTermialOrColon (compoundStatement)?)+
				('else' (compoundStatement)?)?
				('ensure' (compoundStatement)?)?
			|	('ensure' (compoundStatement)?)
			)
			
		;
		
exceptionHandlingExpression
		:	'begin'^
			(bodyStatement)?
			'end'!
		;
		
exceptionList
		:	((className|INSTANCE_VARIABLE|IDENTIFIER)	(COMMA!	(className|INSTANCE_VARIABLE|IDENTIFIER))*)?	(ASSOC	variable)?
		|	GLOBAL_VARIABLE
		;
		
ifExpression
		:	'if'^		(LINE_BREAK!)?
			expression thenOrTermialOrColon (compoundStatement)?
			('elsif' (expression)? thenOrTermialOrColon (compoundStatement)?)*
			('else' (compoundStatement)?)?
			'end'!
		;
		
unlessExpression
		:	'unless'^		(LINE_BREAK!)?
			expression thenOrTermialOrColon (compoundStatement)?
			('else' (compoundStatement)?)?
			'end'!
		;
		
caseExpression
		:	'case'^ (expression)? thenOrTermialOrColon		//(compoundStatement)?
			(keyword_when mrhs	thenOrTermialOrColon (compoundStatement)?)+
			('else' (compoundStatement)?)?
			'end'!
		;
		
forExpression
		:	'for'^	(LINE_BREAK!)?
			block_vars
			'in'		(LINE_BREAK!)?
			expression doOrTermialOrColon
			(compoundStatement)?
			'end'!
		;
		
whileExpression
		:	'while'^	(LINE_BREAK!)?
			expression doOrTermialOrColon
			(compoundStatement)?
			'end'!
		;


untilExpression
		:	'until'^	(LINE_BREAK!)?
			expression doOrTermialOrColon
			(compoundStatement)?
			'end'!
		;
		
moduleDefination
		:	'module'^	(LINE_BREAK!)?
			moduleName 
			(bodyStatement)?
			'end'!			{leaveScope();}
		;
		
moduleName
		:	CONSTANT	(COLON2^ CONSTANT)*
		| 	(LEADING_COLON2	CONSTANT)	(COLON2^ CONSTANT)*
		;

classDefination
		:	'class'^	(LINE_BREAK!)?
			(	className	(LESS_THAN expression)?
			|	LEFT_SHIFT	expression
			)
			terminal			{enterScope();}
			(bodyStatement)?
			'end'!			{leaveScope();}
		;
		
	
className
		:	(CONSTANT|FUNCTION)	(COLON2^	CONSTANT)*
		|	(LEADING_COLON2	CONSTANT)	(COLON2^	CONSTANT)*
		;

methodDefination
		:	'def'^		{++is_in_method_defination;}		
			(options{greedy=true;}:LINE_BREAK!)?
			methodName	{enterScope();}
			methodDefinationArgument
			(bodyStatement)?
			'end'!		{leaveScope();--is_in_method_defination;}
		;
		
fragment
methodNameSupplement
		:	(DOT|COLON2)
			(IDENTIFIER	(ASSIGN_WITH_NO_LEADING_SPACE)?
			|FUNCTION	(ASSIGN_WITH_NO_LEADING_SPACE)?
			|CONSTANT	(ASSIGN_WITH_NO_LEADING_SPACE)?
			|operatorAsMethodname
			|keyword
			)
		;
		
methodName
@init
{boolean is_singleton_method = false;}
		:	(	operatorAsMethodname
			|	keywordAsMethodName
			|	(id=IDENTIFIER
				|function=FUNCTION	
				|constant=CONSTANT	
				)
				(methodNameSupplement{is_singleton_method = true;}|ASSIGN_WITH_NO_LEADING_SPACE)?
			|	(LPAREN|LPAREN_WITH_NO_LEADING_SPACE)
				expression	(LINE_BREAK!)?
				RPAREN
				methodNameSupplement{is_singleton_method = true;}
			|	(INSTANCE_VARIABLE|CLASS_VARIABLE|GLOBAL_VARIABLE )	methodNameSupplement	{is_singleton_method = true;}
			|	('nil'|'self'|'true'|'false'|'__FILE__'|'__LINE__')	methodNameSupplement	{is_singleton_method = true;}
			|	UNARY_PLUS_MINUS_METHOD_NAME
			)

		;
		
methodDefinationArgument
		:	lparen
				(methodDefinationArgumentWithoutParen)?
			RPAREN!	
			
		|	(methodDefinationArgumentWithoutParen)?	terminal
		;
		
methodDefinationArgumentWithoutParen
@init
{boolean seen_star_or_band = false;}
		:	normalMethodDefinationArgument

		|	restMethodDefinationArgument
		|	blockMethodDefinationArgument
		;
		
normalMethodDefinationArgument
		:	variable	((ASSIGN|ASSIGN_WITH_NO_LEADING_SPACE)	expression)?
		;

variable
		:	id1=IDENTIFIER	{addVariable(id1);}
		|	id2=FUNCTION		{addVariable(id2);}
		;
		
restMethodDefinationArgument
		:	REST_ARG_PREFIX	(variable	(COMMA!	blockMethodDefinationArgument)?)?
		;

blockMethodDefinationArgument
		:	BLOCK_ARG_PREFIX	variable
		;


thenOrTermialOrColon
		:	'then'!
		|	terminal	('then'!)?
		|	COLON!
		;
		
doOrTermialOrColon
		:	DO_IN_CONDITION!
		|	terminal
		|	COLON!
		;

operator_ASSIGN				:	(ASSIGN|ASSIGN_WITH_NO_LEADING_SPACE)				(options{greedy=true;}:LINE_BREAK!)?;
//LINE_BREAK is preserved after keyword, we have to do that because keyword can be used as function name.
//for example:
//  def class
//        Registry
//      end
//So the following rules are created so that we do not hve to put (LINE_BREAK)? everywhere.
//
keyword_BEGIN	:	'BEGIN'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_END		:	'END'		(options{greedy=true;}:LINE_BREAK!)?;
keyword___FILE__	:	'__FILE__'	(options{greedy=true;}:LINE_BREAK!)?;
keyword___LINE__	:	'__LINE__'	(options{greedy=true;}:LINE_BREAK!)?;
//keyword_alias		:	'alias'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_and		:	'and'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_begin	:	'begin'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_break	:	'break'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_case		:	'case'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_class	:	'class'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_def		:	'def'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_defined	:	'defined?'	(options{greedy=true;}:LINE_BREAK!)?;
keyword_do		:	'do'			(options{greedy=true;}:LINE_BREAK!)?;
keyword_else		:	'else'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_elsif		:	'elsif'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_end		:	'end'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_ensure	:	'ensure'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_false		:	'false'		(options{greedy=true;}:LINE_BREAK!)?;
//keyword_for	:	'for'			(options{greedy=true;}:LINE_BREAK!)?;
//keyword_if		:	'if'			(options{greedy=true;}:LINE_BREAK!)?;
//keyword_in		:	'in'			(options{greedy=true;}:LINE_BREAK!)?;
keyword_module	:	'module'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_next		:	'next'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_nil		:	'nil'			(options{greedy=true;}:LINE_BREAK!)?;
keyword_not		:	'not'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_or		:	'or'			(options{greedy=true;}:LINE_BREAK!)?;
keyword_redo		:	'redo'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_rescue	:	'rescue'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_retry	:	'retry'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_return	:	'return'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_self		:	'self'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_super	:	'super'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_then		:	'then'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_true		:	'true'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_undef	:	'undef'		(options{greedy=true;}:LINE_BREAK!)?;
//keyword_unless	:	'unless'		(options{greedy=true;}:LINE_BREAK!)?;
//keyword_until	:	'until'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_when	:	'when'		(options{greedy=true;}:LINE_BREAK!)?;
//keyword_while	:	'while'		(options{greedy=true;}:LINE_BREAK!)?;
keyword_yield		:	'yield'		(options{greedy=true;}:LINE_BREAK!)?;

SEMI	:	';'		;

LINE_BREAK	:	'\r'? '\n'	;
			
IF_MODIFIER	:	'if'	;
			
UNLESS_MODIFIER	:	'unless'	;
				
WHILE_MODIFIER	:	'while'		;
				
UNTIL_MODIFIER	:	'until'		;
				
RESCUE_MODIFIER	:	'rescue'	;

LITERAL_undef	:	'undef'		;

LITERAL_alias	:	'alias'		;

LITERAL_do	: 	'do'		;

LITERAL_end	:	'end'		;

LITERAL_and	:	'and'		;

LITERAL_or	:	'or'		;

LITERAL_not	:	'not'		;

LITERAL_return	:	'return'	;

LITERAL_break	:	'break'		;

LITERAL_next	:	'next'		;

LITERAL_nil	:	'nil'		;

LITERAL_true	:	'true'		;

LITERAL_false	:	'false'		;

LITERAL_self	:	'self'		;

LITERAL_super	:	'super'		;

LITERAL_retry	:	'retry'		;

LITERAL_yield	:	'yield'		;

LITERAL_redo	:	'redo'		;

//LITERAL_rescue	:	'rescue'		;

LITERAL_else	:	'else'		;

LITERAL_ensure	:	'ensure'		;

LITERAL_begin	:	'begin'		;

//LITERAL_if		:	'if'		;

LITERAL_elsif	:	'elsif'		;

//LITERAL_unless	:	'unless'	;

LITERAL_case	:	'case'		;

LITERAL_for	:	'for'		;

LITERAL_in	:	'in'		;

//LITERAL_while	:	'while'		;

//LITERAL_until	:	'until'		;

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
		:	{!expectOperator(2)}?
			(delimiter='/')!
			({input.LA(1) != delimiter}? =>	STRING_CHAR)*
			(end='/')!//skip delimiter
			//{
			//	if (end != delimiter)
			//	{
			//		$type=REGEX_BEFORE_EXPRESSION_SUBSTITUTION;
			//		setCurrentSpecialStringDelimiter((char)delimiter, 1);
			//	}
			//	else
			//	{
			//		mREGEX_MODIFIER();//(false);
			//	}
			//}
		|	'/='	{$type=DIV_ASSIGN;}
		|	'/'	{$type=DIV;}
		;
		
COMMAND_OUTPUT
		:	{!lastTokenIsKeywordDefOrColonWithNoFollowingSpace()}?
			delimiter='`'!
			({input.LA(1) != delimiter && !expressionSubstitutionIsNext()}? =>	STRING_CHAR)*
			end=.!//skip delimiter
			{
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
		|	'<<='	{$type=LEFT_SHIFT_ASSIGN;}
		|	'<<'		{$type=LEFT_SHIFT;}
		;

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
		:	'0'!	OCTAL_CONTENT			{$type=OCTAL;}
		|	'0'!	('b'!|'B'!)	BINARY_CONTENT	{$type=BINARY;}
		|	'0'!	('x'!|'X'!)	HEX_CONTENT	{$type=HEX;}
		|	'0'	(
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
		|	FLOAT_WITH_LEADING_DOT	{$type=FLOAT;}
		|	'.'	{$type=DOT;}
		|	'..'	{$type=INCLUSIVE_RANGE;}
		|	'...'	{$type=EXCLUSIVE_RANGE;}
		|	'?'	(
					{isAsciiValueTerminator((char)input.LA(2))}?	(~('\\'|' '|'\n'|'\r'))	{$type=ASCII_VALUE;}
					|'\\'		~('C' | 'M')	{$type=ASCII_VALUE;}
					|('\\'	('C'|'M') '-')+	('a'..'z' | '?')	{$type=ASCII_VALUE;}
					|{$type=QUESTION;}	//If it does not "look like"(not depend on context!) integer, then it is QUESTION operator.
				)
		;

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
	
SPECIAL_STRING
@init
{
	int delimiter_count = 1;
}
		: 	'%'!	'q'!	delimiter1=.!
			({(delimiter_count = trackDelimiterCount((char)input.LA(1), (char)delimiter1, delimiter_count)) != 0}?	STRING_CHAR)*
			.!//skip delimiter
			{$type=SINGLE_QUOTE_STRING;}
		|	/*'%'!	'Q'!	delimiter2=.!
			({(delimiter_count = trackDelimiterCount((char)input.LA(1), (char)delimiter2, delimiter_count)) != 0 && !expressionSubstitutionIsNext()}?	STRING_CHAR)*
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
					setCurrentSpecialStringDelimiter((char)delimiter2, delimiter_count);
				}
			}
		|	'%'!	'r'!	delimiter3=.!
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
			}
		|	*/ '%='	{$type=MOD_ASSIGN;}
		|	'%'		{$type=MOD;}
		;

fragment
STRING_CHAR
		:	~('\r'|'\n'|'\\')
		|	LINE_FEED
		|	ESC
		;
		
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
		:	('\0'		// NULL
      			|'\004'	// ^D
      			|'\032'	// ^Z
      			)
      			{$type=Token.EOF;}
		;
