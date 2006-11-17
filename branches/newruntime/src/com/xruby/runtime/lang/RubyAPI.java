package com.xruby.runtime.lang;

import com.xruby.runtime.value.RubyFixnum;

public class RubyAPI {	
	public static long valueToLong(RubyValue value) {
		if (value instanceof RubyFixnum) {
			return ((RubyFixnum)value).longValue();
		}
		
		if (value == RubyConstant.QNIL) {
			raise(RubyRuntime.typeError, "no implicit conversion from nil to integer");
		}
		
		// FIXME: convert
		return 0;
	}
	
	public static int valueToInt(RubyValue value) {
		return (int)valueToLong(value);
	}
	
	public static boolean equal(RubyValue value1, RubyValue value2) {
		if (value1 == value2) {
			return true;
		}
		
		if (value1 == null) {
			return false;
		}
		
		return RubyAPI.test(value1.callMethod("==", value2));
	}

	public static boolean test(RubyValue value) {
		return value != RubyConstant.QNIL && value != RubyConstant.QFALSE; 
	}

	public static RubyConstant test(boolean value) {
		return value ? RubyConstant.QTRUE : RubyConstant.QFALSE; 
	}

	public static RubyClass classof(RubyValue value) {
		if (value == RubyConstant.QTRUE) {
			return RubyRuntime.trueClass;
		} 
		
		if (value == RubyConstant.QFALSE) {
			return RubyRuntime.falseClass;
		}
		
		if (value == RubyConstant.QNIL) {
			return RubyRuntime.nilClass;
		}
		
		if (value instanceof RubyFixnum) {
			return RubyRuntime.fixnumClass;
		}
		
		RubyBasic basic = (RubyBasic)value;
		return basic.getRubyClass();
	}
	
	// API: Defining Classes
	public static RubyClass defineClass(String name, RubyClass superclass) throws RubyException {
		return RubyRuntime.coreBuilder.defineClass(name, superclass);
	}
	
	public static RubyModule defineModule(String name) throws RubyException {
		return RubyRuntime.coreBuilder.defineModule(name);
	}
	
	public static RubyClass defineClassUnder(RubyClassModuleBase outter, String name, RubyClass superclass) {
		return RubyRuntime.coreBuilder.defineClassUnder(outter, name, superclass);
	}
	
	public static RubyModule defineModuleUnder(RubyClassModuleBase outter, String name) {
		return RubyRuntime.coreBuilder.defineModuleUnder(outter, name);
	}
	
	// API: Global
	public static void defineGlobalMethod(String name, RubyMethod method, int argc) {
		RubyRuntime.kernelModule.defineModuleMethod(name, method, argc);
	}
	
	public static void defineGlobalConst(String name, RubyValue value) {
		RubyRuntime.objectClass.defineConst(name, value);
	}
	
	// API: Exception
	public static void raise(RubyClass exception, String fmt, Object... args) {
		String msg = String.format(fmt, args);
		RubyValue e = exception.newInstance();
		throw new RubyException(e, msg);
	}
	
	// API: log
	public static void warn(String fmt, Object... args) {
		
	}
	
	public static void warning(String fmt, Object... args) {
		
	}
	
	public static void exit(int status) {
		System.exit(status);
	}
	
}
