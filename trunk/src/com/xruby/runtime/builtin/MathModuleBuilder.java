/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Math_sqrt extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyFixnum v = (RubyFixnum)arg;
		return ObjectFactory.createFloat(Math.sqrt(v.intValue()));
	}
}

class Math_exp extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		double d;
		if (arg instanceof RubyFixnum) {
			d = ((RubyFixnum)arg).intValue();
		} else if (arg instanceof RubyFloat) {
			d = ((RubyFloat)arg).doubleValue();
		} else {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "invalid value for Float(): " + arg);
		}

		return ObjectFactory.createFloat(Math.exp(d));
	}
}

public class MathModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.MathModule;
		m.defineModuleMethod("sqrt", new Math_sqrt());
		m.defineModuleMethod("exp", new Math_exp());
	}
}
