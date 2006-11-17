package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public abstract class RubyBlock {
	public static RubyBlock NULL_BLOCK = new RubyBlock() {
		protected RubyValue run(RubyValue receiver, RubyArray args) {
			// FIXME: throw exception
			return null;
		}
	};
	
	public final RubyValue invoke(RubyValue receiver, RubyArray args) {
		return this.run(receiver, args);
	}
	
	protected abstract RubyValue run(RubyValue receiver, RubyArray args);
}
