/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import com.xruby.core.lang.*;
import com.xruby.core.value.*;

class String_operator_mod extends RubyMethod {
	public String_operator_mod(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_operator_array_access extends RubyMethod {
	public String_operator_array_access(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_sub_danger extends RubyMethod {
	public String_sub_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_slice extends RubyMethod {
	public String_slice(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_reverse_danger extends RubyMethod {
	public String_reverse_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_include_question extends RubyMethod {
	public String_include_question(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_succ extends RubyMethod {
	public String_succ(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_upto extends RubyMethod {
	public String_upto(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_oct extends RubyMethod {
	public String_oct(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_operator_array_assign extends RubyMethod {
	public String_operator_array_assign(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_capitalize extends RubyMethod {
	public String_capitalize(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		StringValue new_value = new StringValue(value.toString());
		new_value.capitalize();
		return ObjectFactory.createString(new_value);
	}
}

class String_operator_equal extends RubyMethod {
	public String_operator_equal(int argc) {
		super(argc);
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

class String_delete_danger extends RubyMethod {
	public String_delete_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_delete extends RubyMethod {
	public String_delete(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_tr_s extends RubyMethod {
	public String_tr_s(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

/// Upcases the contents of str, returning nil if no changes were made
class String_upcase_danger extends RubyMethod {
	public String_upcase_danger(int argc) {
		super(argc);
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

class String_crypt extends RubyMethod {
	public String_crypt(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_casecmp extends RubyMethod {
	public String_casecmp(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_match extends RubyMethod {
	public String_match(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

///Modifies str by converting the first character to uppercase and the remainder to lowercase. Returns nil if no changes are made.
class String_capitalize_danger extends RubyMethod {
	public String_capitalize_danger(int argc) {
		super(argc);
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

class String_each_byte extends RubyMethod {
	public String_each_byte(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_tr_s_danger extends RubyMethod {
	public String_tr_s_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_operator_star extends RubyMethod {
	public String_operator_star(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_strip extends RubyMethod {
	public String_strip(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_upcase extends RubyMethod {
	public String_upcase(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		return ObjectFactory.createString(value.toString().toUpperCase());
	}
}

class String_downcase extends RubyMethod {
	public String_downcase(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		return ObjectFactory.createString(value.toString().toLowerCase());
	}
}

class String_rindex extends RubyMethod {
	public String_rindex(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_center extends RubyMethod {
	public String_center(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_operator_plus extends RubyMethod {
	public String_operator_plus(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_sum extends RubyMethod {
	public String_sum(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_count extends RubyMethod {
	public String_count(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_rstrip_danger extends RubyMethod {
	public String_rstrip_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_operator_compare extends RubyMethod {
	public String_operator_compare(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_empty_question extends RubyMethod {
	public String_empty_question(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_length extends RubyMethod {
	public String_length(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_chomp extends RubyMethod {
	public String_chomp(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_size extends RubyMethod {
	public String_size(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_gsub extends RubyMethod {
	public String_gsub(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_chomp_danger extends RubyMethod {
	public String_chomp_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_each_line extends RubyMethod {
	public String_each_line(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_squeeze_danger extends RubyMethod {
	public String_squeeze_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_rstrip extends RubyMethod {
	public String_rstrip(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_chop extends RubyMethod {
	public String_chop(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}


class String_chop_danger extends RubyMethod {
	public String_chop_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_ljust extends RubyMethod {
	public String_ljust(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_slice_danger extends RubyMethod {
	public String_slice_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_lstrip_danger extends RubyMethod {
	public String_lstrip_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_strip_danger extends RubyMethod {
	public String_strip_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_dump extends RubyMethod {
	public String_dump(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

/// Downcases the contents of str, returning nil if no changes were made. 
class String_downcase_danger extends RubyMethod {
	public String_downcase_danger(int argc) {
		super(argc);
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

class String_eql_question extends RubyMethod {
	public String_eql_question(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_rjust extends RubyMethod {
	public String_rjust(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_inspect extends RubyMethod {
	public String_inspect(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_swapcase_danger extends RubyMethod {
	public String_swapcase_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_operator_left_shift extends RubyMethod {
	public String_operator_left_shift(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_succ_danger extends RubyMethod {
	public String_succ_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_replace extends RubyMethod {
	public String_replace(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_operator_match extends RubyMethod {
	public String_operator_match(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_each extends RubyMethod {
	public String_each(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_next extends RubyMethod {
	public String_next(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_to_sym extends RubyMethod {
	public String_to_sym(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_scan extends RubyMethod {
	public String_scan(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_gsub_danger extends RubyMethod {
	public String_gsub_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_lstrip extends RubyMethod {
	public String_lstrip(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_next_danger extends RubyMethod {
	public String_next_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_index extends RubyMethod {
	public String_index(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_hex extends RubyMethod {
	public String_hex(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_insert extends RubyMethod {
	public String_insert(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_sub extends RubyMethod {
	public String_sub(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_split extends RubyMethod {
	public String_split(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_hash extends RubyMethod {
	public String_hash(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_swapcase extends RubyMethod {
	public String_swapcase(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_intern extends RubyMethod {
	public String_intern(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_tr_danger extends RubyMethod {
	public String_tr_danger(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_tr extends RubyMethod {
	public String_tr(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_concat extends RubyMethod {
	public String_concat(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_reverse extends RubyMethod {
	public String_reverse(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}

class String_squeeze extends RubyMethod {
	public String_squeeze(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		throw new RubyException("not implemented!");
	}
}


class String_to_s extends RubyMethod {
	public String_to_s(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		return receiver;
	}
}

class String_to_f extends RubyMethod {
	public String_to_f(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		return ObjectFactory.createFloat(Float.valueOf(value.toString()));
	}
}

class String_to_i extends RubyMethod {
	public String_to_i(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		StringValue value = (StringValue)receiver.getValue();
		return ObjectFactory.createFixnum(Integer.valueOf(value.toString()));
	}
}

class String_initialize extends RubyMethod {
	public String_initialize(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		if (args.get(0) != null) {
			receiver.setValue(args.get(0).getValue());
		}

		return receiver;
	}
}

class String_initialize_copy extends RubyMethod {
	public String_initialize_copy(int argc) {
		super(argc);
	}

	protected RubyValue run(RubyValue receiver, ArrayValue args, RubyBlock block) throws RubyException {
		receiver.setValue(args.get(0).getValue());
		return receiver;
	}
}

public class StringClassBuilder {
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("String", RubyRuntime.ObjectClass);
		c.defineMethod("%", new String_operator_mod(1));
		c.defineMethod("to_s", new String_to_s(0));
		c.defineMethod("[]", new String_operator_array_access(-1));
		c.defineMethod("sub!", new String_sub_danger(-1));
		c.defineMethod("slice", new String_slice(-1));
		c.defineMethod("reverse!", new String_reverse_danger(0));
		c.defineMethod("include?", new String_include_question(1));
		c.defineMethod("succ", new String_succ(0));
		c.defineMethod("upto", new String_upto(1));
		c.defineMethod("oct", new String_oct(0));
		c.defineMethod("[]=", new String_operator_array_assign(-1));
		c.defineMethod("capitalize", new String_capitalize(0));
		c.defineMethod("==", new String_operator_equal(1));
		c.defineMethod("delete!", new String_delete_danger(-1));
		c.defineMethod("delete", new String_delete(-1));
		c.defineMethod("tr_s", new String_tr_s(2));
		c.defineMethod("upcase!", new String_upcase_danger(0));
		c.defineMethod("crypt", new String_crypt(1));
		c.defineMethod("casecmp", new String_casecmp(1));
		c.defineMethod("match", new String_match(1));
		c.defineMethod("capitalize!", new String_capitalize_danger(0));
		c.defineMethod("each_byte", new String_each_byte(0));
		c.defineMethod("tr_s!", new String_tr_s_danger(2));
		c.defineMethod("*", new String_operator_star(1));
		c.defineMethod("strip", new String_strip(0));
		c.defineMethod("upcase", new String_upcase(0));
		c.defineMethod("downcase", new String_downcase(0));
		c.defineMethod("rindex", new String_rindex(-1));
		c.defineMethod("center", new String_center(-1));
		c.defineMethod("to_f", new String_to_f(0));
		c.defineMethod("+", new String_operator_plus(1));
		c.defineMethod("sum", new String_sum(-1));
		c.defineMethod("count", new String_count(-1));
		c.defineMethod("rstrip!", new String_rstrip_danger(0));
		c.defineMethod("<=>", new String_operator_compare(1));
		c.defineMethod("empty?", new String_empty_question(0));
		c.defineMethod("length", new String_length(0));
		c.defineMethod("chomp", new String_chomp(-1));
		c.defineMethod("size", new String_size(0));
		c.defineMethod("gsub", new String_gsub(-1));
		c.defineMethod("chomp!", new String_chomp_danger(-1));
		c.defineMethod("each_line", new String_each_line(-1));
		c.defineMethod("squeeze!", new String_squeeze_danger(-1));
		c.defineMethod("rstrip", new String_rstrip(0));
		c.defineMethod("chop", new String_chop(0));
		c.defineMethod("to_i", new String_to_i(-1));
		c.defineMethod("chop!", new String_chop_danger(0));
		c.defineMethod("ljust", new String_ljust(-1));
		c.defineMethod("slice!", new String_slice_danger(-1));
		c.defineMethod("lstrip!", new String_lstrip_danger(0));
		c.defineMethod("strip!", new String_strip_danger(0));
		c.defineMethod("dump", new String_dump(0));
		c.defineMethod("downcase!", new String_downcase_danger(0));
		c.defineMethod("eql?", new String_eql_question(1));
		c.defineMethod("rjust", new String_rjust(-1));
		c.defineMethod("inspect", new String_inspect(0));
		c.defineMethod("initialize_copy", new String_initialize_copy(1));
		c.defineMethod("to_str", new String_to_s(0));
		c.defineMethod("swapcase!", new String_swapcase_danger(0));
		c.defineMethod("<<", new String_operator_left_shift(1));
		c.defineMethod("succ!", new String_succ_danger(0));
		c.defineMethod("replace", new String_replace(1));
		c.defineMethod("=~", new String_operator_match(1));
		c.defineMethod("each", new String_each(-1));
		c.defineMethod("next", new String_next(0));
		c.defineMethod("to_sym", new String_to_sym(0));
		c.defineMethod("scan", new String_scan(1));
		c.defineMethod("gsub!", new String_gsub_danger(-1));
		c.defineMethod("lstrip", new String_lstrip(0));
		c.defineMethod("next!", new String_next_danger(0));
		c.defineMethod("index", new String_index(-1));
		c.defineMethod("hex", new String_hex(0));
		c.defineMethod("insert", new String_insert(2));
		c.defineMethod("sub", new String_sub(-1));
		c.defineMethod("split", new String_split(-1));
		c.defineMethod("hash", new String_hash(0));
		c.defineMethod("swapcase", new String_swapcase(0));
		c.defineMethod("intern", new String_intern(0));
		c.defineMethod("tr!", new String_tr_danger(2));
		c.defineMethod("tr", new String_tr(2));
		c.defineMethod("concat", new String_concat(1));
		c.defineMethod("reverse", new String_reverse(0));
		c.defineMethod("squeeze", new String_squeeze(-1));
		c.defineMethod("initialize", new String_initialize(-1));
		return c;
	}
}


