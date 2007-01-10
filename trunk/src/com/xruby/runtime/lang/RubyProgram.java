/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public abstract class RubyProgram {

	public RubyValue run() {
		return run(ObjectFactory.topLevelSelfValue, null, null);
	}
	
	public abstract RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block);
}
