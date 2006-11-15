package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.*;

public class KernelMethod {
	private static RubyID ID_EQ = StringMap.intern("==");
	
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
			return RubyUtil.test(result) ? RubyConstant.QTRUE : RubyConstant.QFALSE;
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
			RubyClass klass = RubyUtil.classof(receiver);
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
			if (args == null || args.length() == 0) {
				RubyClass klass = RubyUtil.classof(receiver);
				return klass.instanceMethod(true);
			} else {
				RubyRuntime.raise(RubyRuntime.runtimeError, " not implemented");
				return null;
			}
		}
		
	};
}