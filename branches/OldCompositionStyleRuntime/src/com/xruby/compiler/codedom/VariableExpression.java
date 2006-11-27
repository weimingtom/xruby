package com.xruby.compiler.codedom;

abstract class VariableExpression extends Expression {
	abstract public void acceptAsAssignment(CodeVisitor visitor, boolean rhs_is_method_call, boolean is_multiple_assign);
}
