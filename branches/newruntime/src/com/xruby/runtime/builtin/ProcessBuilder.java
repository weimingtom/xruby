package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class ProcessBuilder implements ExtensionBuilder {
	private RubyModule processModule;
	
	public RubyModule getProcessModule() {
		return this.processModule;
	}
	
	public void initialize() {
		this.processModule = RubyUtil.defineModule("Process");
		RubyModule procUIDModule = RubyUtil.defineModuleUnder(this.processModule, "UID");
		RubyModule procGIDModule = RubyUtil.defineModuleUnder(this.processModule, "GID");
		RubyModule procIDSyscall = RubyUtil.defineModuleUnder(this.processModule, "Sys");
	}
}
