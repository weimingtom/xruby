/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.debug;

import java.util.List;

/**
 * Implementation for Commands
 */
public class CommandLineImpl implements Commands {

    public void run() {
        JVMConnection connection = DebugContext.getJvmConnection();
        String entrance = connection.connectorArg("main");

        connection.open();

    }

    public void list(int lineNumber) {

    }

    public void next() {

    }

    public List showLocalVariables() {
        return null;
    }

    public String eval(String expression) {
        return null;
    }

    public void help() {
    }
}
