/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import java.util.*;
import com.xruby.runtime.value.*;

public class RubyValue extends ModuleClassAndMethodCollection {

	private RubyClass class_;
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
	
	public boolean equals(Object obj) {
		RubyValue v = (RubyValue)obj;
		if (class_ != v.getRubyClass()) {
			return false;
		}
		
		return super.equals(obj);
	}
	
	public String toString() {
		return class_.toString() + super.toString();
	}

	public RubyMethod findPublicMethod(String method_name) {
		RubyMethod m = super.findOwnMethod(method_name);
		if (null != m && m.isPublic()) {
			return m;
		} else {
			return class_.findClassPublicMethod(method_name);
		}
	}

	public RubyMethod findMethod(String method_name) {
		RubyMethod m = super.findOwnMethod(method_name);
		if (null != m) {
			return m;
		} else {
			return class_.findClassMethod(method_name);
		}
	}

	public void collectMethodNames(RubyArray a) {
		super.collectOwnMethodNames(a);
		class_.collectClassMethodNames(a);
	}
	
	public void defineSingletonMethod(String name, RubyMethod method) {
		//FIXME
	}
}

