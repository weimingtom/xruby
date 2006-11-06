package com.xruby.newruntime.value;

import com.xruby.newruntime.lang.RubyBasic;

public class RubyFloat extends RubyBasic {
	private double value;
	
	private RubyFloat(double value) {
		this.value = value;
	}
	
	public double doubleValue() {
		return this.value;
	}
}
