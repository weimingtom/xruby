/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RubyAPI {
    public static RubyClass defineClass(String name, RubyClass superclass) {
        return ClassFactory.defineClass(name, superclass);
    }

    /* For compiler */
    public static RubyClass defineClass(String name, RubyValue superclass) {
        if (null != superclass && !(superclass instanceof RubyClass)) {
            throw new RubyException(RubyRuntime.TypeErrorClass, "superclass must be a Class (" + superclass.getRubyClass().getName() + " given)");
        }

        RubyValue value = RubyRuntime.ObjectClass.getConstant(name);
        if (value != null) {
            if (!(value instanceof RubyClass)) {
                throw new RubyException(RubyRuntime.TypeErrorClass, name + " is not a class");
            }

            RubyClass klass = (RubyClass)value;

            if (superclass != null) {
                if (superclass != klass.getSuperClass().getRealClass()) {
                    throw new RubyException(RubyRuntime.TypeErrorClass, "superclass mismatch for class " + name);
                }
            }

            klass.setAccessPublic();

            return klass;
        }

        return defineClass(name, null == superclass ? null : (RubyClass)superclass);
    }

    public static RubyModule defineModule(String name) {
        return ClassFactory.defineModule(name);
    }

    public static boolean testTrueFalse(RubyValue value) {
        //only 'nil' and 'false' is false.
        return value != ObjectFactory.FALSE_VALUE && value != ObjectFactory.NIL_VALUE;
    }

    public static boolean testCaseEqual(RubyValue value1, RubyValue value2) {
        RubyValue r = RubyAPI.callPublicOneArgMethod(value1, value2, null, CommonRubyID.longEqualID);
        return testTrueFalse(r);
    }

    public static boolean testEqual(RubyValue value1, RubyValue value2) {
        RubyValue r = RubyAPI.callPublicOneArgMethod(value1, value2, null, CommonRubyID.equalID);
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
        if (class_to_compare == value) {
            return true;
        } else if (!(class_to_compare instanceof RubyClass)) {
            //TODO should test include relationship with Module
            return false;
        } else {
            return value.getRubyClass().isKindOf((RubyClass) class_to_compare);
        }
    }

    public static boolean isInstanceOf(RubyValue class_to_compare, RubyValue value) {
        return (value.getRubyClass() == class_to_compare);
    }

    //e.g. defined? super
    public static RubyValue isDefinedSuperMethod(RubyValue receiver, String method_name, RubyMethod current_method) {
        RubyClass c = (RubyClass) current_method.getOwner();
        RubyID mid = StringMap.intern(method_name);
        RubyMethod m = c.findSuperMethod(mid);
        if (null == m || UndefMethod.isUndef(m)) {
            return ObjectFactory.NIL_VALUE;
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

        RubyID mid = StringMap.intern(method_name);
        RubyMethod m = receiver.findPublicMethod(mid);
        if (null == m || UndefMethod.isUndef(m)) {
            return ObjectFactory.NIL_VALUE;
        }

        return ObjectFactory.createString("method");
    }

    //e.g. defined? f
    public static RubyValue isDefinedMethod(RubyValue receiver, String method_name) {
        RubyID mid = StringMap.intern(method_name);
        RubyMethod m = receiver.findMethod(mid);
        if (null == m || UndefMethod.isUndef(m)) {
            return ObjectFactory.NIL_VALUE;
        }

        return ObjectFactory.createString("method");
    }

    public static RubyValue isDefinedYield(RubyBlock block) {
        if (null == block) {
            return ObjectFactory.NIL_VALUE;
        } else {
            return ObjectFactory.createString("yield");
        }
    }

    private static RubyValue callMethodMissing(RubyValue receiver, RubyArray args, RubyBlock block, RubyID mid) {
        RubyMethod m = receiver.findMethod(CommonRubyID.methodMissingId);
        if (null != m && !UndefMethod.isUndef(m)) {
            if (null == args) {
                args = new RubyArray(ObjectFactory.createSymbol(StringMap.id2name(mid)));
            } else {
                args.insert(0, ObjectFactory.createSymbol(StringMap.id2name(mid)));
            }
            return m.invoke(receiver, null, args, block);
        }

        RubyClass klass = receiver.getRubyClass();
        klass = (klass != null) ? klass.getRealClass() : null;
        throw new RubyException(RubyRuntime.NoMethodErrorClass, "undefined method '" + StringMap.id2name(mid) + "' for " + klass.getName());
    }

    //receiver is implicit self
    public static RubyValue callMethod(RubyValue receiver, RubyArray args, RubyBlock block, RubyID mid) {
        assert(null == args || args.size() > 1);//use callOneArgMethod if has only one arg
        RubyMethod m = receiver.findMethod(mid);
        if (null != m && !UndefMethod.isUndef(m)) {
            return invokeMethod(m, mid, receiver, null, args, block);
        }

        return callMethodMissing(receiver, args, block, mid);
    }

    //method call with *one* argument and no block (use the other one if no arg (arg == null)!)
    //This make code (especially reverse engineered ones) more readable.
    public static RubyValue callOneArgMethod(RubyValue receiver, RubyValue arg, RubyBlock block, RubyID mid) {
        assert(null != arg);
        RubyMethod m = receiver.findMethod(mid);
        if (null != m && !UndefMethod.isUndef(m)) {
            return invokeMethod(m, mid, receiver, arg, null, block);
        }

        return callMethodMissing(receiver, new RubyArray(arg), block, mid);
    }

    //method call with *one* argument and no block (use the other one if no arg (arg == null)!)
    //This make code (especially reverse engineered ones) more readable.
    public static RubyValue callPublicOneArgMethod(RubyValue receiver, RubyValue arg, RubyBlock block, RubyID mid) {
        assert(null != arg);
        RubyMethod m = receiver.findPublicMethod(mid);
        if (null != m && !UndefMethod.isUndef(m)) {
            return invokeMethod(m, mid, receiver, arg, null, block);
        }

        return callMethodMissing(receiver, new RubyArray(arg), block, mid);
    }

    //TODO should pass owner to work with protected method
    public static RubyValue callPublicMethod(RubyValue receiver, RubyArray args, RubyBlock block, RubyID mid) {
        assert(null == args || args.size() > 1);//use callPublicOneArgMethod if has only one arg
        RubyMethod m = receiver.findPublicMethod(mid);
        if (null != m && !UndefMethod.isUndef(m)) {
            return invokeMethod(m, mid, receiver, null, args, block);
        }

        return callMethodMissing(receiver, args, block, mid);
    }

    public static RubyValue callSuperOneArgMethod(RubyValue receiver, RubyValue arg, RubyBlock block, RubyID mid, RubyMethod current_method) {
        assert(null != arg);
        RubyClass c = (RubyClass) current_method.getOwner();
        RubyMethod m = c.findSuperMethod(mid);
        if (null == m || UndefMethod.isUndef(m)) {
            throw new RubyException(RubyRuntime.NoMethodErrorClass, "super method '" + StringMap.id2name(mid) + "' can not be found in '" + c.getName() + "'");
        }

        return invokeMethod(m, mid, receiver, arg, null, block);
    }

    public static RubyValue callSuperMethod(RubyValue receiver, RubyArray args, RubyBlock block, RubyID mid, RubyMethod current_method) {
        assert(null == args || args.size() > 1);//use callSuperOneArgMethod if has only one arg
        RubyClass c = (RubyClass) current_method.getOwner();
        RubyMethod m = c.findSuperMethod(mid);
        if (null == m || UndefMethod.isUndef(m)) {
            throw new RubyException(RubyRuntime.NoMethodErrorClass, "super method '" + StringMap.id2name(mid) + "' can not be found in '" + c.getName() + "'");
        }

        return invokeMethod(m, mid, receiver, null, args, block);
    }

    private static RubyValue invokeMethod(RubyMethod m, RubyID mid, RubyValue receiver, RubyValue arg, RubyArray args, RubyBlock block) {
        //FrameManager.pushRecord(method_name);
        RubyValue v = m.invoke(receiver, arg, args, block);
        //FrameManager.popRecord();
        return v;
    }

    public static RubyValue operatorNot(RubyValue value) {
        if (testTrueFalse(value)) {
            return ObjectFactory.FALSE_VALUE;
        } else {
            return ObjectFactory.TRUE_VALUE;
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
                    output.append((char) c);
                }
            }
            stderr.close();

            BufferedReader stdout = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((c = stdout.read()) != -1) {
                if (c != '\r') {
                    output.append((char) c);
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
        }

        return a;
    }

    public static RubyValue expandArrayIfThereIsZeroOrOneValue(RubyValue v) {
        if (v instanceof RubyArray) {
            RubyArray a = (RubyArray) v;
            if (a.isSingleAsterisk()) {
                return expandArrayIfThereIsZeroOrOneValue(a);
            }
        }

        return v;
    }

    public static RubyArray expandArrayIfThereIsOnlyOneRubyArray(RubyArray a) {
        if (a.size() == 1 &&
                a.isSingleRhs() &&
                a.get(0) instanceof RubyArray) {
            return (RubyArray) a.get(0);
        }

        return a;
    }

    public static RubyValue expandArrayIfThereIsOnlyOneRubyArray(RubyValue v) {
        if (v instanceof RubyArray) {
            RubyArray a = (RubyArray)v;
            if (a.size() == 1 && a.isSingleRhs()) {
                return a.get(0);
            }
        }

        return v;
    }

    public static RubyArray convertToArrayIfNotYet(RubyValue v) {
        if (v instanceof RubyArray) {
            return (RubyArray) v;
        }

        return new RubyArray(v);
    }

    public static RubyBlock convertRubyValue2RubyBlock(RubyValue v) {
        if (ObjectFactory.NIL_VALUE == v) {
            return null;
        } else if (v instanceof RubyMethodValue) {
            return ((RubyMethodValue) v).convertToRubyProc().getBlock();
        } else if (v instanceof RubyProc) {
            return ((RubyProc) v).getBlock();
        } else {
            throw new RubyException(RubyRuntime.TypeErrorClass, "wrong argument type " + v.getRubyClass().getName() + " (expected Proc) ");
        }
    }

    public static RubyValue convertRubyException2RubyValue(RubyException e) {
        return e.getRubyValue();
    }

    public static RubyValue setTopLevelConstant(RubyValue value, String name) {
        return RubyRuntime.ObjectClass.setConstant(name, value);
    }

    public static RubyValue getCurrentNamespaceConstant(RubyModule receiver, String name) {
        RubyValue v = receiver.getConstant(name);
        if (null != v) {
            return v;
        }

        v = RubyRuntime.ObjectClass.getConstant(name);
        if (null == v) {
            throwUninitializedConstant(receiver, name);
        }

        return v;
    }

    public static RubyValue isDefinedCurrentNamespaceConstant(RubyValue receiver, String name) {
        RubyValue v = ((RubyModule) receiver).getConstant(name);
        if (null == v) {
            return ObjectFactory.NIL_VALUE;
        }

        return ObjectFactory.createString("constant");
    }

    public static RubyValue getConstant(RubyValue receiver, String name) {
        throwTypeErrorIfNotClassModule(receiver);

        RubyModule m = (RubyModule) receiver;
        RubyValue v = m.getConstant(name);
        if (null == v) {
            throwUninitializedConstant(m, name);
        }

        return v;
    }

    private static void throwUninitializedConstant(RubyModule m, String name) {
        RubyString str = ObjectFactory.createString();
        if (m != RubyRuntime.ObjectClass) {
            m.to_s(str);
            if (str.length() > 0) {
                str.appendString("::");
            }
        }
        str.appendString(name);
        throw new RubyException(RubyRuntime.NameErrorClass, "uninitialized constant " + str.toString());
    }

    public static RubyValue setConstant(RubyValue value, RubyValue receiver, String name) {
        throwTypeErrorIfNotClassModule(receiver);

        return ((RubyModule) receiver).setConstant(name, value);
    }

    private static void throwTypeErrorIfNotClassModule(RubyValue receiver) {
        if (!(receiver instanceof RubyClass) &&
                !(receiver instanceof RubyModule)) {
            RubyValue v = RubyAPI.callPublicMethod(receiver, null, null, CommonRubyID.toSID);
            String s = v.toString();
            throw new RubyException(RubyRuntime.TypeErrorClass, s + " is not a class/module");
        }
    }

    public static void callArraySet(RubyValue value, RubyValue index, RubyValue receiver) {
        RubyArray args = new RubyArray(index, value);
        callPublicMethod(receiver, args, null, StringMap.intern("[]="));
    }
}
