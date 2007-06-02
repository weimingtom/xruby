/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Exception_to_s extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = receiver.toString();
		return ObjectFactory.createString(value);
	}
}

class Exception_new extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return new RubyExceptionValue((RubyClass)receiver);
	}
}

class Exception_backtrace extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyExceptionValue e = (RubyExceptionValue)receiver;
        return e.backtrace();
	}
}

class Exception_initialize extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyExceptionValue e = (RubyExceptionValue)receiver;
		if (null == args) {
			e.setMessage("");
		} else {
			//TODO type check before casting
			e.setMessage(((RubyString)args.get(0)).toString());
		}
		
		return e;
	}
}

public class ExceptionClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.ExceptionClass;
		c.defineMethod("initialize", new Exception_initialize());
		RubyMethod to_s = new Exception_to_s();
		c.defineMethod(CommonRubyID.toSID, to_s);
		c.defineMethod("message", to_s);
		c.defineMethod("to_str", to_s);
        c.defineMethod("backtrace", new Exception_backtrace());
		c.defineAllocMethod(new Exception_new());
	}
}
