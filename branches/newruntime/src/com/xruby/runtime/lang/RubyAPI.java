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
	
	public static boolean equal(RubyValue value1, RubyValue value2) {
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
				return (RubyClass)klassObj;
			} catch (ClassCastException e) {
				RubyAPI.raise(RubyRuntime.typeError, "%s is not a class", name);
			}
		}
		
		if (superclass == null) {
			RubyAPI.warn("no super class for `%s', Object assumed", name);
		}
		
		RubyClass klass = defineIDClass(id, superclass);
		klass.setName(id);
		
		// FIXME: insert class to class table
		
		RubyRuntime.objectClass.setConst(id, klass);
		
		// FIXME: set inherited relation
		
		return klass;
	}
	
	public static RubyClass defineClassUnder(RubyClassModuleBase outter, String name, RubyClass superclass) {
		RubyID id = StringMap.intern(name);
		if (outter.isDefinedConst(id)) {
			RubyValue value = outter.getConst(id);
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
			// FIXME: warn
		}
		
		RubyClass klass = defineIDClass(id, superclass);
		klass.setClasspath(outter, name);
		outter.setConst(id, klass);
		// FIXME: inherited
		
		return klass;
	}
	
	public static RubyModule defineModule(String name) throws RubyException {
		RubyID id = StringMap.intern(name);	
		
		if (RubyRuntime.objectClass.isDefinedConst(id)) {			
			RubyValue moduleObj = RubyRuntime.objectClass.getConst(id);
			
			// FIXME: Catch type cast exception			
			return (RubyModule)moduleObj;	
		}
		
		RubyModule module = defineIDModule(id);
		
		// FIXME: insert module to class table
		
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
				RubyAPI.raise(RubyRuntime.typeError, "%s::%s is not a module", outter.getName(), value.getRubyClassName());
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
		
		RubyClass klass = createBootClass(superclass);
		createMetaClass(klass, ((RubyBasic)superclass).getRubyClass());
		
		return klass;
	}
	
	private static RubyModule defineIDModule(RubyID id) {
		RubyModule module = new RubyModule();
		module.setRubyClass(RubyRuntime.moduleClass);
		return module;
	}
	
	public static RubyClass defineBootClass(String name, RubyClass superclass) {
		RubyClass obj = createBootClass(superclass);
		
		RubyID id = StringMap.intern(name);
		obj.setName(id);
		
		//FIXME: insert class to class table
		
		// set class as const
		RubyClass constObj = (RubyRuntime.objectClass != null) ? RubyRuntime.objectClass : obj;
		
		constObj.setConst(id, obj);
		
		return obj;
	}
	
	public static RubyClass createBootClass(RubyClass superclass) {
		RubyClass klass = new RubyClass();	
		klass.setRubyClass(RubyRuntime.classClass);		
		klass.setSuper(superclass);
		
		// FIXME: set iv table and method table
		
		return klass;
	}
	
	public static RubyClass createMetaClass(RubyBasic obj, RubyClass superclass) {
		RubyClass klass = createBootClass(superclass);
		klass.setSingleton();
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
	
	// API: log
	public static void warn(String fmt, Object... args) {
		
	}
	
	public static void warning(String fmt, Object... args) {
		
	}
	
	public static void exit(int status) {
		System.exit(status);
	}
	
}
