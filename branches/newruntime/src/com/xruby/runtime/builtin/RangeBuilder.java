package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class RangeBuilder implements ExtensionBuilder {
	private RubyClass rangeClass;

	public RubyClass getRangeClass() {
		return rangeClass;
	}

	public void initialize() {
		this.rangeClass = RubyUtil.defineClass("Range", RubyRuntime.objectClass);
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

