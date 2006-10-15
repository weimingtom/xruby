/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class Class_new extends RubyMethod {
	public Class_new() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		RubyClass value = (RubyClass)receiver.getValue();		
		RubyValue clazz = new RubyValue(value, null);
		callInitializeMethod(clazz, args, block);
		
		return clazz;
	}

	private void callInitializeMethod(RubyValue clazz, ArrayValue args,
			RubyBlock block) throws RubyException {
		RubyMethod m = clazz.findMethod("initialize");
		if (m != null) {
			m.invoke(clazz, args, block);
		}
	}
}

public class ClassClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Class", RubyRuntime.ModuleClass);
		c.defineMethod("new", new Class_new());
		return c;
	}
}
