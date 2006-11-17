package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.*;
import com.xruby.newruntime.value.*;

public class KernelBuilder implements ExtensionBuilder {
	private RubyModule kernelModule;

	public void initialize() {
		this.kernelModule = RubyUtil.defineModule("Kernel");	
		this.kernelModule.defineMethod("send", KernelMethod.send, -1);
		this.kernelModule.defineMethod("__send__", KernelMethod.send, -1);
	}
}

class KernelMethod {
	public static RubyMethod send = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			if (args.length() == 0) {
				RubyUtil.raise(RubyRuntime.argumentError, "no method name given");
			}
			
			RubySymbol methodSymbol = (RubySymbol)args.remove(0);
			return receiver.callMethod(methodSymbol.toID(), args, block);
		}		
	};
}