/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.VirtualMachine;

import java.util.Map;
import java.util.HashMap;

/**
 * This is a debugger simulater
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class DebugMain {
    public static void main(String[] args) throws Exception {
//        int traceFlags = VirtualMachine.TRACE_NONE;
//
//        Map<String, String> arguments = new HashMap<String, String>();
//        arguments.put(JVMConnection.MAIN, "test_debug.main");
//        arguments.put(JVMConnection.OPTIONS, "-classpath E:\\Projects\\xruby_debugger\\xruby-0.1.3.jar;E:\\Projects\\xruby_debugger\\test_debug");
//        arguments.put(JVMConnection.LAUNCH, "com.sun.jdi.CommandLineLaunch");
//
//        // initiate environment
//        Environment.initEnv(traceFlags, arguments);
//        new Debugger();
        CommandLineFrontEnd frontEnd = new CommandLineFrontEnd(args);
        
    }
}
