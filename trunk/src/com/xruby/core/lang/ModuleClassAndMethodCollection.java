/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

class ModuleClassAndMethodCollection extends ClassAndMethodCollection {
	public RubyModule defineNewModule(String name) {
		RubyModule m = new RubyModule(name);
		constants_.put(name, new RubyValue(RubyRuntime.ModuleClass, m));//NOTE, do not use ObjectFactory.createClass, it will cause initialization issue
		return m;
	}

	public RubyValue defineModule(String name) throws RubyException {
		RubyValue v = constants_.get(name);
		if (null == v) {
			v = new RubyValue(RubyRuntime.ModuleClass, new RubyModule(name));
			constants_.put(name, v);
			return v;
		}
		
		if (v.getRubyClass() != RubyRuntime.ModuleClass) {
			throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a module");
		}
		
		return v;
	}

	/// e.g. A::B
	public RubyValue getConstantViaColon(String name) throws RubyException {
		RubyValue v = constants_.get(name);
		if (null == v) {
			throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + name_ + "::" + name);
		}

		return v;
	}
}

