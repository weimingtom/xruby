/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Float_to_s extends RubyMethod {
	public Float_to_s() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		Float value = (Float)receiver.getValue();
		return ObjectFactory.createString(value.toString());
	}
}

public class FloatClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Float", RubyRuntime.NumericClass);
		c.defineMethod("to_s", new Float_to_s());
		return c;
	}
}
