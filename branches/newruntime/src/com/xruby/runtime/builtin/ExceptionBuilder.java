package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;

public class ExceptionBuilder implements ExtensionBuilder {
	private RubyClass exceptionException;
	private RubyClass systemExitException;
	private RubyClass fatalException;
	private RubyClass signalException;
	private RubyClass interruptException;
	
	private RubyClass standardError;
	private RubyClass typeError;
	private RubyClass argumentError;
	private RubyClass indexError;
	private RubyClass rangeError;
	private RubyClass nameError;
	private RubyClass noMethodError;
	
	private RubyClass scriptError;
	private RubyClass syntaxError;
	private RubyClass loadError;
	private RubyClass notImplementedError;
	
	private RubyClass runtimeError;
	private RubyClass securityError;
	private RubyClass noMemoryError;
	
	private RubyClass systemCallError;
	
	private RubyModule errnoModule;

	public RubyClass getExceptionException() {
		return this.exceptionException;
	}
	
	public RubyClass getSystemExitException() {
		return this.systemExitException;
	}
	
	public RubyClass getArgumentError() {
		return argumentError;
	}

	public RubyClass getFatalException() {
		return fatalException;
	}

	public RubyClass getIndexError() {
		return indexError;
	}

	public RubyClass getInterruptException() {
		return interruptException;
	}

	public RubyClass getLoadError() {
		return loadError;
	}

	public RubyClass getNameError() {
		return nameError;
	}
	
	public RubyClass getNoMethodError() {
		return noMethodError;
	}

	public RubyClass getNoMemoryError() {
		return noMemoryError;
	}

	public RubyClass getNotImplementedError() {
		return notImplementedError;
	}

	public RubyClass getRangeError() {
		return rangeError;
	}

	public RubyClass getRuntimeError() {
		return runtimeError;
	}

	public RubyClass getScriptError() {
		return scriptError;
	}

	public RubyClass getSecurityError() {
		return securityError;
	}

	public RubyClass getSignalException() {
		return signalException;
	}

	public RubyClass getStandardError() {
		return standardError;
	}

	public RubyClass getSyntaxError() {
		return syntaxError;
	}

	public RubyClass getSystemCallError() {
		return systemCallError;
	}

	public RubyClass getTypeError() {
		return typeError;
	}
	
	public RubyModule getErrnoModule() {
		return errnoModule;
	}

	public void initialize() {
		this.exceptionException = 
			RubyAPI.defineClass("Exception", RubyRuntime.objectClass);
		this.exceptionException.defineSingletonMethod("exception", 
				ClassMethod.newInstance, -1);
		
		/*
		 rb_define_method(rb_eException, "exception", exc_exception, -1);
    rb_define_method(rb_eException, "initialize", exc_initialize, -1);
    */
		this.exceptionException.defineMethod("to_s", ExceptionMethod.toS, 0);
		/*
    rb_define_method(rb_eException, "to_s", exc_to_s, 0);
    rb_define_method(rb_eException, "to_str", exc_to_str, 0);
    rb_define_method(rb_eException, "message", exc_to_str, 0);
    rb_define_method(rb_eException, "inspect", exc_inspect, 0);
    rb_define_method(rb_eException, "backtrace", exc_backtrace, 0);
    rb_define_method(rb_eException, "set_backtrace", exc_set_backtrace, 1);
		 */
		
		this.systemExitException  = RubyAPI.defineClass("SystemExit", this.exceptionException);
		
		/*
		rb_eSystemExit  = rb_define_class("SystemExit", rb_eException);
	    rb_define_method(rb_eSystemExit, "initialize", exit_initialize, -1);
	    rb_define_method(rb_eSystemExit, "status", exit_status, 0);
	    rb_define_method(rb_eSystemExit, "success?", exit_success_p, 0);
	    */
		
		this.fatalException = RubyAPI.defineClass("fatal", this.exceptionException);
		this.signalException = RubyAPI.defineClass("SignalException", this.exceptionException);
		this.interruptException = RubyAPI.defineClass("Interrupt", this.signalException);
		
		this.standardError = RubyAPI.defineClass("StandardError", this.exceptionException);
		this.typeError = RubyAPI.defineClass("TypeError", this.standardError);
		this.argumentError = RubyAPI.defineClass("ArgumentError", this.standardError);
		this.indexError = RubyAPI.defineClass("IndexError", this.standardError);
		this.rangeError = RubyAPI.defineClass("RangeError", this.standardError);
		this.nameError = RubyAPI.defineClass("NameError", this.standardError);
		
		/*	    
	    rb_define_method(rb_eNameError, "initialize", name_err_initialize, -1);
	    rb_define_method(rb_eNameError, "name", name_err_name, 0);
	    rb_define_method(rb_eNameError, "to_s", name_err_to_s, 0);
	    rb_cNameErrorMesg = rb_define_class_under(rb_eNameError, "message", rb_cData);
	    rb_define_singleton_method(rb_cNameErrorMesg, "!", name_err_mesg_new, 3);
	    rb_define_method(rb_cNameErrorMesg, "to_str", name_err_mesg_to_str, 0);
	    rb_define_method(rb_cNameErrorMesg, "_dump", name_err_mesg_to_str, 1);
	    rb_define_singleton_method(rb_cNameErrorMesg, "_load", name_err_mesg_load, 1);
	    */
		
		this.noMethodError = RubyAPI.defineClass("NoMethodError", this.nameError);
		
		/*
	    rb_eNoMethodError = rb_define_class("NoMethodError", rb_eNameError);
	    rb_define_method(rb_eNoMethodError, "initialize", nometh_err_initialize, -1);
	    rb_define_method(rb_eNoMethodError, "args", nometh_err_args, 0);
	    */
		
		this.scriptError = RubyAPI.defineClass("ScriptError", this.exceptionException);
		this.syntaxError = RubyAPI.defineClass("SyntaxError", this.scriptError);
		this.loadError = RubyAPI.defineClass("LoadError", this.scriptError);
		this.notImplementedError = RubyAPI.defineClass("NotImplementedError", this.scriptError);
		
		this.runtimeError = RubyAPI.defineClass("RuntimeError", this.standardError);
		this.securityError = RubyAPI.defineClass("SecurityError", this.standardError);
		this.noMemoryError = RubyAPI.defineClass("NoMemoryError", this.exceptionException);
		
		/*	    
	    syserr_tbl = st_init_numtable();
	    */
		
		this.systemCallError = RubyAPI.defineClass("SystemCallError", this.standardError);
		
		/*	    
	    rb_define_method(rb_eSystemCallError, "initialize", syserr_initialize, -1);
	    rb_define_method(rb_eSystemCallError, "errno", syserr_errno, 0);
	    rb_define_singleton_method(rb_eSystemCallError, "===", syserr_eqq, 1);
	    */
		
		this.errnoModule = RubyAPI.defineModule("Errno");
	    /*

	    rb_define_global_function("warn", rb_warn_m, 1);
	    */
		
	}	
}

class ExceptionMethod {
	public static RubyMethod toS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return null;
		}
		
	};
}
