package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * Represents a $number variable.
 *
 * @author jpetersen
 */
public class NthRefNode extends Node {
    static final long serialVersionUID = -3301605695065934063L;

    private final int matchNumber;

    public NthRefNode(ISourcePosition position, int matchNumber) {
        this.position = position;
        this.matchNumber = matchNumber;
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitNthRefNode(this);
    }


    /**
     * Gets the matchNumber.
     *
     * @return Returns a int
     */
    public int getMatchNumber() {
        return matchNumber;
    }


}
