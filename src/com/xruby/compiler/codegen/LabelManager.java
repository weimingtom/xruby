package com.xruby.compiler.codegen;

import java.util.Stack;

import org.objectweb.asm.Label;

class LabelManager {
	private class LabelGroup {
		public Label break_ = null;
		public Label next_ = null;
	}
	
	private Stack<LabelGroup> labels_ = new Stack<LabelGroup>();
	
	public void setCurrentBreak(Label label) {
		labels_.peek().break_ = label;
	}
	
	public void setCurrentNext(Label label) {
		labels_.peek().break_ = label;
	}
	
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
