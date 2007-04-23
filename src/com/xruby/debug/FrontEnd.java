/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.VirtualMachine;

import java.util.Map;

/**
 * Abstract FrontEnd
 * If you wanna create a new FrontEnd, e.g. a GUI debugger:
 * 1. Initiate FrontEnd using the protected constructor.
 * 2. Retrieve instruction, and pass it to the distributeCommand method
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
    private static final String CONT = "cont";
    private static final String SETP_OVER = "next";

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

        // Maybe monostate is better for DebugContext
        DebugContext.initContext(traceMode, arguments);
    }

    /**
     * Validate input, create instructions, and execute them
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
            // TODO:Validate script's name
            String classId = args[0];
            int lineNumber = Integer.parseInt(args[1]);
            StopInsn insn = new StopInsn(classId, lineNumber);
            insn.execute();
            // TODO: Check the arguments, guarantee that all arguments are right and in correct poisition
            // Right form: stop at XXX:linenumber or stop in XXXX:methodname
        } else if (command.equalsIgnoreCase(LIST)) {
            // TODO: List the source code, if no arguments just list 10 lines
        } else if (command.equalsIgnoreCase(CONT)) {
            new ContinueInsn().execute();   
        } else if (command.equalsIgnoreCase(SETP_OVER)) {
            new NextInsn().execute();
        } else {
            throw new XRubyDebugException(String.format("This command %s is not supported now", command));
        }
    }

    protected Result run() {
        return new RunInsn().execute();
    }

    protected Result stop(String classId, int lineNumber) {
        StopInsn insn = null;
        try {
            insn = new StopInsn(classId, lineNumber);
        } catch (XRubyDebugException e) {
            Result result = new Result();
            result.setStatus(Result.Status.ERROR);
            result.setErrMsg(e.getMessage());

            return result;
        }

        return insn.execute();
    }

    protected Result list() {
        return null;
    }

    protected Result cont() {
        return new ContinueInsn().execute();
    }

    protected Result stepOver() {
        return new NextInsn().execute();
    }


    // --------------------------------------
    // protected (abstract) methos
    // --------------------------------------

    /**
     * Return lauch mode, e.g.
     * com.sun.jdi.CommandLineLaunch, attach etc.
     *
     * @return mode
     */
    protected abstract String getLaunchMode();

    protected abstract void handleResult(Result result);

    protected int validateLauchMode() {
        return VirtualMachine.TRACE_NONE;
    }

    public abstract void start() throws XRubyDebugException ;

    public abstract void onVmShutdown();
}
