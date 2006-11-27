package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyString {
	private StringBuilder sb_;
	
	public RubyString(String s) {
		sb_ = new StringBuilder(s);
	}

	public RubyString(StringBuilder sb) {
		sb_ = sb;
	}
	
	public RubyString() {
		sb_ = new StringBuilder();
	}
	
	public String toString() {
		return sb_.toString();
	}
	
	public int length() {
		return sb_.length();
	}
	
	public RubyString appendString(String v) {
		sb_.append(v);
		return this;
	}

	public RubyString appendString(RubyValue v) {
		RubyValue r = RubyAPI.callPublicMethod(v, null, null, "to_s");
		return appendString(((RubyString)r.getValue()).toString());
	}
	
	//Modifies str by converting the first character to uppercase and the remainder to lowercase.
	//Returns false if no changes are made.
	public boolean capitalize() {
		StringBuilder new_sb = new StringBuilder(sb_.toString().toLowerCase());
		char first = new_sb.charAt(0);
		new_sb.setCharAt(0, Character.toUpperCase(first));
		
		if (new_sb.toString().equals(sb_.toString())) {
			new_sb = null;
			return false;
		} else {
			sb_ = new_sb;
			return true;
		}
	}
}
