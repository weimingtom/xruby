package com.xruby.runtime.lang;

public class CommonRubyID {
	public static RubyID initializeId = StringMap.intern("initialize");
	
	public static RubyID inspectID = StringMap.intern("inspect");
	
	public static RubyID toSID = StringMap.intern("to_s");
	public static RubyID toIID = StringMap.intern("to_i");
	public static RubyID toFID = StringMap.intern("to_f");
	
	public static RubyID eachID = StringMap.intern("each");
	
	public static RubyID lengthID = StringMap.intern("length");
	
	public static RubyID plusID = StringMap.intern("+");
	
	public static RubyID unequalID = StringMap.intern("<=>");	
	
	private CommonRubyID() {
	}
}
