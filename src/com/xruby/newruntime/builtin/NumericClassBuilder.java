package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;

public class NumericClassBuilder implements ClassBuilder {
	private RubyClass numericClass;
	
	public RubyClass getNumericClass() {
		return this.numericClass;
	}
	
	public void initialize() {
		this.numericClass = RubyRuntime.defineClass("Numeric", RubyRuntime.objectClass);
	}
}
