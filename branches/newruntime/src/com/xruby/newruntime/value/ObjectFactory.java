package com.xruby.newruntime.value;

public class ObjectFactory {
	public static RubyString createString(String v) {
		return new RubyString(v);
	}
	
	public static RubyString createString(char v) {
		return new RubyString(v);
	}

	public static RubyFixnum createFixnum(int v) {
		return RubyFixnum.int2Fix(v);
	}

	public static RubyFloat createFloat(double v) {
		return new RubyFloat(v);
	}
}
