/**
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.javasupport;

import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyException;

import com.xruby.runtime.value.*;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.util.List;

/**
 * Helper class for Java Runtime
 *
 * @author yu su (beanworms@gmail.com)
 */
public class JavaUtil {
    private static final String RCLASS_STRING = "String";
    private static final String RCLASS_FIXNUM = "Fixnum";
    private static final String RCLASS_BIGNUM = "Bignum";
    private static final String RCLASS_TRUE   = "TrueClass";
    private static final String RCLASS_FALSE  = "FalseClass";
    private static final String RCLASS_NIL    = "NilClass";

    // Need special manipulation
    private static final String RCLASS_REGEXP = "Regexp";
    private static final String RCLASS_SYMBOL = "Symbol";
    private static final String RCLASS_EXCEPTION = "Exception";

    public static RubyValue convertToRubyValue(Object value) {
        if (null == value) {
            return ObjectFactory.nilValue;
        }

        if (value.getClass().equals(Integer.class)) {
            return ObjectFactory.createFixnum((Integer) value);
        }
        
        if (value.getClass().equals(Double.class)) {
            return ObjectFactory.createFloat((Double)value);
        }

        if (value.getClass().equals(Float.class)) {
            return ObjectFactory.createFloat((Float)value);
        }

        if (value.getClass().equals(Boolean.class)) {
            if (value.equals(true)) {
                return ObjectFactory.trueValue;
            } else {
                return ObjectFactory.falseValue;
            }
        }

        // TODO: Support more data types: Hash, Array, File etc.

        return null;
    }

    public static RubyArray convertToRubyValues(Object[] value) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public static Object convertToJavaValue(RubyValue value) {
        RubyClass clazz = value.getRubyClass();
        String className = clazz.getName();

        if (RubyRuntime.isBuiltinClass(className)) {
            return convertToJavaValue(className, value);
        } else {
            return ((RubyData<Object>) value).getData();
        }
    }

    public static Object[] convertToJavaValues(RubyArray array) {
        if (null == array) {
            return new Object[0];
        }

        int size = array.size();
        Object[] retValues = new Object[size];
        for (int i = 0; i < size; ++i) {
            RubyValue value = array.get(i);
            Object obj = convertToJavaValue(value);
            retValues[i] = obj;
        }

        return retValues;
    }

    @SuppressWarnings("unchecked")
	private static Object convertToJavaValue(String className, RubyValue value) {
        if (className.equals(RCLASS_STRING)) {
            return ((RubyString)value).toString();
        }
        else if (className.equals(RCLASS_FIXNUM)) {
            return ((RubyFixnum)value).intValue();
        }
        else if (className.equals(RCLASS_BIGNUM)) {
            return ((RubyBignum)value).getInternal();
        }
        else if(className.equals(RCLASS_TRUE)) {
            return true;
        }
        else if(className.equals(RCLASS_FALSE)) {
            return false;
        }
        else if(className.equals(RCLASS_NIL)) {
            return null;
        }
        else if(className.equals(RCLASS_SYMBOL)) {
            return ((RubySymbol)value).toString();
        }
        else if(className.equals(RCLASS_EXCEPTION)) {
            return new Exception(value.toString());
        }
        else if(className.equals(RCLASS_REGEXP)) {
            // TODO:Convert to Java's regular expression
        }


        throw new IllegalArgumentException("Ruby type " + className +
                " couldn't be passed to java method");
    }

    private static String[] collectTypes(RubyArray args) {
        String[] tmp = new String[50];
        int i = 0;

        for(RubyValue value: args) {
            String className = value.getRubyClass().getName();
            tmp[i] = className;
            ++ i;
        }

        String[] types = new String[i];
        System.arraycopy(tmp, 0, types, 0, i);

        return types;
    }

    private static boolean matchNativeTye(String type, Class clazz) {
        if(type.equals("String")) {
            if(clazz.equals(String.class)) {
                return true;
            }
        }

        return false;
    }

    public static Method matchMethod(List<Method> methods, RubyArray args) {
        String[] types = collectTypes(args);

        for(Method method: methods) {
            for(String type: types) {

            }

            return method;
        }

        throw new RubyException("Couldn't find method ");
    }

    public static Constructor matchInitMethod(List<Constructor> methods, RubyArray args) {
        String[] types = collectTypes(args);

        for (Constructor method : methods) {
            Class[] params = method.getParameterTypes();
            boolean match = true;

            for (int i = 0; i < types.length && match; i++) {
                if (!matchNativeTye(types[i], params[i])) {
                    match = false;
                }
            }

            if(match)  {
                return method;
            }
        }

        throw new RubyException("Couldn't find method ");
    }
}

