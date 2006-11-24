package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

public class KernelBuilder implements ExtensionBuilder {
	private RubyModule kernelModule;

	public void initialize() {
		this.kernelModule = RubyAPI.defineModule("Kernel");	
		this.kernelModule.defineMethod("send", KernelMethod.send, -1);
		this.kernelModule.defineMethod("__send__", KernelMethod.send, -1);
		this.kernelModule.defineMethod("print", KernelMethod.print, -1);
	}
}

class KernelMethod {
	private static RubyID ID_EQ = StringMap.intern("==");
	
	public static RubyMethod send = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			if (args.size() == 0) {
				RubyAPI.raise(RubyRuntime.argumentError, "no method name given");
			}
			
			RubySymbol methodSymbol = (RubySymbol)args.remove(0);
			return receiver.callMethod(methodSymbol.toID(), args, block);
		}		
	};

	public static RubyMethod objectEqual = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return receiver == arg ? RubyConstant.QTRUE : RubyConstant.QFALSE;
		}
	};
	
	public static RubyMethod equal = new NoBlockRubyMethod() {		
		public RubyValue run(RubyValue receiver, RubyArray args) {
			if (receiver == args.get(0)) {
				return RubyConstant.QTRUE;
			}
			
			RubyValue result = receiver.callMethod(ID_EQ, args);
			return RubyAPI.testTrueFalse(result) ? RubyConstant.QTRUE : RubyConstant.QFALSE;
		}
	};
	
	public static RubyMethod objectClass = new RubyNoArgMethod() {
		private RubyClass realClass(RubyClass klass) {			
			while (klass.isSingleton() || klass instanceof RubyIncludeClass) {
				klass = klass.getSuper();
			}
			
			return (RubyClass)klass;
		}
		
		protected RubyValue run(RubyValue receiver) throws RubyException {
			RubyClass klass = receiver.getRubyClass();
			return realClass(klass);
		} 
	};
	
	public static RubyMethod anyToS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) throws RubyException {
			String name = receiver.getRubyClassName().getString();
			return ObjectFactory.createString("#<" + name + ":0x" + Integer.toHexString(receiver.hashCode()) + ">");
		}
	};
	
	public static RubyMethod objectInspect = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) throws RubyException {
			if (receiver instanceof RubyObject 
					&& ((RubyObject)receiver).getIvSize() > 0) {
				String name = receiver.getRubyClassName().getString();
				// FIXME: inspect
			}
			
			return receiver.callMethod("to_s");
		}
	};
	
	public static RubyMethod isInstanceOf = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {			
			RubyClassModuleBase base = (RubyClassModuleBase)(arg);
			return base.isInstanceOf(receiver) ? RubyConstant.QTRUE : RubyConstant.QFALSE;
			
			// FIXME: type cast exception
		}
	};
	
	public static RubyMethod isKindOf = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {		
			RubyClassModuleBase base = (RubyClassModuleBase)(arg);
			return base.isKindOf(receiver) ? RubyConstant.QTRUE : RubyConstant.QFALSE;
			
			// FIXME: type cast exception
		}
	};
	
	public static RubyMethod methods = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			boolean recursion = true;
			if (args != null && args.size() > 0) {
				recursion = RubyAPI.testTrueFalse(args.get(0));
			}
				
			RubyClass klass = receiver.getRubyClass();
			return klass.instanceMethods(recursion);
		}		
	};
	
	public static RubyMethod protectedMethods = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			boolean recursion = true;
			if (args != null && args.size() > 0) {
				recursion = RubyAPI.testTrueFalse(args.get(0));
			}
				
			RubyClass klass = receiver.getRubyClass();
			return klass.protectedInstanceMethods(recursion);
		}		
	};
	
	public static RubyMethod privateMethods = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			boolean recursion = true;
			if (args != null && args.size() > 0) {
				recursion = RubyAPI.testTrueFalse(args.get(0));
			}
				
			RubyClass klass = receiver.getRubyClass();
			return klass.privateInstanceMethods(recursion);
		}		
	};
	
	public static RubyMethod publicMethods = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			boolean recursion = true;
			if (args != null && args.size() > 0) {
				recursion = RubyAPI.testTrueFalse(args.get(0));
			}
				
			RubyClass klass = receiver.getRubyClass();
			return klass.publicInstanceMethods(recursion);
		}		
	};
	
	public static RubyMethod print = new RubyMethod() {
		protected RubyValue run(RubyValue receiver, RubyArray args,
				RubyBlock block) {
			receiver = GlobalVariables.STDOUT;
			
			//if no argument given, print `$_'
			if (null == args) {
				args = new RubyArray(GlobalVariables.LAST_READ_LINE);
			}
			
			for (int i = 0; i < args.size(); ++i) {
				// insert the output field separator($,) if not nil
				if (i > 0 && GlobalVariables.OUTPUT_FIELD_SEPARATOR != ObjectFactory.nilValue) {
					RubyAPI.callPublicMethod(receiver, GlobalVariables.OUTPUT_FIELD_SEPARATOR, "write");
				}
				
				if (args.get(i) == ObjectFactory.nilValue) {
					RubyAPI.callPublicMethod(receiver, ObjectFactory.createString("nil"), "write");
				} else {
					RubyAPI.callPublicMethod(receiver, args.get(i), "write");
				}
			}
			
			// if the output record separator($\) is not nil, it will be appended to the output.
			if ( GlobalVariables.OUTPUT_RECORD_SEPARATOR != ObjectFactory.nilValue) {
				RubyAPI.callPublicMethod(receiver, GlobalVariables.OUTPUT_RECORD_SEPARATOR, "write");
			}

			return ObjectFactory.nilValue;
		}
	};
	
}