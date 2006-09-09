/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;

class Object_operator_equal extends RubyMethod {
	public Object_operator_equal(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		if (receiver == args[0]) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

public class ObjectClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Object", null);
		c.includeModule(RubyRuntime.KernelModule);
		c.defineMethod("==", new Object_operator_equal(1));
		return c;
	}
	
}
