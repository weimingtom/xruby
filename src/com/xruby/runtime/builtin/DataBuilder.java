package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class DataBuilder implements ExtensionBuilder {
	private RubyClass dataClass;

	public RubyClass getDataClass() {
		return dataClass;
	}

	public void initialize() {
		this.dataClass = RubyAPI.defineClass("Data", RubyRuntime.objectClass);
		this.dataClass.undefAllocMethod();
	}
}
