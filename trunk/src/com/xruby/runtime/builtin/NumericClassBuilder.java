/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyFixnum;

class Numeric_unary_plus extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return receiver;
    }
}

class Numeric_unary_minus extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return RubyAPI.callPublicOneArgMethod(ObjectFactory.FIXNUM0, receiver, null, RubyID.subID);
    }
}

/*
def step(limit, step)
   if step > 0
	 i = self
	 while i < limit
	   yield i
	   i += step
	 end
   elsif step < 0
	  i = self
	 while i >= limit
	   yield i
	   i += step
	 end
   end
 end
*/
class Numeric_step extends RubyTwoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
        if (receiver instanceof RubyFixnum &&
                arg1 instanceof RubyFixnum &&
                arg2 instanceof RubyFixnum) {
            int from = ((RubyFixnum) receiver).intValue();
            int to = ((RubyFixnum) arg1).intValue();
            int step = ((RubyFixnum) arg2).intValue();
            if (step > 0) {
                for (int i = from; i < to; i += step) {
                    RubyValue v = block.invoke(receiver, ObjectFactory.createFixnum(i));
                    if (block.breakedOrReturned()) {
                        return v;
                    }
                }
            } else {
                for (int i = from; i >= to; i += step) {
                    RubyValue v = block.invoke(receiver, ObjectFactory.createFixnum(i));
                    if (block.breakedOrReturned()) {
                        return v;
                    }
                }
            }
        } else {
            throw new RubyException("not implemented!");
        }

        return receiver;
    }
}

public class NumericClassBuilder {

    public static void initialize() {
        RubyClass c = RubyRuntime.NumericClass;
        c.defineMethod("+@", new Numeric_unary_plus());
        c.defineMethod("-@", new Numeric_unary_minus());
        c.defineMethod("step", new Numeric_step());
    }
}
