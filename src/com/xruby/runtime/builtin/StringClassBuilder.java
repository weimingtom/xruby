package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyRuntime;

public class StringClassBuilder {
	public static void initialize() {
		RubyRuntime.stringClass = RubyAPI.defineClass("String", RubyRuntime.objectClass);
	}
}
