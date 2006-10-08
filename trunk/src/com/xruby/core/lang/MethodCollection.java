/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.util.*;

public abstract class MethodCollection extends ClassVariableCollection {
	protected Map<String, RubyMethod> methods_ = new HashMap<String, RubyMethod>();
	private int current_access_mode_ = RubyMethod.PUBLIC;

	Map<String, RubyMethod> getMethods() {
		return methods_;
	}

	public void includeModule(RubyModule m) {
		methods_.putAll(m.getMethods());
		class_varibles_.putAll(m.getClassVaribles());
	}

	RubyMethod findMethod(String method_name) {
		return methods_.get(method_name);
	}

	RubyMethod findPublicMethod(String method_name) {
		RubyMethod m = methods_.get(method_name);
		if (null != m && m.isPublic()) {
			return m;
		}

		return null;
	}

	public RubyValue defineMethod(String name, RubyMethod m) {
		m.setAccess(current_access_mode_);
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
