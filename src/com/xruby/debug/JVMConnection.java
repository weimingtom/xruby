/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.VirtualMachine;

/**
 * Connection to JVM
 */
public class JVMConnection {
    private VirtualMachine jvm;

    

    public VirtualMachine getJvm() {
        return jvm;
    }
}
