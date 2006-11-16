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
		RubyModule procUIDModule = RubyRuntime.defineModuleUnder(this.processModule, "UID");
		RubyModule procGIDModule = RubyRuntime.defineModuleUnder(this.processModule, "GID");
		RubyModule procIDSyscall = RubyRuntime.defineModuleUnder(this.processModule, "Sys");
	}
}
