package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;

public class ArrayBuilder implements ExtensionBuilder {
	private RubyClass arrayClass;
	
	public RubyClass getArrayClass() {
		return this.arrayClass;
	}
	
	public void initialize() {
		this.arrayClass = RubyRuntime.defineClass("Array", RubyRuntime.objectClass);
		this.arrayClass.includeModule(RubyRuntime.enumerableModule);
		this.arrayClass.defineAllocMethod(ArrayMethod.alloc);
		/*
		 rb_define_singleton_method(rb_cArray, "[]", rb_ary_s_create, -1);
		 */
		this.arrayClass.defineMethod("initialize", ArrayMethod.initialize, -1);
		/*    
    rb_define_method(rb_cArray, "initialize_copy", rb_ary_replace, 1);
    */
		this.arrayClass.defineMethod("to_s", ArrayMethod.toS, 0);
		/*    
    rb_define_method(rb_cArray, "inspect", rb_ary_inspect, 0);
    rb_define_method(rb_cArray, "to_a", rb_ary_to_a, 0);
    */
		this.arrayClass.defineMethod("to_ary", ArrayMethod.toAry, 0);
		/*    
    rb_define_method(rb_cArray, "frozen?",  rb_ary_frozen_p, 0);
    */
		this.arrayClass.defineMethod("==", ArrayMethod.equal, 1);
		this.arrayClass.defineMethod("eql?", ArrayMethod.equal, 1);
		/*
    rb_define_method(rb_cArray, "hash", rb_ary_hash, 0);
    */
		
		this.arrayClass.defineMethod("[]", ArrayMethod.aref, -1);
		this.arrayClass.defineMethod("[]=", ArrayMethod.aset, -1);

		/*
    rb_define_method(rb_cArray, "at", rb_ary_at, 1);
    rb_define_method(rb_cArray, "fetch", rb_ary_fetch, -1);
    rb_define_method(rb_cArray, "first", rb_ary_first, -1);
    rb_define_method(rb_cArray, "last", rb_ary_last, -1);
    */
		this.arrayClass.defineMethod("concat", ArrayMethod.concat, 1);
		this.arrayClass.defineMethod("<<", ArrayMethod.push, 1);
		this.arrayClass.defineMethod("push", ArrayMethod.push, -1);
		this.arrayClass.defineMethod("pop", ArrayMethod.pop, 0);
		/*
    rb_define_method(rb_cArray, "shift", rb_ary_shift, 0);
    rb_define_method(rb_cArray, "unshift", rb_ary_unshift_m, -1);
    rb_define_method(rb_cArray, "insert", rb_ary_insert, -1);
    rb_define_method(rb_cArray, "each", rb_ary_each, 0);
    rb_define_method(rb_cArray, "each_index", rb_ary_each_index, 0);
    rb_define_method(rb_cArray, "reverse_each", rb_ary_reverse_each, 0);
    */
		this.arrayClass.defineMethod("length", ArrayMethod.length, 0);
		this.arrayClass.aliasMethod("size", "length");
		this.arrayClass.defineMethod("empty?", ArrayMethod.empty, 0);
    /*    
    rb_define_method(rb_cArray, "index", rb_ary_index, 1);
    rb_define_method(rb_cArray, "rindex", rb_ary_rindex, 1);
    rb_define_method(rb_cArray, "indexes", rb_ary_indexes, -1);
    rb_define_method(rb_cArray, "indices", rb_ary_indexes, -1);
    rb_define_method(rb_cArray, "join", rb_ary_join_m, -1);
    rb_define_method(rb_cArray, "reverse", rb_ary_reverse_m, 0);
    rb_define_method(rb_cArray, "reverse!", rb_ary_reverse_bang, 0);
    rb_define_method(rb_cArray, "sort", rb_ary_sort, 0);
    rb_define_method(rb_cArray, "sort!", rb_ary_sort_bang, 0);
    rb_define_method(rb_cArray, "collect", rb_ary_collect, 0);
    rb_define_method(rb_cArray, "collect!", rb_ary_collect_bang, 0);
    rb_define_method(rb_cArray, "map", rb_ary_collect, 0);
    rb_define_method(rb_cArray, "map!", rb_ary_collect_bang, 0);
    rb_define_method(rb_cArray, "select", rb_ary_select, 0);
    rb_define_method(rb_cArray, "values_at", rb_ary_values_at, -1);
    rb_define_method(rb_cArray, "delete", rb_ary_delete, 1);
    */
		this.arrayClass.defineMethod("delete_at", ArrayMethod.deleteAt, 1);
		
	/*
    rb_define_method(rb_cArray, "delete_at", rb_ary_delete_at_m, 1);
    rb_define_method(rb_cArray, "delete_if", rb_ary_delete_if, 0);
    rb_define_method(rb_cArray, "reject", rb_ary_reject, 0);
    rb_define_method(rb_cArray, "reject!", rb_ary_reject_bang, 0);
    rb_define_method(rb_cArray, "zip", rb_ary_zip, -1);
    rb_define_method(rb_cArray, "transpose", rb_ary_transpose, 0);
    rb_define_method(rb_cArray, "replace", rb_ary_replace, 1);
    rb_define_method(rb_cArray, "clear", rb_ary_clear, 0);
    rb_define_method(rb_cArray, "fill", rb_ary_fill, -1);
    */
		this.arrayClass.defineMethod("include?", ArrayMethod.include, 1);
		/*
    rb_define_method(rb_cArray, "include?", rb_ary_includes, 1);
    rb_define_method(rb_cArray, "<=>", rb_ary_cmp, 1);

    rb_define_method(rb_cArray, "slice", rb_ary_aref, -1);
    rb_define_method(rb_cArray, "slice!", rb_ary_slice_bang, -1);

    rb_define_method(rb_cArray, "assoc", rb_ary_assoc, 1);
    rb_define_method(rb_cArray, "rassoc", rb_ary_rassoc, 1);
    */

		this.arrayClass.defineMethod("+", ArrayMethod.plus, 1);
		this.arrayClass.defineMethod("*", ArrayMethod.times, 1);
    /*
    rb_define_method(rb_cArray, "-", rb_ary_diff, 1);
    rb_define_method(rb_cArray, "&", rb_ary_and, 1);
    rb_define_method(rb_cArray, "|", rb_ary_or, 1);

    rb_define_method(rb_cArray, "uniq", rb_ary_uniq, 0);
    rb_define_method(rb_cArray, "uniq!", rb_ary_uniq_bang, 0);
    rb_define_method(rb_cArray, "compact", rb_ary_compact, 0);
    rb_define_method(rb_cArray, "compact!", rb_ary_compact_bang, 0);
    rb_define_method(rb_cArray, "flatten", rb_ary_flatten, 0);
    rb_define_method(rb_cArray, "flatten!", rb_ary_flatten_bang, 0);
    rb_define_method(rb_cArray, "nitems", rb_ary_nitems, 0);
		 */
	}
}