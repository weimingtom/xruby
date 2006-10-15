/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

/**
 * Anything that goes wrong in runtime.
 */
public class RubyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private RubyValue value_ = null;

	public RubyException(String message) {
		value_ = new RubyValue(RubyRuntime.ExceptionClass, message);
	}
	
	public RubyException(RubyClass exception_class, String message) {
		value_ = new RubyValue(exception_class, message);
	}

	public RubyValue getRubyValue() {
		return value_;
	}

	public boolean equals(Object obj) {
		return value_.equals(((RubyException)obj).getRubyValue());
	}
	
	public String toString() {
		return value_.toString();
	}
}
