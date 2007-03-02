/** 
 * Copyright 2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public abstract class RubyTwoArgMethod extends RubyMethod {
	protected abstract RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block);
	
	public RubyTwoArgMethod() {
		super(2);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return this.run(receiver, args.get(0), args.get(1), block);
	}
}