/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class Numeric_unary_plus extends RubyMethod {
	public Numeric_unary_plus() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		return receiver;
	}
}

class Numeric_unary_minus extends RubyMethod {
	public Numeric_unary_minus() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		return RubyRuntime.callPublicMethod(ObjectFactory.createFixnum(0), receiver, "-");
	}
}

public class NumericClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Numeric", RubyRuntime.ObjectClass);
		c.defineMethod("+@", new Numeric_unary_plus());
		c.defineMethod("-@", new Numeric_unary_minus());
		return c;
	}
}
