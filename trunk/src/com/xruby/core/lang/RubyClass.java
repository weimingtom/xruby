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
	private RubyClass superclass_;
	private ArrayList<RubyModule> mixins_ = new ArrayList<RubyModule>();

	public RubyClass(String name, RubyClass superclass) {
		super.name_ = name;
		superclass_ = superclass;
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
