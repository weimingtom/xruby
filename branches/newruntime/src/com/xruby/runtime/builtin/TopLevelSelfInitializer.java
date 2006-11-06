package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class TopLevelSelf_include extends RubyMethod {
	public TopLevelSelf_include() {
		super(-1);
	}
	
	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		assert(ObjectFactory.topLevelSelfValue == receiver);

		for (RubyValue v : args) {
			RubyClass c = v.getRubyClass();
			if (c != RubyRuntime.ModuleClass) {
				throw new RubyException(RubyRuntime.TypeErrorClass, "wrong argument type " + c.getName() + " (expected Module)");
			}
			receiver.getRubyClass().includeModule((RubyModule)v.getValue());
		}
		
		return receiver;
	}
}

public class TopLevelSelfInitializer {
	public static void initSingletonMethods() {
		ObjectFactory.topLevelSelfValue.defineMethod("include", new TopLevelSelf_include());
	}
	
}
