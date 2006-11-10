/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Array_length extends RubyMethod {
	public Array_length() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray value = (RubyArray)receiver.getValue();
		return ObjectFactory.createFixnum(value.size());
	}
}

class Array_to_s extends RubyMethod {
	public Array_to_s() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray value = (RubyArray)receiver.getValue();
		return value.to_s();
	}
}

class Array_array_access extends RubyMethod {
	public Array_array_access() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray value = (RubyArray)receiver.getValue();
		
		if (1 == args.size()) {
			Object argValue = args.get(0).getValue();
			if (argValue instanceof IntegerValue) {
				IntegerValue index = (IntegerValue)argValue;
				return value.get(index.intValue());
			} else if (argValue instanceof RangeValue) {				
				RangeValue range = (RangeValue)argValue;
				RubyArray resultValue = value.subarray(range);
				return ObjectFactory.createArray(resultValue);
			}
		} else if (2 == args.size()) {
			Object arg0Value = args.get(0).getValue();
			Object arg1Value = args.get(1).getValue();
			if (arg0Value instanceof IntegerValue && arg1Value instanceof IntegerValue) {
				int begin = ((IntegerValue)arg0Value).intValue();
				int length = ((IntegerValue)arg1Value).intValue();
				RubyArray resultValue = value.subarray(begin, length);
				if (resultValue == null) {
					return ObjectFactory.nilValue;
				}
				
				return ObjectFactory.createArray(resultValue);
			}
		}
		
		//TODO
		throw new RubyException("not implemented");
	}
}

class Array_array_set extends RubyMethod {
	public Array_array_set() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		//TODO index can be range, -1 etc
		RubyArray value = (RubyArray)receiver.getValue();
		IntegerValue index = (IntegerValue)args.get(0).getValue();
		return value.set(index.intValue(), args.get(1));
	}
}

class Array_array_equal extends RubyMethod {
	public Array_array_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray left = (RubyArray)receiver.getValue();
		Object right = args.get(0).getValue();
		if (!(right instanceof RubyArray)) {
			return ObjectFactory.falseValue;
		}
		return left.equals((RubyArray)right);
	}
}

class Array_concat extends RubyMethod {
	public Array_concat() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray left = (RubyArray)receiver.getValue();
		left.concat(args.get(0));
		return receiver;
	}
}

class Array_plus extends RubyMethod {
	public Array_plus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray left = (RubyArray)receiver.getValue();
		RubyArray right = (RubyArray)args.get(0).getValue();
		RubyArray resultArray = left.plus(right);
		return ObjectFactory.createArray(resultArray);
	}
}

class Array_times extends RubyMethod {
	public Array_times() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray array = (RubyArray)receiver.getValue();
		IntegerValue times = (IntegerValue)args.get(0).getValue();
		RubyArray resultArray = array.times(times.intValue());		
		
		return ObjectFactory.createArray(resultArray);
	}
}

class Array_push extends RubyMethod {
	public Array_push() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray array = (RubyArray)receiver.getValue();
		RubyValue obj = args.get(0);
		array.add(obj);
		return receiver;
	}
}

class Array_pop extends RubyMethod {
	public Array_pop() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {		
		RubyArray array = (RubyArray)receiver.getValue();		
		return array.remove(array.size() - 1);		
	}
}

class Array_delete_at extends RubyMethod {
	public Array_delete_at() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray array = (RubyArray)receiver.getValue();
		IntegerValue pos = (IntegerValue)args.get(0).getValue();
		return array.remove(pos.intValue());		
	}
}

class Array_include extends RubyMethod {
	public Array_include() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) throws RubyException {
		RubyArray array = (RubyArray)receiver.getValue();
		if (array.include(args.get(0))) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

public class ArrayClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Array", RubyRuntime.ObjectClass);
		c.defineMethod("length", new Array_length());
		c.defineMethod("to_s", new Array_to_s());
		c.defineMethod("[]", new Array_array_access());
		c.defineMethod("[]=", new Array_array_set());
		c.defineMethod("==", new Array_array_equal());
		c.defineMethod("concat", new Array_concat());
		c.defineMethod("+", new Array_plus());
		c.defineMethod("*", new Array_times());
		c.defineMethod("push", new Array_push());
		c.defineMethod("pop", new Array_pop());
		c.defineMethod("delete_at", new Array_delete_at());
		c.defineMethod("include?", new Array_include());
		return c;
	}
}

