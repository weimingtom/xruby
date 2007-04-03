/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.VMDisconnectedException;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.event.ClassUnloadEvent;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.EventIterator;
import com.sun.jdi.event.EventQueue;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.event.ExceptionEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;
import com.sun.jdi.event.StepEvent;
import com.sun.jdi.event.ThreadDeathEvent;
import com.sun.jdi.event.ThreadStartEvent;
import com.sun.jdi.event.VMStartEvent;
import com.sun.jdi.event.WatchpointEvent;
import com.sun.jdi.request.EventRequest;

/**
 * @author Yu Su (beanworms@gmail.com)
 */
public class EventHandler implements Runnable {
    private boolean connected = true;
    private JVMEventNotifier notifier;
    private boolean completed = false;
    private boolean stopOnVMStart = false;
    private Thread thread;

    EventHandler(JVMEventNotifier notifier, boolean stopOnVMStart) {
        this.notifier = notifier;
        this.stopOnVMStart = stopOnVMStart;
        this.thread = new Thread(this, "event-handler");
        this.thread.start();
    }

    public void run() {
        EventQueue queue = Environment.getJVM().eventQueue();
        while (connected) {
            try {
                EventSet eventSet = queue.remove();
                boolean resumeStoppedApp = false;
                EventIterator it = eventSet.eventIterator();
                while (it.hasNext()) {
                    resumeStoppedApp |= !handleEvent(it.nextEvent());
                }

                if (resumeStoppedApp) {
                    eventSet.resume();
                } else if (eventSet.suspendPolicy() == EventRequest.SUSPEND_ALL) {
                    //setCurrentThread(eventSet);
                    //notifier.vmInterrupted();
                }
            } catch (InterruptedException exc) {
                // Do nothing. Any changes will be seen at top of loop.
            } catch (VMDisconnectedException discExc) {
                //handleDisconnectedException();
                break;
            }
        }
        synchronized (this) {
            completed = true;
            notifyAll();
        }
    }

     private boolean handleEvent(Event event) {
        notifier.receivedEvent(event);

        if (event instanceof ExceptionEvent) {
            return true; //exceptionEvent(event);
        } else if (event instanceof BreakpointEvent) {
            return true; //breakpointEvent(event);
        } else if (event instanceof WatchpointEvent) {
            return true; //fieldWatchEvent(event);
        } else if (event instanceof StepEvent) {
            return true; //stepEvent(event);
        } else if (event instanceof MethodEntryEvent) {
            return true; //methodEntryEvent(event);
        } else if (event instanceof MethodExitEvent) {
            return true; //methodExitEvent(event);
        } else if (event instanceof ClassPrepareEvent) {
            return true; //classPrepareEvent(event);
        } else if (event instanceof ClassUnloadEvent) {
            return true; //classUnloadEvent(event);
        } else if (event instanceof ThreadStartEvent) {
            return true; //threadStartEvent(event);
        } else if (event instanceof ThreadDeathEvent) {
            return true; //threadDeathEvent(event);
        } else if (event instanceof VMStartEvent) {
            return vmStartEvent(event);
        } else {
            return true; //handleExitEvent(event);
        }
    }

    private boolean vmStartEvent(Event event) {
        VMStartEvent se = (VMStartEvent) event;
        notifier.vmStartEvent(se);
        return stopOnVMStart;
    }
}
