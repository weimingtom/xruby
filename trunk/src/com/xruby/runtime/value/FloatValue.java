package com.xruby.runtime.value;

public class FloatValue {
	private double value_;
	
	public FloatValue(double value) {
		value_ = value;
	}
	
	public double doubleValue() {
		return value_;
	}
	
	public String toString() {
		return Double.toString(value_);
	}
}
