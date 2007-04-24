/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.StackFrame;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.Location;
import com.sun.jdi.AbsentInformationException;

import static java.lang.System.err;
import static java.lang.System.out;

/**
 * List the source code
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class ListInsn implements Instruction {

    private int range;

    public ListInsn(int range) {
        if(range > 0) {
            this.range = range;
        } else {
            this.range = 5;
        }
    }

    public Result execute() {
        Result result = null;
        
        ThreadInfo threadInfo = ThreadInfo.getCurrentThreadInfo();
        StackFrame frame;
        try {
            frame = threadInfo.getCurrentFrame();
        } catch (IncompatibleThreadStateException exc) {
            err.println("<location unavailable>");
            return result;
        }
        if (frame == null) {
            err.println("No frames on the current call stack");
        } else {
            Location loc = frame.location();
            // TODO: Print out source code
            try {
                String sourceFile = loc.sourceName();
                int lineNumber = loc.lineNumber();

                out.println(SourceCodeMgr.getSourceSnippet(sourceFile, lineNumber, range));
            } catch (AbsentInformationException e) {
                err.println("Debug information lost");
            }
        }
        
        return result;
    }
}
