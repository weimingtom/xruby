package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Range_case_equal extends RubyMethod {
	public Range_case_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		Object o = args.get(0).getValue();
		if (!(o instanceof IntegerValue)) {
			//not comparable
			return ObjectFactory.falseValue;
		}

		RangeValue r = (RangeValue)receiver.getValue();
		if (r.include(((IntegerValue)o).intValue())) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Range_to_s extends RubyMethod {
	public Range_to_s() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RangeValue r = (RangeValue)receiver.getValue();
		int left = r.getLeft();
		int right = r.getRight();
		
		return ObjectFactory.createString(left + "..." + right);
	}
}

public class RangeClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Range", RubyRuntime.ObjectClass);
		c.defineMethod("===", new Range_case_equal());
		c.defineMethod("to_s", new Range_to_s());
		return c;
	}
}