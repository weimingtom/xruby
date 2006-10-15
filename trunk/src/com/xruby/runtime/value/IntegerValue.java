package com.xruby.core.value;

public class IntegerValue {
	private int i_;
	
	public IntegerValue(int i) {
		i_ = i;
	}
	
	public int intValue() {
		return i_;
	}
	
	public int hashCode() {
		return i_;
	}
	
	public boolean equals(Object o) {
		if (null == o) {
			return false;
		} else if (o instanceof IntegerValue) {
			return i_ == ((IntegerValue)o).intValue();
		} else {
			return false;
		}
	}
	
	public String toString() {
		return Integer.toString(i_);
	}
}
