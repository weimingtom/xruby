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

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
		RubyString new_value = ObjectFactory.createString(value.toString());
		new_value.capitalize();
		return new_value;
	}
}

class String_operator_equal extends RubyMethod {
	public String_operator_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (!(args.get(0) instanceof RubyString)) {
			return ObjectFactory.falseValue;
		}

		RubyString a = (RubyString)receiver;
		RubyString b = (RubyString)args.get(0);
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

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
		String new_value = value.toString().toUpperCase();
		if (new_value.equals(value.toString())) {
			//no changes
			return ObjectFactory.nilValue;
		} else {
			return value.setString(new_value);
		}
	}
}

///Modifies str by converting the first character to uppercase and the remainder to lowercase. Returns nil if no changes are made.
class String_capitalize_danger extends RubyMethod {
	public String_capitalize_danger() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
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

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
		return ObjectFactory.createString(value.toString().toUpperCase());
	}
}

class String_downcase extends RubyMethod {
	public String_downcase() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
		return ObjectFactory.createString(value.toString().toLowerCase());
	}
}

/// Downcases the contents of str, returning nil if no changes were made. 
class String_downcase_danger extends RubyMethod {
	public String_downcase_danger() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
		String new_value = value.toString().toLowerCase();
		if (new_value.equals(value.toString())) {
			return ObjectFactory.nilValue;
		} else {
			return value.setString(new_value);
		}
	}
}

class String_to_f extends RubyMethod {
	public String_to_f() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
		return ObjectFactory.createFloat(Double.valueOf(value.toString()));
	}
}

class String_to_i extends RubyMethod {
	public String_to_i() {
		super(1, false, 1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
		if (args == null || args.size() == 0){
			return ObjectFactory.createFixnum(Integer.valueOf(value.toString()));
		}else{
			int radix = ((RubyFixnum)args.get(0)).intValue();
			if (radix >= 2 && radix <= 36){
				return ObjectFactory.createFixnum(Integer.valueOf(value.toString(), radix));
			}
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "illegal radix " + radix);
		}
	}
}

class String_to_s extends RubyMethod {
	public String_to_s() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
		return ObjectFactory.createString(value.toString());
	}
}

class String_length extends RubyMethod {
	public String_length() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString value = (RubyString)receiver;
		return ObjectFactory.createFixnum(value.length());
	}
}

class String_initialize extends RubyMethod {
	public String_initialize() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (args != null) {
			String new_value = RubyTypesUtil.convertToString(args.get(0)).toString();
			((RubyString)receiver).setString(new_value);
		}
		
		return receiver;
	}
}

class String_new extends RubyMethod {
	public String_new() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return ObjectFactory.createString();
	}
}

class String_plus extends RubyMethod {
	public String_plus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString v1 = (RubyString)receiver;
		RubyString v2 = (RubyString)args.get(0);
		return ObjectFactory.createString(v1.toString() + v2.toString());
	}
}

class String_gsub extends RubyMethod {
	public String_gsub() {
		super(-1);
	}

	protected void checkParameters(RubyArray args) {
		if (args.size() < 2) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong number of arguments (" + args.size() + " for 2)");
		}
		
		if (!(args.get(0) instanceof RubyRegexp)) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "wrong argument type " + args.get(0).getRubyClass().getName() + " (expected Regexp)");
		}
		
		if (!(args.get(1) instanceof RubyString)) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "can't convert " + args.get(1).getRubyClass().getName() + " into String");
		}
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		checkParameters(args);
		
		RubyString g = (RubyString)receiver;
		RubyRegexp r = (RubyRegexp)args.get(0);
		RubyString s = (RubyString)args.get(1);

		return ObjectFactory.createString(r.gsub(g, s));
	}
}

class String_gsub_danger extends String_gsub {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		checkParameters(args);

		RubyString g = (RubyString)receiver;
		RubyRegexp r = (RubyRegexp)args.get(0);
		RubyString s = (RubyString)args.get(1);

		String result = r.gsub(g, s);
		if (g.toString().equals(result)) {
			return ObjectFactory.nilValue;
		} else {
			return ObjectFactory.createString(result);
		}
	}
}

class String_split extends RubyMethod {
	public String_split() {
		super(2, false, 1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyString g = (RubyString)receiver;
		RubyRegexp r = (RubyRegexp)args.get(0);
		String[] splitResult;
		
		if (args.size() == 1){
			splitResult = r.getPattern().split(g.toString());
		}else{
			RubyFixnum i = (RubyFixnum)args.get(1);
			splitResult = r.getPattern().split(g.toString(), i.intValue());
		}
		
		RubyArray a = new RubyArray(splitResult.length);
		for(String str : splitResult){
			a.add(ObjectFactory.createString(str));
		}
		return a;
	}
}

class String_operator_compare extends RubyMethod {
	public String_operator_compare() {
		super(1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (!(args.get(0) instanceof RubyString)){
			return ObjectFactory.nilValue;
		}
		
		RubyString value1 = (RubyString)receiver;
		RubyString value2 = (RubyString)args.get(0);
		int compare = value1.toString().compareTo(value2.toString());
		if (compare > 0){
			compare = 1;
		}else if(compare < 0){
			compare = -1;
		}
		return ObjectFactory.createFixnum(compare);
	}
}

class String_operator_match extends RubyMethod {
	public String_operator_match() {
		super(1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (args.get(0) instanceof RubyRegexp) {
			RubyRegexp reg = (RubyRegexp)args.get(0);
			int p = reg.matchPosition(((RubyString)receiver).toString()); 
			if (p >= 0) {
				return ObjectFactory.createFixnum(p);
			} else {
				return ObjectFactory.nilValue;
			}
		} else {
			return RubyAPI.callPublicMethod(args.get(0), receiver, "=~");
		}
	}
}

public class StringClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.StringClass;
		c.defineMethod("capitalize", new String_capitalize());
		c.defineMethod("==", new String_operator_equal());
		c.defineMethod("upcase!", new String_upcase_danger());
		c.defineMethod("capitalize!", new String_capitalize_danger());
		c.defineMethod("upcase", new String_upcase());
		c.defineMethod("downcase", new String_downcase());
		c.defineMethod("to_f", new String_to_f());
		c.defineMethod("to_i", new String_to_i());
		c.defineMethod("to_s", new String_to_s());
		c.defineMethod("length", new String_length());
		c.defineMethod("downcase!", new String_downcase_danger());
		c.defineMethod("initialize_copy", new String_initialize());
		c.defineMethod("initialize", new String_initialize());
		c.defineMethod("+", new String_plus());
		c.defineMethod("gsub", new String_gsub());
		c.defineMethod("gsub!", new String_gsub_danger());
		c.defineMethod("split", new String_split());
		c.defineMethod("<=>", new String_operator_compare());
		c.defineMethod("=~", new String_operator_match());
		c.defineAllocMethod(new String_new());
	}
}


