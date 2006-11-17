package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.*;

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
