package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class Range_case_equal extends RubyMethod {
	public Range_case_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
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

public class RangeClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Range", RubyRuntime.ObjectClass);
		c.defineMethod("===", new Range_case_equal());
		return c;
	}
}