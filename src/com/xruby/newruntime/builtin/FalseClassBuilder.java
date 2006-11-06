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

public class FalseClassBuilder implements ClassBuilder {
	private RubyClass falseClass;
	
	public RubyClass getFalseClass() {
		return this.falseClass;
	}
	
	public void initialize() {
		this.falseClass = RubyRuntime.defineClass("FalseClass", RubyRuntime.objectClass);
		this.falseClass.defineMethod("to_s", FalseMethod.toS, 0);
		this.falseClass.defineMethod("&", FalseMethod.and, 1);
		this.falseClass.defineMethod("|", FalseMethod.or, 1);
		this.falseClass.defineMethod("^", FalseMethod.xor, 1);
		RubyUtil.classof(this.falseClass).undefMethod("new");
	}
}

class FalseMethod {
	public static final RubyMethod toS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return RubyString.newString("false");
		}		
	};
	
	public static final RubyMethod and = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return RubyConstant.QFALSE;
		}		
	};
	
	public static final RubyMethod or = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return RubyUtil.test(RubyUtil.test(arg));
		}
	};
	
	public static final RubyMethod xor = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return RubyUtil.test(RubyUtil.test(arg));
		}
	};
}