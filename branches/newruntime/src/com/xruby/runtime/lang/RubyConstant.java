package com.xruby.runtime.lang;

public class RubyConstant extends RubyValue {
	public static RubyConstant QFALSE = new RubyConstant(0, "false");
	public static RubyConstant QTRUE = new RubyConstant(2, "true");
	public static RubyConstant QNIL = new RubyConstant(4, "nil");
	
	public static boolean isNil(RubyValue value) {
		return value == QNIL;
	}
	
	private int value;
	private String text;
	
	private RubyConstant(int value, String text) {
		this.value = value;
		this.text = text;
	}

	public String toString() {
		return this.text;
	}
}
