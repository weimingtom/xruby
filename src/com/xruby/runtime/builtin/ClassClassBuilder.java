/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Class_new extends RubyMethod {
	public Class_new() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyClass value = (RubyClass)receiver.getValue();		
		RubyValue clazz = new RubyValue(value, null);
		callInitializeMethod(clazz, args, block);
		
		return clazz;
	}

	private void callInitializeMethod(RubyValue clazz, RubyArray args,
			RubyBlock block) {
		RubyMethod m = clazz.findMethod("initialize");
		if (m != null) {
			m.invoke(clazz, args, block);
		}
	}
}

class Class_operator_equal extends RubyMethod {
	public Class_operator_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyClass value1 = (RubyClass)receiver.getValue();
		RubyClass value2 = (RubyClass)args.get(0).getValue();
		return ObjectFactory.createBoolean(value1 == value2);
	}
}

public class ClassClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Class", RubyRuntime.ModuleClass);
		c.defineMethod("new", new Class_new());
		c.defineMethod("==", new Class_operator_equal());
		return c;
	}
}
