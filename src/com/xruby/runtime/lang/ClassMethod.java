package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyArray;

public class ClassMethod {
	private static RubyID init = StringMap.intern("initialize");
	
	public static RubyMethod alloc = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return new RubyObject((RubyClass)receiver);
			// FIXME: type cast exception
		}
	};
	
	public static RubyMethod newInstance = new NoBlockRubyMethod() {
		public RubyValue run(RubyValue receiver, RubyArray args) throws RubyException {
			RubyValue obj = receiver.callMethod(RubyID.ID_ALLOCATOR, args);			
			obj.callMethod(init, args);
			
			return obj;
		}
	};
}
