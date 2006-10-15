package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class Proc_call extends RubyMethod {
	public Proc_call() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		RubyBlock b = (RubyBlock)receiver.getValue();
		return b.invoke(receiver, args);
	}
}

public class ProcClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Proc", RubyRuntime.ObjectClass);
		c.defineMethod("call", new Proc_call());
		return c;
	}
}