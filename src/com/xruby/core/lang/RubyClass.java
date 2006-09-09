/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.util.*;
import com.xruby.core.builtin.*;

/**
 * Hold all instances of the class
 */
public class RubyClass extends MethodCollection {
	//private Set<RubyObject> instances_ = new HashSet<RubyObject>();
	private Map<String, RubyValue> class_varibles_ = new HashMap<String, RubyValue>();
	private RubyClass superclass_;
	private ArrayList<RubyModule> mixins_ = new ArrayList<RubyModule>();
	private int current_access_mode_ = RubyMethod.PUBLIC;

	public RubyClass(String name, RubyClass superclass) {
		super.name_ = name;
		superclass_ = superclass;
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

	boolean isMyParent(final RubyClass superclass) {
		return superclass_ == superclass;
	}

	boolean isInstanceOf(RubyClass value) {
		if (value == this) {
			return true;
		} else if (null != superclass_) {
			return superclass_.isInstanceOf(value);
		} else {
			return false;
		}
	}

	public void includeModule(RubyModule m) {
		mixins_.add(m);
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

	public RubyValue defineMethod(String name, RubyMethod m) {
		m.setAccess(current_access_mode_);
		//FIXME may need to override the method in super class
		return super.defineMethod(name, m);
	}

	RubyMethod findMethod(String method_name) {
		RubyMethod m = super.findMethod(method_name);
		if (null != m) {
			return m;
		}
		
		for (RubyModule module : mixins_) {
			m = module.findMethod(method_name);
			if (null != m) {
				return m;
			}
		}
		
		if (null != superclass_) {
			return superclass_.findMethod(method_name);
		}

		return null;
	}

	RubyMethod findPublicMethod(String method_name) {
		RubyMethod m = super.findMethod(method_name);
		if (null != m && m.isPublic()) {
			return m;
		}
		
		for (RubyModule module : mixins_) {
			m = module.findMethod(method_name);
			if (null != m && m.isPublic()) {
				return m;
			}
		}
		
		if (null != superclass_){
			return superclass_.findPublicMethod(method_name);
		}

		return null;
	}

}
