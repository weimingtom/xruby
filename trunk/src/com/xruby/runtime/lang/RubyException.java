/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

/**
 * Anything that goes wrong at runtime.
 */
public class RubyException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RubyExceptionValue value_ = null;

	public RubyException(String message) {
		this(RubyRuntime.ExceptionClass, message);
	}
	
	public RubyException(RubyClass exception_class, String message) {
		value_ = new RubyExceptionValue(exception_class, message);
	}

	public RubyException(RubyExceptionValue e) {
		value_ = e;
	}
	
	public RubyExceptionValue getRubyValue() {
		return value_;
	}

	//To get a friendly message
	public String toString() {
		return value_.toString();
	}
}
