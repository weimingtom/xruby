package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.*;

public class PrecisionBuilder implements ExtensionBuilder {
	private RubyModule precisionModule;
	
	public RubyModule getPrecisionModule() {
		return precisionModule;
	}

	public void initialize() {
		this.precisionModule = RubyUtil.defineModule("Precision");
		/*
		 * rb_define_singleton_method(rb_mPrecision, "included", prec_included, 1);
    rb_define_method(rb_mPrecision, "prec", prec_prec, 1);
    rb_define_method(rb_mPrecision, "prec_i", prec_prec_i, 0);
    rb_define_method(rb_mPrecision, "prec_f", prec_prec_f, 0);
		 */
	}
}
