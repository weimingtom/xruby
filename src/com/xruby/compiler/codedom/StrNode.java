package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ISourcePosition;

/** Representing a simple String literal.
 *
 * @author  jpetersen
 */
public class StrNode extends Node implements ILiteralNode {
    static final long serialVersionUID = 4544779503072130759L;

    private final ByteList value;

    public StrNode(ISourcePosition position, ByteList value) {
        super(position, NodeTypes.STRNODE);
        this.value = value;
    }

    public StrNode(ISourcePosition position, StrNode head, StrNode tail) {
        super(position, NodeTypes.STRNODE);

        this.value = (ByteList) head.getValue();

        value.append(tail.getValue());
    }
    /**
     * Accept for the visitor pattern.
     * @param iVisitor the visitor
     **/
    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the value.
     * @return Returns a String
     */
    public ByteList getValue() {
        return value;
    }

}
