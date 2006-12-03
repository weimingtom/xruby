package com.xruby.runtime.javasupport;

import com.xruby.runtime.value.*;
import com.xruby.runtime.lang.*;

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

    @SuppressWarnings("unchecked")
	public static Object convertToJavaValue(RubyValue value) {
        RubyClass clazz = value.getRubyClass();
        String className = clazz.getName();

        if(RubyRuntime.isBuiltinClass(className)) {
            return convertToJavaValue(className, value);   
        }
        else {
            return ((RubyData<Object>)value).getData();
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

        return ((RubyData<Object>)value).getData();

    }
}

