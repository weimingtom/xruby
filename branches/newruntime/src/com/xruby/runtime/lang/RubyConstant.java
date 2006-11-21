package com.xruby.runtime.lang;

public abstract class RubyConstant extends RubyValue {
	public static RubyConstant QFALSE = new RubyConstant() {
		public String toString() {
			return "false";
		}
		
		public RubyClass getRubyClass() {
			return RubyRuntime.falseClass;
		}		
	};
	
	public static RubyConstant QTRUE = new RubyConstant() {
		public String toString() {
			return "true";
		}
		
		public RubyClass getRubyClass() {
			return RubyRuntime.trueClass;
		}
	};
	
	public static RubyConstant QNIL = new RubyConstant() {
		public String toString() {
			return "true";
		}
		
		public RubyClass getRubyClass() {
			return RubyRuntime.nilClass;
		}
	};
	
	public static boolean isNil(RubyValue value) {
		return value == QNIL;
	}
	
	private RubyConstant() {}
}
