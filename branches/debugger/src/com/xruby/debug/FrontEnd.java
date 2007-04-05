/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

/**
 * Abstract FrontEnd
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public abstract class FrontEnd {
    // --------------------
    //   Constant Fields
    // --------------------
    private static final String RUN = "run";
    private static final String STOP = "stop";
    private static final String LIST = "list";

    public void distributeEvent(final String command, String[] args) throws XRubyDebugException {
        if (command.equalsIgnoreCase(RUN)) {
            // TODO: Run the program
            new RunInsn().execute();
        } else if (command.equalsIgnoreCase(STOP)) {
            // TODO: Check the arguments, guarantee that all arguments are right and in correct poisition
            // Right form: stop at XXX:linenumber or stop in XXXX:methodname
        } else if (command.equalsIgnoreCase(LIST)) {
            // TODO: List the source code, if no arguments just list 10 lines
        } else {
            throw new XRubyDebugException(String.format("This command %s is not supported now", command));
        }
    }
}
