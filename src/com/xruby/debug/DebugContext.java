/*
 * Copyright 2006-2007 Yu Su 
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.debug;

import com.sun.jdi.VirtualMachine;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

/**
 * DebugContext for debug
 *
 * @author Yu Su(beanworms@gmail.com)
 */
public class DebugContext {
    private static JVMConnection jvmConnection;
    private static List<File> sourcePath;

    // static initialization
    static {
        sourcePath = new ArrayList<File>();
    }

    // -----------------
    //  static methods
    // -----------------
    public static void initContext(int traceFlg, Map<String, String> arguments) {
        jvmConnection = new JVMConnection(traceFlg, arguments);
    }


    public static JVMConnection getJvmConnection() {
        return jvmConnection;
    }

    public static VirtualMachine getJVM() {
        return jvmConnection.getJvm();
    }

    public static void addSourcePath(String path) {
        File file = new File(path);

        if(file.isDirectory()) {
            sourcePath.add(file);
        }
        else if(path.endsWith(".jar")){
            sourcePath.add(file);
        }
        else {
            // TODO: Output the warning here
        }
    }

    public static void addSourcePath(List<String> list) {
        for(String path: list) {
            addSourcePath(path);
        }
    }
}
