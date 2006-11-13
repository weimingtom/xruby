package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyModule;
import com.xruby.newruntime.lang.RubyRuntime;

public class ProcessBuilder implements ExtensionBuilder {
	private RubyModule processModule;
	
	public RubyModule getProcessModule() {
		return this.processModule;
	}
	
	public void initialize() {
		this.processModule = RubyRuntime.defineModule("Process");
	}
}
