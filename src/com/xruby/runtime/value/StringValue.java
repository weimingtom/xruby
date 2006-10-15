package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class StringValue {
	private StringBuilder sb_;
	
	public StringValue(String s) {
		sb_ = new StringBuilder(s);
	}
	
	public StringValue() {
		sb_ = new StringBuilder();
	}
	
	public String toString() {
		return sb_.toString();
	}
	
	public int length() {
		return sb_.length();
	}
	
	public StringValue appendString(String v) {
		sb_.append(v);
		return this;
	}

	public StringValue appendString(RubyValue v) throws RubyException {
		RubyValue r = RubyRuntime.callPublicMethod(v, null, null, "to_s");
		return appendString(((StringValue)r.getValue()).toString());
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
