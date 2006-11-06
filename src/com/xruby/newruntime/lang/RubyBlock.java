package com.xruby.newruntime.lang;

public abstract class RubyBlock {
	public static RubyBlock NULL_BLOCK = new RubyBlock() {
		protected RubyValue run(RubyValue receiver, RubyValue[] args) {
			// FIXME: throw exception
			return null;
		}
	};
	
	public final RubyValue invoke(RubyValue receiver, RubyValue[] args) {
		return this.run(receiver, args);
	}
	
	protected abstract RubyValue run(RubyValue receiver, RubyValue[] args);
}
