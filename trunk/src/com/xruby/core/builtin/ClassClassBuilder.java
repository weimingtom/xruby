/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class Class_new extends RubyMethod {
	public Class_new(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		RubyClass value = (RubyClass)receiver.getValue();
		return new RubyValue(value, null);
	}
}

public class ClassClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Class", RubyRuntime.ModuleClass);
		c.defineMethod("new", new Class_new(0));
		return c;
	}
}
