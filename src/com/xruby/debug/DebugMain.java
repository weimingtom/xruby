/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import java.util.Map;
import java.util.HashMap;

/**
 * This is a debugger simulater
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class DebugMain {

    public static void main(String[] args) throws XRubyDebugException, Exception {
        // Parse the arguments: entrance, options
        DebugCommandLineOptions options = new DebugCommandLineOptions(args);
        Map<String, String> arguments = new HashMap<String, String>();

        // Options, this is optional
        String optionsArg;
        if (options.getClassPath() != null) {
            optionsArg = String.format("-classpath %s", options.getClassPath());
            arguments.put(DebugConstant.OPTIONS, optionsArg);
        }

        // Entrance, required
        String mainArg = String.format("%s", options.getEntrance());
        if (mainArg == null || mainArg.equals("")) {
            throw new XRubyDebugException("No entrance");
        }
        arguments.put(DebugConstant.MAIN, mainArg);

        // Create front end
        FrontEnd frontEnd = new CommandLineFrontEnd(arguments);

        // initiate debug context
        DebugContext.addSourcePath(options.getPathList());
        DebugContext.setClassPath(options.getClassPath());

        // For test_debug.main
//        frontEnd.distributeCommand("stop", new String[]{"test_debug.main", "1"});
//        Thread.sleep(1000);
//        frontEnd.distributeCommand("run", null);
//        Thread.sleep(1000);
//        frontEnd.distributeCommand("next", null);
//        Thread.sleep(1000);
//        frontEnd.distributeCommand("stop", new String[]{"test_debug.main", "6"});
//        Thread.sleep(1000);
//        frontEnd.distributeCommand("cont", null);
//        Thread.sleep(1000);
//        frontEnd.distributeCommand("next", null);
//        Thread.sleep(1000);
//        frontEnd.distributeCommand("next", null);
//        Thread.sleep(1000);
//        frontEnd.distributeCommand("cont", null);

        // For test_debug2.BLOCK$0
        // TODO: next step frontEnd.distributeCommand("stop", new String[]{"test_debug2.rb", "4"});
        frontEnd.distributeCommand("stop", new String[]{"test_debug2.main", "4"});
        Thread.sleep(1000);
        frontEnd.distributeCommand("run", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
        Thread.sleep(1000);
        frontEnd.distributeCommand("cont", null);
    }
}