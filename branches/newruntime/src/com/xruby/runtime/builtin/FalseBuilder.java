package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyNoArgMethod;
import com.xruby.runtime.lang.RubyOneArgMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;

public class FalseBuilder implements ExtensionBuilder {
	private RubyClass falseClass;
	
	public RubyClass getFalseClass() {
		return this.falseClass;
	}
	
	public void initialize() {
		this.falseClass = RubyAPI.defineClass("FalseClass", RubyRuntime.objectClass);
		this.falseClass.defineMethod("to_s", FalseMethod.toS, 0);
		this.falseClass.defineMethod("&", FalseMethod.and, 1);
		this.falseClass.defineMethod("|", FalseMethod.or, 1);
		this.falseClass.defineMethod("^", FalseMethod.xor, 1);
		this.falseClass.getRubyClass().undefMethod("new");
	}
}

class FalseMethod {
	public static final RubyMethod toS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return ObjectFactory.createString("false");
		}		
	};
	
	public static final RubyMethod and = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return RubyConstant.QFALSE;
		}		
	};
	
	public static final RubyMethod or = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return RubyAPI.testTrueFalse(arg) ? RubyConstant.QTRUE : RubyConstant.QFALSE;
		}
	};
	
	public static final RubyMethod xor = new RubyOneArgMethod() {
		protected RubyValue run(RubyValue receiver, RubyValue arg) {
			return RubyAPI.testTrueFalse(arg) ? RubyConstant.QTRUE : RubyConstant.QFALSE;
		}
	};
}