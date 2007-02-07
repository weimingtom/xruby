/** 
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.ObjectFactory;

class Integer_get_bit extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block)  {
		int index = ((RubyFixnum)arg).intValue();
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

class Integer_chr extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
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
