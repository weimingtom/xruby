/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Numeric_unary_plus extends RubyMethod {
	public Numeric_unary_plus() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return receiver;
	}
}

class Numeric_unary_minus extends RubyMethod {
	public Numeric_unary_minus() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return RubyAPI.callPublicMethod(ObjectFactory.createFixnum(0), receiver, "-");
	}
}

public class NumericClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.NumericClass;
		c.defineMethod("+@", new Numeric_unary_plus());
		c.defineMethod("-@", new Numeric_unary_minus());
	}
}
