package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyArray;

public abstract class RubyMethod {
	public static RubyArray NULL_ARG = null;
	
	public static RubyMethod DUMMY_METHOD = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			return RubyConstant.QNIL;
		}
	};
	
	public static RubyMethod TRUE_METHOD = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args, 
				RubyBlock block) {
			return RubyConstant.QTRUE;
		}
	};
	
	public static RubyMethod FALSE_METHOD = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args, 
				RubyBlock block) {
			return RubyConstant.QFALSE;
		}
	};
	
	public final RubyValue invoke(RubyValue receiver, RubyArray args) {
		return this.invoke(receiver, args, null);
	}
	
	public final RubyValue invoke(RubyValue receiver, RubyArray args, RubyBlock block) {
		return run(receiver, args, block);
	}
	
	protected abstract RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block);
}
