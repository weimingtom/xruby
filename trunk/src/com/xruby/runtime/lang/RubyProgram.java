/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public abstract class RubyProgram {

	public RubyValue run() {
		return run(ObjectFactory.topLevelSelfValue, null, null, RubyRuntime.GlobalScope);
	}
	
	public abstract RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block, RubyModule scope);
}
