package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

public class IntegerBuilder implements ExtensionBuilder {
	private RubyClass integerClass;
	
	public RubyClass getIntegerClass() {
		return this.integerClass;
	}
	
	public void initialize() {
		this.integerClass = RubyAPI.defineClass("Integer", RubyRuntime.numericClass);
		this.integerClass.undefAllocMethod();
		RubyAPI.classof(this.integerClass).undefMethod("new");
		this.integerClass.defineMethod("integer?", RubyMethod.TRUE_METHOD, 0);
		/*
    rb_define_method(rb_cInteger, "upto", int_upto, 1);
    rb_define_method(rb_cInteger, "downto", int_downto, 1);
    rb_define_method(rb_cInteger, "times", int_dotimes, 0);
    */
		this.integerClass.includeModule(RubyRuntime.precisionModule);
		this.integerClass.defineMethod("succ", IntegerMethod.succ, 0);
		this.integerClass.defineMethod("next", IntegerMethod.succ, 0);		
		this.integerClass.defineMethod("chr", IntegerMethod.chr, 0);
		this.integerClass.defineMethod("to_i", IntegerMethod.toI, 0);
		this.integerClass.defineMethod("to_int", IntegerMethod.toI, 0);
		this.integerClass.defineMethod("floor", IntegerMethod.toI, 0);
		this.integerClass.defineMethod("ceil", IntegerMethod.toI, 0);
		this.integerClass.defineMethod("round", IntegerMethod.toI, 0);
		this.integerClass.defineMethod("truncate", IntegerMethod.toI, 0);
	}
}

class IntegerMethod {
	public static RubyMethod succ = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			if (receiver instanceof RubyFixnum) {
				RubyFixnum num = (RubyFixnum)receiver;
				return RubyFixnum.long2Fix(num.longValue() + 1);
			}
			
			return receiver.callMethod("+", RubyFixnum.int2Fix(1));
		}		
	};
	
	public static RubyMethod toI = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return receiver;
		}		
	};
	
	public static RubyMethod chr = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			int value = RubyAPI.valueToInt(receiver);
			if (value < 0 || value > 0xff) {
				RubyAPI.raise(RubyRuntime.rangeError, "%ld out of char range", value);
			}
			
			char c = (char)value;
			
			return ObjectFactory.createString(c);
		}		
	};
}