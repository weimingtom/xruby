package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyString extends RubyBasic {
	private StringBuilder str;
	
	RubyString(String s) {
		this.str = new StringBuilder(s);
		this.setRubyClass(RubyRuntime.stringClass);
	}
	
	RubyString(char c) {
		this.str = new StringBuilder();
		this.str.append(c);
		this.setRubyClass(RubyRuntime.stringClass);
	}
	
	public void setString(String s) {
		this.str = new StringBuilder(s);
	}
	
	public String getString() {
		return this.str.toString();
	}
	
	public int length() {
		return this.str.length();
	}
	
	public void append(RubyValue v) {
		RubyString s = (RubyString)v.callMethod("to_s");
		this.str.append(s.getString());
	}

	public String toString() {
		return this.str.toString();
	}
}
