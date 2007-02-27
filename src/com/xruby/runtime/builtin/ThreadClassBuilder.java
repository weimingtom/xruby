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

public class ThreadClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.ThreadClass;
		c.defineMethod("join", new Thread_join());
		c.getSingletonClass().defineMethod("new", new Thread_new());
	}
}
