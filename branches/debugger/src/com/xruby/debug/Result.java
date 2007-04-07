/*
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import java.util.Map;
import java.util.HashMap;

/**
 * Result of instrution execution, including status and
 * additional information, status is set to DELAYED by default
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class Result {
    /**
     * status
     */
    public enum Status {ERROR, SUCCESSFUL, DELAYED}

    private static final String ERROR_MSG = "ERROR_MSG";

    // status is set to DELAYED by default
    private Status status = Status.DELAYED;
    private Map<String, Object> additionalInfo;    

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isSuccessful() {
        return (status == Status.SUCCESSFUL);
    }

    public void addInfo(String key, Object info) {
        if(additionalInfo == null) {
            additionalInfo = new HashMap<String, Object>();
        }

        additionalInfo.put(key, info);
    }

    public Object getInfo(String key) {
        return additionalInfo.get(key);
    }

    public void setErrMsg(String msg) {
        addInfo(ERROR_MSG, msg);
    }
}
