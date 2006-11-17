package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyUtil;

public class MethodBuilder implements ExtensionBuilder {
	private RubyClass methodClass;
	private RubyClass unboundMethodClass;

	public RubyClass getMethodClass() {
		return methodClass;
	}

	public RubyClass getUnboundMethodClass() {
		return unboundMethodClass;
	}

	public void initialize() {
		this.methodClass = RubyUtil.defineClass("Method", RubyRuntime.objectClass);
		this.methodClass.undefAllocMethod();
		RubyUtil.classof(this.methodClass).undefMethod("new");
		
		/*
    rb_define_method(rb_cMethod, "==", method_eq, 1);
    rb_define_method(rb_cMethod, "clone", method_clone, 0);
    rb_define_method(rb_cMethod, "call", method_call, -1);
    rb_define_method(rb_cMethod, "[]", method_call, -1);
    rb_define_method(rb_cMethod, "arity", method_arity, 0);
    rb_define_method(rb_cMethod, "inspect", method_inspect, 0);
    rb_define_method(rb_cMethod, "to_s", method_inspect, 0);
    rb_define_method(rb_cMethod, "to_proc", method_proc, 0);
    rb_define_method(rb_cMethod, "unbind", method_unbind, 0);
    rb_define_method(rb_mKernel, "method", rb_obj_method, 1);
		 */
		
		this.unboundMethodClass = RubyUtil.defineClass("UnboundMethod", RubyRuntime.objectClass);
		this.unboundMethodClass.undefAllocMethod();
		RubyUtil.classof(this.unboundMethodClass).undefMethod("new");
		
		/*
    rb_define_method(rb_cUnboundMethod, "==", method_eq, 1);
    rb_define_method(rb_cUnboundMethod, "clone", method_clone, 0);
    rb_define_method(rb_cUnboundMethod, "arity", method_arity, 0);
    rb_define_method(rb_cUnboundMethod, "inspect", method_inspect, 0);
    rb_define_method(rb_cUnboundMethod, "to_s", method_inspect, 0);
    rb_define_method(rb_cUnboundMethod, "bind", umethod_bind, 1);
    rb_define_method(rb_cModule, "instance_method", rb_mod_method, 1);
		 */
	}
}
