/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.util.HashMap;
import java.util.Map;

abstract class MethodCollection {
	protected String name_;
	private Map<String, RubyMethod> methods_ = new HashMap<String, RubyMethod>();

	public String getName() {
		return name_;
	}

	RubyMethod findMethod(String method_name) {
		return methods_.get(method_name);
	}

	public RubyValue defineMethod(String name, RubyMethod m) {
		methods_.put(name, m);
		return null;//FIXME return something real!
	}
	
	public void undefMethod(String name) throws RubyException {
		if (methods_.remove(name) == null) {
			throw new RubyException(RubyRuntime.NameErrorClass, "undefined method " + name + "for class `Object' (NameError)");
		}
	}
	
	public void aliasMethod(String newName, String oldName) throws RubyException {
		RubyMethod m = methods_.get(oldName);
		if (null == m) {
			throw new RubyException(RubyRuntime.NameErrorClass, "undefined method " + oldName + "for class `Object' (NameError)");
		}
		
		methods_.put(newName, m);
	}
}
