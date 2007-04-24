/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.xruby.compiler.codegen.NameFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * This is a debugger simulater
 *
 * @author Yu Su (beanworms@gmail.com)
 * @deprecated 
 */
public class DebugMain {
    public static FrontEnd frontEnd;

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
        frontEnd = new CommandLineFrontEnd(arguments);

        // initiate debug context
        DebugContext.addSourcePath(options.getPathList());
        DebugContext.setClassPath(options.getClassPathList());

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
//        frontEnd.distributeCommand("stop", new String[]{"test_debug2.main", "5"});
//        frontEnd.distributeCommand("stop", new String[]{NameFactory.createMainClass("test_debug2.rb"), "14"});
//        frontEnd.distributeCommand("stop", new String[]{NameFactory.createMainClass("test_debug2.rb"), "27"});
//        frontEnd.distributeCommand("stop", new String[]{NameFactory.createMainClass("test_debug2.rb"), "17"});
//        Thread.sleep(1000);
//        frontEnd.distributeCommand("run", null);
    }
}
