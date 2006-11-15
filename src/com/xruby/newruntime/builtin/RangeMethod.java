package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.*;
import com.xruby.newruntime.value.*;

public class RangeMethod {
	public static RubyMethod alloc = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return new RubyRange();
		}		
	};
	
	public static RubyMethod initialize = new NoBlockRubyMethod() {
		public RubyValue run(RubyValue receiver, RubyArray args) {
			RubyRange range = (RubyRange)receiver;
			int argc = (args == null) ? 0 : args.length();
			
			if (argc >= 2) {
				int begin = ((RubyFixnum)args.get(0)).intValue();
				int end = ((RubyFixnum)args.get(1)).intValue();
				range.setBegin(begin);
				range.setEnd(end);
			}
			
			if (argc >= 3) {
				range.setExcludeEnd(RubyUtil.test(args.get(2)));
			}
			
			return RubyConstant.QNIL;			
		}		
	};
	
	public static RubyMethod include = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			RubyRange range = (RubyRange)receiver;
			int value = ((RubyFixnum)arg).intValue();
			return RubyUtil.test(range.include(value));
		}		
	};
	
	public static RubyMethod first = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			RubyRange range = (RubyRange)receiver;
			return RubyFixnum.int2Fix(range.getBegin());
		}
	};
	
	public static RubyMethod last = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			RubyRange range = (RubyRange)receiver;
			return RubyFixnum.int2Fix(range.getEnd());
		}
	};
	
	public static RubyMethod toS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			RubyRange range = (RubyRange)receiver;
			return ObjectFactory.createString(range.toString());
		}
	};
	
	public static RubyMethod excludeEnd = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			RubyRange range = (RubyRange)receiver;
			return RubyUtil.test(range.isExcludeEnd());
		}
	};
	
	public static RubyMethod eq = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			RubyRange range = (RubyRange)receiver;
			return RubyUtil.test(range.equals(arg));
		}
	};
}
