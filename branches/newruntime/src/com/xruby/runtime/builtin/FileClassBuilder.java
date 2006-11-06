package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class FileClassBuilder {

	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("File", RubyRuntime.IOClass);
		//c.defineMethod("id2name", new Symbol_id2name());
		return c;
	}
}
