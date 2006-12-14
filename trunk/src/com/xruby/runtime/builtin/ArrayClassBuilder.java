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
				RubyFixnum begin = (RubyFixnum)((RubyRange)args.get(0)).getLeft();
				RubyFixnum end = (RubyFixnum)((RubyRange)args.get(0)).getLeft();
				return value.subarray(begin.intValue(), end.intValue());
			}
		} else if (2 == args.size()) {
			Object arg0Value = args.get(0);
			Object arg1Value = args.get(1);
			if (arg0Value instanceof RubyFixnum && arg1Value instanceof RubyFixnum) {
				int begin = ((RubyFixnum)arg0Value).intValue();
				int length = ((RubyFixnum)arg1Value).intValue();
				RubyArray resultValue = value.subarray(begin, length);
				if (resultValue == null) {
					return ObjectFactory.nilValue;
				}
				
				return resultValue;
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
		return value.set(index.intValue(), args.get(1));
	}
}

class Array_array_equal extends RubyMethod {
	public Array_array_equal() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray left = (RubyArray)receiver;
		Object right = args.get(0);
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

class Array_times extends RubyMethod {
	public Array_times() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		RubyFixnum times = (RubyFixnum)args.get(0);
		return array.times(times.intValue());
	}
}

class Array_push extends RubyMethod {
	public Array_push() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		RubyValue obj = args.get(0);
		array.add(obj);
		return receiver;
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

class Array_pack extends RubyMethod {
	private final boolean NATINT_PACK = true;
	
	public Array_pack() {
		super(1);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		RubyArray array = (RubyArray)receiver;
		String format = ((RubyString)args.get(0)).toString();
		
		int natint = 0;
		int len = 0;
		int items = array.size();
		int idx = 0;
		int plen;
		String ptr;
		RubyValue from;
		
		StringBuilder result = new StringBuilder();
		
		int pos = 0;
		while (pos < format.length()){
			char type = format.charAt(pos ++);
			if (NATINT_PACK) natint = 0;
			
			if (type == ' ') continue;
			
			if (format.indexOf(pos) == '#') {
				while (pos < format.length() && format.charAt(pos) != '\n'){
					pos ++;
				}
				continue;
			}
			
			char t;
			if (pos >= format.length())
				t = 0;
			else
				t = format.charAt(pos);
			
			if (t == '_' || t == '!'){
				final String natstr = "sSiIlL";
				if (natstr.indexOf(t) >= 0){
					if (NATINT_PACK) natint = 1;
					pos ++;
				}else{
					throw new RubyException(RubyRuntime.ArgumentErrorClass, String.format("'%c' allowed only after types %s", type, natstr));
				}
			}
			
			if (pos >= format.length())
				t = 0;
			else
				t = format.charAt(pos);
			
			if (format.indexOf(pos) == '*') {
				len = "@Xxu".indexOf(t) >= 0 ? 0 : items;
				pos ++;
			}else if(Character.isDigit(t)){
				int end = pos;
				while (end < format.length() - 1 && Character.isDigit(format.indexOf(end + 1))){
					end ++;
				}
				len = Integer.parseInt(format.substring(pos, end + 1), 10);
			}else{
				len = 1;
			}
			
			switch (type){
			case 'A': case 'a': case 'Z':
			case 'B': case 'b':
			case 'H': case 'h':
				if (items-- > 0)
					from = array.get(idx ++);
				else
					throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
				
				if (from == ObjectFactory.nilValue){
					ptr = "";
					plen = 0;
				}else{
					ptr = ((RubyString)from).toString();
					plen = ptr.length();
					result.append(ptr);
				}
				
				if (format.charAt(pos - 1) == '*'){
					len = plen;
				}
				
				switch (type){
				case 'a':
				case 'A':
				case 'Z':
					{
						if (plen >= len){
							result.append(ptr.substring(0, len));
							if (format.charAt(pos - 1) == '*' && type == 'Z')
								result.append('\0');
						}else{
							result.append(ptr.substring(0, plen));
							len -= plen;
							while (len -- > 0){
								result.append(' ');
							}
						}
					}
					break;
				
				case 'b':
					{
						int byte_ = 0;
						int i, j = 0;
						
						if (len > plen){
							j = (len - plen + 1) / 2;
							len = plen;
						}
						
						int pos1 = 0;
						for (i=0; i++ < len; pos1 ++){
							if ((ptr.charAt(pos1) & 1) != 0){
								byte_ |= 128;
							}
							
							if ((i & 7) != 0){
								byte_ >>= 1;
							}else{
								char c = (char)(byte_ & 0xff);
								result.append(c);
								byte_ = 0;
							}
							
							if ((len & 7) != 0){
								char c;
								byte_ >>= 7 - (len & 7);
								c = (char)(byte_ & 0xff);
								result.append(c);
							}
							len = j;
							while (len-- > 0){
								result.append('\0');
							}
						}
					}
					break;
					
				case 'B':
					{
						int byte_ = 0;
						int i, j = 0;
						
						if (len > plen){
							j = (len - plen + 1) / 2;
							len = plen;
						}
						
						int pos1 = 0;
						for (i=0; i++ < len; pos1 ++){
							byte_ |= (ptr.charAt(pos1) & 1);
							if ((i & 7) != 0)
								byte_ <<= 1;
							else{
								char c = (char)(byte_ & 0xff);
								result.append(c);
								byte_ = 0;
							}
						}
						
						if ((len & 7) != 0){
							char c;
							byte_ <<= 7 - (len & 7);
							c = (char)(byte_ & 0xff);
							result.append(c);
						}
						
						len = j;
						while (len-- > 0){
							result.append('\0');
						}
					}
					break;
					
				case 'h':
					{
						int byte_ = 0;
						int i, j = 0;
						if (len > plen){
							j = (len - plen + 1) / 2;
							len = plen;
						}
						
						int pos1 = 0;
						for (i=0; i++ < len; pos1 ++){
							if (Character.isLetter(ptr.charAt(pos1))){
								byte_ |= (((ptr.charAt(pos1) & 15) + 9) & 15) << 4;
							}else{
								byte_ |= (ptr.charAt(pos1) & 15) << 4;
							}
							
							if ((i & 1) != 0){
								byte_ >>= 4;
							}else{
								char c = (char)(byte_ & 0xff);
								result.append(c);
								byte_ = 0;
							}
						}
						
						if ((len & 1) != 0){
							char c = (char)(byte_ & 0xff);
							result.append(c);
						}
						
						len = j;
						while (len-- > 0){
							result.append('\0');
						}
					}
					break;
					
				case 'H':
					{
						int byte_ = 0;
						int i, j = 0;
						
						if (len > plen){
							j = (len - plen + 1) / 2;
							len = plen;
						}
						
						int pos1 = 0;
						for (i=0; i++ < len; pos1 ++){
							if (Character.isLetter(ptr.charAt(pos1))){
								byte_ |= ((ptr.charAt(pos1) & 15) + 9) & 15;
							}else{
								byte_ |= ptr.charAt(pos1) & 15;
							}
							
							if ((i & 1) != 0){
								byte_ <<= 4;
							}else{
								char c = (char)(byte_ & 0xff);
								result.append(c);
								byte_ = 0;
							}
						}
						
						if ((len & 1) != 0){
							char c = (char)(byte_ & 0xff);
							result.append(c);
						}
						
						len = j;
						while (len-- > 0){
							result.append('\0');
						}
					}
					break;
				}
					
			case 'c':
			case 'C':
				while (len-- > 0){
					char c;
					
					if (items-- > 0)
						from = array.get(idx ++);
					else
						throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
					
					if (from instanceof RubyFixnum){
						c = (char)(((RubyFixnum)from).intValue() & 0xff);
					}else if (from instanceof RubyFloat){
						c = (char)((int)((RubyFloat)from).doubleValue() & 0xff);
					}else if (from instanceof RubyBignum){
						c = (char)(((RubyBignum)from).getInternal().intValue() & 0xff);
					}else{
						throw new RubyException(RubyRuntime.RuntimeErrorClass, String.format("can't convert %s into Integer", from.getRubyClass().getName()));
					}
					
					result.append(c);
				}
				break;
				
			case 's':
			case 'S':
				while (len-- > 0){
					short s;
					
					if (items-- > 0)
						from = array.get(idx ++);
					else
						throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
					
					if (from instanceof RubyFixnum){
						s = (short)(((RubyFixnum)from).intValue() & 0xffff);
					}else if (from instanceof RubyFloat){
						s = (short)((int)((RubyFloat)from).doubleValue() & 0xffff);
					}else if (from instanceof RubyBignum){
						s = (short)(((RubyBignum)from).getInternal().intValue() & 0xffff);
					}else{
						throw new RubyException(RubyRuntime.RuntimeErrorClass, String.format("can't convert %s into Integer", from.getRubyClass().getName()));
					}

					result.append((char)(s & 0xff));
					result.append((char)(s >> 8));
				}
				break;
				
			case 'i':
			case 'I':
			case 'l':
			case 'L':
				while (len-- > 0){
					int i;
					
					if (items-- > 0)
						from = array.get(idx ++);
					else
						throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
					
					if (from instanceof RubyFixnum){
						i = (int)(((RubyFixnum)from).intValue() & 0xffffffff);
					}else if (from instanceof RubyFloat){
						i = (int)((int)((RubyFloat)from).doubleValue() & 0xffffffff);
					}else if (from instanceof RubyBignum){
						i = (int)(((RubyBignum)from).getInternal().intValue() & 0xffffffff);
					}else{
						throw new RubyException(RubyRuntime.RuntimeErrorClass, String.format("can't convert %s into Integer", from.getRubyClass().getName()));
					}

					result.append((char)(i & 0xff));
					result.append((char)(i >> 8));
					result.append((char)(i >> 16));
					result.append((char)(i >> 24));
				}
				break;
				
			case 'q':
			case 'Q':
				// Not implemented
				while (len-- > 0){
					
				}
				break;
				
			// ... TODO
			case 'x':
					while (len-- > 0){
						result.append('\0');
					}
				break;
			}
		}

		return ObjectFactory.createString(result.toString());
	}
}

public class ArrayClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.ArrayClass;
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
		c.defineMethod("unshift", new Array_unshift());
		c.defineMethod("each", new Array_each());
		c.defineMethod("pack", new Array_pack());
		c.defineMethod("shift", new Array_shift());
		c.defineAllocMethod(new Array_new());

		c.includeModule(RubyRuntime.EnumerableModule);
	}
}

