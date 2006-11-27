package com.xruby.runtime.lang;

/**
 * Java does not have multiple inheritance, and RubyException has to be inheritated from Exception.
 */
public class RubyExceptionValue extends RubyValue {

	private String message_;
	
	public RubyExceptionValue(RubyClass c, String message) {
		super(c, null);
		message_ = message;
	}
	
	public String toString() {
		return message_;
	}
}
