/* 
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import static java.lang.System.out;

/**
 * Command Line FrontEnd
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class CommandLineFrontEnd extends FrontEnd {
    // --------------------
    //   Constant Fields
    // --------------------
    private static final String RUN = "run";
    private static final String STOP = "stop";
    private static final String LIST = "list";
    private static final String CONT = "cont";
    private static final String SETP_OVER = "next";

    private static final String CMD_PATTERN_STR =
            "run(\\s*)|stop(\\s*)|list(\\s*)|cont(\\s*)|next(\\s*)";
    private static final String STOP_PATTERN_STR =
            "(stop){1}\\s*(at|in)\\s*((([\\w\\$]+)(.rb)*){1}:(\\d+){1})*";
    private static final String LIST_PATTERN_STR =
            "(list)\\s*(\\d+)?";

    private static final String cmdPrompt = "> ";

    private static Pattern commandPattern = Pattern.compile(CMD_PATTERN_STR);
    private static Pattern stopPattern = Pattern.compile(STOP_PATTERN_STR);
    private static Pattern listPattern = Pattern.compile(LIST_PATTERN_STR);

    private boolean running = false;

    public CommandLineFrontEnd(Map<String, String> arguments) throws XRubyDebugException {
        super(arguments);
    }

    protected String getLaunchMode() {
        return "com.sun.jdi.CommandLineLaunch";
    }

    protected void handleResult(Result result) {
    }

    public void start() throws XRubyDebugException {
        out.println("XRuby debugger ...");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        running = true;
        while (running) {
            try {                    
                out.print(cmdPrompt);

                String cmd = in.readLine().trim();
                Matcher m = commandPattern.matcher(cmd);
                if (isInstruction(m)) {
                    String cmdName = m.group().trim();
                    String[] arguments = retrieveArgs(cmdName, cmd);

                    execute(cmdName, arguments);
                } else {
                    out.println("Invalid instruction");
                }

                // TODO: We should handle VMdisconnect&VMDeath events in EventHandler
                
            } catch (IOException ioe) {
                throw new XRubyDebugException(ioe);
            }
        }

    }

    /**
     * Create instructions, and execute them
     *
     * @param command command's name
     * @param args    its arguments
     * @return Result
     */
    private Result execute(final String command, String[] args) {
        Result result = null;
        if (command.equalsIgnoreCase(RUN)) {
            result = run();
        } else if (command.equalsIgnoreCase(STOP)) {
            String classId = args[0];
            int lineNumber = Integer.parseInt(args[1]);
            
            result = stop(classId, lineNumber);
        } else if (command.equalsIgnoreCase(LIST)) {
            int range = -1;
            if(args != null && args[0] != null) {
                range = Integer.parseInt(args[0]);
            }
            result = list(range);
        } else if (command.equalsIgnoreCase(CONT)) {
            result = cont();
        } else if (command.equalsIgnoreCase(SETP_OVER)) {
            result = stepOver();
        }

        return result;
    }

    public void onVmShutdown() {}

    private String[] retrieveArgs(String insnName, String cmd) {
        String[] args = null;
        if (insnName.equalsIgnoreCase(STOP)) {
            Matcher m = stopPattern.matcher(cmd);

            if(m.find()) {
                args = new String[2];
                args[0] = m.group(4);
                args[1] = m.group(7);
            }
        } else if (insnName.equalsIgnoreCase(LIST)) {
            Matcher m = listPattern.matcher(cmd);

            if(m.find()) {
                args = new String[1];
                args[0] = m.group(2);
            }
        }

        return args;
    }

    private boolean isInstruction(Matcher m) {
        return m.find() && m.start() == 0;
    }

    private void printGroup(Matcher m) {
        int groupCount = m.groupCount();
        for (int i = 0; i <= groupCount; i++) {
            out.printf("Group %d: %s\n", i, m.group(i));
        }

        out.println("\n");
    }

    public static void main(String[] args) throws Exception {
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

        // initiate debug context
        DebugContext.addSourcePath(options.getPathList());
        DebugContext.setClassPath(options.getClassPathList());

        // Create front end
        FrontEnd frontEnd = new CommandLineFrontEnd(arguments);
        frontEnd.start();
    }
}
