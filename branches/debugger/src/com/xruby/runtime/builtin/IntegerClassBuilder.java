/** 
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

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

/*
Without optimization for Fixnum, the code should look like:
def times		
	a = 0		
	while a < self
		yield a
		a += 1; 	
	end 
end
*/
class Integer_times extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		if (receiver instanceof RubyFixnum) {
			int value = ((RubyFixnum)receiver).intValue();
			for (int i = 0; i < value; ++i) {
				RubyValue v = block.invoke(receiver, new RubyArray(ObjectFactory.createFixnum(i)));
				if (block.breakedOrReturned()) {
					return v;
				}
			}
		} else {
			RubyValue a = ObjectFactory.fixnum0;
			while (RubyAPI.testTrueFalse(RubyAPI.callPublicOneArgMethod(a, receiver, null, "<"))) {
				RubyValue v = block.invoke(receiver, new RubyArray(a));
				if (block.breakedOrReturned()) {
					return v;
				}
				a = RubyAPI.callPublicOneArgMethod(a, ObjectFactory.fixnum1, null, "+");
			}
		}
		
		return receiver;
	}
}

public class IntegerClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.IntegerClass;
		c.defineMethod("[]",  new Integer_get_bit());
		c.defineMethod("chr",  new Integer_chr());
		c.defineMethod("times",  new Integer_times());
	}
}
