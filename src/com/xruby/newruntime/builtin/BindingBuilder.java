package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyUtil;

public class BindingBuilder implements ExtensionBuilder {
	private RubyClass bindingClass;

	public RubyClass getBindingClass() {
		return bindingClass;
	}

	public void initialize() {
		this.bindingClass = RubyUtil.defineClass("Binding", RubyRuntime.objectClass);
		this.bindingClass.undefAllocMethod();
		RubyUtil.classof(this.bindingClass).undefMethod("new");
		
		/**
    rb_define_method(rb_cBinding, "clone", proc_clone, 0);
    rb_define_method(rb_cBinding, "dup", proc_dup, 0);
    rb_define_global_function("binding", rb_f_binding, 0);
		 */
	}
}
