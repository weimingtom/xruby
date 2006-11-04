package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class MatchDataClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("MatchData",
				RubyRuntime.ObjectClass);
		return c;
	}
}
