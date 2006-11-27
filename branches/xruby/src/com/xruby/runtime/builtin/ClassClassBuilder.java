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
		RubyClass r = (RubyClass)receiver;
		RubyValue v = r.invokeAllocMethod(receiver);
		callInitializeMethod(v, args, block);
		return v;
	}

	private void callInitializeMethod(RubyValue v, RubyArray args, RubyBlock block) {
		RubyMethod m = v.findMethod("initialize");
		if (m != null) {
			m.invoke(v, args, block);
		}
	}
}

class Class_operator_equal extends RubyMethod {
	public Class_operator_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyClass value1 = (RubyClass)receiver;
		RubyClass value2 = (RubyClass)args.get(0);
		return ObjectFactory.createBoolean(value1 == value2);
	}
}

public class ClassClassBuilder {

	static RubyMethod class_new_ = new Class_new();
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Class", RubyRuntime.ModuleClass);
		c.defineMethod("new", class_new_);
		c.defineMethod("==", new Class_operator_equal());
		return c;
	}
}
