package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;
import com.xruby.compiler.parser.StaticScope;

public abstract class MethodDefNode extends Node implements INameNode {

	protected final ArgumentNode nameNode;
	protected final ArgsNode argsNode;
	protected final StaticScope scope;
	protected final Node bodyNode;

	public MethodDefNode(ISourcePosition position, ArgumentNode nameNode, ArgsNode argsNode, StaticScope scope, Node bodyNode, int id) {
		super(position, id);
		this.nameNode = nameNode;
		this.argsNode = argsNode;
		this.scope = scope;
		this.bodyNode = bodyNode;
	}

	/**
	 * Gets the argsNode.
	 * @return Returns a Node
	 */
	public ArgsNode getArgsNode() {
	    return argsNode;
	}

	/**
	 * Get the static scoping information.
	 *
	 * @return the scoping info
	 */
	public StaticScope getScope() {
	    return scope;
	}

	/**
	 * Gets the body of this class.
	 *
	 * @return the contents
	 */
	public Node getBodyNode() {
	    return bodyNode;
	}

	/**
	 * Gets the name's node.
	 * @return Returns an ArgumentNode
	 */
	public ArgumentNode getNameNode() {
	    return nameNode;
	}

	/**
	 * Gets the name.
	 * @return Returns a String
	 */
	public String getName() {
	    return nameNode.getName();
	}
}
