package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.NoBlockRubyMethod;
import com.xruby.newruntime.lang.RubyMethod;
import com.xruby.newruntime.lang.RubyNoArgMethod;
import com.xruby.newruntime.lang.RubyOneArgMethod;
import com.xruby.newruntime.lang.RubyUtil;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.value.RubyFixnum;

class FixnumMethod {
	public static RubyMethod toS = new NoBlockRubyMethod() {
		public RubyValue run(RubyValue receiver, RubyValue[] args) {
			long base = (args.length == 0) ? 10 : (RubyUtil.valueToLong(args[0]));
			RubyFixnum fixnum = (RubyFixnum)receiver;
			return fixnum.toS(base);
		}
	};
	
	public static RubyMethod equal = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			RubyFixnum num = (RubyFixnum)receiver;
			if (arg instanceof RubyFixnum) {
				return RubyUtil.test(num.equals(arg));
			}
			
			// FIXME: num equal
			return null;
		}
	};
	
	public static RubyMethod lshift = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long value = RubyUtil.valueToLong(receiver);
			long width = RubyUtil.valueToLong(arg);
			if (width < 0) {
				// FIXME: rshift
			}
			
			// FIXME: bigshift
			
			return RubyFixnum.long2Fix(value << width);
		}
	};
		
	public static RubyMethod rshift = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long value = RubyUtil.valueToLong(receiver);
			long width = RubyUtil.valueToLong(arg);
			if (width < 0) {
				// FIXME: lshift
			}
			
			// FIXME: bigshift
			
			return RubyFixnum.long2Fix(value >> width);
		}
	};
	
	public static RubyMethod plus = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyFixnum.long2Fix(left + right);
		}
	};
	
	public static RubyMethod minus = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyFixnum.long2Fix(left - right);
		}
	};
	
	public static RubyMethod mul = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyFixnum.long2Fix(left * right);
		}
	};
	
	public static RubyMethod div = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyFixnum.long2Fix(left / right);
		}
	};
	
	public static RubyMethod mod = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyFixnum.long2Fix(left % right);
		}
	};
	
	public static RubyMethod abs = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			long value = RubyUtil.valueToLong(receiver);
			return RubyFixnum.long2Fix(value > 0 ? value : -value);
		}
	};
	
	public static RubyMethod cmp = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			if (left == right) {
				return RubyFixnum.int2Fix(0);
			} else if (left > right) {
				return RubyFixnum.int2Fix(1);
			} else {
				return RubyFixnum.int2Fix(-1);
			}
			
			// FIXME : arg is not fixnum
		}
	};
	
	public static RubyMethod gt = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyUtil.test(left > right);
		}
	};
	
	public static RubyMethod ge = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyUtil.test(left >= right);
		}
	};
	
	public static RubyMethod lt = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyUtil.test(left < right);
		}
	};
	
	public static RubyMethod le = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyUtil.test(left <= right);
		}
	};
	
	public static RubyMethod rev = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			long value = RubyUtil.valueToLong(receiver);
			return RubyFixnum.long2Fix(~value);
		}
	};
    
    public static RubyMethod and = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyFixnum.long2Fix(left & right);
		}
	};
	
	public static RubyMethod or = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyFixnum.long2Fix(left | right);
		}
	};
	
	public static RubyMethod xor = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyUtil.valueToLong(receiver);
			long right = RubyUtil.valueToLong(arg);
			return RubyFixnum.long2Fix(left ^ right);
		}
	};
	
	public static RubyMethod zero = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			long value = RubyUtil.valueToLong(receiver);
			return RubyUtil.test(value == 0);
		}
	};
}
