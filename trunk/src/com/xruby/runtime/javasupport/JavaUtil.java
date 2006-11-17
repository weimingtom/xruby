package com.xruby.runtime.javasupport;

import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyBignum;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyClass;

/**
 * Helper class for Java Runtime
 *
 *  @author yu su (beanworms@gmail.com)
 */
public class JavaUtil {
    public static final String RCLASS_STRING = "String";
    private static final String RCLASS_FIXNUM = "Fixnum";
    private static final String RCLASS_BIGNUM = "Bignum";

    public static RubyValue convertToRubyValue(Object value) {
        if(null == value) {
            return ObjectFactory.nilValue;
        }

        if(value.getClass().equals(Integer.class)) {
            return ObjectFactory.createFixnum((Integer)value);
        }

        return null;
    }

    public static RubyArray convertToRubyValues(Object[] value) {
        return null;  
    }

    public static Object convertToJavaValue(RubyValue value) {
        RubyClass clazz = value.getRubyClass();
        String className = clazz.getName();

        if(isBuiltin(className)) {
            return convertToJavaValue(className, value);   
        }
        else {
            return value.getValue();
        }
    }

    public static Object[] convertToJavaValues(RubyArray array) {
        if(null == array) {
            return new Object[0];
        }

        int size = array.size();
        Object[] retValues = new Object[size];
        for (int i = 0; i < size; ++ i) {
            RubyValue value = array.get(i);
            Object obj = convertToJavaValue(value);
            retValues[i] = obj;
        }

        return retValues;
    }

    private static boolean isBuiltin(String name) {
        return name.equals("Object") ||
                name.equals("NilClass") ||
                name.equals("TrueClass") ||
                name.equals("FalseClass") ||
                name.equals("Numeric") ||
                name.equals("Integer") ||
                name.equals("Fixnum") ||
                name.equals("Float") ||
                name.equals("String") ||
                name.equals("Exception") ||
                name.equals("RuntimeError") ||
                name.equals("Array") ||
                name.equals("Hash") ||
                name.equals("Class") ||
                name.equals("Module") ||
                name.equals("IO") ||
                name.equals("Proc") ||
                name.equals("Range") ||
                name.equals("Regexp") ||
                name.equals("File") ||
                name.equals("Method") ||
                name.equals("Time") ||
                name.equals("MatchDate") ||
                name.equals("Bignum") ||
                name.equals("Dir");
    }

    private static Object convertToJavaValue(String className, RubyValue value) {
        if (className.equals(RCLASS_STRING)) {
            return value.getValue().toString();
        }
        else if (className.equals(RCLASS_FIXNUM)) {
            return ((RubyFixnum)value.getValue()).intValue();
        }
        else if (className.equals(RCLASS_BIGNUM)) {
            return ((RubyBignum)value.getValue()).getValue();
        }

        return value.getValue();

    }
}

