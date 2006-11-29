/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import java.util.*;
import com.xruby.runtime.value.*;

public abstract class RubyValue {

	private RubyClass class_;
	private RubySingletonClass singleton_class_ = null;
	private Map<String, RubyValue> instance_varibles_ = new HashMap<String, RubyValue>();

	public RubyValue(RubyClass c) {
		class_ = c;
	}
	
	public RubyValue getInstanceVariable(String name) {
		RubyValue v = instance_varibles_.get(name);
		if (null != v) {
			return v;
		} else {
			return ObjectFactory.nilValue;
		}
	}
	
	public RubyValue setInstanceVariable(RubyValue value, String name) {
		instance_varibles_.put(name, value);
		return value;
	}

	public RubyClass getRubyClass() {
		return class_;
	}
	
	public RubyClass getSingletonClass() {
		if (null == singleton_class_) {
			singleton_class_ = new RubySingletonClass();
		}
		return singleton_class_;
	}
	
	public String toString() {
		return getRubyClass().getName() + super.toString();
	}

	public RubyMethod findPublicMethod(String name) {
		RubyMethod m = getSingletonClass().findOwnMethod(name);
		if (null != m && m.isPublic()) {
			return m;
		} 
		
		m = getRubyClass().findOwnPublicMethod(name);
		if (null != m) {
			return m;
		}
		
		return null;
	}

	public RubyMethod findMethod(String name) {
		RubyMethod m = getSingletonClass().findOwnMethod(name);
		if (null != m) {
			return m;
		}
		
		m = getRubyClass().findOwnMethod(name);
		if (null != m) {
			return m;
		}

		return null;
	}

	public void collectMethodNames(RubyArray a) {
		getSingletonClass().collectOwnMethodNames(a);
		getRubyClass().collectClassMethodNames(a);
	}

}

