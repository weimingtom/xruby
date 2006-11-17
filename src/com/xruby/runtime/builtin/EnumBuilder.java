package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class EnumBuilder implements ExtensionBuilder {
	private RubyModule enumModule;

	public RubyModule getEnumModule() {
		return enumModule;
	}
	
	public void initialize() {
		this.enumModule = RubyUtil.defineModule("Enumerable");
	}
}

class EnumMethod {
	
}
