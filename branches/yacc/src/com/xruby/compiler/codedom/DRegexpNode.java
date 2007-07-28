package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 *	Dynamic regexp node.
 *	a regexp is dynamic if it contains some expressions which will need to be evaluated
 *	everytime the regexp is used for a match
 * @author  jpetersen
 */
public class DRegexpNode extends ListNode implements ILiteralNode {
    static final long serialVersionUID = 7307853378003210140L;

    private final int options;
    private final boolean once;

    public DRegexpNode(ISourcePosition position) {
        this(position, 0, false);
    }

    public DRegexpNode(ISourcePosition position, DStrNode node, int options, boolean once) {
        super(position, NodeTypes.DREGEXPNODE);

        this.options = options;
        this.once = once;

        addAll(node);
    }

    public DRegexpNode(ISourcePosition position, int options, boolean once) {
        super(position, NodeTypes.DREGEXPNODE);

        this.options = options;
        this.once = once;
    }

    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the once.
     * @return Returns a boolean
     */
    public boolean getOnce() {
        return once;
    }

    /**
     * Gets the options.
     * @return Returns a int
     */
    public int getOptions() {
        return options;
    }
}
