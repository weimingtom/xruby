/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class GC_start extends RubyNoArgMethod {	
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		System.gc();
		return ObjectFactory.nilValue;
	}
}

public class GCModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.GCModule;
		m.getSingletonClass().defineMethod("start", new GC_start());
	}
}
