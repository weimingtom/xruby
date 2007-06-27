/**
 * Copyright 2005-2007 Xue Yong Zhi, Jie Li, Ye Zheng, Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.CommonRubyID;
import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyID;
import com.xruby.runtime.lang.RubyNoArgMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyVarArgMethod;
import com.xruby.runtime.lang.StringMap;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyFixnum;
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
                RubyValue v = block.invoke(receiver, ite);
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
                RubyValue v = block.invoke(receiver, ite);
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

class Range_hash extends RubyNoArgMethod {
    protected RubyValue run(RubyValue receiver, RubyBlock block) {
        RubyRange rr = (RubyRange)receiver;
        int baseHash = rr.isExcludeEnd()?1:0;
        int beginHash = ((RubyFixnum)RubyAPI.callPublicMethod(rr.getLeft(),null,null, StringMap.intern("hash"))).intValue();
        int endHash = ((RubyFixnum)RubyAPI.callPublicMethod(rr.getRight(),null,null, StringMap.intern("hash"))).intValue();
        
        int hash = baseHash;
        hash = hash ^ (beginHash << 1);
        hash = hash ^ (endHash << 9);
        hash = hash ^ (baseHash << 24);
        return ObjectFactory.createFixnum(hash);
    }
}

public class RangeClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.RangeClass;
        c.defineMethod("begin", new Range_begin());
        c.defineMethod("end", new Range_end());
        c.defineMethod("exclude_end?", new Range_exclude_end());
        c.defineMethod("initialize", new Range_initialize());
        c.defineMethod("each", new Range_each());
        c.defineMethod("hash", new Range_hash());
        c.defineAllocMethod(new Range_new());
    }
}