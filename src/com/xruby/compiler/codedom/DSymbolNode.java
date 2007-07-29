package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * Node representing symbol in a form like ':"3jane"'.
 *
 */
public class DSymbolNode extends ListNode {
	private static final long serialVersionUID = 3763093063878326071L;

    /**
     * For mutating from a DStr to a DSym (we just create a new one with same contents).
     *
     * @param node to be copied
     */
	public DSymbolNode(ISourcePosition position, DStrNode node) {
		super(position, NodeTypes.DSYMBOLNODE);
		addAll(node);
	}

    public DSymbolNode(ISourcePosition position) {
        super(position, NodeTypes.DSYMBOLNODE);
    }

	public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }
}
