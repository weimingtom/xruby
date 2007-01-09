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

class Math_exp extends RubyMethod {
	public Math_exp() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyValue v = args.get(0);
		double d;
		if (v instanceof RubyFixnum) {
			d = ((RubyFixnum)v).intValue();
		} else if (v instanceof RubyFloat) {
			d = ((RubyFloat)v).doubleValue();
		} else {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "invalid value for Float(): " + v);
		}

		return ObjectFactory.createFloat(Math.exp(d));
	}
}

public class MathModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.MathModule;
		m.defineMethod("sqrt", new Math_sqrt());
		m.defineMethod("exp", new Math_exp());
	}
}
