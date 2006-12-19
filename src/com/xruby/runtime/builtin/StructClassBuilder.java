package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Struct_new extends RubyMethod {
	public Struct_new() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (!(args.get(0) instanceof RubyString)) {
			//TODO It is almost impossible to implement this:
			//Customer = Struct.new(:name, :address)
			//a = Customer.new("Dave", "123 Main")
			//print a.class
			throw new RubyException("not implemented!");
		} else {
			RubyClass c = RubyRuntime.StructClass.defineClass(((RubyString)args.get(0)).toString(), RubyRuntime.ObjectClass);
			for (int i = 1; i < args.size(); ++i) {
				String s = RubyTypesUtil.convertToSymbol(args.get(i)).toString();
				c.defineMethod(s, new AttrReader(s));
				c.defineMethod(s + "=", new AttrWriter(s));
			}
			
			final RubyArray super_args = args;
			c.defineAllocMethod(new RubyMethod(args.size() - 1) {

				protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
					RubyValue v = new RubyObject((RubyClass)receiver);
					for (int i = 0; i < args.size(); ++i) {
						v.setInstanceVariable(args.get(i), "@" + RubyTypesUtil.convertToSymbol(super_args.get(i + 1)).toString());
					}
					return v;
				}
				
			}
			);
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
