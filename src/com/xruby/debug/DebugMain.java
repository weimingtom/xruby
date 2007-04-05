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

    public static void main(String[] args) throws XRubyDebugException {
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

        frontEnd.distributeCommand("run", null);
    }
}
