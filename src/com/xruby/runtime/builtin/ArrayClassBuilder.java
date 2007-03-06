/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng, Jie Li, Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Array_length extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray value = (RubyArray)receiver;
		return ObjectFactory.createFixnum(value.size());
	}
}

class Array_to_s extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray value = (RubyArray)receiver;
		return value.to_s();
	}
}

class Array_array_first extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray a = (RubyArray)receiver;
		if (null == args) {
			return a.get(0);
		} else {
			RubyFixnum n = (RubyFixnum)args.get(0);
			return a.subarray(0, n.intValue());
		}
	}
}

class Array_array_last extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray a = (RubyArray)receiver;
		if (null == args) {
			return a.get(-1);
		} else {
			RubyFixnum n = (RubyFixnum)args.get(0);
			return a.subarray(a.size() - n.intValue(), n.intValue());
		}
	}
}

class Array_array_access extends RubyVarArgMethod {
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

class Array_array_at extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray value = (RubyArray)receiver;
		RubyFixnum index = (RubyFixnum)arg;
		return value.get(index.intValue());
	}
}

class Array_array_set extends RubyVarArgMethod {
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

class Array_equal extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		Object right = arg;
		if (!(right instanceof RubyArray)) {
			return ObjectFactory.falseValue;
		}
		return left.equals((RubyArray)right) ? ObjectFactory.trueValue : ObjectFactory.falseValue;
	}
}

class Array_compare extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		Object right = arg;
		if (!(right instanceof RubyArray)) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "Can't convert " + arg.getRubyClass().getName() + " into Array");
		}
		return left.compare((RubyArray)right);
	}
}

class Array_concat extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		left.concat(arg);
		return receiver;
	}
}

class Array_left_shift_operator extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		left.add(arg);
		return receiver;
	}
}

class Array_plus extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		RubyArray right = (RubyArray)arg;
		return left.plus(right);
	}
}

class Array_minus extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		RubyArray right = (RubyArray)arg;
		return left.minus(right);
	}
}

class Array_times extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		if (arg instanceof RubyFixnum) { 
			RubyFixnum times = (RubyFixnum)arg;
			return array.times(times.intValue());
		} else if (arg instanceof RubyString) {
			return RubyAPI.callOneArgMethod(receiver, arg, block, "join");
		}

		throw new RubyException(RubyRuntime.TypeErrorClass, "no implicit conversion from " + arg + " to integer");
	}
}

class Array_operator_and extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.and((RubyArray)arg);
	}
}

class Array_operator_or extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.or((RubyArray)arg);
	}
}

class Array_push extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		if (null != args) {
			for (RubyValue v : args) {
				array.add(v);
			}
		}
		return array;
	}
}

class Array_insert extends RubyTwoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg1, RubyValue arg2, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		RubyFixnum index = (RubyFixnum)arg1;
		return array.insert(index.intValue(), arg2);
	}
}

class Array_pop extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {		
		RubyArray array = (RubyArray)receiver;		
		return array.remove(array.size() - 1);		
	}
}

//TODO array.delete(obj) { block }
class Array_delete_at extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		RubyFixnum pos = (RubyFixnum)arg;
		return array.remove(pos.intValue());		
	}
}

class Array_delete extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.delete(arg);
	}
}

class Array_include extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		if (array.include(arg)) {
			return ObjectFactory.trueValue;
		} else {
			return ObjectFactory.falseValue;
		}
	}
}

class Array_each extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		array.rb_iterate(receiver, block);
        
        return receiver;
	}
}

class Array_unshift extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.unshift(args);
	}
}

class Array_new extends RubyVarArgMethod {
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		if (null == args) {
			return new RubyArray();
		}

		RubyFixnum size = (RubyFixnum)args.get(0);
		RubyValue default_value = args.get(1);
		return new RubyArray(size.intValue(), default_value);
	}
}

class Array_shift extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.remove(0);
	}
}

class Array_sort_dangers extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		if (null == block) {
			array.sort();
		} else {
			array.sort(block);
		}
		return array;
	}
}

class Array_sort extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = ((RubyArray)receiver).copy();
		if (null == block) {
			array.sort();
		} else {
			array.sort(block);
		}
		return array;
	}
}

class Array_hash extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return ObjectFactory.createFixnum(array.hash());
	}
}

class Array_compact_danger extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.compact() ? array : ObjectFactory.nilValue;
	}
}

class Array_compact extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = ((RubyArray)receiver).copy();
		return array.compact() ? array : ObjectFactory.nilValue;
	}
}

class Array_uniq_danger extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		return array.uniq() ? array : ObjectFactory.nilValue;
	}
}

class Array_uniq extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = ((RubyArray)receiver).copy();
		return array.uniq() ? array : ObjectFactory.nilValue;
	}
}

class Array_reverse_danger extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		array.reverse();
		return array;
	}
}

class Array_reverse extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyArray array = ((RubyArray)receiver).copy();
		array.reverse();
		return array;
	}
}

class Array_pack extends RubyOneArgMethod {
	protected RubyValue run(RubyValue receiver, RubyValue arg, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		String format = ((RubyString)arg).toString();
		return ObjectFactory.createString(ArrayPacker.pack(array, format));	
	}
}

public class ArrayClassBuilder {	
	public static void initialize() {
		RubyClass c = RubyRuntime.ArrayClass;
		c.getSingletonClass().defineMethod("new", new Array_new());
		c.defineMethod("length", new Array_length());
		c.defineMethod("to_s", new Array_to_s());
		c.defineMethod("[]", new Array_array_access());
		c.defineMethod("first", new Array_array_first());
		c.defineMethod("last", new Array_array_last());
		c.defineMethod("at", new Array_array_at());
		c.defineMethod("[]=", new Array_array_set());
		c.defineMethod("==", new Array_equal());
		c.defineMethod("<=>", new Array_compare());
		c.defineMethod("<<", new Array_left_shift_operator());
		c.defineMethod("concat", new Array_concat());
		c.defineMethod("+", new Array_plus());
		c.defineMethod("-", new Array_minus());
		c.defineMethod("*", new Array_times());
		c.defineMethod("&", new Array_operator_and());
		c.defineMethod("|", new Array_operator_or());
		c.defineMethod("push", new Array_push());
		c.defineMethod("insert", new Array_insert());
		c.defineMethod("pop", new Array_pop());
		c.defineMethod("delete", new Array_delete());
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

		c.includeModule(RubyRuntime.EnumerableModule);
	}
}

