package com.xruby.runtime.lang;

import java.util.*;

abstract class ClassVariableCollection extends RubyValue {
	protected String name_;
	private Map<String, RubyValue> class_varibles_ = new HashMap<String, RubyValue>();

	ClassVariableCollection(RubyClass c) {
		super(c);
	}
	
	public String getName() {
		return name_;
	}

	RubyValue findClassVariable(String name) {
		return class_varibles_.get(name);
	}

	public RubyValue getClassVariable(String name) {
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