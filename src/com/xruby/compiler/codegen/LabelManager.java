package com.xruby.compiler.codegen;

import java.util.Stack;

import org.objectweb.asm.Label;

class LabelManager {
	private class LabelGroup {
		public Label break_ = new Label();
		public Label next_ = new Label();
	}
	
	private Stack<LabelGroup> labels_ = new Stack<LabelGroup>();
	
	public Label getCurrentBreak() {
		return labels_.peek().break_;
	}
	
	public Label getCurrentNext() {
		return labels_.peek().next_;
	}
	
	public void openNewScope() {
		labels_.add(new LabelGroup());
	}
	
	public void closeCurrentScope() {
		labels_.pop();
	}
}
