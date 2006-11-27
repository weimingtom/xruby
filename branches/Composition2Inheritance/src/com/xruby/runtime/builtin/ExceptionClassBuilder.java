package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Exception_to_s extends RubyMethod {
	public Exception_to_s() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		String value = (String)receiver.getValue();
		return ObjectFactory.createString(value);
	}
}

public class ExceptionClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Exception", RubyRuntime.ObjectClass);
		c.defineMethod("to_s", new Exception_to_s());
		return c;
	}
}
