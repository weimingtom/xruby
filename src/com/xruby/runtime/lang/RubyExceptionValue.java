/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

/**
 * Java does not have multiple inheritance, and RubyException has to be inheritated from Exception.
 */
public class RubyExceptionValue extends RubyBasic {

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

	public String toString() {
		return message_;
	}

    public RubyArray backtrace() {
        //TODO implement this!
        return new RubyArray();
    }
}
