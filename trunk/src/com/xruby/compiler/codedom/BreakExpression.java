package com.xruby.codedom;

public class BreakExpression extends Expression {

	private ReturnArguments arguments_;
	
	public BreakExpression(ReturnArguments arguments){
		arguments_ = arguments;
	}
	
	public void accept(CodeVisitor visitor) {
		visitor.visitBreakBegin();
		
		if (null != arguments_) { 
			arguments_.accept(visitor);
		} else {
			visitor.visitNilExpression();
		}

		visitor.visitBreakEnd();
	}

}
