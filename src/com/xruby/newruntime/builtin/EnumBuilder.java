package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyModule;
import com.xruby.newruntime.lang.RubyRuntime;

public class EnumBuilder implements ExtensionBuilder {
	private RubyModule enumModule;

	public RubyModule getEnumModule() {
		return enumModule;
	}
	
	public void initialize() {
		this.enumModule = RubyRuntime.defineModule("Enumerable");
	}
}

class EnumMethod {
	
}
