/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class Fixnum_operator_right_shift extends RubyMethod {
	public Fixnum_operator_right_shift() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() >> value2.intValue());
	}
}

class Fixnum_operator_left_shift extends RubyMethod {
	public Fixnum_operator_left_shift() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() << value2.intValue());
	}
}

class Fixnum_operator_equal extends RubyMethod {
	public Fixnum_operator_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		if (!(args.get(0).getValue() instanceof IntegerValue)) {
			return ObjectFactory.falseValue;
		}
		
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value1.intValue() == value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

//C Ruby does not need this function since it can compare integer directly
class Fixnum_operator_case_equal extends RubyMethod {
	public Fixnum_operator_case_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value1.intValue() == value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_operator_plus extends RubyMethod {
	public Fixnum_operator_plus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() + value2.intValue());
	}
}

class Fixnum_operator_less_or_equal extends RubyMethod {
	public Fixnum_operator_less_or_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value1.intValue() <= value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_operator_minus extends RubyMethod {
	public Fixnum_operator_minus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() - value2.intValue());
	}
}

class Fixnum_operator_div extends RubyMethod {
	public Fixnum_operator_div() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() / value2.intValue());
	}
}

class Fixnum_to_s extends RubyMethod {
	public Fixnum_to_s() {
		super(0, false);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value = (IntegerValue)receiver.getValue();
		return ObjectFactory.createString(value.toString());
	}
}

class Fixnum_operator_mod extends RubyMethod {
	public Fixnum_operator_mod() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() % value2.intValue());
	}
}

class Fixnum_operator_bor extends RubyMethod {
	public Fixnum_operator_bor() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() | value2.intValue());
	}
}

class Fixnum_operator_band extends RubyMethod {
	public Fixnum_operator_band() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() & value2.intValue());
	}
}

class Fixnum_operator_less_than extends RubyMethod {
	public Fixnum_operator_less_than() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value1.intValue() < value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_operator_compare extends RubyMethod {
	public Fixnum_operator_compare() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		int value1 = ((IntegerValue)receiver.getValue()).intValue();
		int value2 = ((IntegerValue)args.get(0).getValue()).intValue();
		if (value1 < value2) {
			return ObjectFactory.createFixnum(-1);
		} else if (value1 == value2) {
			return ObjectFactory.createFixnum(0);
		} else {
			return ObjectFactory.createFixnum(1);
		}
	}
}

class Fixnum_operator_bxor extends RubyMethod {
	public Fixnum_operator_bxor() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() ^ value2.intValue());
	}
}

class Fixnum_operator_greater_than extends RubyMethod {
	public Fixnum_operator_greater_than() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value1.intValue() > value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_operator_greater_or_equal extends RubyMethod {
	public Fixnum_operator_greater_or_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		if (value1.intValue() >= value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_operator_star extends RubyMethod {
	public Fixnum_operator_star() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		IntegerValue value1 = (IntegerValue)receiver.getValue();
		IntegerValue value2 = (IntegerValue)args.get(0).getValue();
		return ObjectFactory.createFixnum(value1.intValue() * value2.intValue());
	}
}

public class FixnumClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Fixnum", RubyRuntime.IntegerClass);
		c.defineMethod(">>", new Fixnum_operator_right_shift());
		c.defineMethod("<<", new Fixnum_operator_left_shift());
		c.defineMethod("==", new Fixnum_operator_equal());
		c.defineMethod("===", new Fixnum_operator_case_equal());
		c.defineMethod("+", new Fixnum_operator_plus());
		c.defineMethod("<=", new Fixnum_operator_less_or_equal());
		c.defineMethod("-", new Fixnum_operator_minus());
		c.defineMethod("/", new Fixnum_operator_div());
		c.defineMethod("to_s", new Fixnum_to_s());
		c.defineMethod("%", new Fixnum_operator_mod());
		c.defineMethod("|", new Fixnum_operator_bor());
		c.defineMethod("&", new Fixnum_operator_band());
		c.defineMethod("<", new Fixnum_operator_less_than());
		c.defineMethod("div", new Fixnum_operator_div());
		c.defineMethod("<=>", new Fixnum_operator_compare());
		c.defineMethod("^", new Fixnum_operator_bxor());
		c.defineMethod(">", new Fixnum_operator_greater_than());
		c.defineMethod(">=", new Fixnum_operator_greater_or_equal());
		c.defineMethod("*", new Fixnum_operator_star());
		return c;
	}
}
