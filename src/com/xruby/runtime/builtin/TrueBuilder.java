package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

public class TrueBuilder implements ExtensionBuilder {
	private RubyClass trueClass;
	
	public RubyClass getTrueClass() {
		return this.trueClass;
	}
	
	public void initialize() {
		this.trueClass = RubyUtil.defineClass("TrueClass", RubyRuntime.objectClass);
		this.trueClass.defineMethod("to_s", TrueMethod.toS, 0);
		this.trueClass.defineMethod("&", TrueMethod.and, 1);
		this.trueClass.defineMethod("|", TrueMethod.or, 1);
		this.trueClass.defineMethod("^", TrueMethod.xor, 1);
		RubyUtil.classof(this.trueClass).undefMethod("new");		
	}
}

class TrueMethod {
	public static RubyMethod toS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return ObjectFactory.createString("true");
		}
		
	};
	
	public static RubyMethod and = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return RubyUtil.test(RubyUtil.test(arg));
		}		
	};
	
	public static RubyMethod or = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return RubyConstant.QTRUE;
		}
	};
	
	public static RubyMethod xor = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return RubyUtil.test(!RubyUtil.test(arg));
		}
	};
}
