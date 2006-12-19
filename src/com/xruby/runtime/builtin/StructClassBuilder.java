package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Struct_new extends RubyMethod {
	public Struct_new() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (!(args.get(0) instanceof RubyString)) {
			//It is almost impossible to implement this:
			//Customer = Struct.new(:name, :address)
			//a = Customer.new("Dave", "123 Main")
			//print a.class
			throw new RubyException("not implemented!");
		} else {
			RubyClass c = RubyRuntime.StructClass.defineClass(((RubyString)args.get(0)).toString(), RubyRuntime.ObjectClass);
			return c;
		}
	}
}

public class StructClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.StructClass;
		c.defineAllocMethod(new Struct_new());
		//c.defineMethod("to_s", new Struct_to_s());
	}
}
