/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.IntegerValue;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class Integer_get_bit extends RubyMethod {
	public Integer_get_bit() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		int index = ((IntegerValue)args.get(0).getValue()).intValue();
		if (index < 0 || index >= 32){
			return ObjectFactory.createFixnum(0);
		}
		int value = ((IntegerValue)receiver.getValue()).intValue();
		if (((1 << index) & value) != 0) {
			return ObjectFactory.createFixnum(1);
		}
		return ObjectFactory.createFixnum(0);
	}
}

class Integer_chr extends RubyMethod {
	public Integer_chr() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		int value = ((IntegerValue)receiver.getValue()).intValue();
		if (value < 0 || value > 255){
			throw new RubyException(RubyRuntime.RangeErrorClass, value + " out of char range");
		}
		char charValue = (char)value;
		return ObjectFactory.createString("" + charValue);
	}
}

public class IntegerClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Integer", RubyRuntime.NumericClass);
		c.defineMethod("[]",  new Integer_get_bit());
		c.defineMethod("chr",  new Integer_chr());
		return c;
	}
}
