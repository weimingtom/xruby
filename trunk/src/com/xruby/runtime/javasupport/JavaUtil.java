/**
 * Copyright 2006-2007 Yu Su, Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.javasupport;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;

import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubySymbol;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyBignum;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyFloat;
import com.xruby.runtime.value.RubyString;

/**
 * Helper class for Java Runtime
 *
 * @author yu su (beanworms@gmail.com), Yu Zhang (zhangyu8374@gmail.com)
 */
public class JavaUtil {

    public static RubyValue convertToRubyValue(Object value) {
        if (null == value) {
            return ObjectFactory.NIL_VALUE;
        }

        if (value.getClass().equals(Integer.class)) {
            return ObjectFactory.createFixnum((Integer) value);
        }

        if (value.getClass().equals(Double.class)) {
            return ObjectFactory.createFloat((Double) value);
        }

        if (value.getClass().equals(Float.class)) {
            return ObjectFactory.createFloat((Float) value);
        }

        if (value.getClass().equals(Boolean.class)) {
            if (value.equals(true)) {
                return ObjectFactory.TRUE_VALUE;
            } else {
                return ObjectFactory.FALSE_VALUE;
            }
        }
        
        if(value.getClass().equals(BigInteger.class)){
            return ObjectFactory.createBignum((BigInteger)value);
        }        
        
        if(value.getClass().equals(String.class)){
            return ObjectFactory.createString((String)value);
        }

        // TODO: Support more data types: Hash, Array, File etc.
        //throw new IllegalArgumentException("Currently the value of Java type " + value.getClass().getName() +
        //" couldn't be changed to Ruby value");
        
        return new RubyJavaObject<Object>(JavaClass.createJavaClass(value.getClass()), value);
    }

    public static RubyArray convertToRubyValues(Object[] value) {
        return null;
    }

    @SuppressWarnings("unchecked")
    public static Object convertToJavaValue(RubyValue value) {
        String className = value.getRubyClass().getName();

        if (className.equals("String")) {
            return ((RubyString) value).toString();
        } else if (className.equals("Fixnum")) {
            return ((RubyFixnum) value).intValue();
        } else if (className.equals("Bignum")) {
            return ((RubyBignum) value).getInternal();
        } else if (className.equals("TrueClass")) {
            return true;
        } else if (className.equals("FalseClass")) {
            return false;
        } else if (className.equals("NilClass")) {
            return null;
        } else if (className.equals("Symbol")) {
            return ((RubySymbol) value).toString();
        } else if (className.equals("Exception")) {
            return new Exception(value.toString());
        } else if (className.equals("Float")) {
            return ((RubyFloat)value).doubleValue();
        } else if (className.equals("Regexp")) {
            // TODO:Convert to Java's regular expression
        }

        if(value instanceof RubyJavaObject){
            return ((RubyJavaObject<Object>) value).getData();
        }else{
            throw new IllegalArgumentException("Ruby type " + className +
                       " couldn't be passed to java method");  
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


    private static String[] collectTypes(RubyArray args) {
        String[] tmp = new String[50];
        int i = 0;

        for (RubyValue value : args) {
            String className = value.getRubyClass().getName();
            tmp[i] = className;
            ++i;
        }

        String[] types = new String[i];
        System.arraycopy(tmp, 0, types, 0, i);

        return types;
    }

    private static boolean matchNativeTye(String type, Class clazz) {
        if (type.equals("String")) {
            if (clazz.equals(String.class)) {
                return true;
            }
        }        
        if(type.equals("Fixnum")) {
            if (clazz.equals(Integer.class)) {
                return true;
            }
        }
        if(type.equals("Bignum")) {
            if (clazz.equals(BigInteger.class)) {
                return true;
            }
        }
        if(type.equals("TrueClass")) {
            if (clazz.equals(Boolean.class)) {
                return true;
            }
        }
        if(type.equals("FalseClass")) {
            if (clazz.equals(Boolean.class)) {
                return true;
            }
        }
        //TODO More type
        return false;
    }

    public static Method matchMethod(List<Method> methods, RubyArray args) {
        String[] types = collectTypes(args);

        for (Method method : methods) {
            for (String type : types) {

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

            if (match) {
                return method;
            }
        }

        throw new RubyException("Couldn't find method ");
    }
}

