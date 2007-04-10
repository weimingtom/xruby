/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Object_operator_equal extends RubyMethod {
	public Object_operator_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (receiver == args.get(0)) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Object_clone extends RubyMethod {
	public Object_clone() {
		super(0);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return (RubyValue)receiver.clone();
	}
}

class Object_alloc extends RubyMethod {
	public Object_alloc() {
		super(-1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return new RubyObject((RubyClass)receiver);
	}
}

public class ObjectClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.ObjectClass;
		RubyMethod equal = new Object_operator_equal();
		c.defineMethod("==", equal);
		c.defineMethod("equal?", equal);
		c.defineMethod("clone", new Object_clone());
		c.defineAllocMethod(new Object_alloc());
	}
}