package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

public class RegexpClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Regexp", RubyRuntime.ObjectClass);
		return c;
	}
}
