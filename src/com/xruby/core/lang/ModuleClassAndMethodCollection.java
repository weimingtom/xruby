/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.util.HashMap;
import java.util.Map;

class ModuleClassAndMethodCollection extends ClassAndMethodCollection {
	protected Map<String, RubyModule> modules_ = new HashMap<String, RubyModule>();

	public RubyModule defineNewModule(String name) {
		RubyModule m = new RubyModule(name);
		modules_.put(name, m);
		return m;
	}

	public RubyModule defineModule(String name) {
		RubyModule m = modules_.get(name);
		if (null == m) {
			return defineNewModule(name);
		}

		return m;
	}

	/// e.g. A::B
	public RubyValue getConstantViaColon(String name) throws RubyException {
		//TODO
		throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + name_ + "::" + name);
	}
}

