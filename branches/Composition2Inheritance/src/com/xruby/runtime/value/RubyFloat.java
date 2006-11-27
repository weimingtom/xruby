package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyFloat extends RubyBasic {
	private double value_;
	
	RubyFloat(double value) {
		super(RubyRuntime.FloatClass);
		value_ = value;
	}

	public double doubleValue() {
		return value_;
	}
}
