package com.xruby.newruntime.value;

import com.xruby.newruntime.lang.RubyBasic;
import com.xruby.newruntime.lang.RubyValue;


public class RubyString extends RubyBasic {
	private StringBuilder str;
	
	private RubyString(String s) {
		this.str = new StringBuilder(s);
	}
	
	private RubyString() {
		this.str = new StringBuilder();
	}
	
	public void setString(String s) {
		this.str = new StringBuilder(s);
	}
	
	public String getString() {
		return this.str.toString();
	}
	
	public static RubyString newString(String s) {
		// FIXME: check null string
		return new RubyString(s);
	}
	
	public static RubyString newString() {
		return new RubyString();
	}
	
	public int length() {
		return this.str.length();
	}
	
	public void append(RubyValue v) {
		RubyString s = (RubyString)v.callMethod("to_s");
		this.str.append(s.getString());
	}
}
