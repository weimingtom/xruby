/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;

class Numeric_unary_plus extends RubyMethod {
	public Numeric_unary_plus(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		return receiver;
	}
}

class Numeric_unary_minus extends RubyMethod {
	public Numeric_unary_minus(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		return RubyRuntime.callPublicMethod(ObjectFactory.createFixnum(0), receiver, "-");
	}
}

public class NumericClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Numeric", RubyRuntime.ObjectClass);
		c.defineMethod("+@", new Numeric_unary_plus(0));
		c.defineMethod("-@", new Numeric_unary_minus(0));
		return c;
	}
}
