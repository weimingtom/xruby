package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public abstract class RubyOneArgMethod extends RubyMethod {
	protected abstract RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block);
	
	public RubyOneArgMethod() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return this.run(receiver, args.get(0), block);
	}
}
