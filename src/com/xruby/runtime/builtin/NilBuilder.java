package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

public class NilBuilder implements ExtensionBuilder {
	private RubyClass nilClass;
	
	public RubyClass getNilClass() {
		return this.nilClass;
	}
	
	public void initialize() {
		this.nilClass = RubyUtil.defineClass("NilClass", RubyRuntime.objectClass);
		this.nilClass.defineMethod("to_i", NilMethod.toI, 0);
		//this.rbNilClass.defineMethod("to_f", NilClassMethodCollection.NIL_TO_I, 0);
		this.nilClass.defineMethod("to_s", NilMethod.toS, 0);
		//this.rbNilClass.defineMethod("to_a", NilClassMethodCollection.NIL_TO_I, 0);
		this.nilClass.defineMethod("inspect", NilMethod.inspect, 0);
		this.nilClass.defineMethod("&", FalseMethod.and, 1);
		this.nilClass.defineMethod("|", FalseMethod.or, 1);
		this.nilClass.defineMethod("^", FalseMethod.xor, 1);
		this.nilClass.defineMethod("nil?", RubyMethod.TRUE_METHOD, 1);		
		RubyUtil.classof(this.nilClass).undefMethod("new");
	}
}

class NilMethod {
	public static RubyMethod toI = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return RubyFixnum.int2Fix(0);
		}		
	};
	
	public static RubyMethod toS = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return ObjectFactory.createString("");
		}		
	};
	
	public static RubyMethod inspect = new RubyNoArgMethod() {
		protected RubyValue run(RubyValue receiver) {
			return ObjectFactory.createString("nil");
		}
	};
}