package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/**
 * Regexp backref.
 * generated when one of the following special global variables are found
 * <p/>
 * <p/>
 * - $&amp; last succesfull match
 * <p/>
 * - $+ highest numbered group matched in last successful match.
 * <p/>
 * - $` what precedes the last successful match
 * <p/>
 * - $' what follows the last successful match
 *
 * @author jpetersen
 */
public class BackRefNode extends Node {
    static final long serialVersionUID = 5321267679438359590L;

    /**
     * the character which generated the backreference
     */
    private final char type;

    public BackRefNode(ISourcePosition position, char type) {
        this. position = position;
        this.type = type;
    }

    public void accept(CodeVisitor visitor) {
        visitor.visitBackrefNode(this);
    }

    /**
     * Gets the type.
     * the type is the character which generates the backreference
     *
     * @return type
     */
    public char getType() {
        return type;
    }


}
