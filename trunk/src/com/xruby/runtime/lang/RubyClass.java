/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

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

	public RubyValue defineMethod(String name, RubyMethod m) {
		m.setOwner(this);
		return super.defineMethod(name, m);
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

	RubyMethod findSuperMethod(String name) {
		if (null != superclass_){
			return superclass_.findOwnMethod(name);
		}
		
		return null;
	}
	
	RubyMethod findOwnMethod(String name) {
		RubyMethod m = super.findOwnMethod(name);
		if (null != m) {
			return m;
		} 
		
		if (null != superclass_){
			return superclass_.findOwnMethod(name);
		}
		
		return null;
	}
	
	RubyMethod findOwnPublicMethod(String name) {
		RubyMethod m = super.findOwnPublicMethod(name);
		if (null != m) {
			return m;
		}
		
		if (null != superclass_){
			return superclass_.findOwnPublicMethod(name);
		}
		
		return null;
	}

	void collectClassMethodNames(RubyArray a) {
		super.collectOwnMethodNames(a);
		if (null != superclass_){
			superclass_.collectClassMethodNames(a);
		}
	}

	protected RubyValue findClassVariable(String name) {
		RubyValue v = super.findClassVariable(name);
		if (null != v) {
			return v;
		}
		
		if (null != superclass_){
			return superclass_.findClassVariable(name);
		}
		
		return null;
	}

	private RubyClass findWhereIsClassVariableDefined(String name) {
		RubyValue v = super.findClassVariable(name);
		if (null != v) {
			return this;
		}
		
		if (null != superclass_){
			return superclass_.findWhereIsClassVariableDefined(name);
		}
		
		return null;
	}

	private void setOwnClassVariable(RubyValue value, String name) {
		super.setClassVariable(value, name);
	}

	public RubyValue setClassVariable(RubyValue value, String name) {
		RubyClass c = findWhereIsClassVariableDefined(name);
		if (null == c) {
			setOwnClassVariable(value, name);
		} else {
			c.setOwnClassVariable(value, name);
		}
		
		return value;
	}
}
