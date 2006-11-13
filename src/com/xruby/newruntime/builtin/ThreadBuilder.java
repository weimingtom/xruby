package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyUtil;

public class ThreadBuilder implements ExtensionBuilder {
	private RubyClass threadError;
	private RubyClass threadClass;
	private RubyClass continuationClass;
	private RubyClass threadGroupClass;

	public RubyClass getThreadError() {
		return threadError;
	}

	public RubyClass getThreadClass() {
		return threadClass;
	}

	public RubyClass getContinuationClass() {
		return continuationClass;
	}

	public RubyClass getThreadGroupClass() {
		return threadGroupClass;
	}

	public void initialize() {
		this.threadError = RubyRuntime.defineClass("ThreadError", RubyRuntime.standardError);
		this.threadClass = RubyRuntime.defineClass("Thread", RubyRuntime.objectClass);
		this.threadClass.undefAllocMethod();
		
		/**
		 * rb_define_singleton_method(rb_cThread, "new", rb_thread_s_new, -1);
    rb_define_method(rb_cThread, "initialize", rb_thread_initialize, -2);
    rb_define_singleton_method(rb_cThread, "start", rb_thread_start, -2);
    rb_define_singleton_method(rb_cThread, "fork", rb_thread_start, -2);

    rb_define_singleton_method(rb_cThread, "stop", rb_thread_stop, 0);
    rb_define_singleton_method(rb_cThread, "kill", rb_thread_s_kill, 1);
    rb_define_singleton_method(rb_cThread, "exit", rb_thread_exit, 0);
    rb_define_singleton_method(rb_cThread, "pass", rb_thread_pass, 0);
    rb_define_singleton_method(rb_cThread, "current", rb_thread_current, 0);
    rb_define_singleton_method(rb_cThread, "main", rb_thread_main, 0);
    rb_define_singleton_method(rb_cThread, "list", rb_thread_list, 0);

    rb_define_singleton_method(rb_cThread, "critical", rb_thread_critical_get, 0);
    rb_define_singleton_method(rb_cThread, "critical=", rb_thread_critical_set, 1);

    rb_define_singleton_method(rb_cThread, "abort_on_exception", rb_thread_s_abort_exc, 0);
    rb_define_singleton_method(rb_cThread, "abort_on_exception=", rb_thread_s_abort_exc_set, 1);

    rb_define_method(rb_cThread, "run", rb_thread_run, 0);
    rb_define_method(rb_cThread, "wakeup", rb_thread_wakeup, 0);
    rb_define_method(rb_cThread, "kill", rb_thread_kill, 0);
    rb_define_method(rb_cThread, "terminate", rb_thread_kill, 0);
    rb_define_method(rb_cThread, "exit", rb_thread_kill, 0);
    rb_define_method(rb_cThread, "value", rb_thread_value, 0);
    rb_define_method(rb_cThread, "status", rb_thread_status, 0);
    rb_define_method(rb_cThread, "join", rb_thread_join_m, -1);
    rb_define_method(rb_cThread, "alive?", rb_thread_alive_p, 0);
    rb_define_method(rb_cThread, "stop?", rb_thread_stop_p, 0);
    rb_define_method(rb_cThread, "raise", rb_thread_raise_m, -1);

    rb_define_method(rb_cThread, "abort_on_exception", rb_thread_abort_exc, 0);
    rb_define_method(rb_cThread, "abort_on_exception=", rb_thread_abort_exc_set, 1);

    rb_define_method(rb_cThread, "priority", rb_thread_priority, 0);
    rb_define_method(rb_cThread, "priority=", rb_thread_priority_set, 1);
    rb_define_method(rb_cThread, "safe_level", rb_thread_safe_level, 0);
    rb_define_method(rb_cThread, "group", rb_thread_group, 0);

    rb_define_method(rb_cThread, "[]", rb_thread_aref, 1);
    rb_define_method(rb_cThread, "[]=", rb_thread_aset, 2);
    rb_define_method(rb_cThread, "key?", rb_thread_key_p, 1);
    rb_define_method(rb_cThread, "keys", rb_thread_keys, 0);

    rb_define_method(rb_cThread, "inspect", rb_thread_inspect, 0);
		 */
		
		this.continuationClass = RubyRuntime.defineClass("Continuation", RubyRuntime.objectClass);
		this.continuationClass.undefAllocMethod();
		RubyUtil.classof(this.continuationClass).undefMethod("new");
		/**
    rb_define_method(rb_cCont, "call", rb_cont_call, -1);
    rb_define_method(rb_cCont, "[]", rb_cont_call, -1);
    rb_define_global_function("callcc", rb_callcc, 0);
    rb_global_variable(&cont_protect);
		 */
		
		this.threadGroupClass = RubyRuntime.defineClass("ThreadGroup", RubyRuntime.objectClass);
		/*
		rb_define_alloc_func(cThGroup, thgroup_s_alloc);
	    rb_define_method(cThGroup, "list", thgroup_list, 0);
	    rb_define_method(cThGroup, "enclose", thgroup_enclose, 0);
	    rb_define_method(cThGroup, "enclosed?", thgroup_enclosed_p, 0);
	    rb_define_method(cThGroup, "add", thgroup_add, 1);
	    rb_global_variable(&thgroup_default);
	    thgroup_default = rb_obj_alloc(cThGroup);
	    rb_define_const(cThGroup, "Default", thgroup_default);
	    */
	}
}
