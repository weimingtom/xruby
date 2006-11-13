package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;

public class DataBuilder implements ExtensionBuilder {
	private RubyClass dataClass;

	public RubyClass getDataClass() {
		return dataClass;
	}

	public void initialize() {
		this.dataClass = RubyRuntime.defineClass("Data", RubyRuntime.objectClass);
		this.dataClass.undefAllocMethod();
	}
}
