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
@init{StatementList statementList = new StatementList(); p = new Program(statementList);}:	^(STATEMENT_LIST (s=statement{statementList.addStatement(s);})*);

statement returns[Statement s]
	: ^(STATEMENT e=expression) {s=new ExpressionStatement(e);};

expression returns[Expression e]
	:	value=INT{e=IntegerExpression.parseIntegerExpression($value.text);}
	|       value=SINGLE_QUOTE_STRING{e=new SingleQuoteStringExpression($value.text);}
	|       value=DOUBLE_QUOTE_STRING{e=((MyToken)$value.getToken()).getExpression();} 
	|       value=HEREDOC_STRING{e=((MyToken)$value.getToken()).getExpression();}
	
	|       ^(ASSIGN left=expression right=expression) {e=new AssignmentExpression((VariableExpression)left, right);}
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
	|       ID {e=new LocalVariableExpression($ID.text, false);}
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
	;

	

