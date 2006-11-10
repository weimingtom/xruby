package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class MatchData_to_s extends RubyMethod {
	public MatchData_to_s() {
		super(0);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		MatchDataValue matchdata = (MatchDataValue)receiver.getValue();
		return ObjectFactory.createString(matchdata.to_s());
	}
}

public class MatchDataClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("MatchData",
				RubyRuntime.ObjectClass);
		c.defineMethod("to_s", new MatchData_to_s());
		return c;
	}
}
