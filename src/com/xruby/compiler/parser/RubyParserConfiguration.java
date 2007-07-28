package com.xruby.compiler.parser;

/**
 * User: user
 * Date: 2007-7-28
 */
public class RubyParserConfiguration {
    private DynamicScope existingScope = null;
    private boolean asBlock = false;

    /**
     * If we are performing an eval we should pass existing scope in.
     * Calling this lets the parser know we need to do this.
     *
     * @param existingScope is the scope that captures new vars, etc...
     */
    public void parseAsBlock(DynamicScope existingScope) {
        this.asBlock = true;
        this.existingScope = existingScope;
    }

    /**
     * This method returns the appropriate first scope for the parser.
     *
     * @return correct top scope for source to be parsed
     */
    public DynamicScope getScope() {
        if (asBlock) {
            return existingScope;
        }

        // FIXME: We should really not be creating the dynamic scope for the root
        // of the AST before parsing.  This makes us end up needing to readjust
        // this dynamic scope coming out of parse (and for local static scopes it
        // will always happen because of $~ and $_).
        return new DynamicScope(new LocalStaticScope(null), existingScope);
    }
}
