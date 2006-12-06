package com.xruby.runtime.lang;

import java.util.*;

abstract class ConstantCollection extends ClassVariableCollection {
	protected Map<String, RubyValue> constants_ = new HashMap<String, RubyValue>();

	ConstantCollection(RubyClass c) {
		super(c);
	}

	/// e.g. A::B
	RubyValue getConstant(String name) {
		return constants_.get(name);
	}

	RubyValue setConstant(String name, RubyValue value) {
		constants_.put(name, value);
		return value;
	}
}
