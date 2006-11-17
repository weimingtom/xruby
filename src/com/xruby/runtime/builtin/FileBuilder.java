package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

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
		this.fileTestModule = RubyAPI.defineModule("FileTest");
		this.fileClass = RubyAPI.defineClass("File", RubyRuntime.ioClass);
		this.fileStatClass = RubyAPI.defineClassUnder(this.fileClass, "Stat", RubyRuntime.objectClass);
		RubyModule constModule = RubyAPI.defineModuleUnder(this.fileClass, "Constants");
	}
}
