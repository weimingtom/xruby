tree grammar Rubyv3TreeParser;

options {
tokenVocab=Rubyv3; // reuse token types
ASTLabelType=CommonTree; // $label will have type CommonTree
TokenLabelType=MyToken;
}
@header {
package com.xruby.compiler.parser;

import com.xruby.compiler.codedom.*;
}

program	returns[Program p]
@init{p = new Program();} :	sl=statement_list {p.setStatementList(sl);};

statement_list returns[StatementList statementList]
@init{statementList = new StatementList();}
	:	^(STATEMENT_LIST (s=statement{statementList.addStatement(s);})*)
	;

statement returns[Statement s]
	: ^(STATEMENT e=expression) {s=new ExpressionStatement(e);};

expression returns[Expression e]
	:	value=INT{e=IntegerExpression.parseIntegerExpression($value.text);}
	|       value=FLOAT{e=new FloatExpression($value.text);}
	|       value=SINGLE_QUOTE_STRING{e=new SingleQuoteStringExpression($value.text);}
	|       value=DOUBLE_QUOTE_STRING{e=((MyToken)$value.getToken()).getExpression();} 
	|       value=HEREDOC_STRING{e=((MyToken)$value.getToken()).getExpression();}
	
	|       ^('alias' newName=. oldName=.) {e = new ExpressionList(); ((ExpressionList)e).addExpression(new MethodDefinationExpression($oldName.text)); ((ExpressionList)e).addExpression(new AliasStatement($newName.text, $oldName.text));}
	
	|       ^(ASSIGN left=expression right=expression) {e = AssignmentOperatorExpression.create(left, right);}
	|       ^(MOD_ASSIGN  left=expression	right=expression) {e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression(String.valueOf(37), left, right));}
	//|       ^(COMPLEMENT_ASSIGN left=expression	right=expression) {e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("~", left, right));}
	|       ^(DIV_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("/", left, right));}
	|       ^(MINUS_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("-", left, right));}
	|       ^(PLUS_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("+", left, right));}
	|       ^(BOR_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("|", left, right));}
	|       ^(BAND_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("&", left, right));}
	|       ^(LEFT_SHIFT_ASSIGN		left=expression	right=expression)	{e =AssignmentOperatorExpression.create(left,  new BinaryOperatorExpression("<<", left, right));}
	|       ^(RIGHT_SHIFT_ASSIGN		left=expression	right=expression)	{e =AssignmentOperatorExpression.create(left,  new BinaryOperatorExpression(">>", left, right));}
	|       ^(STAR_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("*", left, right));}
	|       ^(LOGICAL_AND_ASSIGN	left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new AndOrBinaryOperatorExpression("&&", left, right));}
	|       ^(LOGICAL_OR_ASSIGN		left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new AndOrBinaryOperatorExpression("||", left, right));}
	|       ^(POWER_ASSIGN			left=expression	right=expression)	{e = AssignmentOperatorExpression.create(left, new BinaryOperatorExpression("**", left, right));}
	
	|       ^(LEFT_SHIFT lhs0=expression rhs=expression) {e=new BinaryOperatorExpression("<<", lhs0, rhs);}
	|       e1=variableExpression {e=e1;}
	|       'true' {e = new TrueExpression();}
	|       'false'{e = new FalseExpression();}
	|       'nil'{e = new NilExpression();}
	|       ^(QUESTION condition=expression left=expression right=expression) {e= new IfExpression(condition, left, right);}
	|       ^(POWER left=expression right=expression) {e= new BinaryOperatorExpression("**", left, right);}
	|       ^(op=('and'|'&&') left=expression right=expression) {e= new AndOrBinaryOperatorExpression("&&", left, right);}
	|       ^(op=('or'|'||') left=expression right=expression) {e= new AndOrBinaryOperatorExpression("||", left, right);}
	|       ^(op='not'left=expression) {e = new UnaryOperatorExpression("!", left);}
	|       ^(INCLUSIVE_RANGE		left=expression	right=expression)	{e = new RangeOperatorExpression("..", left, right);}
	|       ^(EXCLUSIVE_RANGE		left=expression	right=expression)	{e = new RangeOperatorExpression("...", left, right);}
	
	|       e1=methodDefinition {e=e1;}
	|       e1=method{e=e1;}
	|       ^(DOT left=expression ^(CALL methodName=ID  (arg=arguments)?) {e = new MethodCallExpression(left, $ID.text, arg, null);})
	       
	|       ^('{' {e = new HashExpression();} (e1=expression e2=expression {((HashExpression)e).addElement(e1,e2);})*)
	;
variableExpression returns [LocalVariableExpression e]
	:	^(VARIABLE ID) {e=new LocalVariableExpression($ID.text, false);};
methodDefinition
returns [MethodDefinationExpression e]
        :	^('def' name=ID{e = new MethodDefinationExpression($name.text);} 
                   (^(ARG (name1=ID{e.addParameter($name1.text, null);})* (^('=' name2=ID expression))* 
                   (^('*' (name3=ID{e.setAsteriskParameter($name3.text);} | REST_UNUSE{e.setAsteriskParameter(null);}  )
                          )
                     )? 
                   ))? ^(BODY sl=statement_list))  {e.setBody(new BodyStatement(sl));};
method	
returns [MethodCallExpression e]
:
^(CALL methodName=ID  (arg=arguments)? {e = new MethodCallExpression(null, $ID.text, arg, null);});
        
arguments
returns [MethodCallArguments args]
@init{
	args = new MethodCallArguments();
	Expression e = null;
}
		:	^(ARG
			(e1 = expression	{args.addArgument(e1);})*
			)
		;

	

