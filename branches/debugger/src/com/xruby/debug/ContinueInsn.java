/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

/**
 * @author Yu Su (beanworms@gmail.com)
 */
public class ContinueInsn implements Instruction {
    public Result execute() {
        DebugContext.getJVM().resume();

        Result result = new Result();
        result.setStatus(Result.Status.SUCCESSFUL);
        return result;
    }
}
