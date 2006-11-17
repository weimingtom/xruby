package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyAPI;

public class RegexpBuilder implements ExtensionBuilder {
	private RubyClass regexpError;
	private RubyClass regexpClass;
	private RubyClass matchClass;
	
	public RubyClass getRegexpError() {
		return regexpError;
	}

	public RubyClass getRegexpClass() {
		return regexpClass;
	}

	public RubyClass getMatchClass() {
		return this.matchClass;
	}
	
	public void initialize() {
		this.regexpError = RubyAPI.defineClass("RegexpError", RubyRuntime.standardError);
		this.regexpClass = RubyAPI.defineClass("Regexp", RubyRuntime.objectClass);
		/**
		 * rb_define_alloc_func(rb_cRegexp, rb_reg_s_alloc);
    rb_define_singleton_method(rb_cRegexp, "compile", rb_class_new_instance, -1);
    rb_define_singleton_method(rb_cRegexp, "quote", rb_reg_s_quote, -1);
    rb_define_singleton_method(rb_cRegexp, "escape", rb_reg_s_quote, -1);
    rb_define_singleton_method(rb_cRegexp, "union", rb_reg_s_union, -1);
    rb_define_singleton_method(rb_cRegexp, "last_match", rb_reg_s_last_match, -1);

    rb_define_method(rb_cRegexp, "initialize", rb_reg_initialize_m, -1);
    rb_define_method(rb_cRegexp, "initialize_copy", rb_reg_init_copy, 1);
    rb_define_method(rb_cRegexp, "hash", rb_reg_hash, 0);
    rb_define_method(rb_cRegexp, "eql?", rb_reg_equal, 1);
    rb_define_method(rb_cRegexp, "==", rb_reg_equal, 1);
    rb_define_method(rb_cRegexp, "=~", rb_reg_match, 1);
    rb_define_method(rb_cRegexp, "===", rb_reg_eqq, 1);
    rb_define_method(rb_cRegexp, "~", rb_reg_match2, 0);
    rb_define_method(rb_cRegexp, "match", rb_reg_match_m, 1);
    rb_define_method(rb_cRegexp, "to_s", rb_reg_to_s, 0);
    rb_define_method(rb_cRegexp, "inspect", rb_reg_inspect, 0);
    rb_define_method(rb_cRegexp, "source", rb_reg_source, 0);
    rb_define_method(rb_cRegexp, "casefold?", rb_reg_casefold_p, 0);
    rb_define_method(rb_cRegexp, "options", rb_reg_options_m, 0);
    rb_define_method(rb_cRegexp, "kcode", rb_reg_kcode_m, 0);

    rb_define_const(rb_cRegexp, "IGNORECASE", INT2FIX(RE_OPTION_IGNORECASE));
    rb_define_const(rb_cRegexp, "EXTENDED", INT2FIX(RE_OPTION_EXTENDED));
    rb_define_const(rb_cRegexp, "MULTILINE", INT2FIX(RE_OPTION_MULTILINE));

    rb_global_variable(&reg_cache);
		 */
		
		this.matchClass = RubyAPI.defineClass("MatchData", RubyRuntime.objectClass);
		
		/**
		 * rb_define_global_const("MatchingData", rb_cMatch);
		 * rb_define_alloc_func(rb_cMatch, match_alloc);
	 */
		RubyAPI.classof(this.matchClass).undefMethod("new");
    
    /*
    rb_define_method(rb_cMatch, "initialize_copy", match_init_copy, 1);
    rb_define_method(rb_cMatch, "size", match_size, 0);
    rb_define_method(rb_cMatch, "length", match_size, 0);
    rb_define_method(rb_cMatch, "offset", match_offset, 1);
    rb_define_method(rb_cMatch, "begin", match_begin, 1);
    rb_define_method(rb_cMatch, "end", match_end, 1);
    rb_define_method(rb_cMatch, "to_a", match_to_a, 0);
    rb_define_method(rb_cMatch, "[]", match_aref, -1);
    rb_define_method(rb_cMatch, "captures", match_captures, 0);
    rb_define_method(rb_cMatch, "select", match_select, -1);
    rb_define_method(rb_cMatch, "values_at", match_values_at, -1);
    rb_define_method(rb_cMatch, "pre_match", rb_reg_match_pre, 0);
    rb_define_method(rb_cMatch, "post_match", rb_reg_match_post, 0);
    rb_define_method(rb_cMatch, "to_s", match_to_s, 0);
    rb_define_method(rb_cMatch, "inspect", rb_any_to_s, 0); // in object.c 
    rb_define_method(rb_cMatch, "string", match_string, 0);
		 */
	}
}
