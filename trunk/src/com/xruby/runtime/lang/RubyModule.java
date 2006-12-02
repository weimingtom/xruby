/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

public class RubyModule extends ModuleClassAndMethodCollection {

	public RubyModule(String name) {
		super(null);
		super.name_ = name;
	}
	
	//We called super(null) in RubyModule's constructor to avoid initialization pains 
	public RubyClass getRubyClass() {
		return RubyRuntime.ModuleClass;
	}

	public RubyValue defineMethod(String name, RubyMethod m) {
		m.setOwner(this);
		getSingletonClass().addMethod(name, m);
		return super.addMethod(name, m);
	}
}
