package com.xruby.core.builtin;

import com.xruby.core.lang.*;

public class FileClassBuilder {

	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("File", RubyRuntime.IOClass);
		//c.defineMethod("id2name", new Symbol_id2name());
		return c;
	}
}
