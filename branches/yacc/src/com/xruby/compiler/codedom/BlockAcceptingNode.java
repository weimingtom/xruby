package com.xruby.compiler.codedom;

/**
 *  Any thing which implements this represents a callable-like node which can have a block
 *  associated with it as part of that call.  The calls which can be this are: CallNode, FCallNode,
 *  VCallNode, and SuperNode.  Blocks (the IterNode that this interface refers to can be either
 *  an IterNode ( {...} or do ... end ) or a BlockPassNode (&block).
 *
 *  It is likely we can remove this interface once the parser explicitly passes all iters into
 *  the callable node during construction.
 */
public interface BlockAcceptingNode {
    public Node getIterNode();

    public void setIterNode(Node iterNode);
}
