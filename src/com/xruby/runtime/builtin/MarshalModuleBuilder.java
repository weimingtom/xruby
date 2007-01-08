package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class MarshalDumper {
	private static void packInteger(RubyFixnum v, StringBuilder sb) {
		sb.append('i');
		packInteger(v.intValue(), sb);
	}
	
	private static void packInteger(int v, StringBuilder sb) {
		if (0 == v) {
			sb.append((char)0);
		} else {
			sb.append((char)(v + 5));
		}
	}
	
	private static void packString(RubyString v, StringBuilder sb) {
		sb.append('"');
		packInteger(v.length(), sb);
		sb.append(v);
	}
	
	private static void packArray(RubyArray v, StringBuilder sb) {
		sb.append('[');
		packInteger(v.size(), sb);
		for (RubyValue a : v) {
			packValue(a, sb);
		}
	}
	
	private static void packHash(RubyHash v, StringBuilder sb) {
		sb.append('{');
		packInteger(v.size(), sb);
		RubyArray keys = v.keys();
		for (RubyValue a : keys) {
			packValue(a, sb);
			packValue(v.get(a), sb);
		}
	}
	
	private static void packValue(RubyValue v, StringBuilder sb) {
		if (v == ObjectFactory.nilValue) {
			sb.append((char)0);
		} else if (v == ObjectFactory.trueValue) {
			sb.append('T');
		} else if (v == ObjectFactory.falseValue) {
			sb.append('F');
		} else if (v instanceof RubyString) {
			packString((RubyString)v, sb);
		} else if (v instanceof RubyFixnum) {
			packInteger((RubyFixnum)v, sb);
		} else if (v instanceof RubyArray) {
			packArray((RubyArray)v, sb);
		} else if (v instanceof RubyHash) {
			packHash((RubyHash)v, sb);
		} else {
			throw new RubyException("is not implemented");
		}
	}
	
	public static RubyString dump(RubyValue v) {
		StringBuilder sb = new StringBuilder();
		
		//version
		sb.append((char)4);
		sb.append((char)8);
		
		packValue(v, sb);
		
		return ObjectFactory.createString(sb);
	}
}

class MarshalLoader {
	private int current_index_ = 0;
	
	private int loadInteger(String v) {
		char c = v.charAt(current_index_);
		++current_index_;
		if (0 == c) {
			return c;
		} else {
			return c - 5;
		}
	}
	
	private RubyString loadString(String v) {
		int length = loadInteger(v);
		String s = v.substring(current_index_, current_index_ + length);
		current_index_ += length;
		return ObjectFactory.createString(s);
	}
	
	private RubyArray loadArray(String v) {
		int length = loadInteger(v);
		RubyArray a = new RubyArray(length);
		for (int i = 0; i < length; ++i) {
			RubyValue value = loadValue(v);
			a.add(value);
		}
		return a;
	}
	
	private RubyHash loadHash(String v) {
		int length = loadInteger(v);
		RubyHash h = ObjectFactory.createHash();
		for (int i = 0; i < length; ++i) {
			RubyValue k = loadValue(v);
			RubyValue value = loadValue(v);
			h.add(k, value);
		}
		return h;
	}
	
	private RubyValue loadValue(String v) {
		char c = v.charAt(current_index_); 
		++current_index_;
		switch (c) {
		case '\0':
			return ObjectFactory.nilValue;
		case 'T':
			return ObjectFactory.trueValue;
		case 'F':
			return ObjectFactory.falseValue;
		case 'i':
			return ObjectFactory.createFixnum(loadInteger(v));
		case '"':
			return loadString(v);
		case '[':
			return loadArray(v);
		case '{':
			return loadHash(v);
		default:
			throw new RubyException("not implemented");	
		}
	}
	
	public RubyValue load(RubyString s) {
		String v = s.toString();
		if (v.length() <= 2) {
			throw new RubyException(RubyRuntime.ArgumentErrorClass, "marshal data too short");
		} else if (v.charAt(0) != 4 && v.charAt(1) != 8) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "incompatible marshal file format (can't be read)");
		} else {
			current_index_ += 2;
			return loadValue(v);
		}
	}
}

class Marshal_dump extends RubyMethod {
	public Marshal_dump() {
		super(1);
	}
		
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		return MarshalDumper.dump(args.get(0));
	}
}

class Marshal_load extends RubyMethod {
	
	public Marshal_load() {
		super(1);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		MarshalLoader loader = new MarshalLoader(); 
		return loader.load((RubyString)args.get(0));
	}
}

public class MarshalModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.MarshalModule;
		m.defineMethod("dump", new Marshal_dump());
		RubyMethod load = new Marshal_load();
		m.defineMethod("load", load);
		m.defineMethod("restore", load);
	}
}
