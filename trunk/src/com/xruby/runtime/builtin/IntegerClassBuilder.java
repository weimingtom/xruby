/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class Integer_get_bit extends RubyMethod {
	public Integer_get_bit() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block)  {
		int index = ((RubyFixnum)args.get(0)).intValue();
		if (index < 0 || index >= 32){
			return ObjectFactory.fixnum0;
		}
		int value = ((RubyFixnum)receiver).intValue();
		if (((1 << index) & value) != 0) {
			return ObjectFactory.fixnum1;
		}
		return ObjectFactory.fixnum0;
	}
}

class Integer_chr extends RubyMethod {
	public Integer_chr() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		int value = ((RubyFixnum)receiver).intValue();
		if (value < 0 || value > 255){
			throw new RubyException(RubyRuntime.RangeErrorClass, value + " out of char range");
		}
		char charValue = (char)value;
		return ObjectFactory.createString("" + charValue);
	}
}

public class IntegerClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.IntegerClass;
		c.defineMethod("[]",  new Integer_get_bit());
		c.defineMethod("chr",  new Integer_chr());
	}
}
