package com.xruby.debug;

import com.sun.jdi.request.EventRequest;

import java.util.List;

/**
 * Clear/List breakpoint
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class ClearInsn implements Instruction {

    private int index;
    private String position;

    public ClearInsn(int index) {
        this.index = index;
    }

    public ClearInsn(String position) {
        this.position = position;
    }

    public ClearInsn() {
        this(-1);
    }

    public Result execute() {
        Result result = new Result();
        result.setStatus(Result.Status.SUCCESSFUL);
        
        List<String> list = StopInsn.allBreakpoints();
        
        if(index > 0) {
            position = list.get(index - 1);
        }

        if(position != null) {
            EventRequest request = StopInsn.getBreakpointReq(position);
            DebugContext.getEventRequestManager().deleteEventRequest(request);

            StopInsn.removeBreakpoint(position);
        } else {
            StringBuffer tmp = new StringBuffer();
            for(int i = 0; i < list.size(); i ++) {
                tmp.append(i + 1).append(" ").append(list.get(i)).append("\n");
            }

            System.out.println(tmp.toString());
        }

        return result;
    }
}
