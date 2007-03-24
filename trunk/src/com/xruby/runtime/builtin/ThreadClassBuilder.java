/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Thread_join extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyThread t = (RubyThread)receiver;
		t.join();
		return t;
	}
}

class Thread_new extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return new RubyThread(block);
	}
}

class Thread_current extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return RubyThread.current();
	}
}

//c ruby does not have this method, but since we wrapped java's Thread, can no longer use java's == operator
class Thread_equal extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		if (receiver.equals(arg)) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Thread_array_access extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		//TODO implement this!
		return ObjectFactory.nilValue;
	}
}

class Thread_array_set extends RubyTwoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
		//TODO implement this!
		return arg2;
	}
}

public class ThreadClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.ThreadClass;
		c.defineMethod("join", new Thread_join());
		c.defineMethod("[]", new Thread_array_access());
		c.defineMethod("[]=", new Thread_array_set());
		c.defineMethod("==", new Thread_equal());
		c.getSingletonClass().defineMethod("current", new Thread_current());
		c.getSingletonClass().defineMethod("new", new Thread_new());
	}
}
