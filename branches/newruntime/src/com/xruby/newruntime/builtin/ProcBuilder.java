package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;

public class ProcBuilder implements ExtensionBuilder {
	private RubyClass procClass;

	public RubyClass getProcClass() {
		return procClass;
	}

	public void initialize() {
		this.procClass = RubyRuntime.defineClass("Proc", RubyRuntime.objectClass);
		this.procClass.undefAllocMethod();
		
		/**
		 * rb_define_singleton_method(rb_cProc, "new", proc_s_new, -1);

    rb_define_method(rb_cProc, "clone", proc_clone, 0);
    rb_define_method(rb_cProc, "dup", proc_dup, 0);
    rb_define_method(rb_cProc, "call", proc_call, -2);
    rb_define_method(rb_cProc, "arity", proc_arity, 0);
    rb_define_method(rb_cProc, "[]", proc_call, -2);
    rb_define_method(rb_cProc, "==", proc_eq, 1);
    rb_define_method(rb_cProc, "to_s", proc_to_s, 0);
    rb_define_method(rb_cProc, "to_proc", proc_to_self, 0);
    rb_define_method(rb_cProc, "binding", proc_binding, 0);

    rb_define_global_function("proc", proc_lambda, 0);
    rb_define_global_function("lambda", proc_lambda, 0);
    
		 */
	}
}
