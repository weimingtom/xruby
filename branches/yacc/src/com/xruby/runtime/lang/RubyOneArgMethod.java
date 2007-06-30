/** 
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

public abstract class RubyOneArgMethod extends RubyMethod {
	public RubyOneArgMethod() {
		super(1, false, 0);
	}

	protected abstract RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block);
	
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyArray args, RubyBlock block) {
		return this.run(receiver, arg, block);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {		
		return this.run(receiver, args.get(0), block);
	}

	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return super.run(receiver, ObjectFactory.NIL_VALUE, block);
	}
}
