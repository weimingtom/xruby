package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.*;

public class DataBuilder implements ExtensionBuilder {
	private RubyClass dataClass;

	public RubyClass getDataClass() {
		return dataClass;
	}

	public void initialize() {
		this.dataClass = RubyUtil.defineClass("Data", RubyRuntime.objectClass);
		this.dataClass.undefAllocMethod();
	}
}
