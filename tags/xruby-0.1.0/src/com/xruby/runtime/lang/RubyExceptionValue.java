/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

/**
 * Java does not have multiple inheritance, and RubyException has to be inheritated from Exception.
 */
public class RubyExceptionValue extends RubyValue {

	private String message_;
	
	public RubyExceptionValue(RubyClass c, String message) {
		super(c);
		message_ = message;
	}
	
	public String toString() {
		return message_;
	}
}
