/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.ObjectFactory;

/**
 * Java does not have multiple inheritance, and RubyException has to be inheritated from Exception.
 */
public class RubyExceptionValue extends RubyBasic {

    private RubyException exception_;
    private String message_;

    public RubyExceptionValue(RubyClass c) {
        super(c);
        GlobalVariables.set(this, "$!");
    }

    public RubyExceptionValue(RubyClass c, String message) {
        super(c);
        message_ = message;
        GlobalVariables.set(this, "$!");
    }

    public void setMessage(String message) {
        message_ = message;
    }

    void setException(RubyException exception) {
        exception_ = exception;
    }

    public String toString() {
        return message_;
    }

    public RubyArray backtrace() {
        RubyArray a = new RubyArray();
        StackTraceElement[] trace = exception_.getStackTrace();
        for (StackTraceElement e : trace) {
            String s = e.getClassName();
            if (!s.startsWith("com.xruby")) {//filter internal calls
                a.add(ObjectFactory.createString(s));
            }
        }
        return a;
    }
}
