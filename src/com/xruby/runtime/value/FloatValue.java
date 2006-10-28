package com.xruby.runtime.value;

public class FloatValue {
	private float value_;
	
	public FloatValue(float value) {
		value_ = value;
	}
	
	public float floatValue() {
		return value_;
	}
	
	public String toString() {
		return Float.toString(value_);
	}
}
