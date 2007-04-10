/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.util.*;

abstract class ConstantCollection extends ClassVariableCollection {
	protected Map<String, RubyValue> constants_ = new HashMap<String, RubyValue>();

	ConstantCollection(RubyClass c) {
		super(c);
	}

	/// e.g. A::B
	RubyValue getOwnConstant(String name) {
		return constants_.get(name);
	}

	RubyValue setConstant(String name, RubyValue value) {
		constants_.put(name, value);
		if (value instanceof RubyModule) {
			((RubyModule)value).setName(name);
		}
		return value;
	}
}
