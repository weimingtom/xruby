package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyString extends RubyBasic {
	private StringBuilder sb_;

	public RubyString(RubyClass c, String s) {
		super(c);
		sb_ = new StringBuilder(s);
	}
	
	RubyString(String s) {
		super(RubyRuntime.StringClass);
		sb_ = new StringBuilder(s);
	}

	RubyString(StringBuilder sb) {
		super(RubyRuntime.StringClass);
		sb_ = sb;
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

	public void chomp(String seperator) {
		if (!sb_.toString().endsWith(seperator)) {
			return;
		}
		
		int start = sb_.length() - seperator.length();
		int end = sb_.length();
		sb_.delete(start, end);
	}

	public RubyArray scan(RubyRegexp regex) {
		RubyMatchData match = regex.match(sb_.toString());
		if (null != match) {
			return match.toArray();
		} else {
			return new RubyArray();
		}
	}

	/// @return false if no change made
	private boolean transform(String from, String to, boolean remove_duplicate) {
		if (from.length() == 3 && to.length() == 3 && from.charAt(1) == '-' && to.charAt(1) == '-') {
			char from_start = from.charAt(0);
			char from_end = from.charAt(2);
			char to_start = to.charAt(0);
			char to_end = to.charAt(2);

			char last_char = 0;
			for (int i = 0; i < sb_.length(); ++i) {
				char current_char = sb_.charAt(i);
				if (current_char >= from_start && current_char <= from_end) {
					if (remove_duplicate && last_char == current_char) {
						sb_.deleteCharAt(i);
						--i;
					} else {
						int replace_char = (current_char - from_start) + to_start;
						sb_.setCharAt(i, replace_char < to_end ? (char)replace_char : to_end);
						last_char = current_char;
					}
				}
			}
			return true;
		}

		//TODO handle more situations
		return false;
	}

	public boolean tr(String from, String to) {
		return transform(from, to, false);
	}

	public boolean tr_s(String from, String to) {
		return transform(from, to, true);
	}

	public boolean squeeze(String from) {
		if (null != from && from.length() == 3 && from.charAt(1) == '-' ) {
			char from_start = from.charAt(0);
			char from_end = from.charAt(2);
			char last_char = 0;
			for (int i = 0; i < sb_.length(); ++i) {
				char current_char = sb_.charAt(i);
				if (current_char >= from_start && current_char <= from_end) {
					if (last_char == current_char) {
						sb_.deleteCharAt(i);
						--i;
					} else {
						last_char = current_char;
					}
				}
			}
			return true;
		}

		//TODO handle more situations
		return false;
	}

	public boolean delete(String s) {
		int index = sb_.indexOf(s);
		if (index < 0) {
			return false;
		}
		
		sb_.delete(index, index + s.length());
		return true;
	}
}
