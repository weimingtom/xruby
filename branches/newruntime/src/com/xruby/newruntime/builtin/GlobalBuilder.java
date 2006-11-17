package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.*;
import com.xruby.newruntime.value.*;

public class GlobalBuilder implements ExtensionBuilder {
	public void initialize() {
		RubyUtil.defineGlobalMethod("raise", GlobalMethod.raise, -1);
		RubyUtil.defineGlobalMethod("fail", GlobalMethod.raise, -1);
		
		RubyUtil.defineGlobalMethod("proc", GlobalMethod.lambda, 0);
		RubyUtil.defineGlobalMethod("lambda", GlobalMethod.lambda, 0);
	}	
}

class GlobalMethod {
	public static RubyMethod raise = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			
			int argc = args.length();
			switch (argc) {
			case 0:
				RubyUtil.raise(RubyRuntime.runtimeError, " not implemented");
				break;
			case 1:				
				if (args.get(0) instanceof RubyString) {
					RubyUtil.raise(RubyRuntime.runtimeError, ((RubyString)args.get(0)).getString());
					break;
				}
				
				break;
			case 2:
			case 3:
				RubyUtil.raise(RubyRuntime.runtimeError, " not implemented");
				break;
			default: 
				RubyUtil.raise(RubyRuntime.runtimeError, " not implemented");
			}
			
			return RubyConstant.QNIL; // not reach
		}		
	};
	
	public static RubyMethod lambda = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return null;
		}
		
	};
}