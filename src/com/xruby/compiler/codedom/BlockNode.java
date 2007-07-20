package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * A structuring node (linked list of other nodes).
 * This type of node is used to structure the AST.
 * Used in many places it is created throught the
 * 
 *
 * @author  jpetersen
 */
public class BlockNode extends ListNode {
    static final long serialVersionUID = 6070308619613804520L;

    public BlockNode(ISourcePosition position) {
        super(position);
    }

    /**
     * RubyMethod used by visitors.
     * accepts the visitor
     * @param visitor the visitor to accept
     **/
    public void accept(CodeVisitor visitor) {
        //todo:return visitor.visitb
    }
}
