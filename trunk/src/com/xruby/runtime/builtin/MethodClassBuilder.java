package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Method_call extends RubyMethod {
	public Method_call() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		MethodValue m = (MethodValue)receiver.getValue();
		return m.call(args, block);
	}
}

public class MethodClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Method", RubyRuntime.ObjectClass);
		c.defineMethod("call", new Method_call());
		return c;
	}
}
