package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

/**
 * 
 * Ruby method with no arg.
 *
 */
public abstract class RubyNoArgMethod extends RubyMethod {
	protected abstract RubyValue run(RubyValue receiver, RubyBlock block);
	
	public RubyNoArgMethod() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return this.run(receiver, block);
	}
}
