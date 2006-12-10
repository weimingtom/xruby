package com.xruby.compiler.codegen;

import java.util.Stack;

import org.objectweb.asm.Label;

class LabelManager {
	private class LabelGroup {
		public Label break_ = new Label();
		public Label next_ = new Label();
		public Label redo_ = new Label();
		public Label x_ = new Label();//general purpose label
	}
	
	private Stack<LabelGroup> labels_ = new Stack<LabelGroup>();
	
	public Label getCurrentBreak() {
		return labels_.peek().break_;
	}
	
	public Label getCurrentNext() {
		return labels_.peek().next_;
	}

	public Label getCurrentRedo() {
		return labels_.peek().redo_;
	}

	public Label getCurrentX() {
		return labels_.peek().x_;
	}
	
	public void openNewScope() {
		labels_.add(new LabelGroup());
	}
	
	public void closeCurrentScope() {
		labels_.pop();
	}
}

class EnsureLabelManager {
	private class LabelGroup {
		public Label finally_ = null;
	}
	
	private Stack<LabelGroup> labels_ = new Stack<LabelGroup>();

	public Label getCurrentFinally() {
		if (labels_.empty()) {
			return null;//top scope
		}
		return labels_.peek().finally_;
	}

	public void setCurrentFinally(Label l) {
		labels_.peek().finally_ = l;
	}

	public void openNewScope() {
		labels_.push(new LabelGroup());
	}
	
	public void closeCurrentScope() {
		labels_.pop();
	}
}

