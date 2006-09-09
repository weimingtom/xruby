/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.RubyClass;
import com.xruby.core.lang.RubyRuntime;

public class FalseClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("FalseClass", RubyRuntime.ObjectClass);
		return c;
	}
}
