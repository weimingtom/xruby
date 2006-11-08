package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyBlock;
import com.xruby.newruntime.lang.RubyConstant;
import com.xruby.newruntime.lang.RubyMethod;
import com.xruby.newruntime.lang.RubyNoArgMethod;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.value.RubyString;
import com.xruby.newruntime.value.RubyArray;

public class GlobalBuilder implements ClassBuilder {
	public void initialize() {
		RubyRuntime.defineGlobalMethod("raise", GlobalMethod.raise, -1);
		RubyRuntime.defineGlobalMethod("fail", GlobalMethod.raise, -1);
		
		RubyRuntime.defineGlobalMethod("proc", GlobalMethod.lambda, 0);
		RubyRuntime.defineGlobalMethod("lambda", GlobalMethod.lambda, 0);
	}	
}

class GlobalMethod {
	public static RubyMethod raise = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			
			int argc = args.length();
			switch (argc) {
			case 0:
				RubyRuntime.raise(RubyRuntime.runtimeError, " not implemented");
				break;
			case 1:				
				if (args.get(0) instanceof RubyString) {
					RubyRuntime.raise(RubyRuntime.runtimeError, ((RubyString)args.get(0)).getString());
					break;
				}
				
				break;
			case 2:
			case 3:
				RubyRuntime.raise(RubyRuntime.runtimeError, " not implemented");
				break;
			default: 
				RubyRuntime.raise(RubyRuntime.runtimeError, " not implemented");
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