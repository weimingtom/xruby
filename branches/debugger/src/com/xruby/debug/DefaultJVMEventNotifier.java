/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.event.VMStartEvent;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.tools.example.debug.tty.MessageOutput;

import static java.lang.System.out;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * Implementation for JVMEventNotifier
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class DefaultJVMEventNotifier implements JVMEventNotifier {

    public void vmStartEvent(VMStartEvent e) {
        Thread.yield();  // fetch output
        out.println("VM Started:");
    }

    public void receivedEvent(Event event) {
    }

    public void vmInterrupted() {
        Thread.yield();
        printCurrentLocation();
    }

    public void classPrepareEvent(ClassPrepareEvent e) {
        System.out.println("ClassPrepared event");
    }

    public void breakpointEvent(BreakpointEvent e) {
        System.out.println("A breakpoint hit");
    }

    private void printCurrentLocation() {
        // TODO:Print current source code
    }
}
