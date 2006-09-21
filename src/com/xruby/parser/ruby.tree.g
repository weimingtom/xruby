header {
package com.xruby.parser;

import com.xruby.codedom.*;
}

/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

class RubyTreeParser extends TreeParser;

options {
	importVocab = Ruby;
	defaultErrorHandler = false;
}

{
	public Program parse(AST t) throws RecognitionException {
		Program p = program(t);
		if (null == p) {
			return new Program(null);
		} else {
			return p;
		}
	}

}

program
returns [Program p]
{
	p = null;
	CompoundStatement cs = null;
}
		:	(cs=compoundStatement	{p = new Program(cs);}
			)?
		;

compoundStatement
returns [CompoundStatement cs]
{
	Statement s = null;
	cs = new CompoundStatement();
}
		:	#(COMPSTMT
				(s=statement	{cs.addStatement(s);}
				)+
			)
		;

statement
returns [Statement s]
{
	Expression e = null;
	String newname = null;
	String oldname = null;
}
		:	e=expression
			{
				if (e instanceof LocalVariableExpression) {
					LocalVariableExpression var = (LocalVariableExpression)e;
					if (var.isFunction()) {
						e = new MethodCallExpression(null, var.getValue(), null, null);
					}
				}
				s = new ExpressionStatement(e);
			}
		|	#("alias"	newname=aliasParameter	oldname=aliasParameter)	{s = new AliasStatement(newname, oldname);}
		|	#("undef"	{s = new UndefStatement();}	(func:FUNCTION	{((UndefStatement)s).add(func.getText());})+)
		|	#(	PARALLEL_ASSIGN	{s = new MultipleAssignmentStatement();}
				(e=expression	{((MultipleAssignmentStatement)s).addLhs(e);})*
				(REST_ARG_PREFIX	e=expression	{((MultipleAssignmentStatement)s).setAsteriskLhs(e);})?
				(
					#(MRHS	
					(e=expression	{((MultipleAssignmentStatement)s).addRhs(e);})*
					(REST_ARG_PREFIX	e=expression	{((MultipleAssignmentStatement)s).setAsteriskRhs(e);})?
					)
				)?
			)
		;

aliasParameter
returns[String s]
		:	gvar:GLOBAL_VARIABLE 	{s = gvar.getText();}
		|	func:FUNCTION		{s = func.getText();}
		;

expression
returns [Expression e]
{
	e = null;
	Expression condition = null;
	Expression left = null;
	Expression right = null;
	MethodCallArguments args = null;
	ReturnArguments return_args = null;
	LocalVariableExpression var = null;
	Block block = null;
	CompoundStatement cs = null;
}
		:	#("and"					left=expression	right=expression)	{e = new BinaryOperatorExpression("&&", left, right);}
		|	#("or"					left=expression	right=expression)	{e = new BinaryOperatorExpression("||", left, right);}
		|	#("not"					left=expression)					{e = new UnaryOperatorExpression("!", left);}
		|	#(QUESTION				condition=expression	left=expression	right=expression)
																	{e = new IfExpression(condition, left, right);}
		|	#(ASSIGN				left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, right);}
		|	#(PLUS_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("+", left, right));}
		|	#(MINUS_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("-", left, right));}
		|	#(STAR_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("*", left, right));}
		|	#(DIV_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("/", left, right));}
		|	#(MOD_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("%", left, right));}
		|	#(POWER_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("**", left, right));}
		|	#(BAND_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("&", left, right));}
		|	#(BXOR_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("^", left, right));}
		|	#(BOR_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("|", left, right));}
		|	#(LEFT_SHIFT_ASSIGN		left=expression	right=expression)	{e =AssignmentOperatorExpression.create(left,  new BinaryOperatorExpression("<<", left, right));}
		|	#(RIGHT_SHIFT_ASSIGN	left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression(">>", left, right));}
		|	#(LOGICAL_AND_ASSIGN	left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("&&", left, right));}
		|	#(LOGICAL_OR_ASSIGN		left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("||", left, right));}
		|	#(INCLUSIVE_RANGE		left=expression	right=expression)	{e = new BinaryOperatorExpression("...", left, right);}
		|	#(EXCLUSIVE_RANGE		left=expression	right=expression)	{e = new BinaryOperatorExpression("..", left, right);}
		|	#(LOGICAL_OR			left=expression	right=expression)	{e = new BinaryOperatorExpression("||", left, right);}
		|	#(LOGICAL_AND			left=expression	right=expression)	{e = new BinaryOperatorExpression("&&", left, right);}
		|	#(COMPARE				left=expression	right=expression)	{e = new BinaryOperatorExpression("<=>", left, right);}
		|	#(EQUAL					left=expression	right=expression)	{e = new BinaryOperatorExpression("==", left, right);}
		|	#(CASE_EQUAL			left=expression	right=expression)	{e = new BinaryOperatorExpression("===", left, right);}
		|	#(NOT_EQUAL				left=expression	right=expression)	{e = new BinaryOperatorExpression("!=", left, right);}
		|	#(MATCH					left=expression	right=expression)	{e = new BinaryOperatorExpression("=~", left, right);}
		|	#(NOT_MATCH			left=expression	right=expression)	{e = new BinaryOperatorExpression("!~", left, right);}
		|	#(LESS_THAN				left=expression	right=expression)	{e = new BinaryOperatorExpression("<", left, right);}
		|	#(GREATER_THAN			left=expression	right=expression)	{e = new BinaryOperatorExpression(">", left, right);}
		|	#(LESS_OR_EQUAL			left=expression	right=expression)	{e = new BinaryOperatorExpression("<=", left, right);}
		|	#(GREATER_OR_EQUAL		left=expression	right=expression)	{e = new BinaryOperatorExpression(">=", left, right);}
		|	#(BXOR					left=expression	right=expression)	{e = new BinaryOperatorExpression("^", left, right);}
		|	#(BOR					left=expression	right=expression)	{e = new BinaryOperatorExpression("|", left, right);}
		|	#(BAND					left=expression	right=expression)	{e = new BinaryOperatorExpression("&", left, right);}
		|	#(LEFT_SHIFT			left=expression	right=expression)	{e = new BinaryOperatorExpression("<<", left, right);}
		|	#(RIGHT_SHIFT			left=expression	right=expression)	{e = new BinaryOperatorExpression(">>", left, right);}
		|	#(PLUS					left=expression	right=expression)	{e = new BinaryOperatorExpression("+", left, right);}
		|	#(MINUS					left=expression	right=expression)	{e = new BinaryOperatorExpression("-", left, right);}
		|	#(STAR					left=expression	right=expression)	{e = new BinaryOperatorExpression("*", left, right);}
		|	#(DIV					left=expression	right=expression)	{e = new BinaryOperatorExpression("/", left, right);}
		|	#(MOD					left=expression	right=expression)	{e = new BinaryOperatorExpression("%", left, right);}
		|	#(POWER					left=expression	right=expression)	{e = new BinaryOperatorExpression("**", left, right);}
		|	#(UNARY_PLUS			left=expression)					{e = new UnaryOperatorExpression("+@", left);}
		|	#(UNARY_MINUS			left=expression)					{e = new UnaryOperatorExpression("-@", left);}
		|	#(BNOT					left=expression)					{e = new UnaryOperatorExpression("~", left);}
		|	#(NOT					left=expression)					{e = new UnaryOperatorExpression("!", left);}
		|	#(DOT					left=expression	right=expression)
																	{
																		if (right instanceof MethodCallExpression) {
																			MethodCallExpression mc = (MethodCallExpression)right;
																			e = new MethodCallExpression(left, mc.getName(), mc.getArguments(), mc.getBlock());
																		} else {
																			e = new MethodCallExpression(left, ((LocalVariableExpression)right).getValue(), null, null);
																		}
																	}
		|	#(CALL					(var=variable|yield:"yield"|defined:"defined?")	(args=arguments)?	(block=codeBlock)?)
																	{
																		if (null != yield) {
																			if (null != block) {
																				throw new RecognitionException("block can not be passed into yield");
																			}
																			e = new YieldExpression(args);
																		} else if (null != defined) {
																			if (null != block) {
																				throw new RecognitionException("block can not be passed into defined?");
																			}
																			e = new DefinedExpression(args);
																		} else {
																			e = new MethodCallExpression(null, var.getValue(), args, block);
																		}
																	}
		|	#(LBRACK_ARRAY_ACCESS	left=expression	args=elements_as_arguments)	{e = new MethodCallExpression(left, "[]", args, null);}
		|	#(COLON2				left=expression	right=expression)
		|	e=primaryExpression
		|	e=methodDefination
		|	e=moduleDefination
		|	e=classDefination
		|	e=ifExpression
		|	e=whileExpression
		|	e=unlessExpression
		|	e=caseExpression
		|	e=exceptionHandlingExpression
		|	e=arrayExpression
		|	e=hashExpression
		|	e=symbol
		|	#("return"	(return_args=return_arguments)?)		{e = new ReturnExpression(return_args);}
		|	#(LPAREN	cs=compoundStatement)			{e = new ParenthesisExpression(cs);}
		;

arguments
returns [MethodCallArguments args]
{
	args = new MethodCallArguments();
	Expression e = null;
}
		:	#(ARG
			(e = expression	{args.addArgument(e);})*
			(REST_ARG_PREFIX	e = expression	{args.setAsteriskArgument(e);})?
			)
		;

return_arguments
returns [ReturnArguments args]
{
	args = new ReturnArguments();
	Expression e = null;
}
		:	#(ARG
			(e = expression	{args.addArgument(e);})*
			(REST_ARG_PREFIX	e = expression	{args.setAsteriskArgument(e);})?
			)
		;

elements_as_arguments
returns [MethodCallArguments args]
{
	args = new MethodCallArguments();
	Expression e = null;
}
		:	(e = expression	{args.addArgument(e);})*
		;

primaryExpression
returns [Expression e]
		:	integer:INTEGER							{e = new IntegerExpression(integer.getText(), 10);}
		|	hex:HEX									{e = new IntegerExpression(hex.getText(), 16);}
		|	binary:BINARY								{e = new IntegerExpression(binary.getText(), 2);}
		|	octal:OCTAL								{e = new IntegerExpression(octal.getText(), 8);}
		|	float_:FLOAT								{e = new FloatExpression(float_.getText());}
		//|	ASCII_VALUE	!!!!!!!!!!!!!!
		|	double_quote_string:DOUBLE_QUOTE_STRING	{e = new StringExpression(double_quote_string.getText(), true);}
		|	single_quote_string:SINGLE_QUOTE_STRING	{e = new StringExpression(single_quote_string.getText(), false);}
		|	command_output:COMMAND_OUTPUT			{e = new CommandOutputExpression(command_output.getText());}
		|	e=variable
		|	gvar:GLOBAL_VARIABLE 					{e = new GlobalVariableExpression(gvar.getText());}
		|	"true"									{e = new TrueExpression();}
		|	"false"									{e = new FalseExpression();}
		|	"self"									{e = new SelfExpression();}
		|	"super"									{e = new SuperExpression();}
		|	"nil"										{e = new NilExpression();}
		|	class_variable:CLASS_VARIABLE				{e = new ClassVariableExpression(class_variable.getText());}
		|	instance_variable:INSTANCE_VARIABLE		{e = new InstanceVariableExpression(instance_variable.getText());}
		;

symbol
returns [Expression e]
		:	#(SYMBOL
				(id:IDENTIFIER		{e= new SymbolExpression(id.getText());}
				|f:FUNCTION			{e= new SymbolExpression(f.getText());}
				|constant:CONSTANT	{e= new SymbolExpression(constant.getText());}
				|g:GLOBAL_VARIABLE 	{e= new SymbolExpression(g.getText());}
				|i:INSTANCE_VARIABLE	{e= new SymbolExpression(i.getText());}
				|c:CLASS_VARIABLE		{e= new SymbolExpression(c.getText());}
				|u:UNARY_PLUS_MINUS_METHOD_NAME	{e= new SymbolExpression(u.getText());}
				//FIXME add more!
				)
			)
		;

variable
returns [LocalVariableExpression e]
		:	constant:CONSTANT						{e = new LocalVariableExpression(constant.getText(), false);}
		|	id:IDENTIFIER								{e = new LocalVariableExpression(id.getText(), false);}
		|	function:FUNCTION						{e = new LocalVariableExpression(function.getText(), true);}
		|	unary:UNARY_PLUS_MINUS_METHOD_NAME	{e = new LocalVariableExpression(unary.getText(), true);}//it does not look like a good place to put -@/+@, but bad programs should have failed in parser.
		;

arrayExpression
returns [ArrayExpression e]
{
	Expression element = null;
}
		:	#(	LBRACK	{e = new ArrayExpression();}
				(element=expression	{e.addElement(element);})*
				(REST_ARG_PREFIX	element=expression	{e.setAsteriskElement(element);})?
			)
		|	EMPTY_ARRAY		{e = new ArrayExpression();}
		;

hashExpression
returns [HashExpression e]
{
	Expression key = null;
	Expression value = null;
}
		:	#(	LCURLY_HASH	{e = new HashExpression();}
				(key=expression	(ASSOC	value=expression)?	{e.addElement(key, value);value=null;})*
			)
		;

ifExpression
returns [IfExpression e]
{
	Expression condition = null;
	CompoundStatement body = null;
}
		:	#(	"if"	condition=expression	(body=compoundStatement)?			{e = new IfExpression(condition, body);}
				("elsif"	(condition=expression)?	(body=compoundStatement)?	{e.addElsif(condition, body);condition=null;body=null;})*
				("else"	(body=compoundStatement)?							{e.addElse(body);})?
			)
		;

whileExpression
returns [WhileExpression e]
{
	Expression condition = null;
	CompoundStatement body = null;
}
		:	#(	"while"	condition=expression	(body=compoundStatement)?			{e = new WhileExpression(condition, body, false);}
			)
		|	#(	"until"	condition=expression	(body=compoundStatement)?			{e = new WhileExpression(condition, body, true);}
			)
		;

unlessExpression
returns [UnlessExpression e]
{
	Expression condition = null;
	CompoundStatement body = null;
	CompoundStatement else_body = null;
}
		:	#(	"unless"	condition=expression	(body=compoundStatement)?
				("else"	(else_body=compoundStatement)?)?
				{e = new UnlessExpression(condition, body, else_body);}
			)
		;

caseExpression
returns [CaseExpression e]
{
	Expression condition = null;
	CompoundStatement body = null;
}		:	#(	"case"	(condition=expression)?	{e=null;}		{e = new CaseExpression(condition);}
				("when"	#(MRHS	condition=expression)
				(body=compoundStatement)?	{e.addWhen(condition, body);condition=null;body=null;}
				)*
				("else"	(body=compoundStatement)?							{e.addElse(body);})?
			)
		;

exceptionHandlingExpression
returns [ExceptionHandlingExpression e]
{
	String name = null;
	BodyStatement body = null;
}
		:	#("begin"
			(body=bodyStatement)?
			)
			{
				e = new ExceptionHandlingExpression(body);
			}
		;

classDefination
returns [ClassDefinationExpression e]
{
	String name = null;
	String superClassName = "Object";
	BodyStatement body = null;
}
		:	#("class"
			name=className
			(LESS_THAN	superClassName=className)?
			(body=bodyStatement)?
			)
			{
				e = new ClassDefinationExpression(name, superClassName, body);
			}
		;

moduleDefination
returns [ModuleDefinationExpression e]
{
	String name = null;
	BodyStatement body = null;
}
		:	#("module"
			name=moduleName
			(body=bodyStatement)?
			)
			{
				e = new ModuleDefinationExpression(name, body);
			}
		;

methodDefination
returns [MethodDefinationExpression e]
{
	String name = null;
	BodyStatement body = null;
	Expression default_value = null;
}
		:	#("def"
				name=methodName	{e = new MethodDefinationExpression(name);}
				(	(id:IDENTIFIER|func:FUNCTION)
					((ASSIGN|ASSIGN_WITH_NO_LEADING_SPACE)	default_value=expression)?
					{e.addParameter((null != id) ? id.getText() : func.getText(), default_value);}
				)*
				(
					REST_ARG_PREFIX	(id2:IDENTIFIER|func2:FUNCTION)
					{e.setAsteriskParameter((null != id2) ? id2.getText() : func2.getText());}
				)?
				(body=bodyStatement {e.setBody(body);})?
			)
		;

codeBlock
returns [Block b]
{
		CompoundStatement cs = null;
}
		:	#(	BLOCK					{b = new Block();}
				((id:IDENTIFIER|func:FUNCTION)
					{b.addParameter((null != id) ? id.getText() : func.getText());}
				)*
				(
					REST_ARG_PREFIX	(id2:IDENTIFIER|func2:FUNCTION)
					{b.setAsteriskParameter((null != id2) ? id2.getText() : func2.getText());}
				)?
				(cs=compoundStatement	{b.setBody(cs);})?
			)
		;


className
returns [String s]
		:	id:IDENTIFIER			{s = id.getText();}
		|	function:FUNCTION		{s = function.getText();}
		|	constant:CONSTANT	{s = constant.getText();}
		;

moduleName
returns [String s]
		:	id:IDENTIFIER			{s = id.getText();}
		|	function:FUNCTION		{s = function.getText();}
		|	constant:CONSTANT	{s = constant.getText();}
		;

methodName
returns [String s]
		:	id:IDENTIFIER			{s = id.getText();}
		|	function:FUNCTION		{s = function.getText();}
		|	constant:CONSTANT	{s = constant.getText();}
		|	LEFT_SHIFT			{s = "<<";}
		|	RIGHT_SHIFT			{s = ">>";}
		|	EQUAL				{s = "==";}
		|	CASE_EQUAL			{s = "===";}
		|	GREATER_THAN		{s = ">";}
		|	GREATER_OR_EQUAL	{s = ">=";}
		|	LESS_THAN			{s = "<";}
		|	LESS_OR_EQUAL		{s = "<=";}
		|	PLUS				{s = "+";}
		|	MINUS				{s = "-";}
		|	STAR				{s = "_";}
		|	DIV					{s = "/";}
		|	MOD					{s = "%";}
		|	POWER				{s = "**";}
		|	BAND				{s = "&";}
		|	BOR					{s = "|";}
		|	BXOR				{s = "^";}
		|	(EMPTY_ARRAY	|EMPTY_ARRAY_ACCESS)	(options{greedy=true;}:ASSIGN_WITH_NO_LEADING_SPACE)?	{s = "[]=";}
		|	MATCH				{s = "=~";}
		|	COMPARE			{s = "<=>";}
		|	BNOT				{s = "!";}
		|	SINGLE_QUOTE		{s = "`";}
		|	"and"				{s = "and";}
		|	"def"				{s = "def";}
		|	"end"				{s = "end";}
		|	"in"					{s = "in";}
		|	"or"					{s = "or";}
		|	"unless"				{s = "unless";}
		|	"begin"				{s = "begin";}
		|	"defined?"			{s = "defined?";}
		|	"ensure"				{s = "ensure";}
		|	"module"				{s = "module";}
		|	"redo"				{s = "redo";}
		|	"super"				{s = "super";}
		|	"until"				{s = "until";}
		|	"BEGIN"				{s = "BEGIN";}
		|	"break"				{s = "break";}
		|	"do"					{s = "do";}
		|	"next"				{s = "next";}
		|	"rescue"				{s = "rescue";}
		|	"then"				{s = "then";}
		|	"when"				{s = "when";}
		|	"END"				{s = "END";}
		|	"case"				{s = "case";}
		|	"else"				{s = "else";}
		|	"for"					{s = "for";}
		|	"retry"				{s = "retry";}
		|	"while"				{s = "while";}
		|	"alias"				{s = "alias";}
		|	"class"				{s = "class";}
		|	"elsif"				{s = "elsif";}
		|	"if"					{s = "if";}
		|	"not"				{s = "not";}
		|	"return"				{s = "return";}
		|	"undef"				{s = "undef";}
		|	"yield"				{s = "yield";}
		;

bodyStatement
returns [BodyStatement bs]
{
	ExceptionList el;
	CompoundStatement cs = null;
}
		:	#(	BODY
				(cs=compoundStatement)?			{bs = new BodyStatement(cs);cs=null;}
				("rescue" el=exceptionList	(cs=compoundStatement	{bs.addRescue(el, cs);cs=null;})?)*
				("else" 	(cs=compoundStatement	{bs.addElse(cs);cs=null;})?)?
				("ensure"	(cs=compoundStatement	{bs.addEnsure(cs);})?)?
			)
		;

//TODO
exceptionList
returns [ExceptionList el]
{
	LocalVariableExpression v;
}
		:	{el = new ExceptionList();}
			(v=variable	{el.addArgument(v);})*
			(ASSOC	v=variable	{el.addExceptionVariable(v);})?
		;
