package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyFixnum;

public class FixnumBuilder implements ExtensionBuilder {
	private RubyClass fixnumClass;
	
	public RubyClass getFixnumClass() {
		return this.fixnumClass;
	}
	
	public void initialize() {
		this.fixnumClass = RubyAPI.defineClass("Fixnum", RubyRuntime.integerClass);
		
		/*
		 rb_include_module(rb_cFixnum, rb_mPrecision);
    rb_define_singleton_method(rb_cFixnum, "induced_from", rb_fix_induced_from, 1);
    rb_define_singleton_method(rb_cInteger, "induced_from", rb_int_induced_from, 1);
    */
		this.fixnumClass.defineMethod("to_s", FixnumMethod.toS, -1);
		
		/*

    rb_define_method(rb_cFixnum, "to_s", fix_to_s, -1);

    rb_define_method(rb_cFixnum, "id2name", fix_id2name, 0);
    rb_define_method(rb_cFixnum, "to_sym", fix_to_sym, 0);

    rb_define_method(rb_cFixnum, "-@", fix_uminus, 0);
    */
		this.fixnumClass.defineMethod("+", FixnumMethod.plus, 1);
		this.fixnumClass.defineMethod("-", FixnumMethod.minus, 1);
		this.fixnumClass.defineMethod("*", FixnumMethod.mul, 1);
		this.fixnumClass.defineMethod("/", FixnumMethod.div, 1);
		this.fixnumClass.defineMethod("div", FixnumMethod.div, 1);
		this.fixnumClass.defineMethod("%", FixnumMethod.mod, 1);
		
		/*
    rb_define_method(rb_cFixnum, "modulo", fix_mod, 1);
    rb_define_method(rb_cFixnum, "divmod", fix_divmod, 1);
    rb_define_method(rb_cFixnum, "quo", fix_quo, 1);
    rb_define_method(rb_cFixnum, "**", fix_pow, 1);
    */
		this.fixnumClass.defineMethod("abs", FixnumMethod.abs, 0);
		this.fixnumClass.defineMethod("==", FixnumMethod.equal, 1);
		this.fixnumClass.defineMethod("<=>", FixnumMethod.cmp, 1);
		this.fixnumClass.defineMethod(">", FixnumMethod.gt, 1);
		this.fixnumClass.defineMethod(">=", FixnumMethod.ge, 1);
		this.fixnumClass.defineMethod("<", FixnumMethod.lt, 1);
		this.fixnumClass.defineMethod("<=", FixnumMethod.le, 1);
		
		this.fixnumClass.defineMethod("~", FixnumMethod.rev, 0);
		this.fixnumClass.defineMethod("&", FixnumMethod.and, 1);
		this.fixnumClass.defineMethod("|", FixnumMethod.or, 1);
		this.fixnumClass.defineMethod("^", FixnumMethod.xor, 1);
		
		/*
    rb_define_method(rb_cFixnum, "[]", fix_aref, 1);
    */
		this.fixnumClass.defineMethod("<<", FixnumMethod.lshift, 1);
		this.fixnumClass.defineMethod(">>", FixnumMethod.rshift, 1);

    /*
    rb_define_method(rb_cFixnum, "to_f", fix_to_f, 0);
    rb_define_method(rb_cFixnum, "size", fix_size, 0);
    */
		this.fixnumClass.defineMethod("zero?", FixnumMethod.zero, 0);
	}
}

class FixnumMethod {
	public static RubyMethod toS = new NoBlockRubyMethod() {
		public RubyValue run(RubyValue receiver, RubyArray args) {
			long base = (null == args) ? 10 : (RubyAPI.valueToLong(args.get(0)));
			RubyFixnum fixnum = (RubyFixnum)receiver;
			return fixnum.toS(base);
		}
	};
	
	public static RubyMethod equal = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			RubyFixnum num = (RubyFixnum)receiver;
			if (arg instanceof RubyFixnum) {
				return RubyAPI.test(num.equals(arg));
			}
			
			// FIXME: num equal
			return null;
		}
	};
	
	public static RubyMethod lshift = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long value = RubyAPI.valueToLong(receiver);
			long width = RubyAPI.valueToLong(arg);
			if (width < 0) {
				// FIXME: rshift
			}
			
			// FIXME: bigshift
			
			return RubyFixnum.long2Fix(value << width);
		}
	};
		
	public static RubyMethod rshift = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long value = RubyAPI.valueToLong(receiver);
			long width = RubyAPI.valueToLong(arg);
			if (width < 0) {
				// FIXME: lshift
			}
			
			// FIXME: bigshift
			
			return RubyFixnum.long2Fix(value >> width);
		}
	};
	
	public static RubyMethod plus = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyFixnum.long2Fix(left + right);
		}
	};
	
	public static RubyMethod minus = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyFixnum.long2Fix(left - right);
		}
	};
	
	public static RubyMethod mul = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyFixnum.long2Fix(left * right);
		}
	};
	
	public static RubyMethod div = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyFixnum.long2Fix(left / right);
		}
	};
	
	public static RubyMethod mod = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyFixnum.long2Fix(left % right);
		}
	};
	
	public static RubyMethod abs = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			long value = RubyAPI.valueToLong(receiver);
			return RubyFixnum.long2Fix(value > 0 ? value : -value);
		}
	};
	
	public static RubyMethod cmp = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
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
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyAPI.test(left > right);
		}
	};
	
	public static RubyMethod ge = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyAPI.test(left >= right);
		}
	};
	
	public static RubyMethod lt = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyAPI.test(left < right);
		}
	};
	
	public static RubyMethod le = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyAPI.test(left <= right);
		}
	};
	
	public static RubyMethod rev = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			long value = RubyAPI.valueToLong(receiver);
			return RubyFixnum.long2Fix(~value);
		}
	};
    
    public static RubyMethod and = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyFixnum.long2Fix(left & right);
		}
	};
	
	public static RubyMethod or = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyFixnum.long2Fix(left | right);
		}
	};
	
	public static RubyMethod xor = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			long left = RubyAPI.valueToLong(receiver);
			long right = RubyAPI.valueToLong(arg);
			return RubyFixnum.long2Fix(left ^ right);
		}
	};
	
	public static RubyMethod zero = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			long value = RubyAPI.valueToLong(receiver);
			return RubyAPI.test(value == 0);
		}
	};
}
