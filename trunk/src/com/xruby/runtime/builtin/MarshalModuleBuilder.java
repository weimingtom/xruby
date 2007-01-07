package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Marshal_dump extends RubyMethod {
	public Marshal_dump() {
		super(1);
	}
	
	private void packInteger(RubyFixnum v, StringBuilder sb) {
		sb.append('i');
		packInteger(v.intValue(), sb);
	}
	
	private void packInteger(int v, StringBuilder sb) {
		if (0 == v) {
			sb.append((char)0);
		} else {
			sb.append((char)(v + 5));
		}
	}
	
	private void packString(RubyString v, StringBuilder sb) {
		sb.append('"');
		packInteger(v.length(), sb);
		sb.append(v);
	}
	
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		StringBuilder sb = new StringBuilder();
		//version
		sb.append((char)4);
		sb.append((char)8);
		
		RubyValue v = args.get(0);
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
		} else {
			throw new RubyException("is not implemented");
		}
		
		return ObjectFactory.createString(sb);
	}
}

public class MarshalModuleBuilder {
	public static void initialize() {
		RubyModule m = RubyRuntime.MarshalModule;
		m.defineMethod("dump", new Marshal_dump());
	}
}
