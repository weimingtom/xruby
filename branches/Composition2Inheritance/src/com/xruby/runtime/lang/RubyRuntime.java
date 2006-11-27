/**
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.builtin.*;
import com.xruby.runtime.value.*;

public class RubyRuntime {

	//For performance reason we provide direct access(static public field) for most builtin types.
	//Note: order is important: should creare parent classes first!
	public static RubyModule GlobalScope = new RubyModule(null);
	public static RubyClass ObjectClass = ObjectClassBuilder.create();
	public static RubyClass ModuleClass = ModuleClassBuilder.create();
	public static RubyClass ClassClass = ClassClassBuilder.create();
	public static RubyModule KernelModule = KernelModuleBuilder.create();
	public static RubyClass NilClassClass = NilClassBuilder.create();
	public static RubyClass TrueClassClass = TrueClassBuilder.create();
	public static RubyClass FalseClassClass = FalseClassBuilder.create();
	public static RubyClass NumericClass = NumericClassBuilder.create();
	public static RubyClass IntegerClass = IntegerClassBuilder.create();
	public static RubyClass FixnumClass = FixnumClassBuilder.create();
	public static RubyClass BignumClass = BignumClassBuilder.create();
	public static RubyClass StringClass = StringClassBuilder.create();
	public static RubyClass FloatClass = FloatClassBuilder.create();
	public static RubyClass ArrayClass = ArrayClassBuilder.create();
	public static RubyClass HashClass = HashClassBuilder.create();
	public static RubyClass SymbolClass = SymbolClassBuilder.create();
	public static RubyClass IOClass = IOClassBuilder.create();
	public static RubyClass ProcClass = ProcClassBuilder.create();
	public static RubyClass RangeClass = RangeClassBuilder.create();
	public static RubyClass RegexpClass = RegexpClassBuilder.create();
	public static RubyClass FileClass = FileClassBuilder.create();
	public static RubyClass MethodClass = MethodClassBuilder.create();
	public static RubyClass TimeClass = TimeClassBuilder.create();
	public static RubyClass MatchDataClass = MatchDataClassBuilder.create();
	public static RubyClass DirClass = DirClassBuilder.create();

	public static RubyClass ExceptionClass = ExceptionClassBuilder.create();

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

    public static RubyModule EnumModule = EnumerableBuilder.create();

    private static boolean builtin_initialized_ = false;
    
    public static void initBuiltin(){
    	initBuiltin(null);
    }

	public static void initBuiltin(String[] args) {
		if (builtin_initialized_) {
			return;
		}
		
		RubyArray argv = new RubyArray();
		if (args != null){
			for (String arg: args){
				argv.add(ObjectFactory.createString(arg));
			}
		}

		RubyValue.setTopLevelConstant(argv, "ARGV");

		TopLevelSelfInitializer.initSingletonMethods();
		TimeClassBuilder.initSingletonMethods();
		IOClassBuilder.initSingletonMethods();
		FileClassBuilder.initSingletonMethods();
		DirClassBuilder.initSingletonMethods();

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

}
