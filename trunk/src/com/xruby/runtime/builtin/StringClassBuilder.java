/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class String_capitalize extends RubyMethod {
	public String_capitalize() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		StringValue new_value = new StringValue(value.toString());
		new_value.capitalize();
		return ObjectFactory.createString(new_value);
	}
}

class String_operator_equal extends RubyMethod {
	public String_operator_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		if (args.get(0).getRubyClass() != RubyRuntime.StringClass) {
			return ObjectFactory.falseValue;
		}

		StringValue a = (StringValue)receiver.getValue();
		StringValue b = (StringValue)args.get(0).getValue();
		if (a.toString().equals(b.toString())) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

/// Upcases the contents of str, returning nil if no changes were made
class String_upcase_danger extends RubyMethod {
	public String_upcase_danger() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		StringValue new_value = new StringValue(value.toString().toUpperCase());
		if (new_value.toString().equals(value.toString())) {
			//no changes
			return ObjectFactory.nilValue;
		} else {
			receiver.setValue(new_value);
			return receiver;
		}
	}
}

///Modifies str by converting the first character to uppercase and the remainder to lowercase. Returns nil if no changes are made.
class String_capitalize_danger extends RubyMethod {
	public String_capitalize_danger() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		boolean changed = value.capitalize();
		if (changed) {
			return receiver;
		} else {
			return ObjectFactory.nilValue;
		}
	}
}

class String_upcase extends RubyMethod {
	public String_upcase() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		return ObjectFactory.createString(value.toString().toUpperCase());
	}
}

class String_downcase extends RubyMethod {
	public String_downcase() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		return ObjectFactory.createString(value.toString().toLowerCase());
	}
}

/// Downcases the contents of str, returning nil if no changes were made. 
class String_downcase_danger extends RubyMethod {
	public String_downcase_danger() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		StringValue new_value = new StringValue(value.toString().toLowerCase());
		if (new_value.toString().equals(value.toString())) {
			return ObjectFactory.nilValue;
		} else {
			receiver.setValue(new_value);
			return receiver;
		}
	}
}

class String_to_f extends RubyMethod {
	public String_to_f() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		return ObjectFactory.createFloat(Float.valueOf(value.toString()));
	}
}

class String_to_i extends RubyMethod {
	public String_to_i() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		return ObjectFactory.createFixnum(Integer.valueOf(value.toString()));
	}
}

class String_length extends RubyMethod {
	public String_length() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		return ObjectFactory.createFixnum(value.length());
	}
}

class String_initialize extends RubyMethod {
	public String_initialize() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		if (args == null) {
			receiver.setValue(new StringValue(""));
		} else if (args.get(0) != null) {
			receiver.setValue(args.get(0).getValue());
		}

		return receiver;
	}
}

class String_initialize_copy extends RubyMethod {
	public String_initialize_copy() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		receiver.setValue(args.get(0).getValue());
		return receiver;
	}
}

public class StringClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("String", RubyRuntime.ObjectClass);
		c.defineMethod("capitalize", new String_capitalize());
		c.defineMethod("==", new String_operator_equal());
		c.defineMethod("upcase!", new String_upcase_danger());
		c.defineMethod("capitalize!", new String_capitalize_danger());
		c.defineMethod("upcase", new String_upcase());
		c.defineMethod("downcase", new String_downcase());
		c.defineMethod("to_f", new String_to_f());
		c.defineMethod("to_i", new String_to_i());
		c.defineMethod("length", new String_length());
		c.defineMethod("downcase!", new String_downcase_danger());
		c.defineMethod("initialize_copy", new String_initialize_copy());
		c.defineMethod("initialize", new String_initialize());
		return c;
	}
}


