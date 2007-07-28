package com.xruby.compiler.codedom;

import com.xruby.compiler.parser.ByteList;
import com.xruby.compiler.parser.ISourcePosition;

/**
 * Backtick string
 *
 * @author  jpetersen
 */
public class XStrNode extends Node implements ILiteralNode {
    static final long serialVersionUID = 1371310021447439748L;

    private final ByteList value;

    public XStrNode(ISourcePosition position, ByteList value) {
        super(position, NodeTypes.XSTRNODE);
        this.value = (value == null ? ByteList.create("") : value);
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
