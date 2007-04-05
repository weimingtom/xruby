/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

/**
 * Stop instruction, there are two way to use this instruction
 * 1. Add a breakpoint in a specified position of a file/class
 * 2. Add a breakpoint at the beginning of a specified method
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class StopInsn implements Instruction {
    private int lineNumber = -1;
    private String classId;
    private String methodName;

    /**
     * Constructor
     *
     * @param classId    Class identifier
     * @param lineNumber Line number
     */
    public StopInsn(String classId, int lineNumber) {
        this.lineNumber = lineNumber;
        this.classId = classId;
    }

    /**
     * Constructor
     *
     * @param classId    Class identifier
     * @param methodName method's name
     */
    public StopInsn(String classId, String methodName) {
        this.methodName = methodName;
        this.classId = classId;
    }

    public void execute() {
        // TODO: Implement Stop
        if (lineNumber != -1) {
            executeStopAt();
        } else {
            executeStopIn();
        }
    }

    // For the first usage, position breakpoint
    protected void executeStopAt() {

    }

    // For the second usage, method breakpoint
    protected void executeStopIn() {

    }

    // ----------------------
    //        Readers
    // ----------------------
    public int getLineNumber() {
        return lineNumber;
    }

    public String getClassId() {
        return classId;
    }

    public String getMethodName() {
        return methodName;
    }

    // Private methods

    // Validate class's id, return false if it's illegal, otherwise true.

    private boolean validateClassId(String id) {
        // TODO: Check class's id
        return true;
    }
}
