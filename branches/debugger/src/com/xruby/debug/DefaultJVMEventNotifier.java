/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.event.VMStartEvent;
import com.sun.jdi.event.Event;

import static java.lang.System.out;

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
}
