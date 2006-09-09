/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;

class Fixnum_operator_right_shift extends RubyMethod {
	public Fixnum_operator_right_shift() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		return ObjectFactory.createFixnum(value1.intValue() >> value2.intValue());
	}
}

class Fixnum_operator_left_shift extends RubyMethod {
	public Fixnum_operator_left_shift() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		return ObjectFactory.createFixnum(value1.intValue() << value2.intValue());
	}
}

class Fixnum_operator_equal extends RubyMethod {
	public Fixnum_operator_equal() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
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
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		if (value1.intValue() == value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_operator_power extends RubyMethod {
	public Fixnum_operator_power() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_quo extends RubyMethod {
	public Fixnum_quo() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_modulo extends RubyMethod {
	public Fixnum_modulo() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_operator_plus extends RubyMethod {
	public Fixnum_operator_plus() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		return ObjectFactory.createFixnum(value1.intValue() + value2.intValue());
	}
}

class Fixnum_size extends RubyMethod {
	public Fixnum_size() {
		super(0, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_operator_less_or_equal extends RubyMethod {
	public Fixnum_operator_less_or_equal() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		if (value1.intValue() <= value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_to_f extends RubyMethod {
	public Fixnum_to_f() {
		super(0, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_operator_array_access extends RubyMethod {
	public Fixnum_operator_array_access() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_operator_minus extends RubyMethod {
	public Fixnum_operator_minus() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		return ObjectFactory.createFixnum(value1.intValue() - value2.intValue());
	}
}

class Fixnum_operator_div extends RubyMethod {
	public Fixnum_operator_div() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		return ObjectFactory.createFixnum(value1.intValue() / value2.intValue());
	}
}

class Fixnum_to_s extends RubyMethod {
	public Fixnum_to_s() {
		super(0, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value = (Integer)receiver.getValue();
		return ObjectFactory.createString(value.toString());
	}
}

class Fixnum_zero_question extends RubyMethod {
	public Fixnum_zero_question() {
		super(0, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_operator_mod extends RubyMethod {
	public Fixnum_operator_mod() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		return ObjectFactory.createFixnum(value1.intValue() % value2.intValue());
	}
}

class Fixnum_operator_bor extends RubyMethod {
	public Fixnum_operator_bor() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		return ObjectFactory.createFixnum(value1.intValue() | value2.intValue());
	}
}

class Fixnum_operator_band extends RubyMethod {
	public Fixnum_operator_band() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		return ObjectFactory.createFixnum(value1.intValue() & value2.intValue());
	}
}

class Fixnum_operator_less_than extends RubyMethod {
	public Fixnum_operator_less_than() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		if (value1.intValue() < value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_divmod extends RubyMethod {
	public Fixnum_divmod() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_id2name extends RubyMethod {
	public Fixnum_id2name() {
		super(0, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_operator_compare extends RubyMethod {
	public Fixnum_operator_compare() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		int value1 = ((Integer)receiver.getValue()).intValue();
		int value2 = ((Integer)args[0].getValue()).intValue();
		if (value1 < value2) {
			return ObjectFactory.createFixnum(-1);
		} else if (value1 == value2) {
			return ObjectFactory.createFixnum(0);
		} else {
			return ObjectFactory.createFixnum(1);
		}
	}
}

class Fixnum_abs extends RubyMethod {
	public Fixnum_abs() {
		super(0, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_to_sym extends RubyMethod {
	public Fixnum_to_sym() {
		super(0, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_operator_bxor extends RubyMethod {
	public Fixnum_operator_bxor() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		return ObjectFactory.createFixnum(value1.intValue() ^ value2.intValue());
	}
}

class Fixnum_operator_not extends RubyMethod {
	public Fixnum_operator_not() {
		super(0, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class Fixnum_operator_greater_than extends RubyMethod {
	public Fixnum_operator_greater_than() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		if (value1.intValue() > value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_operator_greater_or_equal extends RubyMethod {
	public Fixnum_operator_greater_or_equal() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
		if (value1.intValue() >= value2.intValue()) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Fixnum_operator_star extends RubyMethod {
	public Fixnum_operator_star() {
		super(1, false);
	}

	protected RubyValue run(RubyValue receiver, RubyValue[] args, RubyBlock block) throws RubyException {
		Integer value1 = (Integer)receiver.getValue();
		Integer value2 = (Integer)args[0].getValue();
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
		c.defineMethod("**", new Fixnum_operator_power());
		c.defineMethod("quo", new Fixnum_quo());
		c.defineMethod("modulo", new Fixnum_modulo());
		c.defineMethod("+", new Fixnum_operator_plus());
		c.defineMethod("size", new Fixnum_size());
		c.defineMethod("<=", new Fixnum_operator_less_or_equal());
		c.defineMethod("to_f", new Fixnum_to_f());
		c.defineMethod("[]", new Fixnum_operator_array_access());
		c.defineMethod("-", new Fixnum_operator_minus());
		c.defineMethod("/", new Fixnum_operator_div());
		c.defineMethod("to_s", new Fixnum_to_s());
		c.defineMethod("zero?", new Fixnum_zero_question());
		c.defineMethod("%", new Fixnum_operator_mod());
		c.defineMethod("|", new Fixnum_operator_bor());
		c.defineMethod("&", new Fixnum_operator_band());
		c.defineMethod("<", new Fixnum_operator_less_than());
		c.defineMethod("divmod", new Fixnum_divmod());
		c.defineMethod("div", new Fixnum_operator_div());
		c.defineMethod("id2name", new Fixnum_id2name());
		c.defineMethod("<=>", new Fixnum_operator_compare());
		c.defineMethod("abs", new Fixnum_abs());
		c.defineMethod("to_sym", new Fixnum_to_sym());
		c.defineMethod("^", new Fixnum_operator_bxor());
		c.defineMethod("~", new Fixnum_operator_not());
		c.defineMethod(">", new Fixnum_operator_greater_than());
		c.defineMethod(">=", new Fixnum_operator_greater_or_equal());
		c.defineMethod("*", new Fixnum_operator_star());
		return c;
	}
}
