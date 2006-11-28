/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

/**
 * Hold all instances of the class
 */
public class RubyClass extends RubyModule {
	//private Set<RubyObject> instances_ = new HashSet<RubyObject>();
	private RubyClass superclass_;
	private RubyMethod alloc_method_;
	
	public RubyClass(String name, RubyClass superclass) {
		super(name);
		superclass_ = superclass;
	}
	
	//We called super(null, ...) in RubyModule's constructor to avoid initialization pains 
	public RubyClass getRubyClass() {
		return RubyRuntime.ClassClass;
	}
	
	public void defineAllocMethod(RubyMethod m) {
		alloc_method_ = m;
	}
	
	public RubyValue invokeAllocMethod(RubyValue reciver) {//TODO reciver can be 'this' in the future
		if (null != alloc_method_) {
			return alloc_method_.invoke(reciver, null, null);
		} else {
			return superclass_.invokeAllocMethod(reciver);
		}
	}

	boolean isMyParent(final RubyClass superclass) {
		return superclass_ == superclass;
	}

	boolean isKindOf(RubyClass value) {
		if (value == this) {
			return true;
		} else if (null != superclass_) {
			return superclass_.isKindOf(value);
		} else {
			return false;
		}
	}

	RubyMethod findSuperMethod(String method_name) {
		if (null != superclass_){
			return superclass_.findOwnMethod(method_name);
		}
		
		return null;
	}
	
	RubyMethod findOwnMethod(String method_name) {
		RubyMethod m = super.findOwnMethod(method_name);
		if (null != m) {
			return m;
		} 
		
		if (null != superclass_){
			return superclass_.findOwnMethod(method_name);
		}
		
		return null;
	}
	
	RubyMethod findOwnPublicMethod(String method_name) {
		RubyMethod m = super.findOwnPublicMethod(method_name);
		if (null != m) {
			return m;
		}
		
		if (null != superclass_){
			return superclass_.findOwnPublicMethod(method_name);
		}
		
		return null;
	}

	void collectClassMethodNames(RubyArray a) {
		super.collectOwnMethodNames(a);
		if (null != superclass_){
			superclass_.collectClassMethodNames(a);
		}
	}
}
