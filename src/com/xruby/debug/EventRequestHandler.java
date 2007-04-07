/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.request.ClassPrepareRequest;
import com.sun.jdi.ReferenceType;

/**
 * Event Request Handler, for ClassPrepareRequest
 * Instructions like stop gonna need extend this 
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public abstract class EventRequestHandler {
    protected ClassPrepareRequest prepareRequest;
    private String classId;

    protected EventRequestHandler(String classId) {
        this.classId = classId;
    }

    public void preSolved() {
        prepareRequest = DebugContext.getEventRequestManager().createClassPrepareRequest();
        prepareRequest.addClassFilter(classId);
        prepareRequest.addCountFilter(1);
        prepareRequest.enable();
    }

    public abstract void resolveEventRequest(ReferenceType refType);

    public void solveEvent(ClassPrepareEvent event) {
        ReferenceType refType = event.referenceType();
        resolveEventRequest(refType);
        prepareRequest.disable();
        DebugContext.getEventRequestManager().deleteEventRequest(prepareRequest);
    }


    public ClassPrepareRequest getPrepareRequest() {
        return prepareRequest;
    }

    public void setPrepareRequest(ClassPrepareRequest prepareRequest) {
        this.prepareRequest = prepareRequest;
    }
}
