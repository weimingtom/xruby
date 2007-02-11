/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Object_operator_equal extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		if (receiver == arg) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Object_clone extends RubyNoArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return (RubyValue)receiver.clone();
	}
}

class Object_alloc extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return new RubyObject((RubyClass)receiver);
	}
}

class Object_object_id extends RubyNoArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		//Object.hashCode() javadoc:
		//As much as is reasonably practical, the hashCode method defined
		//by class Object does return distinct integers for distinct objects.
		return ObjectFactory.createFixnum(receiver.hashCode());
	}
}

public class ObjectClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.ObjectClass;
		RubyMethod equal = new Object_operator_equal();
		c.defineMethod("==", equal);
		c.defineMethod("equal?", equal);
		c.defineMethod("clone", new Object_clone());
		RubyMethod object_id = new Object_object_id();
		c.defineMethod("object_id", object_id);
		c.defineMethod("__id__", object_id);
		c.defineAllocMethod(new Object_alloc());
	}
}
