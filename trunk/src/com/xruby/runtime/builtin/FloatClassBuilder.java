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
		FloatValue value = (FloatValue)receiver.getValue();
		return ObjectFactory.createString(value.toString());
	}
}

class Float_operator_minus extends RubyMethod {
	public Float_operator_minus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		FloatValue value1 = (FloatValue)receiver.getValue();
		FloatValue value2 = (FloatValue)args.get(0).getValue();
		return ObjectFactory.createFloat(value1.floatValue() - value2.floatValue());
	}
}

public class FloatClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Float", RubyRuntime.NumericClass);
		c.defineMethod("to_s", new Float_to_s());
		c.defineMethod("-", new Float_operator_minus());
		return c;
	}
}
