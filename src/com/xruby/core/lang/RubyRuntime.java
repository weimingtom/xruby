/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import java.io.*;

import com.xruby.core.builtin.*;
import com.xruby.core.value.*;

public class RubyRuntime {
	
	//For performance reason we provide direct access(static public field) for most builtin types.
	//Note: order is important: should creare parent classes first!
	public static RubyModule GlobalScope = new RubyModule(null);
	public static RubyModule KernelModule = KernelModuleBuilder.create();
	public static RubyClass ObjectClass = ObjectClassBuilder.create();
	public static RubyClass NilClassClass = NilClassBuilder.create();
	public static RubyClass TrueClassClass = TrueClassBuilder.create();
	public static RubyClass FalseClassClass = FalseClassBuilder.create();
	public static RubyClass NumericClass = NumericClassBuilder.create();
	public static RubyClass IntegerClass = IntegerClassBuilder.create();
	public static RubyClass FixnumClass = FixnumClassBuilder.create();
	public static RubyClass StringClass = StringClassBuilder.create();
	public static RubyClass FloatClass = FloatClassBuilder.create();
	public static RubyClass ModuleClass = ModuleClassBuilder.create();
	public static RubyClass ClassClass = ClassClassBuilder.create();
	public static RubyClass ArrayClass = ArrayClassBuilder.create();
	public static RubyClass HashClass = HashClassBuilder.create();
	public static RubyClass SymbolClass = SymbolClassBuilder.create();
	public static RubyClass IOClass = IOClassBuilder.create();
	
	public static RubyClass ExceptionClass = GlobalScope.defineNewClass("Exception", ObjectClass);
	
	public static RubyClass StandardErrorClass = GlobalScope.defineNewClass("StandardError", ExceptionClass);
	public static RubyClass TypeErrorClass = GlobalScope.defineNewClass("TypeError", StandardErrorClass);
	public static RubyClass ArgumentErrorClass = GlobalScope.defineNewClass("ArgumentError", StandardErrorClass);
	public static RubyClass IndexErrorClass = GlobalScope.defineNewClass("IndexError", StandardErrorClass);
	public static RubyClass RangeErrorClass = GlobalScope.defineNewClass("RangeError", StandardErrorClass);
	public static RubyClass NameErrorClass = GlobalScope.defineNewClass("NameError", StandardErrorClass);
	public static RubyClass NoMethodErrorClass = GlobalScope.defineNewClass("NoMethodError", NameErrorClass);
	
	public static RubyClass RuntimeErrorClass = GlobalScope.defineNewClass("RuntimeError", StandardErrorClass);
	
	static {
		if (!RubyRuntimeSettings.CompileOnly) {
			try {
				Class c = Class.forName("builtin.main");
				Object o = c.newInstance();
				RubyProgram p = (RubyProgram)o;
				p.run();
			} catch (ClassNotFoundException e) {
			} catch (InstantiationException e) {
			} catch (IllegalAccessException e) {
			} catch (RubyException e) {
				e.printStackTrace();
				System.exit(-1);
			}
		}
	}
		
	public static boolean testTrueFalse(RubyValue value) {
		//only 'nil' and 'false' is false.
		if (value.getRubyClass() == FalseClassClass) {
			return false;
		}  else if (value.getRubyClass() == NilClassClass) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean testEqual(RubyValue value1, RubyValue value2) throws RubyException {
		RubyValue r = callPublicMethod(value1, value2, "===");
		return testTrueFalse(r);
	}

	public static boolean testExceptionType(ArrayValue classes_to_compare, RubyException e) {
		RubyValue value = e.getRubyValue();
		for (RubyValue class_to_compare : classes_to_compare) {
			if (testInstanceOf(class_to_compare, value)) {
				return true;
			}
		}

		return false;
	}
	
	static boolean testInstanceOf(RubyValue class_to_compare, RubyValue value) {
		return value.getRubyClass().isInstanceOf((RubyClass)class_to_compare.getValue());
	}

	//receiver is implicit self
	public static RubyValue callMethod(RubyValue receiver, ArrayValue args, RubyBlock block, String method_name) throws RubyException {
		RubyMethod m = receiver.findMethod(method_name);
		if (null == m) {
			throw new RubyException(RubyRuntime.NameErrorClass, "method '" +  method_name + "' can not be found in 'Object'");
		}

		return m.invoke(receiver, args, block);
	}

	//method call with one argument and no block
	public static RubyValue callPublicMethod(RubyValue receiver, RubyValue arg, String method_name) throws RubyException {
		return callPublicMethod(receiver, new ArrayValue(arg), null, method_name);
	}

	public static RubyValue callPublicMethod(RubyValue receiver, ArrayValue args, RubyBlock block, String method_name) throws RubyException {
		
		RubyMethod m = receiver.findPublicMethod(method_name);
		if (null == m) {
			throw new RubyException(RubyRuntime.NameErrorClass, "public method '" +  method_name + "' can not be found in '" + receiver.getRubyClass().getName() + "'");
		}
		
		return m.invoke(receiver, args, block);
	}
	
	public static RubyValue operatorAnd(RubyValue first, RubyValue second) {
		//The and and && operators evaluate their first operand. If false,
		//the expression returns false; otherwise, the expression returns
		//the value of the second operand. 
		if (!testTrueFalse(first)) {
			return first;
		} else {
			return second;
		}
	}
	
	public static RubyValue operatorOr(RubyValue first, RubyValue second) {
		//The or and || operators evaluate their first operand. If true, 
		//the expression returns true; otherwise, the expression returns
		//the value of the second operand. 
		if (testTrueFalse(first)) {
			return first;
		} else {
			return second;
		}
	}
	
	public static RubyValue runCommandAndCaptureOutput(String value) throws RubyException {
		try {
			Process p = Runtime.getRuntime().exec(value);
			StringBuilder output = new StringBuilder();
			
			BufferedReader stderr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			String line;
			while ((line = stderr.readLine()) != null) {
				output.append(line);
				output.append("\n");
			}
			stderr.close();

			BufferedReader stdout = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((line = stdout.readLine()) != null) {
				output.append(line);
				output.append("\n");
			}
			stdout.close();
			
			return ObjectFactory.createString(output.toString());
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.ExceptionClass, e.getMessage());
		}
	}

}
