/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import java.util.HashMap;
import java.util.Map;

abstract class ClassAndMethodCollection extends MethodCollectionWithMixin {
	protected Map<String, RubyValue> constants_ = new HashMap<String, RubyValue>();

	ClassAndMethodCollection(RubyClass c) {
		super(c);
	}

	public void addNewClass(String name, RubyClass c) {
		constants_.put(name, c);
	}

	/// This method is only used by java classes in package 'com.xruby.runtime.builtin'.
	/// It has less overhead than 'defineClass' (no hash table lookup).
	/// This method is NOT used by classes compiled from ruby script.
	public RubyClass defineNewClass(String name, RubyClass parent) {
		RubyClass c = new RubyClass(name, parent);
		constants_.put(name, c);
		return c;
	}

	private RubyClass defineClass(String name, RubyClass parent) {
		RubyValue v = constants_.get(name);
		if (null == v) {
			RubyClass c = new RubyClass(name, (null == parent) ? RubyRuntime.ObjectClass : parent);
			constants_.put(name, c);
			return c;
		}

		if (!(v instanceof RubyClass)) {
			throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a class");
		}

		RubyClass c = (RubyClass)v;

		if (null != parent) {
			if (!c.isMyParent(parent)){
				throw new RubyException(RubyRuntime.TypeErrorClass, "superclass mismatch for class "+ name);
			}
		}

		c.setAccessPublic();
		return c;
	}

	/// define a new class or get a old one
	public RubyClass defineClass(String name, RubyValue parent) {
		if (null != parent && !(parent instanceof RubyClass)) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "superclass must be a Class (" + parent.getRubyClass().getName() + " given)");
		}

		return defineClass(name, null == parent ? null : (RubyClass)parent);
	}

	/// For compile-time recognizable builtin class
	public RubyClass defineBuiltInClass(RubyValue v, RubyValue parent) {
		RubyClass c = (RubyClass)v;

		if (null != parent) {
			if (!(parent instanceof RubyClass)) {
				throw new RubyException(RubyRuntime.TypeErrorClass, "superclass must be a Class (" + parent.getRubyClass().getName() + " given)");
			}

			if (!c.isMyParent((RubyClass)parent)){
				throw new RubyException(RubyRuntime.TypeErrorClass, "superclass mismatch for class "+ c.getName());
			}
		}

		c.setAccessPublic();
		return c;
	}
	
}
