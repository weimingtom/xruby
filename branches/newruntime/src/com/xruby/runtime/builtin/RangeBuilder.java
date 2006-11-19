package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyRange;

public class RangeBuilder implements ExtensionBuilder {
	private RubyClass rangeClass;

	public RubyClass getRangeClass() {
		return rangeClass;
	}

	public void initialize() {
		this.rangeClass = RubyAPI.defineClass("Range", RubyRuntime.objectClass);
		this.rangeClass.includeModule(RubyRuntime.enumerableModule);
		this.rangeClass.defineAllocMethod(RangeMethod.alloc);
		this.rangeClass.defineMethod("initialize", RangeMethod.initialize, -1);
		this.rangeClass.defineMethod("==", RangeMethod.eq, 1);
		this.rangeClass.defineMethod("===", RangeMethod.include, 1);
		this.rangeClass.defineMethod("eql?", RangeMethod.eq, 1);
		/*
    rb_define_method(rb_cRange, "hash", range_hash, 0);
    rb_define_method(rb_cRange, "each", range_each, 0);
    rb_define_method(rb_cRange, "step", range_step, -1);
    */
		this.rangeClass.defineMethod("first", RangeMethod.first, 0);
		this.rangeClass.defineMethod("last", RangeMethod.last, 0);
		this.rangeClass.defineMethod("begin", RangeMethod.first, 0);
		this.rangeClass.defineMethod("end", RangeMethod.last, 0);
		this.rangeClass.defineMethod("to_s", RangeMethod.toS, 0);
		/*
    rb_define_method(rb_cRange, "inspect", range_inspect, 0);
    */
		this.rangeClass.defineMethod("exclude_end?", RangeMethod.excludeEnd, 0);
		this.rangeClass.defineMethod("member?", RangeMethod.include, 1);
		this.rangeClass.defineMethod("include?", RangeMethod.include, 1);
	}
}

class RangeMethod {
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
				range.setExcludeEnd(RubyAPI.test(args.get(2)));
			}
			
			return RubyConstant.QNIL;			
		}		
	};
	
	public static RubyMethod include = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			RubyRange range = (RubyRange)receiver;
			int value = ((RubyFixnum)arg).intValue();
			return RubyAPI.test(range.include(value));
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
			return RubyAPI.test(range.isExcludeEnd());
		}
	};
	
	public static RubyMethod eq = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			RubyRange range = (RubyRange)receiver;
			return RubyAPI.test(range.equals(arg));
		}
	};
}


