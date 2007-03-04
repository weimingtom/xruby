/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import java.io.*;
import com.xruby.runtime.value.*;

public class RubyAPI {

	public static boolean testTrueFalse(RubyValue value) {
		//only 'nil' and 'false' is false.
		if (value == ObjectFactory.falseValue) {
			return false;
		} else if (value == ObjectFactory.nilValue) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean testCaseEqual(RubyValue value1, RubyValue value2) {
		RubyValue r = RubyAPI.callPublicOneArgMethod(value1, value2, null, "===");
		return testTrueFalse(r);
	}

	public static boolean testEqual(RubyValue value1, RubyValue value2) {
		RubyValue r = RubyAPI.callPublicOneArgMethod(value1, value2, null, "==");
		return testTrueFalse(r);
	}

	public static boolean testExceptionType(RubyArray classes_to_compare, RubyException e) {
		RubyValue value = e.getRubyValue();
		for (RubyValue class_to_compare : classes_to_compare) {
			if (RubyAPI.isKindOf(class_to_compare, value)) {
				return true;
			}
		}
	
		return false;
	}

	public static boolean isKindOf(RubyValue class_to_compare, RubyValue value) {
		return value.getRubyClass().isKindOf((RubyClass)class_to_compare);
	}

	public static boolean isInstanceOf(RubyValue class_to_compare, RubyValue value) {
		return (value.getRubyClass() == class_to_compare);
	}
	
	//e.g. defined? super
	public static RubyValue isDefinedSuperMethod(RubyValue receiver, String method_name, RubyMethod current_method) {
		RubyClass c = (RubyClass)current_method.getOwner();
		RubyMethod m = c.findSuperMethod(method_name);
		if (null == m || UndefMethod.isUndef(m)) {
			return ObjectFactory.nilValue;
		}
		
		return ObjectFactory.createString("super");
	}
	
	//e.g. defined? a.f
	//TODO bad name, should be isDefinedMethodWithReceiver
	public static RubyValue isDefinedPublicMethod(RubyValue receiver, RubyModule owner, String method_name) {
		if (receiver.getRubyClass() == owner) {
			//TODO do not have to be equal
			return isDefinedMethod(receiver, method_name);
		}
		
		RubyMethod m = receiver.findPublicMethod(method_name);
		if (null == m || UndefMethod.isUndef(m)) {
			return ObjectFactory.nilValue;
		}
		
		return ObjectFactory.createString("method");
	}

	//e.g. defined? f
	public static RubyValue isDefinedMethod(RubyValue receiver, String method_name) {
		RubyMethod m = receiver.findMethod(method_name);
		if (null == m || UndefMethod.isUndef(m)) {
			return ObjectFactory.nilValue;
		}
		
		return ObjectFactory.createString("method");
	}
	
	public static RubyValue isDefinedYield(RubyBlock block) {
		if (null == block) {
			return ObjectFactory.nilValue;
		} else {
			return ObjectFactory.createString("yield");
		}
	}

	private static RubyValue callMethodMissing(RubyValue receiver, RubyArray args, RubyBlock block, String method_name) {
		RubyMethod m = receiver.findMethod("method_missing");
		if (null != m && !UndefMethod.isUndef(m)) {
			if (null == args) {
				args = new RubyArray(ObjectFactory.createSymbol(method_name));
			} else {
				args.insert(0, ObjectFactory.createSymbol(method_name));
			}
			return m.invoke(receiver, args, block);
		}
		
		throw new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method '" +  method_name + "' for " + receiver.getRubyClass().getName());
	}

	//receiver is implicit self
	public static RubyValue callMethod(RubyValue receiver, RubyArray args, RubyBlock block, String method_name) {
		assert(null == args || args.size() > 1);//use callOneArgMethod if has only one arg
		RubyMethod m = receiver.findMethod(method_name);
		if (null != m && !UndefMethod.isUndef(m)) {
			return invokeMethod(m, method_name, receiver, args, block);
		}
	
		return callMethodMissing(receiver, args, block, method_name);
	}

	//method call with *one* argument and no block (use the other one if no arg (arg == null)!)
	//This make code (especially reverse engineered ones) more readable.
	public static RubyValue callOneArgMethod(RubyValue receiver, RubyValue arg, RubyBlock block, String method_name) {
		assert(null != arg);
		return RubyAPI.callMethod(receiver, new RubyArray(arg), block, method_name);
	}

	//method call with *one* argument and no block (use the other one if no arg (arg == null)!)
	//This make code (especially reverse engineered ones) more readable.
	public static RubyValue callPublicOneArgMethod(RubyValue receiver, RubyValue arg, RubyBlock block, String method_name) {
		assert(null != arg);
		return RubyAPI.callPublicMethod(receiver, new RubyArray(arg), block, method_name);
	}

	//TODO should pass owner to work with protected method
	public static RubyValue callPublicMethod(RubyValue receiver, RubyArray args, RubyBlock block, String method_name) {
		assert(null == args || args.size() > 1);//use callPublicOneArgMethod if has only one arg
		RubyMethod m = receiver.findPublicMethod(method_name);
		if (null != m && !UndefMethod.isUndef(m)) {
			return invokeMethod(m, method_name, receiver, args, block);
		}
	
		return  callMethodMissing(receiver, args, block, method_name);
	}

	public static RubyValue callSuperOneArgMethod(RubyValue receiver, RubyValue arg, RubyBlock block, String method_name, RubyMethod current_method) {
		assert(null != arg);
		return RubyAPI.callSuperMethod(receiver, new RubyArray(arg), block, method_name, current_method);
	}

	public static RubyValue callSuperMethod(RubyValue receiver, RubyArray args, RubyBlock block, String method_name, RubyMethod current_method) {
		assert(null == args || args.size() > 1);//use callSuperOneArgMethod if has only one arg
		RubyClass c = (RubyClass)current_method.getOwner();
		RubyMethod m = c.findSuperMethod(method_name);
		if (null == m || UndefMethod.isUndef(m)) {
			throw new RubyException(RubyRuntime.NoMethodErrorClass, "super method '" +  method_name + "' can not be found in '" + c.getName() + "'");
		}
	
		return invokeMethod(m, method_name, receiver, args, block);
	}

	private static RubyValue invokeMethod(RubyMethod m, String method_name, RubyValue receiver, RubyArray args, RubyBlock block) {
		//FrameManager.pushRecord(method_name);
		RubyValue v = m.invoke(receiver, args, block);
		//FrameManager.popRecord();
		return v;
	}
	
	public static RubyValue operatorNot(RubyValue value) {
		if (testTrueFalse(value)) {
			return ObjectFactory.falseValue;
		} else {
			return ObjectFactory.trueValue;
		}
	}

	public static RubyValue runCommandAndCaptureOutput(String value) {
		//some commands are builtin within the shell. e,g. echo, copy...
		if (System.getProperty("os.name").toUpperCase().indexOf("WINDOWS") >= 0) {
			value = "cmd /c " + value;
		}
		
		try {
			Process p = Runtime.getRuntime().exec(value);
			StringBuilder output = new StringBuilder();
	
			BufferedReader stderr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
			int c;
			while ((c = stderr.read()) != -1) {
				if (c != '\r') {
					output.append((char)c);
				}
			}
			stderr.close();
	
			BufferedReader stdout = new BufferedReader(new InputStreamReader(p.getInputStream()));
			while ((c = stdout.read()) != -1) {
				if (c != '\r') {
					output.append((char)c);
				}
			}
			stdout.close();
	
			return ObjectFactory.createString(output);
		} catch (IOException e) {
			throw new RubyException(RubyRuntime.ExceptionClass, e.toString());
		}
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
	
	public static RubyBlock convertRubyValue2RubyBlock(RubyValue v) {
		if (ObjectFactory.nilValue == v) {
			return null;
		} else if (v instanceof MethodValue) {
			return ((MethodValue)v).convertToRubyProc().getBlock();
		} else if (v instanceof RubyProc) {
			return ((RubyProc)v).getBlock();
		} else {
			throw new RubyException(RubyRuntime.TypeErrorClass, "wrong argument type " + v.getRubyClass().getName() + " (expected Proc) ");
		}
	}

	public static RubyValue convertRubyException2RubyValue(RubyException e) {
		return e.getRubyValue();
	}

	public static RubyValue setTopLevelConstant(RubyValue value, String name) {
		return RubyRuntime.GlobalScope.setConstant(name, value);
	}

	public static RubyValue getCurrentNamespaceConstant(RubyModule receiver, String name) {
		RubyValue v = receiver.getConstant(name);
		if (null == v) {
			RubyString str = ObjectFactory.createString();
			receiver.to_s(str);
			if (str.length() > 0) {
				str.appendString("::");
			}
			str.appendString(name);
			throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + str.toString());
		}
		
		return v;
	}

	public static RubyValue isDefinedCurrentNamespaceConstant(RubyValue receiver, String name) {
		RubyValue v = ((RubyModule)receiver).getConstant(name);
		if (null == v) {
			return ObjectFactory.nilValue;
		}
		
		return ObjectFactory.createString("constant");
	}

	public static RubyValue getConstant(RubyValue receiver, String name) {
		throwTypeErrorIfNotClassModule(receiver);
		
		RubyModule m = (RubyModule)receiver;
		RubyValue v = m.getConstant(name);
		if (null == v) {
			RubyString str = ObjectFactory.createString();
			m.to_s(str);
			if (str.length() > 0) {
				str.appendString("::");
			}
			str.appendString(name);
			throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + str.toString());
		}
		
		return v;
	}

	public static RubyValue setConstant(RubyValue value, RubyValue receiver, String name) {
		throwTypeErrorIfNotClassModule(receiver);

		return ((RubyModule)receiver).setConstant(name, value);
	}

	private static void throwTypeErrorIfNotClassModule(RubyValue receiver) {
		if (!(receiver instanceof RubyClass) &&
				!(receiver instanceof RubyModule)) {
			RubyValue v = RubyAPI.callPublicMethod(receiver, null, null, "to_s");
			String s = ((RubyString)v).toString();
			throw new RubyException(RubyRuntime.TypeErrorClass, s + " is not a class/module");
		}
	}
}
