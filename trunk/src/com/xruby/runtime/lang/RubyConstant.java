package com.xruby.runtime.lang;

public abstract class RubyConstant extends RubySpecialValue {
	public static RubyConstant QFALSE = new RubyConstant() {
		public RubyClass getRubyClass() {
			return RubyRuntime.FalseClassClass;
		}

		public boolean isTrue() {
			return false;
		}		
	};
	
	public static RubyConstant QTRUE = new RubyConstant() {
		public RubyClass getRubyClass() {
			return RubyRuntime.TrueClassClass;
		}
	};
	
	public static RubyConstant QNIL = new RubyConstant() {
		public RubyClass getRubyClass() {
			return RubyRuntime.NilClassClass;
		}
		
		public boolean isTrue() {
			return false;
		}
	};
	
	private RubyConstant() {}
}
