package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;


class Range_begin extends RubyMethod {
	public Range_begin() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyRange r = (RubyRange)receiver;
		return r.getLeft();
	}
}

class Range_end extends RubyMethod {
	public Range_end() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyRange r = (RubyRange)receiver;
		return r.getRight();
	}
}

class Range_exclude_end extends RubyMethod {
	public Range_exclude_end() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyRange r = (RubyRange)receiver;
		return ObjectFactory.createBoolean(r.isExcludeEnd());
	}
}

class Range_initialize extends RubyMethod {
	public Range_initialize() {
		super(3, false, 1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block)  {
		RubyValue left = args.get(0);
		RubyValue right = args.get(1);
		boolean isExclusive = false;
		if (args.size() == 3){
			RubyValue exclusive = args.get(2);
			if (exclusive != ObjectFactory.nilValue && exclusive != ObjectFactory.falseValue){
				isExclusive = true;
			}
		}
		((RubyRange)receiver).setValue(left, right, isExclusive);
		return receiver;
	}
}

class Range_new extends RubyMethod {
	public Range_new() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return ObjectFactory.createRange();
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
		c.defineAllocMethod(new Range_new());
	}
}