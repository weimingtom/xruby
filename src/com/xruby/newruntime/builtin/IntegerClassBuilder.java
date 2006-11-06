package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyUtil;

public class IntegerClassBuilder implements ClassBuilder {
	private RubyClass integerClass;
	
	public RubyClass getIntegerClass() {
		return this.integerClass;
	}
	
	public void initialize() {
		this.integerClass = RubyRuntime.defineClass("Integer", RubyRuntime.numericClass);
		this.integerClass.undefAllocMethod();
		RubyUtil.classof(this.integerClass).undefMethod("new");
	}
}