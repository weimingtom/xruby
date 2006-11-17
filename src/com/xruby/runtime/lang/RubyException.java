package com.xruby.runtime.lang;

public class RubyException extends RuntimeException {
	private RubyValue rubyException;
	private String message;
	
	public RubyException(RubyValue exception, String message) {
		this.rubyException = exception;
		this.message = message;
	}
	
	public RubyValue getRubyException() {
		return this.rubyException;
	}
	
	public String getMessage() {
		return this.message;
	}
}
