package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyAPI;

public class BindingBuilder implements ExtensionBuilder {
	private RubyClass bindingClass;

	public RubyClass getBindingClass() {
		return bindingClass;
	}

	public void initialize() {
		this.bindingClass = RubyAPI.defineClass("Binding", RubyRuntime.objectClass);
		this.bindingClass.undefAllocMethod();
		this.bindingClass.getRubyClass().undefMethod("new");
		
		/**
    rb_define_method(rb_cBinding, "clone", proc_clone, 0);
    rb_define_method(rb_cBinding, "dup", proc_dup, 0);
    rb_define_global_function("binding", rb_f_binding, 0);
		 */
	}
}
