package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyBlock;
import com.xruby.newruntime.lang.RubyMethod;
import com.xruby.newruntime.lang.RubyModule;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubySymbol;
import com.xruby.newruntime.lang.RubyValue;

public class KernelBuilder implements ClassBuilder {
	private RubyModule kernelModule;

	public void initialize() {
		this.kernelModule = RubyRuntime.defineModule("Kernel");	
		this.kernelModule.defineMethod("send", KernelMethod.send, -1);
		this.kernelModule.defineMethod("__send__", KernelMethod.send, -1);
	}
}

class KernelMethod {
	public static RubyMethod send = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue[] args,
				RubyBlock block) {
			if (args.length == 0) {
				RubyRuntime.raise(RubyRuntime.argumentError, "no method name given");
			}
			
			RubySymbol methodSymbol = (RubySymbol)args[0];
			int destLen = args.length - 1;
			RubyValue[] destArgs = new RubyValue[destLen];
			System.arraycopy(args, 1, destArgs, 0, destLen);
			
			return receiver.callMethod(methodSymbol.toID(), destArgs, block);
		}		
	};
}