/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Numeric_unary_plus extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return receiver;
	}
}

class Numeric_unary_minus extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return RubyAPI.callPublicOneArgMethod(ObjectFactory.fixnum0, receiver, null, "-");
	}
}

public class NumericClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.NumericClass;
		c.defineMethod("+@", new Numeric_unary_plus());
		c.defineMethod("-@", new Numeric_unary_minus());
	}
}
