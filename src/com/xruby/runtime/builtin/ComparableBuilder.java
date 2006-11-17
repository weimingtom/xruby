package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class ComparableBuilder implements ExtensionBuilder {
	private RubyModule comparableModule;

	public RubyModule getComparableModule() {
		return comparableModule;
	}

	public void initialize() {
		this.comparableModule = RubyAPI.defineModule("Comparable");
		/*
		 * rb_define_method(rb_mComparable, "==", cmp_equal, 1);
    rb_define_method(rb_mComparable, ">", cmp_gt, 1);
    rb_define_method(rb_mComparable, ">=", cmp_ge, 1);
    rb_define_method(rb_mComparable, "<", cmp_lt, 1);
    rb_define_method(rb_mComparable, "<=", cmp_le, 1);
    rb_define_method(rb_mComparable, "between?", cmp_between, 2);
		 */
	}

}
