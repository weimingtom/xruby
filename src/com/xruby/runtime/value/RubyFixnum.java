package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyFixnum extends RubyBasic {
	private int value;
	
	public RubyFixnum(int i) {
		super(RubyRuntime.FixnumClass);
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
	
	public String toString(int radix) {
		if (value < 0){
			return "-" + Integer.toString(-value, radix);
		}
		return Integer.toString(value, radix);
	}
}
