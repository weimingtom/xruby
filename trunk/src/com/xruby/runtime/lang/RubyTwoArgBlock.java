package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

public abstract class RubyTwoArgBlock extends RubyBlock {
	public RubyTwoArgBlock(RubyBlock block, RubyValue self, RubyBlock owner, RubyModule scope) {
		super(2, false, 0, block, self, owner, scope);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args) {
		RubyValue arg0 = ObjectFactory.NIL_VALUE;
		RubyValue arg1 = ObjectFactory.NIL_VALUE;
		
		if (args != null) {
			int size = args.size();
			if (size >= 1) {
				arg0 = args.get(0);
			}
			
			if (size >= 2) {
				arg1 = args.get(1);
			}
		}
		
		return this.run(receiver, arg0, arg1);
	}

	protected RubyValue run(RubyValue receiver, RubyValue arg) {
		return this.run(receiver, arg, ObjectFactory.NIL_VALUE);
	}

	protected RubyValue run(RubyValue receiver) {
		return this.run(receiver, ObjectFactory.NIL_VALUE, ObjectFactory.NIL_VALUE);
	}

	protected abstract RubyValue run(RubyValue receiver, RubyValue arg0, RubyValue arg1);
}
