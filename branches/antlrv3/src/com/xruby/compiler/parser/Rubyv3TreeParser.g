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
	|       value=HEREDOC_INDENT_STRING{e=((MyToken)$value.getToken()).getExpression();}
	|       ^('=' lhs=. rhs=expression) {e=new AssignmentExpression(new LocalVariableExpression($lhs.text, false), rhs);}
	|       ^(LEFT_SHIFT lhs0=expression rhs=expression) {e=new BinaryOperatorExpression("<<", lhs0, rhs);}
	|       ID {e=new LocalVariableExpression($ID.text, false);}
	|       'true' {e = new TrueExpression();}
	|       'false'{e = new FalseExpression();}
	|       'nil'{e = new NilExpression();}
	|       ^(op=('and'|'&&') left=expression right=expression) {e= new AndOrBinaryOperatorExpression("&&", left, right);}
	|       ^(op=('or'|'||') left=expression right=expression) {e= new AndOrBinaryOperatorExpression("||", left, right);}
	|       ^(op='not'left=expression) {e = new UnaryOperatorExpression("!", left);}
	;

	

