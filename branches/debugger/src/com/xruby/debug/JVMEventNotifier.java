package com.xruby.debug;

import com.sun.jdi.event.VMStartEvent;
import com.sun.jdi.event.Event;

/**
 * @author Yu Su (beanworms@gmail.com)
 */
public interface JVMEventNotifier {
    public void vmStartEvent(VMStartEvent e);

    public void receivedEvent(Event event);
}
