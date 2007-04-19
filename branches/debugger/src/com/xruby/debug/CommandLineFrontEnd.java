/* 
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */
package com.xruby.debug;

import java.util.Map;

/**
 * Command Line FrontEnd
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class CommandLineFrontEnd extends FrontEnd {

    public CommandLineFrontEnd(Map<String, String> arguments) throws XRubyDebugException {
        super(arguments);
    }

    protected String getLaunchMode() {
        return "com.sun.jdi.CommandLineLaunch";
    }
}
