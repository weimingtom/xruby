package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

/*class Bignum_to_s extends RubyMethod { 
	public Bignum_to_s() {
		super(0); 
	}

	public RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		BignumValue value = (BignumValue)receiver.getValue();
		return ObjectFactory.createString(value.to_s());
	} 
}*/

public class BignumClassBuilder {
	public static RubyClass create(){
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Bignum", RubyRuntime.IntegerClass);
		//c.defineMethod("to_s", new Bignum_to_s());
		return c;
	}
}
