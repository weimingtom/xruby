package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class ProcessBuilder implements ExtensionBuilder {
	private RubyModule processModule;
	
	public RubyModule getProcessModule() {
		return this.processModule;
	}
	
	public void initialize() {
		this.processModule = RubyAPI.defineModule("Process");
		RubyModule procUIDModule = RubyAPI.defineModuleUnder(this.processModule, "UID");
		RubyModule procGIDModule = RubyAPI.defineModuleUnder(this.processModule, "GID");
		RubyModule procIDSyscall = RubyAPI.defineModuleUnder(this.processModule, "Sys");
	}
}
