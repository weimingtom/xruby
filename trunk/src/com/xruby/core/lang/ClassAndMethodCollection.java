/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.util.HashMap;
import java.util.Map;

abstract class ClassAndMethodCollection extends MethodCollection {
	protected Map<String, RubyValue> constants_ = new HashMap<String, RubyValue>();

	/// This method is only used by java classes in package 'com.xruby.core.builtin'.
	/// It has less overhead than 'defineClass' (no hash table lookup).
	/// This method is NOT used by classes compiled from ruby script.
	public RubyClass defineNewClass(String name, RubyClass parent) {
		RubyClass c = new RubyClass(name, parent);
		constants_.put(name, new RubyValue(RubyRuntime.ClassClass, c));//NOTE, do not use ObjectFactory.createClass, it will cause initialization issue
		return c;
	}

	private RubyClass defineClass(String name, RubyClass parent) throws RubyException {
		RubyValue v = constants_.get(name);
		if (null == v) {
			return defineNewClass(name, parent);
		}

		if (v.getRubyClass() != RubyRuntime.ClassClass) {
			throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a class");
		}
		
		RubyClass c = (RubyClass)v.getValue();
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
