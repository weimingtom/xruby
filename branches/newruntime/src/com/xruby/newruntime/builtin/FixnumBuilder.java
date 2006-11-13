package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;

public class FixnumBuilder implements ExtensionBuilder {
	private RubyClass fixnumClass;
	
	public RubyClass getFixnumClass() {
		return this.fixnumClass;
	}
	
	public void initialize() {
		this.fixnumClass = RubyRuntime.defineClass("Fixnum", RubyRuntime.integerClass);
		
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