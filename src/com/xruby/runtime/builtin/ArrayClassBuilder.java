/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng, Jie Li, Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Array_length extends RubyMethod {
	public Array_length() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray value = (RubyArray)receiver;
		return ObjectFactory.createFixnum(value.size());
	}
}

class Array_to_s extends RubyMethod {
	public Array_to_s() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray value = (RubyArray)receiver;
		return value.to_s();
	}
}

class Array_array_access extends RubyMethod {
	public Array_array_access() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray value = (RubyArray)receiver;
		
		if (1 == args.size()) {
			Object argValue = args.get(0);
			if (argValue instanceof RubyFixnum) {
				RubyFixnum index = (RubyFixnum)argValue;
				return value.get(index.intValue());
			} else if (args.get(0) instanceof RubyRange) {
				int begin = ((RubyFixnum)((RubyRange)args.get(0)).getLeft()).intValue();
				int end = ((RubyFixnum)((RubyRange)args.get(0)).getRight()).intValue();
				if (!((RubyRange)args.get(0)).isExcludeEnd()) {
					++end;
				}
				RubyArray resultValue = value.subarray(begin, end - begin);
				return (null == resultValue ? ObjectFactory.nilValue : resultValue);
			}
		} else if (2 == args.size()) {
			Object arg0Value = args.get(0);
			Object arg1Value = args.get(1);
			if (arg0Value instanceof RubyFixnum && arg1Value instanceof RubyFixnum) {
				int begin = ((RubyFixnum)arg0Value).intValue();
				int length = ((RubyFixnum)arg1Value).intValue();
				RubyArray resultValue = value.subarray(begin, length);
				return (null == resultValue ? ObjectFactory.nilValue : resultValue);
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

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		//TODO index can be range, -1 etc
		RubyArray value = (RubyArray)receiver;
		RubyFixnum index = (RubyFixnum)args.get(0);
		if (2 == args.size()) {
			return value.set(index.intValue(), args.get(1));
		} else if (3 == args.size()) {
			RubyFixnum length = (RubyFixnum)args.get(1);
			return value.replace(index.intValue(), length.intValue(), args.get(2));
		}

		//TODO
		throw new RubyException("not implemented");
	}
}

class Array_equal extends RubyMethod {
	public Array_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		Object right = args.get(0);
		if (!(right instanceof RubyArray)) {
			return ObjectFactory.falseValue;
		}
		return left.equals((RubyArray)right) ? ObjectFactory.trueValue : ObjectFactory.falseValue;
	}
}

class Array_compare extends RubyMethod {
	public Array_compare() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		Object right = args.get(0);
		if (!(right instanceof RubyArray)) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "Can't convert " + args.get(0).getRubyClass().getName() + " into Array");
		}
		return left.compare((RubyArray)right);
	}
}

class Array_concat extends RubyMethod {
	public Array_concat() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		left.concat(args.get(0));
		return receiver;
	}
}

class Array_plus extends RubyMethod {
	public Array_plus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		RubyArray right = (RubyArray)args.get(0);
		return left.plus(right);
	}
}

class Array_minus extends RubyMethod {
	public Array_minus() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		RubyArray right = (RubyArray)args.get(0);
		return left.minus(right);
	}
}

class Array_times extends RubyMethod {
	public Array_times() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		if (args.get(0) instanceof RubyFixnum) { 
			RubyFixnum times = (RubyFixnum)args.get(0);
			return array.times(times.intValue());
		} else if (args.get(0) instanceof RubyString) {
			return RubyAPI.callMethod(receiver, args, block, "join");
		}

		throw new RubyException(RubyRuntime.TypeErrorClass, "no implicit conversion from " + args.get(0) + " to integer");
	}
}

class Array_operator_and extends RubyMethod {
	public Array_operator_and() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.and((RubyArray)args.get(0));
	}
}

class Array_operator_or extends RubyMethod {
	public Array_operator_or() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.or((RubyArray)args.get(0));
	}
}

class Array_push extends RubyMethod {
	public Array_push() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		RubyValue obj = args.get(0);
		return array.add(obj);
	}
}

class Array_insert extends RubyMethod {
	public Array_insert() {
		super(2);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		RubyFixnum index = (RubyFixnum)args.get(0);
		RubyValue value = args.get(1);
		return array.insert(index.intValue(), value);
	}
}

class Array_pop extends RubyMethod {
	public Array_pop() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {		
		RubyArray array = (RubyArray)receiver;		
		return array.remove(array.size() - 1);		
	}
}

class Array_delete_at extends RubyMethod {
	public Array_delete_at() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		RubyFixnum pos = (RubyFixnum)args.get(0);
		return array.remove(pos.intValue());		
	}
}

class Array_include extends RubyMethod {
	public Array_include() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		if (array.include(args.get(0))) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Array_each extends RubyMethod {
	public Array_each() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		array.rb_iterate(receiver, block);
        
        return receiver;
	}
}

class Array_unshift extends RubyMethod {
	public Array_unshift() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.unshift(args);
	}
}

class Array_new extends RubyMethod {
	public Array_new() {
		super(-1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        return new RubyArray();
	}
}

class Array_shift extends RubyMethod {
	public Array_shift() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.remove(0);
	}
}

class Array_sort_dangers extends RubyMethod {
	public Array_sort_dangers() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		if (null == block) {
			array.sort();
		} else {
			array.sort(block);
		}
		return array;
	}
}

class Array_sort extends RubyMethod {
	public Array_sort() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = ((RubyArray)receiver).copy();
		if (null == block) {
			array.sort();
		} else {
			array.sort(block);
		}
		return array;
	}
}

class Array_hash extends RubyMethod {
	public Array_hash() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return ObjectFactory.createFixnum(array.hash());
	}
}

class Array_compact_danger extends RubyMethod {
	public Array_compact_danger() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.compact() ? array : ObjectFactory.nilValue;
	}
}

class Array_compact extends RubyMethod {
	public Array_compact() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = ((RubyArray)receiver).copy();
		return array.compact() ? array : ObjectFactory.nilValue;
	}
}

class Array_uniq_danger extends RubyMethod {
	public Array_uniq_danger() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.uniq() ? array : ObjectFactory.nilValue;
	}
}

class Array_uniq extends RubyMethod {
	public Array_uniq() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = ((RubyArray)receiver).copy();
		return array.uniq() ? array : ObjectFactory.nilValue;
	}
}

class Array_reverse_danger extends RubyMethod {
	public Array_reverse_danger() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		array.reverse();
		return array;
	}
}

class Array_reverse extends RubyMethod {
	public Array_reverse() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = ((RubyArray)receiver).copy();
		array.reverse();
		return array;
	}
}

class Array_pack extends RubyMethod {
	
	public Array_pack() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		String format = ((RubyString)args.get(0)).toString();
		return ObjectFactory.createString(ArrayPacker.pack(array, format));	
	}
}

public class ArrayClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.ArrayClass;
		c.defineMethod("length", new Array_length());
		c.defineMethod("to_s", new Array_to_s());
		c.defineMethod("[]", new Array_array_access());
		c.defineMethod("[]=", new Array_array_set());
		c.defineMethod("==", new Array_equal());
		c.defineMethod("<=>", new Array_compare());
		c.defineMethod("concat", new Array_concat());
		c.defineMethod("+", new Array_plus());
		c.defineMethod("-", new Array_minus());
		c.defineMethod("*", new Array_times());
		c.defineMethod("&", new Array_operator_and());
		c.defineMethod("|", new Array_operator_or());
		c.defineMethod("push", new Array_push());
		c.defineMethod("insert", new Array_insert());
		c.defineMethod("pop", new Array_pop());
		c.defineMethod("delete_at", new Array_delete_at());
		c.defineMethod("include?", new Array_include());
		c.defineMethod("unshift", new Array_unshift());
		c.defineMethod("each", new Array_each());
		c.defineMethod("pack", new Array_pack());
		c.defineMethod("shift", new Array_shift());
		c.defineMethod("sort!", new Array_sort_dangers());
		c.defineMethod("sort", new Array_sort());
		c.defineMethod("hash", new Array_hash());
		c.defineMethod("compact!", new Array_compact_danger());
		c.defineMethod("compact", new Array_compact());
		c.defineMethod("uniq!", new Array_uniq_danger());
		c.defineMethod("uniq", new Array_uniq());
		c.defineMethod("reverse!", new Array_reverse_danger());
		c.defineMethod("reverse", new Array_reverse());
		c.defineAllocMethod(new Array_new());

		c.includeModule(RubyRuntime.EnumerableModule);
	}
}

