package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyString extends RubyBasic {
	private StringBuilder sb_;
	
	RubyString(String s) {
		super(RubyRuntime.StringClass);
		sb_ = new StringBuilder(s);
	}
	
	public String toString() {
		return sb_.toString();
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof RubyString)) {
			return false;
		} else if (sb_.toString().equals(((RubyString)obj).toString())) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return sb_.toString().hashCode();
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
		return appendString(((RubyString)r).toString());
	}
	
	public RubyString setString(String s) {
		sb_.replace(0, sb_.length(), s);
		return this;
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

	public void reverse() {
		sb_.reverse();
	}
}
