package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * a call to 'super' with no arguments in a method.
 */
public class ZSuperNode extends Node implements IArityNode, BlockAcceptingNode {
    static final long serialVersionUID = 6109129030317216863L;
    private Node iterNode;

    public ZSuperNode(ISourcePosition position) {
        super(position, NodeTypes.ZSUPERNODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

	/**
	 * 'super' can take any number of arguments.
	 */
	public Arity getArity() {
		return Arity.optional();
	}

    public Node getIterNode() {
        return iterNode;
    }

    public void setIterNode(Node iterNode) {
        this.iterNode = iterNode;
    }
}
