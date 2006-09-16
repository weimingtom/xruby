/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;

class Array_length extends RubyMethod {
	public Array_length() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		ArrayValue value = (ArrayValue)receiver.getValue();
		return ObjectFactory.createFixnum(value.size());
	}
}

class Array_to_s extends RubyMethod {
	public Array_to_s() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		ArrayValue value = (ArrayValue)receiver.getValue();
		return value.to_s();
	}
}

class Array_to_a extends RubyMethod {
	public Array_to_a() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		return receiver;
	}
}

class Array_array_access extends RubyMethod {
	public Array_array_access() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		ArrayValue value = (ArrayValue)receiver.getValue();
		if (1 == args.length) {
			Integer i = (Integer)args[0].getValue();
			return value.get(i);
		}
		
		//TODO
		throw new RubyException("not implemented");
	}
}

class Array_array_set extends RubyMethod {
	public Array_array_set() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		//TODO index can be range, -1 etc
		ArrayValue value = (ArrayValue)receiver.getValue();
		Integer index = (Integer)args[0].getValue();
		return value.set(index, args[1]);
	}
}

class Array_array_equal extends RubyMethod {
	public Array_array_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		ArrayValue left = (ArrayValue)receiver.getValue();
		Object right = args[0].getValue();
		if (!(right instanceof ArrayValue)) {
			return ObjectFactory.falseValue;
		}
		return left.equals((ArrayValue)right);
	}
}

class Array_concat extends RubyMethod {
	public Array_concat() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		ArrayValue left = (ArrayValue)receiver.getValue();
		Object right = args[0].getValue();
		if (right instanceof ArrayValue) {
			left.concat((ArrayValue)right);
		} else {
			left.add((RubyValue)right);
		}

		return receiver;
	}
}

public class ArrayClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Array", RubyRuntime.ObjectClass);
		c.defineMethod("length", new Array_length());
		c.defineMethod("to_s", new Array_to_s());
		c.defineMethod("to_a", new Array_to_a());
		c.defineMethod("[]", new Array_array_access());
		c.defineMethod("[]=", new Array_array_set());
		c.defineMethod("==", new Array_array_equal());
		c.defineMethod("concat", new Array_concat());
		return c;
	}
}

