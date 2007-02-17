/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public abstract class RubyProgram {

	public RubyValue invoke() {
		return invoke(ObjectFactory.topLevelSelfValue, null, null, RubyRuntime.GlobalScope);
	}

	public RubyValue invoke(RubyValue receiver, RubyArray args, RubyBlock block, RubyModule scope) {
		RubyRuntime.ObjectClass.setAccessPrivate();/*so that top level method are parive method of Object by default*/
		return run(receiver, args, block, scope);
	}
	
	protected abstract RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block, RubyModule scope);
}
