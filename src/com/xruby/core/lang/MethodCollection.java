/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.util.*;

abstract class ClassVariableCollection {
	protected String name_;
	private Map<String, RubyValue> class_varibles_ = new HashMap<String, RubyValue>();

	public String getName() {
		return name_;
	}

	public RubyValue getClassVariable(String name) throws RubyException {
		RubyValue v = class_varibles_.get(name);
		if (null != v) {
			return v;
		} else {
			throw new RubyException(RubyRuntime.NameErrorClass,
					"uninitialized class variable " + name + " in " + name_);
		}
	}
	
	public RubyValue setClassVariable(RubyValue value, String name) {
		class_varibles_.put(name, value);
		return value;
	}
}

public abstract class MethodCollection extends ClassVariableCollection {
	private Map<String, RubyMethod> methods_ = new HashMap<String, RubyMethod>();
	protected int current_access_mode_ = RubyMethod.PUBLIC;

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

	public void setAccessPublic() {
		current_access_mode_ = RubyMethod.PUBLIC;
	}
	
	public void setAccessPrivate() {
		current_access_mode_ = RubyMethod.PRIVATE;
	}
	
	public void setAccessMode(int access) {
		current_access_mode_ = access;
	}

	public RubyMethod setAccess(String method_name, int access) {
		RubyMethod m = findMethod(method_name);
		if (null != m) {
			m.setAccess(access);
		} 

		return m;
	}
}
