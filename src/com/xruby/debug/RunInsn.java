/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

/**
 * Run instruction, only for "launch target"
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class RunInsn implements Instruction{

    /**
     * Execute Run instruction, general process is listed as below:
     * 1. Start/Launch the process, pass the arguments to debugee
     * 2. Set Debug track mode
     * 3. Construct&attache the event handler
     * 4. Start threads handling in/error/out streams
     */
    public void execute() {
        // TODO: Implements run instruction
    }
}
