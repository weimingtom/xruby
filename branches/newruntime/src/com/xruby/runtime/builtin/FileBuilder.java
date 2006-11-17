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
		this.fileTestModule = RubyUtil.defineModule("FileTest");
		this.fileClass = RubyUtil.defineClass("File", RubyRuntime.ioClass);
		this.fileStatClass = RubyUtil.defineClassUnder(this.fileClass, "Stat", RubyRuntime.objectClass);
		RubyModule constModule = RubyUtil.defineModuleUnder(this.fileClass, "Constants");
	}
}
