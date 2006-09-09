/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.util.HashMap;
import java.util.Map;

class ModuleClassAndMethodCollection extends ClassAndMethodCollection {
	protected Map<String, RubyModule> modules_ = new HashMap<String, RubyModule>();

	public RubyModule defineModule(String name) {
		RubyModule m = new RubyModule(name);
		modules_.put(name, m);
		return m;
	}

	public RubyModule getModule(String name) {
		return modules_.get(name);
	}
}
