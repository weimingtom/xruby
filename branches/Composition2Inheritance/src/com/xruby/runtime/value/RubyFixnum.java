package com.xruby.runtime.value;

public class RubyFixnum {
	private int value;
	
	public RubyFixnum(int i) {
		value = i;
	}
	
	public int intValue() {
		return value;
	}
	
	public int hashCode() {
		return value;
	}
	
	public boolean equals(Object o) {
		if (null == o) {
			return false;
		} else if (o instanceof RubyFixnum) {
			return value == ((RubyFixnum)o).intValue();
		} else {
			return false;
		}
	}
	
	public String toString() {
		return Integer.toString(value);
	}
}
