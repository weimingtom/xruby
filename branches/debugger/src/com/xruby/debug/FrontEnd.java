/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.VirtualMachine;

import java.util.Map;

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

    /**
     * Validate arguments, LAUNCH, MAIN, OPTIONS
     *
     * @param arguments arguments
     * @throws XRubyDebugException throw exception if no entrance
     */
    protected FrontEnd(Map<String, String> arguments) throws XRubyDebugException {
        if (arguments.containsKey(DebugConstant.MAIN)) {
            arguments.put(DebugConstant.LAUNCH, getLaunchMode());
        } else {
            throw new XRubyDebugException("No entrance");
        }

        // Initiate Context
        int traceMode = validateLauchMode();

        // TODO: Singleton or static ?
        DebugContext.initContext(traceMode, arguments);
    }

    /**
     * Create commands and sent them out
     *
     * @param command command's name
     * @param args    its arguments
     * @throws XRubyDebugException command is illegal
     */
    public void distributeCommand(final String command, String[] args) throws XRubyDebugException {
        if (command.equalsIgnoreCase(RUN)) {
            // TODO: Run the program
            new RunInsn().execute();
        } else if (command.equalsIgnoreCase(STOP)) {
            String classId = args[0];
            int lineNumber = Integer.parseInt(args[1]);
            StopInsn insn = new StopInsn(classId, lineNumber);
            insn.execute();
            // TODO: Check the arguments, guarantee that all arguments are right and in correct poisition
            // Right form: stop at XXX:linenumber or stop in XXXX:methodname
        } else if (command.equalsIgnoreCase(LIST)) {
            // TODO: List the source code, if no arguments just list 10 lines
        } else {
            throw new XRubyDebugException(String.format("This command %s is not supported now", command));
        }
    }

    /**
     * Return lauch mode
     *
     * @return mode
     */
    protected abstract String getLaunchMode();

    protected int validateLauchMode() {
        return VirtualMachine.TRACE_NONE;
    }
}
