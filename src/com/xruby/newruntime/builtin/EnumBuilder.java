package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.*;

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
