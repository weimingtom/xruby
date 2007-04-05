/* 
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import org.apache.commons.cli.*;

/**
 * Command Line FrontEnd
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class CommandLineFrontEnd extends FrontEnd {


    public CommandLineFrontEnd(String[] args) {
        init(args);
    }

    protected void init(String[] args) {
        DebugCommandLineOptions options = new DebugCommandLineOptions(args);
    }
}

/**
 * Wrap the options for commandline debuuger
 */
class DebugCommandLineOptions {
    private static final String SOURCE_PATH_L = "sourcepath"; // long name
    private static final String SOURCE_PATH_S = "s"; // short name

    public DebugCommandLineOptions(String[] args) {
        GnuParser parser = new GnuParser();

        Options options = new Options();
		options.addOption(SOURCE_PATH_S ,SOURCE_PATH_L, true, "path for the source code");
        options.addOption("t", false, "test");

        CommandLine line;
		try {
			line = parser.parse(options, args, true);
		} catch (ParseException e) {
			throw new Error(e.toString());
		}

        if(line.hasOption(SOURCE_PATH_S)) {
            String path = line.getOptionValue(SOURCE_PATH_S);
            System.out.println(path); 
        }

    }
}