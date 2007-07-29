package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Represents a star in a multiple assignent.
 * only used in an instanceof check, this node is never visited.
 * @author  jpetersen
 */
public class StarNode extends Node {
    static final long serialVersionUID = 8314131941892458677L;


    /*
     * Constructor for StarNode.
     */
    public StarNode(ISourcePosition position) {
        super(position, NodeTypes.STARNODE);
    }

    public void accept(CodeVisitor visitor) {
    	// never visited, should be fine
    }

}
