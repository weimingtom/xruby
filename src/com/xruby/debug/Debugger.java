/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.event.VMStartEvent;
import com.sun.jdi.event.Event;
import com.sun.tools.example.debug.tty.*;

import static java.lang.System.out;

/**
 * @author Yu Su (beanworms@gmail.com)
 */
public class Debugger implements JVMEventNotifier {
    private Commands commands;
    private EventHandler handler;

    public Debugger() {
        commands = new CommandLineImpl();
        out.println("Initializing program ...");

        // TODO: Handle incoming command
        // HERE NOW: Execute one command: run ...

        commands.run();
        if ((handler == null) && Environment.getJvmConnection().isOpen()) {
            handler = new EventHandler(this, false);
        }
    }

    private void executeCommand() {

    }

    // ------------------------------------------
    //     Implementation for JVMEventNotifier
    // ------------------------------------------
    public void vmStartEvent(VMStartEvent e) {
        Thread.yield();  // fetch output
        out.println("VM Started:");
    }

    public void receivedEvent(Event event) {
    }
}
