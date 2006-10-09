/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

class ModuleClassAndMethodCollection extends ClassAndMethodCollection {
	public RubyModule defineNewModule(String name) {
		RubyModule m = new RubyModule(name);
		constants_.put(name, new RubyValue(RubyRuntime.ModuleClass, m));
		return m;
	}

	public RubyModule defineModule(String name) throws RubyException {
		RubyValue v = constants_.get(name);
		if (null == v) {
			return defineNewModule(name);
		}
		
		if (v.getRubyClass() != RubyRuntime.ModuleClass) {
			throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a module");
		}
		
		return (RubyModule)v.getValue();
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

