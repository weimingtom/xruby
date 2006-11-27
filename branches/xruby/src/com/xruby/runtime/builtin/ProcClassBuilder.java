package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Proc_call extends RubyMethod {
	public Proc_call() {
		super(0);
	}

	@SuppressWarnings("unchecked")
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBlock b = ((RubyData<RubyBlock>)receiver).getData();
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