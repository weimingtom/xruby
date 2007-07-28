package com.xruby.compiler.codedom;

public interface BinaryOperatorNode {
	/**
	 * Gets the firstNode.
	 * @return Returns a Node
	 */
	public abstract Node getFirstNode();

	/**
	 * Gets the secondNode.
	 * @return Returns a Node
	 */
	public abstract Node getSecondNode();
}
