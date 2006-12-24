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
				RubyFixnum end = (RubyFixnum)((RubyRange)args.get(0)).getRight();
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
		array.add(obj);
		return array;
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
					if (items-- > 0)
						from = array.get(idx ++);
					else
						throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
					
					byte c = RubyTypesUtil.convertToJavaByte(from);
					
					result.append((char)c);
				}
				break;
				
			case 's':
			case 'S':
				while (len-- > 0){
					
					
					if (items-- > 0)
						from = array.get(idx ++);
					else
						throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
					
					short s = RubyTypesUtil.convertToJavaShort(from);

					result.append((char)(s & 0xff));
					result.append((char)(s >> 8));
				}
				break;
				
			case 'i':
			case 'I':
			case 'l':
			case 'L':
				while (len-- > 0){
					if (items-- > 0)
						from = array.get(idx ++);
					else
						throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
					
					int i = RubyTypesUtil.convertToJavaInt(from);

					for (int j=0; j<Integer.SIZE; ++j){
						result.append((char)((i >> (j * 8) & 0xff)));
					}
				}
				break;
				
			case 'q':
			case 'Q':
				while (len-- > 0){					
					if (items-- > 0)
						from = array.get(idx ++);
					else
						throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
					
					long l = RubyTypesUtil.convertToJavaLong(from);

					for (int i=0; i<Long.SIZE; ++i){
						result.append((char)((l >> (i * 8) & 0xff)));
					}
				}
				break;
				
			case 'n': // short (network byte-order)
				break;
				
			case 'N': // int (network byte-order)
				break;
				
			case 'v': // short (VAX byte-order)
				break;
				
			case 'V': // long (VAX byte-order)
				break;
				
			case 'f':
			case 'F':
				while (len-- > 0){
					float f;
					
					if (items-- > 0)
						from = array.get(idx ++);
					else
						throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
					
					if (from instanceof RubyFixnum){
						f = (long)(((RubyFixnum)from).intValue() & 0xffffffff);
					}else if (from instanceof RubyFloat){
						f = ((long)((RubyFloat)from).doubleValue() & 0xffffffffffffffffL);
					}else if (from instanceof RubyBignum){
						f = (((RubyBignum)from).getInternal().longValue() & 0xffffffffffffffffL);
					}else{
						throw new RubyException(RubyRuntime.RuntimeErrorClass, String.format("can't convert %s into Integer", from.getRubyClass().getName()));
					}

					int bits = Float.floatToIntBits(f);
					for (int i=0; i<Integer.SIZE; ++i){
						result.append((char)((bits >> (i * 8) & 0xff)));
					}
				}
				break;
				
			case 'e': // single precision float in VAX byte-order
				break;
				
			case 'E': // double precision float in VAX byte-order
				break;
				
			case 'd':
			case 'D':
				while (len-- > 0){
					if (items-- > 0)
						from = array.get(idx ++);
					else
						throw new RubyException(RubyRuntime.RuntimeErrorClass, "too few"); // #TODO: message
					
					double d = RubyTypesUtil.convertToJavaDouble(from);

					long bits = Double.doubleToLongBits(d);
					
					for (int i=0; i<Long.SIZE; ++i){
						result.append((char)((bits >> (i * 8) & 0xff)));
					}
				}
				break;
				
			case 'g': // single precision float in network byte-order
				break;
				
			case 'G': // double precision float in network byte-order
				break;
				
			case 'x': // null byte
				while (len-- > 0){
					result.append('\0');
				}
				break;
				
			case 'X': // back up byte
				plen = result.length();
				if (plen < len){
					throw new RubyException(RubyRuntime.ArgumentErrorClass, "X outside of string");
				}
				result.delete(plen - len, plen);
				break;
				
			case '@':
				len -= result.length();
				if (len > 0){
					while (len-- > 0){
						result.append('\0');
					}
				}
				
				len = -len;
				if (len > 0){
					plen = result.length();
					if (plen < len){
						throw new RubyException(RubyRuntime.ArgumentErrorClass, "X outside of string");
					}
					result.delete(plen - len, plen);
				}
				break;
				
			case '%':
				throw new RubyException(RubyRuntime.ArgumentErrorClass, "% is not supported");

			case 'U':
				while (len-- > 0){
					char[] buf = new char[8];
					
					from = array.get(idx ++);
					int l = RubyTypesUtil.convertToJavaInt(from);
					if (l < 0){
						throw new RubyException(RubyRuntime.RangeClass, "pack(U): value out of range");
					}
					result.append(uv_to_utf8(buf));
				}
				break;
				
			case 'u': // uuencoded string
			case 'm': // base64 encoded string
				from = array.get(idx ++);
				ptr = from.toString();
				plen = ptr.length();
				
				if (len <= 2){
					len = 45;
				}else{
					len = len / 3 * 3;
				}
				
				while (plen > 0){
					int todo;
					if (plen > len){
						todo = len;
					}else{
						todo = plen;
					}
					
					result.append(encodes(ptr, todo, type));
					plen -= todo;
					ptr += todo;
				}
				break;
				
			case 'M': // quoted-printable encoded string
				{
					String str = ((RubyString)array.get(idx ++)).toString();
					if (len <= 1){
						len = 72;
					}
					
					result.append(qpencode(str, len));
				}
				break;
				
			case 'P': // pointer to packed byte string
			case 'p': // pointer to string
				throw new RubyException("Not implemented");
				
			case 'w': // BER compressed integer
				break;
				
			default:
				break;
			}
		}

		return ObjectFactory.createString(result.toString());
	}
	
	private String uv_to_utf8(char[] str){
		throw new RubyException("Not implemented");
	}
	
	private String qpencode(String str, int len){
		throw new RubyException("Not implemented");
	}
	
	private String encodes(String str, int todo, char type){
		throw new RubyException("Not implemented");
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
		c.defineAllocMethod(new Array_new());

		c.includeModule(RubyRuntime.EnumerableModule);
	}
}

