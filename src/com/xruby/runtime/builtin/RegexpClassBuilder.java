package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;


class Regexp_case_equal extends RubyMethod {
	public Regexp_case_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		Object o = args.get(0).getValue();
		if (!(o instanceof StringValue)) {
			//not comparable
			return ObjectFactory.falseValue;
		}

		RegexpValue r = (RegexpValue)receiver.getValue();
		if (r.caseEqual(((StringValue)o).toString())) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Regexp_match extends RubyMethod {
	public Regexp_match() {
		super(1);
	}
	
	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		Object o = args.get(0).getValue();
		if (!(o instanceof StringValue)) {
			//not comparable
			return ObjectFactory.falseValue;
		}

		RegexpValue r = (RegexpValue)receiver.getValue();
		MatchDataValue m = r.match(((StringValue)o).toString());
		if (null == m) {
			return ObjectFactory.nilValue;
		} else {
			return ObjectFactory.createMatchData(m);
		}
	}
}

public class RegexpClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Regexp", RubyRuntime.ObjectClass);
		c.defineMethod("===", new Regexp_case_equal());
		c.defineMethod("match", new Regexp_match());
		return c;
	}
}
