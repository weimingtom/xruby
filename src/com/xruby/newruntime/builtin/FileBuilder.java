package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyModule;
import com.xruby.newruntime.lang.RubyRuntime;

public class FileBuilder implements ExtensionBuilder {
	private RubyModule fileTestModule;
	private RubyClass fileClass;
	private RubyClass fileStatClass;
	
	public RubyModule getFileTestModule() {
		return fileTestModule;
	}

	public RubyClass getFileClass() {
		return fileClass;
	}

	public RubyClass getFileStatClass() {
		return fileStatClass;
	}

	public void initialize() {
		this.fileTestModule = RubyRuntime.defineModule("FileTest");
		this.fileClass = RubyRuntime.defineClass("File", RubyRuntime.ioClass);
		this.fileStatClass = RubyRuntime.defineClassUnder(this.fileClass, "Stat", RubyRuntime.objectClass);
		RubyModule constModule = RubyRuntime.defineModuleUnder(this.fileClass, "Constants");
	}
}
