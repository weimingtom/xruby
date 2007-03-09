header {
package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.*;
}

/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

class RubyTreeParser extends TreeParser;

options {
	importVocab = Ruby;
	defaultErrorHandler = false;
}

{
	private String filename_ = null;

	public Program parse(AST t, String filename) throws RecognitionException {
		filename_ = filename;

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
		:	s=expressionStatement
		|	s=alias
		|	s=undef
		|	s=multipleAssignment
		;

expressionStatement
returns[ExpressionStatement s]
{
	Expression e = null;
}
		:	e=expression
			{
				s = new ExpressionStatement(e);
			}
		;

alias
returns[AliasStatement s]
{
	String newname = null;
	String oldname = null;
}
		:	#("alias"	newname=aliasParameter	oldname=aliasParameter)	{s = new AliasStatement(newname, oldname);}
		;

aliasParameter
returns[String s]
{SymbolExpression sym = null;}
		:	gvar:GLOBAL_VARIABLE {s = gvar.getText();}
		|	func:FUNCTION		{s = func.getText();}
		|	sym=symbol			{s = sym.getValue();}
		|	s=operator
		;
		
undef
returns[UndefStatement s]
{String name = null;}
		:	#("undef"	{s = new UndefStatement();}	(name=undefParameter	{s.add(name);})+)
		;

undefParameter
returns[String s]
{SymbolExpression sym = null;}
		:	func:FUNCTION		{s = func.getText();}
		|	id:IDENTIFIER			{s = id.getText();}
		|	sym=symbol			{s = sym.getValue();}
		;

multipleAssignment
returns[MultipleAssignmentStatement s]
{
	Expression e = null;
}
		:	#(	MULTIPLE_ASSIGN	{s = new MultipleAssignmentStatement(false);}
				multipleAssignmentBody[s]
			)
		|	#(	MULTIPLE_ASSIGN_WITH_EXTRA_COMMA	{s = new MultipleAssignmentStatement(true);}
				multipleAssignmentBody[s]
			)
		;

protected
multipleAssignmentBody[MultipleAssignmentStatement s]
{
	Expression e = null;
}
		:	(e=lhs	{s.addLhs(e);})*
			(REST_ARG_PREFIX	{e=null;}	(e=expression	{s.setAsteriskLhs(e);})?  {if(null!=e) s.setHasExtraComma();})?
			(
				#(MRHS
				(e=expression	{s.addRhs(e);})*
				(REST_ARG_PREFIX	e=expression	{s.setAsteriskRhs(e);})?
				)
			)?
		;

lhs
returns[Expression e]
		:	e=expression
		|	e=nestedLhs
		;

nestedLhs
returns[NestedVariableExpression e]
{
	Expression exp = null;
}
		:	#(	NESTED_LHS			{e = new NestedVariableExpression();}
				(exp=expression		{e.addLhs(exp);})*
				(REST_ARG_PREFIX	exp=expression	{e.setAsteriskLhs(exp);})?
			)
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
	CompoundStatement cs = null;
	String method_name = null;
}
		:	#("and"					left=expression	right=expression)	{e = new AndOrBinaryOperatorExpression("&&", left, right);}
		|	#("or"					left=expression	right=expression)	{e = new AndOrBinaryOperatorExpression("||", left, right);}
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
		|	#(LOGICAL_AND_ASSIGN	left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new AndOrBinaryOperatorExpression("&&", left, right));}
		|	#(LOGICAL_OR_ASSIGN		left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new AndOrBinaryOperatorExpression("||", left, right));}
		|	#(INCLUSIVE_RANGE		left=expression	right=expression)	{e = new RangeOperatorExpression("..", left, right);}
		|	#(EXCLUSIVE_RANGE		left=expression	right=expression)	{e = new RangeOperatorExpression("...", left, right);}
		|	#(LOGICAL_OR			left=expression	right=expression)	{e = new AndOrBinaryOperatorExpression("||", left, right);}
		|	#(LOGICAL_AND			left=expression	right=expression)	{e = new AndOrBinaryOperatorExpression("&&", left, right);}
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
		|	#(DOT					left=expression	(right=callExpression|method_name=methodCallName))
									{
										if (right != null) {
											MethodCallExpression mc = (MethodCallExpression)right;
											e = new MethodCallExpression(left, mc.getName(), mc.getArguments(), mc.getBlock());
										} else {
											e = new MethodCallExpression(left, method_name, null, null);
										}
									}
		|	e=callExpression
		|	#(LBRACK_ARRAY_ACCESS	left=expression	args=elements_as_arguments)	{e = new MethodCallExpression(left, "[]", args, null);}
		|	#(COLON2				left=expression	(right=callExpression|constant:CONSTANT|function:FUNCTION))	
									{	if (null != right) {
											MethodCallExpression mc = (MethodCallExpression)right;
											e = new MethodCallExpression(left, mc.getName(), mc.getArguments(), mc.getBlock());
										} else {
											e = new Colon2Expression(left, (null != constant) ? constant.getText() : function.getText());
										}
									}
		|	e=primaryExpression
		|	e=methodDefination
		|	e=moduleDefination
		|	e=classDefination
		|	e=ifExpression
		|	e=whileExpression
		|	e=forInExpression
		|	e=unlessExpression
		|	e=caseExpression
		|	e=exceptionHandlingExpression
		|	e=arrayExpression
		|	e=hashExpression
		|	e=symbol
		|	#("return"	(return_args=return_arguments)?)	{e = new ReturnExpression(return_args);}
		|	#("break"		(return_args=return_arguments)?)	{e = new BreakExpression(return_args);}
		|	#("next"		(return_args=return_arguments)?)	{e = new NextExpression(return_args);}
		|	#(LPAREN						cs=compoundStatement)			{e = new ParenthesisExpression(cs);}
		|	#(LPAREN_WITH_NO_LEADING_SPACE	cs=compoundStatement)			{e = new ParenthesisExpression(cs);}
		|	"redo"										{e = new RedoExpression();}
		|	"retry"										{e = new RetryExpression();}
		;

callExpression
returns [Expression e]
{
	String method_name = null;
	String method_name2 = null;
	MethodCallArguments args = null;
	Block block = null;
	Expression left = null;
	Expression right = null;
}
		:	#(	CALL	
				(	method_name=methodCallName
					|yield:"yield"
					|sup:"super"
					|defined:"defined?"
					|#(DOT					left=expression	(right=callExpression|method_name2=methodCallName))
				)
				(args=arguments)?
				(block=codeBlock)?
			)
			{
				if (null != yield) {
					if (null != block) {
						throw new RecognitionException("block can not be passed into yield");
					}
					e = new YieldExpression(args);
				} else if (null != sup) {
					e = new SuperExpression(args, block);
				} else if (null != defined) {
					if (null != block) {
						throw new RecognitionException("block can not be passed into defined?");
					}
					e = new DefinedExpression(args);
				} else if (null != method_name) {
					e = new MethodCallExpression(null, method_name, args, block);
				} else if (right != null) {
					MethodCallExpression mc = (MethodCallExpression)right;
					e = new MethodCallExpression(left, mc.getName(), mc.getArguments(), mc.getBlock());
				} else {
					e = new MethodCallExpression(left, method_name2, args, block);
				}
			}
		;

arguments
returns [MethodCallArguments args]
{
	args = new MethodCallArguments();
	Expression e = null;
}
		:	#(ARG
			(e = expression	{args.addArgument(e);})*
			(e = implicitHash	{args.addArgument(e);})?
			(REST_ARG_PREFIX	e = expression	{args.setAsteriskArgument(e);})?
			(BLOCK_ARG_PREFIX	e = expression	{args.setBlockArgument(e);})?
			)
		;

implicitHash
returns [HashExpression e]
{
	Expression key = null;
	Expression value = null;
	e = new HashExpression();
}
		:	(
				#(	ASSOC
					key=expression
					(value=expression)?
					{e.addElement(key, value);value=null;}
				)
			)+
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
		|	ascii:ASCII_VALUE							{e = new AsciiValueExpression(ascii.getText());}
		|	command_output:COMMAND_OUTPUT			{e = new CommandOutputExpression(command_output.getText());}
		|	heredoc:HERE_DOC_CONTENT				{e = new StringExpression(heredoc.getText(), true);}
		|	regex:REGEX								{e = new RegexpExpression(regex.getText());}
		|	warray:W_ARRAY							{e = new WArrayExpression(warray.getText());}
		|	e=local_variable
		|	constant:CONSTANT						{e = new CurrentNamespaceConstantExpression(constant.getText());}
		|	LEADING_COLON2	constant2:CONSTANT		{e = new Colon2Expression(null, constant2.getText());}
		|	gvar:GLOBAL_VARIABLE 					{e = new GlobalVariableExpression(gvar.getText());}
		|	"true"									{e = new TrueExpression();}
		|	"false"									{e = new FalseExpression();}
		|	"self"									{e = new SelfExpression();}
		|	"nil"										{e = new NilExpression();}
		|	class_variable:CLASS_VARIABLE				{e = new ClassVariableExpression(class_variable.getText());}
		|	instance_variable:INSTANCE_VARIABLE		{e = new InstanceVariableExpression(instance_variable.getText());}
		|	"__FILE__"								{e = new StringExpression((null != filename_) ? filename_ : "-", false);}
		|	line:"__LINE__"							{e = new IntegerExpression(line.getLine());}
		|	e=string
		|	e=regexWithExpressionSubstituation
		|	e=commandOutputWithExpressionSubstituation
		|	e=heredocWithExpressionSubstituation
		;

string
returns[StringGroupExpression e]
{
	e = new StringGroupExpression();
	StringExpressionWithExpressionSubstitution s = null;
}
		:	#(STRING
				(double_quote_string:DOUBLE_QUOTE_STRING	{e.appendString(double_quote_string.getText(), true);}
				|single_quote_string:SINGLE_QUOTE_STRING	{e.appendString(single_quote_string.getText(), false);}
				|s=stringWithExpressionSubstituation			{e.addStringWithExpressionSubstituation(s);}
				)+
			)
		;

protected
stringWithExpressionSubstituation
returns [StringExpressionWithExpressionSubstitution e]
		:	#(	b:STRING_BEFORE_EXPRESSION_SUBSTITUTION	{e = new StringExpressionWithExpressionSubstitution(b.getText());}
				(expression_substituation[e])?
				(m:STRING_BETWEEN_EXPRESSION_SUBSTITUTION	{e.addString(m.getText());}
				(expression_substituation[e])?
				)*
				a:STRING_AFTER_EXPRESSION_SUBSTITUTION		{e.addString(a.getText());}
			)
		;

protected
heredocWithExpressionSubstituation
returns [StringExpressionWithExpressionSubstitution e]
		:	#(	b:HERE_DOC_BEFORE_EXPRESSION_SUBSTITUTION	{e = new StringExpressionWithExpressionSubstitution(b.getText());}
				(expression_substituation[e])?
				(m:HERE_DOC_BETWEEN_EXPRESSION_SUBSTITUTION	{e.addString(m.getText());}
				(expression_substituation[e])?
				)*
				a:HERE_DOC_AFTER_EXPRESSION_SUBSTITUTION		{e.addString(a.getText());}
			)
		;

regexWithExpressionSubstituation
returns [RegexpExpressionWithExpressionSubstitution e]
		:	#(	b:REGEX_BEFORE_EXPRESSION_SUBSTITUTION	{e = new RegexpExpressionWithExpressionSubstitution(b.getText());}
				(expression_substituation[e])?
				(m:STRING_BETWEEN_EXPRESSION_SUBSTITUTION	{e.addString(m.getText());}
				(expression_substituation[e])?
				)*
				a:STRING_AFTER_EXPRESSION_SUBSTITUTION		{e.addString(a.getText());}
			)
		;

commandOutputWithExpressionSubstituation
returns [CommandOutputExpressionWithExpressionSubstitution e]
		:	#(	b:COMMAND_OUTPUT_BEFORE_EXPRESSION_SUBSTITUTION	{e = new CommandOutputExpressionWithExpressionSubstitution(b.getText());}
				(expression_substituation[e])?
				(m:STRING_BETWEEN_EXPRESSION_SUBSTITUTION	{e.addString(m.getText());}
				(expression_substituation[e])?
				)*
				a:STRING_AFTER_EXPRESSION_SUBSTITUTION		{e.addString(a.getText());}
			)
		;

expression_substituation[ExpressionWithExpressionSubstitution e]
{
	CompoundStatement cs = null;
}
		:	(	cs=compoundStatement	{e.addCompoundStatement(cs);}
			|	g:GLOBAL_VARIABLE 		{e.addGlobalVariable(g.getText());}
			|	i:INSTANCE_VARIABLE		{e.addInstanceVariable(i.getText());}
			|	c:CLASS_VARIABLE		{e.addClassVariable(c.getText());}
			)
		;

symbol
returns [SymbolExpression e]
{String s = null;}
		:	#(SYMBOL
				(id:IDENTIFIER		{e= new SymbolExpression(id.getText());}
				|f:FUNCTION			{e= new SymbolExpression(f.getText());}
				|constant:CONSTANT	{e= new SymbolExpression(constant.getText());}
				|g:GLOBAL_VARIABLE 	{e= new SymbolExpression(g.getText());}
				|i:INSTANCE_VARIABLE	{e= new SymbolExpression(i.getText());}
				|c:CLASS_VARIABLE	{e= new SymbolExpression(c.getText());}
				|u:UNARY_PLUS_MINUS_METHOD_NAME	{e= new SymbolExpression(u.getText());}
				|s=keyword			{e = new SymbolExpression(s);}
				|s=operator			{e = new SymbolExpression(s);}
				)
			)
		;

methodCallName
returns [String s]
		:	constant:CONSTANT						{s = constant.getText();}
		|	id:IDENTIFIER								{s = id.getText();}
		|	function:FUNCTION						{s = function.getText();}
		|	unary:UNARY_PLUS_MINUS_METHOD_NAME	{s = unary.getText();}
		|	empty_array:EMPTY_ARRAY					{s = empty_array.getText();}
		;

local_variable
returns [LocalVariableExpression e]
		:	id:IDENTIFIER								{e = new LocalVariableExpression(id.getText(), false);}
		|	function:FUNCTION						{e = new LocalVariableExpression(function.getText(), true);}
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
	Expression exp = null;
	Expression super_class = null;
	BodyStatement body = null;
}
		:	#("class"
			(name=className	(LESS_THAN	super_class=expression)?
			|LEFT_SHIFT	exp=expression
			)
			(body=bodyStatement)?
			)
			{
				if (name != null) {
					e = new ClassDefinationExpression(name, super_class, body);
				} else {
					e = new ClassDefinationExpression(exp, super_class, body);
				}
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
	Expression exp = null;
}
		:	#("def"
				(name=methodName	{e = new MethodDefinationExpression(name);}
				|#(SINGLETON_METHOD exp=expression (DOT|COLON2)	name=methodName	{e = new MethodDefinationExpression(name, exp);})
				)
				(	{id=null;func=null;}
					(id:IDENTIFIER|func:FUNCTION)
					((ASSIGN|ASSIGN_WITH_NO_LEADING_SPACE)	exp=expression)?
					{e.addParameter((null != id) ? id.getText() : func.getText(), exp);}
				)*
				(
					REST_ARG_PREFIX	(id2:IDENTIFIER|func2:FUNCTION)
					{e.setAsteriskParameter((null != id2) ? id2.getText() : func2.getText());}
				)?
				(
					BLOCK_ARG_PREFIX (id3:IDENTIFIER|func3:FUNCTION)
					{e.setBlockParameter((null != id3) ? id3.getText() : func3.getText());}
				)?
				(body=bodyStatement {e.setBody(body);})?
			)
		;

forInExpression
returns [ForInExpression e]
{
	Expression exp = null;
	Block b = null;
	CompoundStatement cs = null;
}
		:	#(	"for"		{b = new Block();}
				((id:IDENTIFIER|func:FUNCTION)	{b.addParameter((null != id) ? id.getText() : func.getText(), null);})+
				"in"
				exp=expression
				(cs=compoundStatement	{b.setBody(cs);})?
				{e = new ForInExpression(exp, b);}
			)
		;

codeBlock
returns [Block b]
{
	CompoundStatement cs = null;
	Expression default_value = null;
}
		:	#(	BLOCK					{b = new Block();}
				((BOR|LOGICAL_OR)		{b.setShouldValidateArgumentLength();})?
				(	(id:IDENTIFIER|func:FUNCTION)
					((ASSIGN|ASSIGN_WITH_NO_LEADING_SPACE)	default_value=expression)?
					{b.addParameter((null != id) ? id.getText() : func.getText(), default_value);}
				)*
				(
					REST_ARG_PREFIX
					(
					(id2:IDENTIFIER|func2:FUNCTION)
					{b.setAsteriskParameter((null != id2) ? id2.getText() : func2.getText());}
					)?
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
		:	id:IDENTIFIER			(assign1:ASSIGN_WITH_NO_LEADING_SPACE)?	{s = id.getText(); if (null != assign1) {s += "=";}}
		|	function:FUNCTION	(assign2:ASSIGN_WITH_NO_LEADING_SPACE)?	{s = function.getText(); if (null != assign2) {s += "=";}}
		|	constant:CONSTANT	{s = constant.getText();}
		|	s=keyword
		|	s=operator
		;

operator
returns [String s]
		:	LEFT_SHIFT			{s = "<<";}
		|	RIGHT_SHIFT			{s = ">>";}
		|	EQUAL				{s = "==";}
		|	CASE_EQUAL			{s = "===";}
		|	GREATER_THAN		{s = ">";}
		|	GREATER_OR_EQUAL	{s = ">=";}
		|	LESS_THAN			{s = "<";}
		|	LESS_OR_EQUAL		{s = "<=";}
		|	PLUS				{s = "+";}
		|	MINUS				{s = "-";}
		|	STAR				{s = "*";}
		|	DIV					{s = "/";}
		|	MOD					{s = "%";}
		|	POWER				{s = "**";}
		|	BAND				{s = "&";}
		|	BOR					{s = "|";}
		|	BXOR				{s = "^";}
		|	(EMPTY_ARRAY	|EMPTY_ARRAY_ACCESS)	(options{greedy=true;}:ASSIGN_WITH_NO_LEADING_SPACE)?	{s = "[]=";}
		|	MATCH				{s = "=~";}
		|	COMPARE				{s = "<=>";}
		|	BNOT				{s = "!";}
		|	SINGLE_QUOTE		{s = "`";}
		;

keyword
returns [String s]
		:	"and"				{s = "and";}
		|	"def"					{s = "def";}
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
	CompoundStatement rescue_cs = null;
	CompoundStatement else_cs = null;
	CompoundStatement ensure_cs = null;
}
		:	#(	BODY
				(cs=compoundStatement)?			{bs = new BodyStatement(cs);}
				("rescue" el=exceptionList	(rescue_cs=compoundStatement)?	{bs.addRescue(el, rescue_cs);})*
				("else" 	(else_cs=compoundStatement)?		{bs.addElse(else_cs);})?
				("ensure"	(ensure_cs=compoundStatement)?	{bs.addEnsure(ensure_cs);})?
			)
		;

//TODO
exceptionList
returns [ExceptionList el]
{
	Expression e;
	LocalVariableExpression v;
}
		:	{el = new ExceptionList();}
			(e=expression	{el.addArgument(e);})*
			(ASSOC	v=local_variable	{el.addExceptionVariable(v);})?
		;
