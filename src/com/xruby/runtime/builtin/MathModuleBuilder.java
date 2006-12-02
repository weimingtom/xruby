package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Math_sqrt extends RubyMethod {
	public Math_sqrt() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyFixnum v = (RubyFixnum)args.get(0);
		return ObjectFactory.createFloat(Math.sqrt(v.intValue()));
	}
}

public class MathModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.MathModule;
		m.defineMethod("sqrt", new Math_sqrt());
	}
}
