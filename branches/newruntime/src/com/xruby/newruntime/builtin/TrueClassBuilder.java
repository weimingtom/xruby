package com.xruby.newruntime.builtin;

import com.xruby.newruntime.lang.RubyClass;
import com.xruby.newruntime.lang.RubyConstant;
import com.xruby.newruntime.lang.RubyMethod;
import com.xruby.newruntime.lang.RubyNoArgMethod;
import com.xruby.newruntime.lang.RubyOneArgMethod;
import com.xruby.newruntime.lang.RubyRuntime;
import com.xruby.newruntime.lang.RubyUtil;
import com.xruby.newruntime.lang.RubyValue;
import com.xruby.newruntime.value.RubyString;

public class TrueClassBuilder implements ClassBuilder {
	private RubyClass trueClass;
	
	public RubyClass getTrueClass() {
		return this.trueClass;
	}
	
	public void initialize() {
		this.trueClass = RubyRuntime.defineClass("TrueClass", RubyRuntime.objectClass);
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
			return RubyString.newString("true");
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
