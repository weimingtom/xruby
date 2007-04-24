/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.ThreadReference;
import com.sun.jdi.VMDisconnectedException;
import com.sun.jdi.event.*;
import com.sun.jdi.request.EventRequest;

import static java.lang.System.out;

/**
 * 
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
        EventQueue queue = DebugContext.getJVM().eventQueue();
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
                    setCurrentThread(eventSet);
                    notifier.vmInterrupted();
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
            return breakpointEvent(event);
        } else if (event instanceof WatchpointEvent) {
            return true; //fieldWatchEvent(event);
        } else if (event instanceof StepEvent) {
            return true; //stepEvent(event);
        } else if (event instanceof MethodEntryEvent) {
            return true; //methodEntryEvent(event);
        } else if (event instanceof MethodExitEvent) {
            return true; //methodExitEvent(event);
        } else if (event instanceof ClassPrepareEvent) {
            return classPrepareEvent(event);
        } else if (event instanceof ClassUnloadEvent) {
            return true; //classUnloadEvent(event);
        } else if (event instanceof ThreadStartEvent) {
            return threadStartEvent(event);
        } else if (event instanceof ThreadDeathEvent) {
            return threadDeathEvent(event);
        } else if (event instanceof VMStartEvent) {
            return vmStartEvent(event);
        } else {
            return handleExitEvent(event);
        }
    }

    private boolean handleExitEvent(Event event) {
        if (event instanceof VMDeathEvent) {
            out.println("Application existed");
        } else if (event instanceof VMDisconnectEvent) {
            out.println("VM disconneted");
            DebugContext.shutdown();
        }
        
        return false;
    }

    private boolean threadDeathEvent(Event event) {
        ThreadDeathEvent threadDeathEvent = (ThreadDeathEvent) event;
        
        return false;
    }

    private boolean threadStartEvent(Event event) {
        ThreadStartEvent threadStartEvent = (ThreadStartEvent) event;
        ThreadInfo.addThread(threadStartEvent.thread());

        return false;
    }

    private boolean breakpointEvent(Event event) {
        BreakpointEvent be = (BreakpointEvent) event;
        notifier.breakpointEvent(be);
        return true;
    }

    private boolean vmStartEvent(Event event) {
        VMStartEvent se = (VMStartEvent) event;
        notifier.vmStartEvent(se);
        return stopOnVMStart;
    }

    private boolean classPrepareEvent(Event event) {
        ClassPrepareEvent cle = (ClassPrepareEvent) event;
        notifier.classPrepareEvent(cle);
        EventRequestHandler.resolveAllDeferred(cle);

        // One way or another, the debugger should go on even some deferred command
        // couldn't be executed correctly
        // TODO: What's the failed execution bring us? Should we consider that?
        return false;
    }

    private void setCurrentThread(EventSet set) {
        ThreadReference thread;
        if (set.size() > 0) {
            /*
             * If any event in the set has a thread associated with it,
             * they all will, so just grab the first one.
             */
            Event event = set.iterator().next(); // Is there a better way?
            thread = eventThread(event);
        } else {
            thread = null;
        }
        setCurrentThread(thread);
    }

    private void setCurrentThread(ThreadReference thread) {
        ThreadInfo.invalidateAll();
        ThreadInfo.setCurrentThread(thread);
    }

    private ThreadReference eventThread(Event event) {
        if (event instanceof ClassPrepareEvent) {
            return ((ClassPrepareEvent) event).thread();
        } else if (event instanceof LocatableEvent) {
            return ((LocatableEvent) event).thread();
        } else if (event instanceof ThreadStartEvent) {
            return ((ThreadStartEvent) event).thread();
        } else if (event instanceof ThreadDeathEvent) {
            return ((ThreadDeathEvent) event).thread();
        } else if (event instanceof VMStartEvent) {
            return ((VMStartEvent) event).thread();
        } else {
            return null;
        }
    }
}
