package com.xruby.compiler.codedom;

import com.xruby.RegexpTranslator;
import com.xruby.compiler.parser.ByteList;
import com.xruby.compiler.parser.ISourcePosition;

/** Represents a simple regular expression literal.
 *
 * @author  jpetersen
 */
public class RegexpNode extends Node implements ILiteralNode {
    static final long serialVersionUID = -1566813018564622077L;

    private static final RegexpTranslator translator = new RegexpTranslator();

    //todo:I comment out the code, need examine this
    //private Pattern pattern;
    private int flags;
    private final ByteList value;
    private final int options;

    public RegexpNode(ISourcePosition position, ByteList value, int options) {
        super(position, NodeTypes.REGEXPNODE);

        this.value = value;
        this.options = options;
    }

    public void accept(CodeVisitor iVisitor) {
        throw new UnsupportedOperationException();
    }

    /**
     * Gets the options.
     * @return Returns a int
     */
    public int getOptions() {
        return options;
    }

    /**
     * Gets the value.
     * @return Returns a ByteList
     */
    public ByteList getValue() {
        return value;
    }

    //todo:I comment out the code, need examine this
    /*public int getFlags(int extra_options) {
        if (pattern == null) {
            flags = RegexpTranslator.translateFlags(options | extra_options);
            pattern = translator.translate(value, options, flags);
        }
        return flags;
    }

    public Pattern getPattern(int extra_options) {
        if (pattern == null) {
            flags = RegexpTranslator.translateFlags(options | extra_options);
            pattern = translator.translate(value, options, flags);
        }
        return pattern;
    }*/

    

}

