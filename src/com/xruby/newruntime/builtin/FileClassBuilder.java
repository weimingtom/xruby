package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;

public class FileClassBuilder implements ClassBuilder {
	private RubyClass fileClass;
	
	public RubyClass getFileClass() {
		return fileClass;
	}

	public void initialize() {
		this.fileClass = RubyRuntime.defineClass("File", RubyRuntime.ioClass);
	}
}
