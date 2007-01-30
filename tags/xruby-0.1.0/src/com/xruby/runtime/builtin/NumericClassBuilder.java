/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
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
		return RubyAPI.callPublicMethod(ObjectFactory.fixnum0, receiver, "-");
	}
}

public class NumericClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.NumericClass;
		c.defineMethod("+@", new Numeric_unary_plus());
		c.defineMethod("-@", new Numeric_unary_minus());
	}
}
