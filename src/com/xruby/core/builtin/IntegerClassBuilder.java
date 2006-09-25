/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class Integer_to_int extends RubyMethod {
	public Integer_to_int(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		return receiver;
	}
}

class Integer_to_i extends RubyMethod {
	public Integer_to_i(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		return receiver;
	}
}

public class IntegerClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Integer", RubyRuntime.NumericClass);
		c.defineMethod("to_int", new Integer_to_int(0));
		c.defineMethod("to_i", new Integer_to_i(0));
		return c;
	}
}
