/**
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.builtin.*;
import com.xruby.runtime.value.*;

public class RubyRuntime {

	//For performance reason we provide direct access(static public field) for most builtin types.
	//Note: order is important: should creare parent classes first!
	public static RubyModule GlobalScope = new RubyModule(null, null);
	public static RubyClass ObjectClass = GlobalScope.defineNewClass("Object", null);
	public static RubyClass ModuleClass = GlobalScope.defineNewClass("Module", RubyRuntime.ObjectClass);
	public static RubyClass ClassClass = GlobalScope.defineNewClass("Class", RubyRuntime.ModuleClass);
	public static RubyModule KernelModule = GlobalScope.defineNewModule("Kernel");
	public static RubyModule ComparableModule = GlobalScope.defineNewModule("Comparable");
	public static RubyModule EnumerableModule = GlobalScope.defineNewModule("Enumerable");
	public static RubyModule ErrnoModule = GlobalScope.defineNewModule("Errno");
	public static RubyModule FileTestModule = GlobalScope.defineNewModule("FileTest");
	public static RubyModule GCModule = GlobalScope.defineNewModule("GC");
	public static RubyModule MarshalModule = GlobalScope.defineNewModule("Marshal");
	public static RubyModule MathModule = GlobalScope.defineNewModule("Math");
	public static RubyModule ObjectSpaceModule = GlobalScope.defineNewModule("ObjectSpace");
	public static RubyModule ProcessModule = GlobalScope.defineNewModule("Process");
	public static RubyClass BingingClass = GlobalScope.defineNewClass("Binding", RubyRuntime.ObjectClass);
	public static RubyClass NilClassClass = GlobalScope.defineNewClass("NilClass", RubyRuntime.ObjectClass);
	public static RubyClass TrueClassClass = GlobalScope.defineNewClass("TrueClass", RubyRuntime.ObjectClass);
	public static RubyClass FalseClassClass = GlobalScope.defineNewClass("FalseClass", RubyRuntime.ObjectClass);
	public static RubyClass NumericClass = GlobalScope.defineNewClass("Numeric", RubyRuntime.ObjectClass);
	public static RubyClass IntegerClass = GlobalScope.defineNewClass("Integer", RubyRuntime.NumericClass);
	public static RubyClass FixnumClass = GlobalScope.defineNewClass("Fixnum", RubyRuntime.IntegerClass);
	public static RubyClass BignumClass = GlobalScope.defineNewClass("Bignum", RubyRuntime.IntegerClass);
	public static RubyClass StringClass = GlobalScope.defineNewClass("String", RubyRuntime.ObjectClass);
	public static RubyClass FloatClass = GlobalScope.defineNewClass("Float", RubyRuntime.NumericClass);
	public static RubyClass ArrayClass = GlobalScope.defineNewClass("Array", RubyRuntime.ObjectClass);
	public static RubyClass HashClass = GlobalScope.defineNewClass("Hash", RubyRuntime.ObjectClass);
	public static RubyClass SymbolClass = GlobalScope.defineNewClass("Symbol", RubyRuntime.ObjectClass);
	public static RubyClass IOClass = GlobalScope.defineNewClass("IO", RubyRuntime.ObjectClass);
	public static RubyClass ProcClass = GlobalScope.defineNewClass("Proc", RubyRuntime.ObjectClass);
	public static RubyClass RangeClass = GlobalScope.defineNewClass("Range", RubyRuntime.ObjectClass);
	public static RubyClass RegexpClass = GlobalScope.defineNewClass("Regexp", RubyRuntime.ObjectClass);
	public static RubyClass FileClass = GlobalScope.defineNewClass("File", RubyRuntime.IOClass);
	public static RubyClass MethodClass = GlobalScope.defineNewClass("Method", RubyRuntime.ObjectClass);
	public static RubyClass TimeClass = GlobalScope.defineNewClass("Time", RubyRuntime.ObjectClass);
	public static RubyClass MatchDataClass = GlobalScope.defineNewClass("MatchData", RubyRuntime.ObjectClass);
	public static RubyClass DirClass = GlobalScope.defineNewClass("Dir", RubyRuntime.ObjectClass);
	public static RubyClass StructClass = GlobalScope.defineNewClass("Struct", RubyRuntime.ObjectClass);
	public static RubyClass ThreadGroupClass = GlobalScope.defineNewClass("ThreadGroup", RubyRuntime.ObjectClass);
	public static RubyClass ThreadClass = GlobalScope.defineNewClass("Thread", RubyRuntime.ObjectClass);
	
	public static RubyClass ExceptionClass = GlobalScope.defineNewClass("Exception", RubyRuntime.ObjectClass);
	public static RubyClass StandardErrorClass = GlobalScope.defineNewClass("StandardError", ExceptionClass);
	public static RubyClass TypeErrorClass = GlobalScope.defineNewClass("TypeError", StandardErrorClass);
	public static RubyClass ArgumentErrorClass = GlobalScope.defineNewClass("ArgumentError", StandardErrorClass);
	public static RubyClass IndexErrorClass = GlobalScope.defineNewClass("IndexError", StandardErrorClass);
	public static RubyClass RangeErrorClass = GlobalScope.defineNewClass("RangeError", StandardErrorClass);
	public static RubyClass NameErrorClass = GlobalScope.defineNewClass("NameError", StandardErrorClass);
	public static RubyClass NoMethodErrorClass = GlobalScope.defineNewClass("NoMethodError", NameErrorClass);
	public static RubyClass IOErrorClass = GlobalScope.defineNewClass("IOError", StandardErrorClass);
	public static RubyClass RuntimeErrorClass = GlobalScope.defineNewClass("RuntimeError", StandardErrorClass);
	public static RubyClass LocalJumpErrorClass = GlobalScope.defineNewClass("LocalJumpError", StandardErrorClass);

	private static boolean builtin_initialized_ = false;

	static {
		ObjectClassBuilder.initialize();
		ModuleClassBuilder.initialize();
		ClassClassBuilder.initialize();
		KernelModuleBuilder.initialize();
		EnumerableModuleBuilder.initialize();
		GCModuleBuilder.initialize();
		MathModuleBuilder.initialize();
		NumericClassBuilder.initialize();
		IntegerClassBuilder.initialize();
		FixnumClassBuilder.initialize();
		BignumClassBuilder.initialize();
		StringClassBuilder.initialize();
		FloatClassBuilder.initialize();
		ArrayClassBuilder.initialize();
		HashClassBuilder.initialize();
		SymbolClassBuilder.initialize();
		IOClassBuilder.initialize();
		ProcClassBuilder.initialize();
		RangeClassBuilder.initialize();
		RegexpClassBuilder.initialize();
		FileClassBuilder.initialize();
		MethodClassBuilder.initialize();
		TimeClassBuilder.initialize();
		MatchDataClassBuilder.initialize();
		DirClassBuilder.initialize();
		StructClassBuilder.initialize();
		ExceptionClassBuilder.initialize();
	}

	private static void initARGV(String[] args) {
		RubyArray argv = new RubyArray();
		if (args != null){
			for (String arg: args){
				argv.add(ObjectFactory.createString(arg));
			}
		}

		RubyAPI.setTopLevelConstant(argv, "ARGV");
	}
	
	public static void initBuiltin(String[] args) {
		if (builtin_initialized_) {
			return;
		}
		
		initARGV(args);
		
		RubyAPI.setTopLevelConstant(ObjectFactory.trueValue, "TRUE");
		RubyAPI.setTopLevelConstant(ObjectFactory.falseValue, "FALSE");
		RubyAPI.setTopLevelConstant(ObjectFactory.nilValue, "NIL");
		
		TopLevelSelfInitializer.initialize();

		try {
			Class c = Class.forName("builtin.main");
			Object o = c.newInstance();
			RubyProgram p = (RubyProgram)o;
			p.run();
			builtin_initialized_ = true;
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		} catch (RubyException e) {
			e.printStackTrace();
			System.exit(-1);
		}
	}

	public static boolean isBuiltinClass(String name) {
		final String [] builtin_classes = {
				"Array", "Bignum", "Binding", "Class",
				//"Continuation",
				"Dir", "Exception",
				//"File::Stat",
				"File", "Fixnum", "Float", "Hash", "Integer", "IO", "MatchData", "Method",
				"Module", "NilClass", "Numeric", "Object", "Proc", "Range", "Regexp", "String", "Struct",
				//"Struct::Tms"
				"Symbol", "ThreadGroup", "Thread", "ArgumentError", 
				"Time", "TrueClass",

				"Exception", "StandardError", "TypeError", "IndexError", "RangeError", "NameError", "NoMethodError", "IOError", "RuntimeError", "LocalJumpError",
		};

		for (String s : builtin_classes) {
			if (s.equals(name)) {
				return true;
			}
		}

		return false;
	}
	
	public static boolean isBuiltinModule(String name) {
		final String [] builtin_classes = {
				"Comparable",
				"Enumerable",
				"Errno",
				"FileTest",
				"GC",
				"Kernel",
				"Marshal",
				"Math",
				"ObjectSpace",
				"Process ",
		};

		for (String s : builtin_classes) {
			if (s.equals(name)) {
				return true;
			}
		}

		return false;
	}
}
