/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.util.HashMap;
import java.util.Map;

abstract class ClassAndMethodCollection extends MethodCollection {
	protected Map<String, RubyClass> classes_ = new HashMap<String, RubyClass>();

	/// This method is only used by java classes in package 'com.xruby.core.builtin'.
	/// It has less overhead than 'defineClass' (no hash table lookup).
	/// This method is NOT used by classes compiled from ruby script.
	public RubyClass defineNewClass(String name, RubyClass parent) {
		RubyClass c = new RubyClass(name, parent);
		classes_.put(name, c);
		return c;
	}

	private RubyClass defineClass(String name, RubyClass parent) throws RubyException {
		RubyClass c = classes_.get(name);
		if (null == c) {
			c = new RubyClass(name, parent);
			classes_.put(name, c);
			return c;
		}

		if (!c.isMyParent(parent)){
			throw new RubyException(RubyRuntime.TypeErrorClass, "superclass mismatch for class "+ name);
		}

		c.setAccessPublic();
		return c;
	}

	/// define a new class or get a old one
	public RubyClass defineClass(String name, RubyValue parent) throws RubyException {
		if (parent.getRubyClass() != RubyRuntime.ClassClass) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "superclass must be a Class (" + parent.getRubyClass().getName() + " given)");
		}

		return defineClass(name, (RubyClass)parent.getValue());
	}
	
}
