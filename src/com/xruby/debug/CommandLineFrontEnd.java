/* 
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import org.apache.commons.cli.*;

import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

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

        // Start initiate debug context
        DebugContext.addSourcePath(options.getPathList());
    }
}

/**
 * Wrap the options for commandline debuuger
 */
class DebugCommandLineOptions {
    private static final String SEPARATOR = ";"; //semicolon

    // _S means short name e.g. --sourcepath is abbreviated to -s 
    private static final String SOURCE_PATH = "sourcepath"; // long name
    private static final String SOURCE_PATH_S = "s"; // short name

    private List<String> pathList;

    /**
     * Constructor
     *  
     * @param args Arguments
     */
    public DebugCommandLineOptions(String[] args) {
        pathList = new ArrayList<String>();

        GnuParser parser = new GnuParser();

        Options options = new Options();
        options.addOption(SOURCE_PATH_S, SOURCE_PATH, true, "path for the source code, seperated by semicolon");
        options.addOption("t", false, "test");

        CommandLine line;
        try {
            line = parser.parse(options, args, true);
        } catch (ParseException e) {
            throw new Error(e.toString());
        }

        if (line.hasOption(SOURCE_PATH_S)) {
            String paths = line.getOptionValue(SOURCE_PATH_S);
            StringTokenizer st = new StringTokenizer(paths, SEPARATOR);

            while(st.hasMoreTokens()) {
                String path = st.nextToken();
                pathList.add(path);
            }
        }

    }

    public List<String> getPathList() {
        return pathList;
    }
}