/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

public class RubyModule extends RubyValue {

	public RubyModule(String name) {
		this(RubyRuntime.ModuleClass, name);
	}
	
	RubyModule(RubyClass c, String name) {
		super(c, null);
		super.name_ = name;
	}

}
