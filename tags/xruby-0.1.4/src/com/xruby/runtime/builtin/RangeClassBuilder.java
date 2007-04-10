/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyRange;

class Range_begin extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyRange r = (RubyRange) receiver;
        return r.getLeft();
    }
}

class Range_end extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyRange r = (RubyRange) receiver;
        return r.getRight();
    }
}

class Range_exclude_end extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyRange r = (RubyRange) receiver;
        return ObjectFactory.createBoolean(r.isExcludeEnd());
    }
}

class Range_initialize extends RubyVarArgMethod {
    public Range_initialize() {
        super(3, false, 1);
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        RubyValue left = args.get(0);
        RubyValue right = args.get(1);
        boolean isExclusive = false;
        if (args.size() == 3) {
            RubyValue exclusive = args.get(2);
            if (exclusive != ObjectFactory.NIL_VALUE && exclusive != ObjectFactory.FALSE_VALUE) {
                isExclusive = true;
            }
        }
        ((RubyRange) receiver).setValue(left, right, isExclusive);
        return receiver;
    }
}

class Range_new extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        return ObjectFactory.createRange();
    }
}

class Range_to_a extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyRange r = (RubyRange) receiver;
        return r.to_a();
    }
}

/*
		return self if exclude_end? && (self.begin <=> self.end) != -1
		return self if !exclude_end? && (self.begin <=> self.end) == 1
		iter = self.begin
		while (iter <=> self.end) != 0
			yield(iter)
			iter = iter.succ
		end
		yield(iter) unless exclude_end?
		self
*/
class Range_each extends RubyNoArgMethod {
    private RubyID succID = StringMap.intern("succ");

    private boolean compare(RubyValue value1, RubyValue value2) {
        RubyValue r = RubyAPI.callPublicOneArgMethod(value1, value2, null, CommonRubyID.unequalID);
        return !RubyAPI.testEqual(r, ObjectFactory.FIXNUM0);
    }

    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyRange r = (RubyRange) receiver;
        RubyValue ite = r.getLeft();

        while (true) {
            while (compare(ite, r.getRight())) {
                RubyValue v = block.invoke(receiver, new RubyArray(ite));
                if (block.breakedOrReturned()) {
                    return v;
                } else if (block.shouldRedo()) {
                    ite = r.getLeft();
                    continue;
                } else {
                    ite = RubyAPI.callPublicMethod(ite, null, null, succID);
                }
            }

            if (!r.isExcludeEnd()) {
                RubyValue v = block.invoke(receiver, new RubyArray(ite));
                if (block.breakedOrReturned()) {
                    return v;
                } else if (block.shouldRedo()) {
                    ite = r.getLeft();
                    continue;
                } else {
                    break;
                }
            }

            break;
        }

        return receiver;
    }
}

public class RangeClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.RangeClass;
        //c.defineMethod("===", new Range_case_equal());
        //c.defineMethod("to_s", new Range_to_s());
        c.defineMethod("begin", new Range_begin());
        c.defineMethod("end", new Range_end());
        c.defineMethod("exclude_end?", new Range_exclude_end());
        c.defineMethod("initialize", new Range_initialize());
        c.defineMethod("each", new Range_each());
        c.defineMethod("to_a", new Range_to_a());
        c.defineAllocMethod(new Range_new());
    }
}