/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class Float_to_s extends RubyMethod {
	public Float_to_s(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		Float value = (Float)receiver.getValue();
		return ObjectFactory.createString(value.toString());
	}
}

public class FloatClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Float", RubyRuntime.NumericClass);
		c.defineMethod("to_s", new Float_to_s(-1));
		return c;
	}
}
