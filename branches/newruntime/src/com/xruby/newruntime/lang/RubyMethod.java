package com.xruby.newruntime.lang;

public abstract class RubyMethod {
	public static RubyMethod DUMMY_METHOD = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue[] args,
				RubyBlock block) {
			return RubyConstant.QNIL;
		}
	};
	
	public static RubyMethod TRUE_METHOD = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue[] args, 
				RubyBlock block) {
			return RubyConstant.QTRUE;
		}
	};
	
	public static RubyMethod FALSE_METHOD = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue[] args, 
				RubyBlock block) {
			return RubyConstant.QFALSE;
		}
	};
	
	public final RubyValue invoke(RubyValue receiver, RubyValue[] args) {
		return this.invoke(receiver, args, null);
	}
	
	public final RubyValue invoke(RubyValue receiver, RubyValue[] args, RubyBlock block) {
		return run(receiver, args, block);
	}
	
	protected abstract RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block);
}
