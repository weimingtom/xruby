package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class GC_start extends RubyMethod {
	public GC_start() {
		super(0);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		System.gc();
		return ObjectFactory.nilValue;
	}
}

public class GCModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.GCModule;
		m.getSingletonClass().defineMethod("start", new GC_start());
	}
}
