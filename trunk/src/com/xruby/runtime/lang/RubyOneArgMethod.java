/** 
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public abstract class RubyOneArgMethod extends RubyMethod {
	public RubyOneArgMethod() {
		super(1, false, 0);
	}

	protected abstract RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block);
	
	public RubyValue invoke(RubyValue receiver, RubyBlock block) {
        throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + this.getID() + "': wrong number of arguments (0 for 1)");
    }
	
	public RubyValue invoke(RubyValue receiver, RubyValue arg0, RubyValue arg1, RubyBlock block) {
        throw new RubyException(RubyRuntime.ArgumentErrorClass, "in `" + this.getID() + "': wrong number of arguments (2 for 1)");
    }

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {		
		return this.run(receiver, args.get(0), block);
	}
}
