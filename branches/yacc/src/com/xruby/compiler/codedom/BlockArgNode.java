package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *	a block argument.
 *	A block argument, when present in a function declaration is the last argument
 *	and it is preceded by an ampersand:<br>
 *
 *	<code>def tutu(a, b, &amp;c)</code>
 *	in this example c is a BlockArgNode
 * @author  jpetersen
 */
public class BlockArgNode extends Node implements INameNode {
    static final long serialVersionUID = 8374824536805365398L;

    private final int count;
    private String name;

    public BlockArgNode(ISourcePosition position, int count, String name) {
        super(position, NodeTypes.BLOCKARGNODE);
        this.count = count;
        this.name = name;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }
    /**
     * Gets the count.
     * @return Returns a int
     */
    public int getCount() {
        return count;
    }

    /**
     * Get the name of this block argument
     *
     * @return it's name
     */
    public String getName() {
        return name;
    }

	public void setName(String name) {
		this.name = name;
	}

    

}
