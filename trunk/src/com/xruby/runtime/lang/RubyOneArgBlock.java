package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

public abstract class RubyOneArgBlock extends RubyBlock {
	public RubyOneArgBlock(RubyBlock block, RubyValue self, RubyBlock owner, RubyModule scope) {
		super(1, false, 0, block, self, owner, scope);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args) {
		RubyValue arg;
		if (args != null && args.size() == 1) {
			arg = args.get(0);
		} else if (args == null || args.size() == 0) {
			arg = ObjectFactory.NIL_VALUE;
		} else {
			// TO DO: rethinking 
			// For code: yield 1, 2; f {|x|}
			arg = args;
		}
		
		return this.run(receiver, arg);
	}
	
	protected RubyValue run(RubyValue receiver) {
		return this.run(receiver, ObjectFactory.NIL_VALUE);
	}

	protected RubyValue run(RubyValue receiver, RubyValue arg0, RubyValue arg1) {
		return this.run(receiver, arg0);
	}

	protected abstract RubyValue run(RubyValue receiver, RubyValue arg);
}