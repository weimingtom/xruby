package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyBasic;

public class RubyFloat extends RubyBasic {
	private double value;
	
	RubyFloat(double v) {
		this.value = v;
	}
	
	public double doubleValue() {
		return this.value;
	}
	
	public static RubyFloat newInstance(double v) {
		return new RubyFloat(v);
	}
}
