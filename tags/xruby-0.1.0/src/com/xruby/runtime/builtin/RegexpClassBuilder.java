/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;


class Regexp_case_equal extends RubyMethod {
	public Regexp_case_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (!(args.get(0) instanceof RubyString)) {
			//not comparable
			return ObjectFactory.falseValue;
		}

		RubyRegexp r = (RubyRegexp)receiver;
		if (r.caseEqual(((RubyString)args.get(0)).toString())) {
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
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (!(args.get(0) instanceof RubyString)) {
			//not comparable
			return ObjectFactory.falseValue;
		}

		RubyRegexp r = (RubyRegexp)receiver;
		RubyMatchData m = r.match(((RubyString)args.get(0)).toString());
		if (null == m) {
			return ObjectFactory.nilValue;
		} else {
			return m;
		}
	}
}

class Regexp_match_operator extends RubyMethod {
	public Regexp_match_operator() {
		super(1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (!(args.get(0) instanceof RubyString)) {
			//not comparable
			return ObjectFactory.falseValue;
		}

		RubyRegexp r = (RubyRegexp)receiver;
		int p = r.matchPosition(((RubyString)args.get(0)).toString());
		if (p < 0) {
			return ObjectFactory.nilValue;
		} else {
			return ObjectFactory.createFixnum(p);
		}
	}
}

class Regexp_new extends RubyMethod {
	public Regexp_new() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return ObjectFactory.createRegexp();
	}
}

class Regexp_quote extends RubyMethod {
	public Regexp_quote() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString s = (RubyString)args.get(0);
		return ObjectFactory.createString(RubyRegexp.quote(s.toString()));
	}
}

public class RegexpClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.RegexpClass;
		c.defineMethod("===", new Regexp_case_equal());
		c.defineMethod("match", new Regexp_match());
		c.defineMethod("=~", new Regexp_match_operator());
		RubyMethod quote = new Regexp_quote();
		c.getSingletonClass().defineMethod("escape", quote);
		c.getSingletonClass().defineMethod("quote", quote);
		c.defineAllocMethod(new Regexp_new());
	}
}
