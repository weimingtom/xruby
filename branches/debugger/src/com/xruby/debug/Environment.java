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
 * Environment for debug
 *
 * @author Yu Su(beanworms@gmail.com)
 */
public class Environment {
    private static JVMConnection jvmConnection;
    private static List<File> sourcePath;

    // static initialization
    static {
        sourcePath = new ArrayList<File>();
    }

    // -----------------
    //  static methods
    // -----------------
    public static void initEnv(int traceFlg, Map<String, String> arguments) {
        jvmConnection = new JVMConnection(traceFlg, arguments);
    }


    public static JVMConnection getJvmConnection() {
        return jvmConnection;
    }

    public static VirtualMachine getJVM() {
        return jvmConnection.getJvm();
    }

    public static void addSourcePath(String path) {

    }
}
