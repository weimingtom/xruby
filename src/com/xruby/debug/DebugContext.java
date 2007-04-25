/*
 * Copyright 2006-2007 Yu Su 
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.debug;

import com.sun.jdi.VirtualMachine;
import com.sun.jdi.request.EventRequestManager;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * DebugContext for debug. It manages
 * 1. JVM connection
 * 2. Debug Runtime settings, source path, class path
 * 3. JVM shutdown hook, FrontEnd management
 * 4. Instruction management
 * 5. Message proxy
 *
 * @author Yu Su(beanworms@gmail.com)
 */
public class DebugContext {

    private static JVMConnection jvmConnection;
    private static List<File> sourcePath;
    private static List<URL> classPath;
    private static JVMEventNotifier notifier;
    private static EventHandler handler;
    private static List<Instruction> deferredInsns;
    private static SmapMgr smapMgr;
    private static FrontEnd frontEnd;

    private static MessageCenter messageCtr;

    // Initiate
    static {
        sourcePath = new ArrayList<File>();
        deferredInsns = new ArrayList<Instruction>();
    }

    /**
     * Initiate context
     *
     * @param traceFlag trace mode
     * @param arguments arguments
     */
    public static void initContext(int traceFlag, Map<String, String> arguments) {
        jvmConnection = new JVMConnection(traceFlag, arguments);
    }

    // -------------------------
    //   Readers and Writters
    // -------------------------
    public static void setNotifier(JVMEventNotifier notifier) {
        DebugContext.notifier = notifier;
    }

    public static JVMEventNotifier getNotifier() {
        return notifier;
    }


    public static EventHandler getHandler() {
        return handler;
    }

    public static void setHandler(EventHandler handler) {
        DebugContext.handler = handler;
    }

    public static JVMConnection getJvmConnection() {
        return jvmConnection;
    }

    public static VirtualMachine getJVM() {
        return jvmConnection.getJvm();
    }

    public static EventRequestManager getEventRequestManager() {
        return getJVM().eventRequestManager();
    }

    public static List<URL> getClassPath() {
        return classPath;
    }

    public static void setClassPath(List<URL> classPath) {
        DebugContext.classPath = classPath;

        // Initiatate smapMgr
        URLClassLoader loader = new URLClassLoader(classPath.toArray(new URL[]{}));
        smapMgr = new SmapMgr(loader);
    }

    public static List<File> getSourcePath() {
        return sourcePath;
    }

    public static SmapMgr getSmapMgr() {
        return smapMgr;
    }

    public static List<Instruction> getDeferredInsns() {
        return deferredInsns;
    }

    // If jvm is still a null value
    public static boolean isStarted() {
        return (getJVM() != null);
    }

    public static void registerFrontEnd(FrontEnd frontEnd) {
        DebugContext.frontEnd = frontEnd;
    }

    public static void shutdown() {
        if(DebugContext.frontEnd != null) {
            frontEnd.onVmShutdown();
        } 
    }

    // --------------------
    //    Helper Methods
    // --------------------

    public static void addSourcePath(String path) {
        File file = new File(path);

        if (file.isDirectory()) {
            sourcePath.add(file);
        } else if (path.endsWith(".zip")) {
            sourcePath.add(file);
        } else {
            // TODO: Output the warning here
        }
    }

    public static void addSourcePath(List<String> list) {
        for (String path : list) {
            addSourcePath(path);
        }
    }
    
    /**
     * Return the description of this context.
     *
     * @return description
     */
    public static String dumpContext() {
        return null; // TODO: implement it
    }

    public static void pushCommand(Instruction insn) {
        deferredInsns.add(insn);
    }

    // ---------------------
    //   5. Message proxy
    // ---------------------

    /**
     * This must be set up before start debugger
     * @param messageCtr implementation of MessageCenter interface
     */
    public static void setMessageCenter(MessageCenter messageCtr) {
        DebugContext.messageCtr = messageCtr;
    }

    public static void emitMessage(String msg) {
        DebugContext.messageCtr.emitMessage(msg);
    }

    public static void emitMessage(String format, Object ... args) {
        DebugContext.messageCtr.emitMessage(format, args);
    }

    /**
     * validate the debug context, to guarantee it has been set up correctly
     * otherwise throw RuntimeException
     *
     * TODO: Create XRubyRuntimeException
     */
    public static void validateContext() {
        if(DebugContext.messageCtr == null ||    // Message cener
           DebugContext.frontEnd == null   ||    // Front end register itself by default
           DebugContext.notifier == null) {      // JVM event notifer
            throw new RuntimeException("Fatal error: Debugger failed to start");
        }
    }
}
