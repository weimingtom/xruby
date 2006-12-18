package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Proc_call extends RubyMethod {
	public Proc_call() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyBlock b = ((RubyProc)receiver).getValue();
		b.validateParameterForProcCall(args);
		return b.invoke(receiver, args);
	}
}

public class ProcClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.ProcClass;
		c.defineMethod("call", new Proc_call());
	}
}