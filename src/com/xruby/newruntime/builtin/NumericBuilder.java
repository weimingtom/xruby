package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.*;

public class NumericBuilder implements ExtensionBuilder {
	private RubyClass numericClass;
	private RubyClass zeroDivError;
	private RubyClass floatDomainError;
	
	public RubyClass getNumericClass() {
		return this.numericClass;
	}
	
	public RubyClass getZeroDivError() {
		return zeroDivError;
	}

	public RubyClass getFloatDomainError() {
		return floatDomainError;
	}

	public void initialize() {
		this.zeroDivError = RubyUtil.defineClass("ZeroDivisionError", RubyRuntime.standardError);
		this.floatDomainError = RubyUtil.defineClass("FloatDomainError", RubyRuntime.rangeError);
		this.numericClass = RubyUtil.defineClass("Numeric", RubyRuntime.objectClass);
		
		/*
		 * rb_define_method(rb_cNumeric, "singleton_method_added", num_sadded, 1);
		 *
		 */
		
		this.numericClass.includeModule(RubyRuntime.comparableModule);
		
		/*
    rb_include_module(rb_cNumeric, rb_mComparable);
    rb_define_method(rb_cNumeric, "initialize_copy", num_init_copy, 1);
    rb_define_method(rb_cNumeric, "coerce", num_coerce, 1);
    */
		this.numericClass.defineMethod("+@", NumericMethod.uplus, 0);
		/*
    rb_define_method(rb_cNumeric, "+@", num_uplus, 0);
    rb_define_method(rb_cNumeric, "-@", num_uminus, 0);
    rb_define_method(rb_cNumeric, "<=>", num_cmp, 1);
    rb_define_method(rb_cNumeric, "eql?", num_eql, 1);
    rb_define_method(rb_cNumeric, "quo", num_quo, 1);
    rb_define_method(rb_cNumeric, "div", num_div, 1);
    rb_define_method(rb_cNumeric, "divmod", num_divmod, 1);
    rb_define_method(rb_cNumeric, "modulo", num_modulo, 1);
    rb_define_method(rb_cNumeric, "remainder", num_remainder, 1);
    rb_define_method(rb_cNumeric, "abs", num_abs, 0);
    rb_define_method(rb_cNumeric, "to_int", num_to_int, 0);
    */
		this.numericClass.defineMethod("integer?", RubyMethod.FALSE_METHOD, 0);
		
		/*
    rb_define_method(rb_cNumeric, "integer?", num_int_p, 0);
    rb_define_method(rb_cNumeric, "zero?", num_zero_p, 0);
    rb_define_method(rb_cNumeric, "nonzero?", num_nonzero_p, 0);

    rb_define_method(rb_cNumeric, "floor", num_floor, 0);
    rb_define_method(rb_cNumeric, "ceil", num_ceil, 0);
    rb_define_method(rb_cNumeric, "round", num_round, 0);
    rb_define_method(rb_cNumeric, "truncate", num_truncate, 0);
    rb_define_method(rb_cNumeric, "step", num_step, -1);
		 */
	}
}

class NumericMethod {
	public static RubyMethod uplus = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return receiver;
		}
	};
}
