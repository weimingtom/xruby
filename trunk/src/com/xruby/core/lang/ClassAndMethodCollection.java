/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.util.HashMap;
import java.util.Map;

abstract class ClassAndMethodCollection extends MethodCollection {
	protected Map<String, RubyClass> classes_ = new HashMap<String, RubyClass>();

	public RubyClass defineNewClass(String name, RubyClass parent) {
		RubyClass c = new RubyClass(name, parent);
		classes_.put(name, c);
		return c;
	}

	/// define a new class or get a old one
	public RubyClass defineClass(String name, RubyClass parent) throws RubyException {
		RubyClass c = classes_.get(name);
		if (null == c) {
			c = new RubyClass(name, parent);
			classes_.put(name, c);
		} else if (!c.isMyParent(parent)){
			throw new RubyException(RubyRuntime.NameErrorClass, "superclass mismatch for class "+ name + " (TypeError)");
		}
		
		return c;
	}

	public RubyClass defineClass(String name, String parent) throws RubyException {
		RubyClass p = classes_.get(name);
		if (null == p) {
			throw new RubyException(RubyRuntime.NameErrorClass, "superclass " + name + " has not been for defined ");
		}

		return defineClass(name, p);
	}
	
}
