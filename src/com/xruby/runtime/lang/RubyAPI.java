package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
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
	
	public static boolean testEqual(RubyValue value1, RubyValue value2) {
		if (value1 == value2) {
			return true;
		}
		
		if (value1 == null) {
			return false;
		}
		
		return RubyAPI.testTrueFalse(value1.callMethod("==", value2));
	}

	public static boolean testTrueFalse(RubyValue value) {
		//only 'nil' and 'false' is false
		return value != RubyConstant.QNIL && value != RubyConstant.QFALSE; 
	}
	
	//receiver is implicit self
	public static RubyValue callMethod(RubyValue receiver, RubyArray args, RubyBlock block, String method_name) {
		return receiver.callMethod(method_name, args, block);
	}
	
	//method call with one argument and no block
	public static RubyValue callPublicMethod(RubyValue receiver, RubyValue arg, String method_name) {
		return receiver.callPublicMethod(method_name, (null == arg) ? null : new RubyArray(arg), RubyBlock.NULL_BLOCK);
	}
	
	public  static RubyValue callPublicMethod(RubyValue receiver, RubyArray args, RubyBlock block, String method_name) {
		return receiver.callPublicMethod(method_name, args, block);
	}
	
	private static void nameError(RubyID id, String fmt, Object... args) {
		String msg = String.format(fmt, args);
		RubyValue e = RubyRuntime.nameError.newInstance(
				new RubyArray(ObjectFactory.createString(msg), id.toSymbol())
				);
		throw new RubyException(e, msg);
	}
	
	// API: Defining Classes	
	public static RubyClass defineClass(String name, RubyClass superclass) {
		RubyID id = StringMap.intern(name);		
		
		if (RubyRuntime.objectClass.isDefinedConst(id)) {
			RubyValue klassObj = RubyRuntime.objectClass.getConst(id);
			try {
				RubyClass klass = (RubyClass)klassObj;
				if (klass.getSuper().realClass() != superclass) {
					RubyAPI.nameError(id, "%s is already defined", name);
				}
				
				return klass;
			} catch (ClassCastException e) {
				RubyAPI.raise(RubyRuntime.typeError, "%s is not a class", name);
			}
		}
		
		if (superclass == null) {
			RubyAPI.warn("no super class for `%s', Object assumed", name);
		}
		
		RubyClass klass = defineIDClass(id, superclass);
		klass.setName(id);		
		RubyRuntime.objectClass.setConst(id, klass);		
		setInheritedClass(superclass, klass);
		
		return klass;
	}
	
	public static RubyClass defineClassUnder(RubyClassModuleBase outer, String name, RubyClass superclass) {
		RubyID id = StringMap.intern(name);
		if (outer.isDefinedConst(id)) {
			RubyValue value = outer.getConst(id);
			try {
				RubyClass klass = (RubyClass)value;
				if (klass.getSuper().realClass() != superclass) {
					nameError(id, "%s is already defined", name);
				}
				
				return klass;
			} catch (ClassCastException e) {
				RubyAPI.raise(RubyRuntime.typeError, "%s is not a class", name);
			}
		}
		
		if (superclass == null) {
			RubyAPI.warn("no super class for `%s::%s', Object assumed", outer.getName(), name);
		}
		
		RubyClass klass = defineIDClass(id, superclass);
		klass.setClasspath(outer, name);
		outer.setConst(id, klass);
		setInheritedClass(superclass, klass);
		
		return klass;
	}
	
	private static RubyValue setInheritedClass(RubyClass superclass, RubyClass klass) {
		if (superclass == null) {
			superclass = RubyRuntime.objectClass;
		}
		
		return superclass.setInheritedClass(klass);
	}
	
	public static RubyModule defineModule(String name) throws RubyException {
		RubyID id = StringMap.intern(name);	
		
		if (RubyRuntime.objectClass.isDefinedConst(id)) {			
			RubyValue moduleObj = RubyRuntime.objectClass.getConst(id);
			try {
				return (RubyModule)moduleObj;
			} catch (ClassCastException e) {
				RubyAPI.raise(RubyRuntime.typeError, "%s is not a module", moduleObj.getRubyClass().getName());
			}
		}
		
		RubyModule module = defineIDModule(id);
		RubyRuntime.objectClass.setConst(id, module);
		
		return module;
	}
	
	public static RubyModule defineModuleUnder(RubyClassModuleBase outter, String name) {
		RubyID id = StringMap.intern(name);
		if (outter.isDefinedConst(id)) {
			RubyValue value = outter.getConst(id);
			try {
				RubyModule module = (RubyModule)value;				
				return module;
			} catch (ClassCastException e) {
				RubyAPI.raise(RubyRuntime.typeError, "%s::%s is not a module", outter.getName(), value.getRubyClass().getName());
			}			
		}
		
		RubyModule module = defineIDModule(id);
		outter.setConst(id, module);
		module.setClasspath(outter, name);
		
		return module;
	}
	
	private static RubyClass defineIDClass(RubyID id, RubyClass superclass) {
		if (superclass == null ) {
			superclass = RubyRuntime.objectClass;
		}
		
		RubyClass klass = createRealClass(superclass);
		createMetaClass(klass, superclass.getRubyClass());		
		return klass;
	}
	
	private static RubyModule defineIDModule(RubyID id) {
		RubyModule module = new RubyModule();
		module.setRubyClass(RubyRuntime.moduleClass);
		return module;
	}
	
	public static RubyClass defineBootClass(String name, RubyClass superclass) {
		RubyClass obj = createRealClass(superclass);		
		RubyID id = StringMap.intern(name);
		obj.setName(id);
		RubyClass constObj = (RubyRuntime.objectClass != null) ? RubyRuntime.objectClass : obj;		
		constObj.setConst(id, obj);		
		return obj;
	}
	
	public static RubyClass createRealClass(RubyClass superclass) {
		RubyClass klass = new RubyRealClass();	
		klass.setRubyClass(RubyRuntime.classClass);		
		klass.setSuper(superclass);		
		return klass;
	}
	
	public static RubyClass createMetaClass(RubyBasic obj, RubyClass superclass) {
		RubySingletonClass klass = new RubySingletonClass();
		klass.setRubyClass(RubyRuntime.classClass);
		klass.setSuper(superclass);
		obj.setRubyClass(klass);
		klass.attachSingletonClass(obj);		
		return klass;
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

	public static RubyValue expandArrayIfThereIsZeroOrOneValue(RubyArray a) {
		if (a.size() <= 1) {
			return a.get(0);
		} else {
			return a;
		}
	}

	public static RubyValue expandArrayIfThereIsZeroOrOneValue(RubyValue v) {
		if (v instanceof RubyArray) {
			RubyArray a = (RubyArray)v;
			if (!a.isNotSingleAsterisk()) {
				return expandArrayIfThereIsZeroOrOneValue(a);
			}
		}
	
		return v;
	}

	public static RubyArray expandArrayIfThereIsOnlyOneRubyArray(RubyArray a) {
		if (a.size() == 1 &&
				a.get(0) instanceof RubyArray) {
			return (RubyArray)a.get(0);
		} else {
			return a;
		}
	}
	
	public static RubyArray convertToArrayIfNotYet(RubyValue v) {
		if (v instanceof RubyArray) {
			return (RubyArray)v;
		} else {
			return new RubyArray(v);
		}
	}
	
	// API: log
	public static void warn(String fmt, Object... args) {		
	}
	
	public static void warning(String fmt, Object... args) {
		
	}
	
	public static void bug(String fmt, Object... args) {
		
	}
	
	public static void exit(int status) {
		System.exit(status);
	}	
}
