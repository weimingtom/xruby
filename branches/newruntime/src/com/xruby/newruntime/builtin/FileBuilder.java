package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyModule;
import com.xruby.newruntime.lang.RubyRuntime;

public class FileBuilder implements ExtensionBuilder {
	private RubyModule fileTestModule;
	private RubyClass fileClass;
	
	public RubyModule getFileTestModule() {
		return fileTestModule;
	}

	public RubyClass getFileClass() {
		return fileClass;
	}

	public void initialize() {
		this.fileTestModule = RubyRuntime.defineModule("FileTest");
		this.fileClass = RubyRuntime.defineClass("File", RubyRuntime.ioClass);
	}
}
