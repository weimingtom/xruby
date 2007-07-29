package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a zero arg in a block.
 * this is never visited and is used only in an instanceof check
 * <pre>
 * do ||
 * end
 * </pre>
 *
 * @author  jpetersen
 */
public class ZeroArgNode extends Node implements IArityNode {
    static final long serialVersionUID = 6596791950608957025L;

    public ZeroArgNode(ISourcePosition position) {
        super(position, NodeTypes.ZEROARGNODE);
    }


    public void accept(CodeVisitor iVisitor) {
        // never visited, should be ok
    }
	/**
     * Zero arguments...
     */
	public Arity getArity() {
		return Arity.noArguments();
	}

    
}
