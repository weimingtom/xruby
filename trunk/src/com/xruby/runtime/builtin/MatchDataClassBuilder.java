package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class MatchData_to_s extends RubyMethod {
	public MatchData_to_s() {
		super(0);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyMatchData matchdata = (RubyMatchData)receiver;
		return ObjectFactory.createString(matchdata.to_s());
	}
}

public class MatchDataClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.MatchDataClass;
		c.defineMethod("to_s", new MatchData_to_s());
	}
}
