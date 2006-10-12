package com.xruby.codedom;

public class TopLevelConstantExpression extends VariableExpression {

	private String name_;
	
	public TopLevelConstantExpression(String name) {
		name_ = name;
	}
	
	public void accept(CodeVisitor visitor) {
		visitor.visitTopLevelConstant(name_);
	}
	
	public void acceptAsAssignment(CodeVisitor visitor, boolean rhs_is_method_call, boolean is_multiple_assign) {
		visitor.visitTopLevelConstantAssignmentOperator(name_, rhs_is_method_call, is_multiple_assign);
	}

}
