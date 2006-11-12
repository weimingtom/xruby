package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Time_new extends RubyMethod {
	public Time_new() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return ObjectFactory.createTime(new TimeValue());
	}
}

class Time_to_f extends RubyMethod {
	public Time_to_f() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		TimeValue t = (TimeValue)receiver.getValue();
		return ObjectFactory.createFloat(t.getTime());
	}
}

class Time_to_i extends RubyMethod {
	public Time_to_i() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		TimeValue t = (TimeValue)receiver.getValue();
		return ObjectFactory.createFixnum((int)t.getTime());
	}
}

public class TimeClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Time", RubyRuntime.ObjectClass);
		c.defineMethod("to_f", new Time_to_f());
		c.defineMethod("to_i", new Time_to_i());
		return c;
	}

	//Do not call this method in create(), otherwise it will cause initialization probelem.
	public static void initSingletonMethods() {
		RubyMethod m = new Time_new();
		ObjectFactory.TimeClassValue.defineMethod("new", m);
		ObjectFactory.TimeClassValue.defineMethod("now", m);
	}
}

