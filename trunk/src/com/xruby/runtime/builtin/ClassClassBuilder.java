/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.lang.util.MethodFactory;
import com.xruby.runtime.lang.util.MethodType;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

class Class_singleton_new extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyClass superclass;
		if (null == args) {
			superclass = RubyRuntime.ObjectClass;
		} else {
			superclass = (RubyClass)args.get(0);
		}

		return RubyAPI.defineClass("", superclass);
	}
}

class EmptyMethod extends RubyOneArgMethod {

	public static final EmptyMethod INSTANCE = new EmptyMethod();

	private EmptyMethod() {
	}

	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		return ObjectFactory.NIL_VALUE;
	}
}

public class ClassClassBuilder {
    public static void initialize() {
        RubyClass c = RubyRuntime.ClassClass;
        MethodFactory factory = MethodFactory.createMethodFactory(RubyClass.class);
        c.defineMethod("new", factory.getMethodWithBlock("newInstance", MethodType.VAR_ARG));
        c.defineMethod("superclass", factory.getMethod("superclass", MethodType.NO_ARG));
		c.getSingletonClass().defineMethod("new", new Class_singleton_new());
		c.defineMethod("inherited", EmptyMethod.INSTANCE);

        /*
        c.setAccessPrivate();        
        c.defineMethod("inherited", new RubyDummyMethod());
        */
    }
}
