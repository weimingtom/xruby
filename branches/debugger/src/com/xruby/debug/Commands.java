/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.debug;

import java.util.List;

/**
 *  Collection of debug commands
 *
 *  @author Yu Su(beanworms@gmail.com)
 */
public interface Commands {
    /**
     * Start running program
     */
    public void run();

    /**
     * Show the source code
     *
     * @param lineNumber which line?
     */
    public void list(int lineNumber);

    /**
     * Next line
     */
    public void next();

    /**
     * Show current local variables
     *
     * @return The list holding the variables
     */
    public List showLocalVariables();
    // TODO: Maybe we need a wrapper for every variable in the future,
    // but now we just return their names and types

    /**
     * Evaluate the expression
     * TODO: This is a difficult function, we need a discussion
     *
     * @param expression Expression
     * @return The result
     */
    public String eval(String expression);

    /**
     * Show Usage
     */
    public void help();

    // TODO: We need more interfaces in the future
}
