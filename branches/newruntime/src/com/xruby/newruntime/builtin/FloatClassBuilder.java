package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyMethod;
import com.xruby.newruntime.lang.RubyNoArgMethod;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.value.RubyFloat;
import com.xruby.newruntime.value.RubyString;

public class FloatClassBuilder implements ClassBuilder {
	private RubyClass floatClass;
	
	public RubyClass getFloatClass() {
		return this.floatClass;
	}
	
	public void initialize() {
		this.floatClass = RubyRuntime.defineClass("Float", RubyRuntime.numericClass);
		this.floatClass.undefAllocMethod();
		this.floatClass.undefMethod("new");
		
/*
 rb_define_singleton_method(rb_cFloat, "induced_from", rb_flo_induced_from, 1);
    rb_include_module(rb_cFloat, rb_mPrecision);

    rb_define_const(rb_cFloat, "ROUNDS", INT2FIX(FLT_ROUNDS));
    rb_define_const(rb_cFloat, "RADIX", INT2FIX(FLT_RADIX));
    rb_define_const(rb_cFloat, "MANT_DIG", INT2FIX(DBL_MANT_DIG));
    rb_define_const(rb_cFloat, "DIG", INT2FIX(DBL_DIG));
    rb_define_const(rb_cFloat, "MIN_EXP", INT2FIX(DBL_MIN_EXP));
    rb_define_const(rb_cFloat, "MAX_EXP", INT2FIX(DBL_MAX_EXP));
    rb_define_const(rb_cFloat, "MIN_10_EXP", INT2FIX(DBL_MIN_10_EXP));
    rb_define_const(rb_cFloat, "MAX_10_EXP", INT2FIX(DBL_MAX_10_EXP));
    rb_define_const(rb_cFloat, "MIN", rb_float_new(DBL_MIN));
    rb_define_const(rb_cFloat, "MAX", rb_float_new(DBL_MAX));
    rb_define_const(rb_cFloat, "EPSILON", rb_float_new(DBL_EPSILON));
*/
		
		this.floatClass.defineMethod("to_s", FloatMethod.toS, 0);
		/*
    rb_define_method(rb_cFloat, "to_s", flo_to_s, 0);
    rb_define_method(rb_cFloat, "coerce", flo_coerce, 1);
    rb_define_method(rb_cFloat, "-@", flo_uminus, 0);
    rb_define_method(rb_cFloat, "+", flo_plus, 1);
    rb_define_method(rb_cFloat, "-", flo_minus, 1);
    rb_define_method(rb_cFloat, "*", flo_mul, 1);
    rb_define_method(rb_cFloat, "/", flo_div, 1);
    rb_define_method(rb_cFloat, "%", flo_mod, 1);
    rb_define_method(rb_cFloat, "modulo", flo_mod, 1);
    rb_define_method(rb_cFloat, "divmod", flo_divmod, 1);
    rb_define_method(rb_cFloat, "**", flo_pow, 1);
    rb_define_method(rb_cFloat, "==", flo_eq, 1);
    rb_define_method(rb_cFloat, "<=>", flo_cmp, 1);
    rb_define_method(rb_cFloat, ">",  flo_gt, 1);
    rb_define_method(rb_cFloat, ">=", flo_ge, 1);
    rb_define_method(rb_cFloat, "<",  flo_lt, 1);
    rb_define_method(rb_cFloat, "<=", flo_le, 1);
    rb_define_method(rb_cFloat, "eql?", flo_eql, 1);
    rb_define_method(rb_cFloat, "hash", flo_hash, 0);
    rb_define_method(rb_cFloat, "to_f", flo_to_f, 0);
    rb_define_method(rb_cFloat, "abs", flo_abs, 0);
    rb_define_method(rb_cFloat, "zero?", flo_zero_p, 0);

    rb_define_method(rb_cFloat, "to_i", flo_truncate, 0);
    rb_define_method(rb_cFloat, "to_int", flo_truncate, 0);
    rb_define_method(rb_cFloat, "floor", flo_floor, 0);
    rb_define_method(rb_cFloat, "ceil", flo_ceil, 0);
    rb_define_method(rb_cFloat, "round", flo_round, 0);
    rb_define_method(rb_cFloat, "truncate", flo_truncate, 0);

    rb_define_method(rb_cFloat, "nan?",      flo_is_nan_p, 0);
    rb_define_method(rb_cFloat, "infinite?", flo_is_infinite_p, 0);
    rb_define_method(rb_cFloat, "finite?",   flo_is_finite_p, 0);
 */
	}
}

class FloatMethod {	
	public static RubyMethod toS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			RubyFloat f = (RubyFloat)receiver;
			return RubyString.newString(Double.toString(f.doubleValue()));
		}
	};
}
