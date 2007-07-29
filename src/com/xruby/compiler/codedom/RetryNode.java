package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a 'retry' statement.
 *
 * @author  jpetersen
 */
public class RetryNode extends Node {
    static final long serialVersionUID = 4648280998968560181L;

    public RetryNode(ISourcePosition position) {
        super(position, NodeTypes.RETRYNODE);
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

}
