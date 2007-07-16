package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public abstract class RubyOneOrTwoArgMethod extends RubyMethod {
	public RubyOneOrTwoArgMethod() {
		super(-1, false, 0);
	}
	
	protected abstract RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block);
	
	protected abstract RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block);
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		int size = args.size();
		switch (size) {
		case 1:
			return this.run(receiver, args.get(0), block);
		case 2:
			return this.run(receiver, args.get(0), args.get(1), block);
		}
		
		// FIXME: Exception should be thrown
		return null;
	}
}
