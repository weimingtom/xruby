/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import java.util.*;
import com.xruby.runtime.value.*;

public class RubyValue extends RubyModule {

	private RubyClass class_;
	private Object value_ = null;
	private Map<String, RubyValue> instance_varibles_ = new HashMap<String, RubyValue>();

	public RubyValue(RubyClass c, Object value) {
		super(null);
		class_ = c;
		value_ = value;
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

	public Object getValue() {
		return value_;
	}
	
	public void setValue(Object value) {
		value_ = value;
	}

	public RubyClass getRubyClass() {
		return class_;
	}
	
	public int hashCode() {
		if (class_ == RubyRuntime.FixnumClass) {
			return ((RubyFixnum)value_).hashCode();
		} else if (class_ == RubyRuntime.StringClass) {
			return ((RubyString)value_).toString().hashCode();
		}else {
			return super.hashCode();
		}
    }
	
	public boolean equals(Object obj) {
		RubyValue v = (RubyValue)obj;
		if (class_ != v.getRubyClass()) {
			return false;
		}
		
		if (class_ == RubyRuntime.StringClass) {
			return ((RubyString)value_).toString().equals(((RubyString)v.getValue()).toString());
		} else if (null == value_) {
			return (null == v.getValue());
		} else {
			return value_.equals(v.getValue());
		}
	}
	
	public String toString() {
		return class_.toString() + value_.toString();
	}

	public RubyMethod findPublicMethod(String method_name) {
		RubyMethod m = super.findMethod(method_name);
		if (null != m && m.isPublic()) {
			return m;
		} else {
			return class_.findPublicMethod(method_name);
		}
	}

	public RubyMethod findMethod(String method_name) {
		RubyMethod m = super.findMethod(method_name);
		if (null != m) {
			return m;
		} else {
			return class_.findMethod(method_name);
		}
	}

	public void collectMethodNames(RubyArray a) {
		super.collectMethodNames(a);
		class_.collectMethodNames(a);
	}
}

