package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;


class Range_begin extends RubyMethod {
	public Range_begin() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RangeValue r = (RangeValue)receiver.getValue();
		return r.getLeft();
	}
}

class Range_end extends RubyMethod {
	public Range_end() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RangeValue r = (RangeValue)receiver.getValue();
		return r.getRight();
	}
}

class Range_exclude_end extends RubyMethod {
	public Range_exclude_end() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RangeValue r = (RangeValue)receiver.getValue();
		return r.excludeEnd();
	}
}

class Range_initialize extends RubyMethod {
	public Range_initialize() {
		super(3, false, 1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyValue left = args.get(0);
		RubyValue right = args.get(1);
		boolean isExclusive = false;
		if (args.size() == 3){
			RubyValue exclusive = args.get(2);
			if (exclusive != ObjectFactory.nilValue && exclusive != ObjectFactory.falseValue){
				isExclusive = true;
			}
		}
		receiver.setValue(ObjectFactory.createRange(left, right, isExclusive).getValue());
		return receiver;
	}
}

public class RangeClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Range", RubyRuntime.ObjectClass);
		//c.defineMethod("===", new Range_case_equal());
		//c.defineMethod("to_s", new Range_to_s());
		c.defineMethod("begin", new Range_begin());
		c.defineMethod("end", new Range_end());
		c.defineMethod("exclude_end?", new Range_exclude_end());
		c.defineMethod("initialize", new Range_initialize());
		return c;
	}
}