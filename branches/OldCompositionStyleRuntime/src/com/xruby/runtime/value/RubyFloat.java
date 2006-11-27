package com.xruby.runtime.value;

public class RubyFloat {
	private double value_;
	
	public RubyFloat(double value) {
		value_ = value;
	}
	
	public double doubleValue() {
		return value_;
	}
}
