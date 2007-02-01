/**
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.javasupport;

import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyBignum;
import com.xruby.runtime.value.RubyData;
import com.xruby.runtime.value.RubyFixnum;
import com.xruby.runtime.value.RubyString;

/**
 * Helper class for Java Runtime
 *
 * @author yu su (beanworms@gmail.com)
 */
public class JavaUtil {
    public static final String RCLASS_STRING = "String";
    private static final String RCLASS_FIXNUM = "Fixnum";
    private static final String RCLASS_BIGNUM = "Bignum";

    public static RubyValue convertToRubyValue(Object value) {
        if (null == value) {
            return ObjectFactory.nilValue;
        }

        if (value.getClass().equals(Integer.class)) {
            return ObjectFactory.createFixnum((Integer) value);
        }

        // TODO: Maybe we should modify createFixnum to make support this data type
        if (value.getClass().equals(Long.class)) {
            return ObjectFactory.createFloat((Long) value);
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
            return ((RubyString) value).toString();
        } else if (className.equals(RCLASS_FIXNUM)) {
            return ((RubyFixnum) value).intValue();
        } else if (className.equals(RCLASS_BIGNUM)) {
            return ((RubyBignum) value).getInternal();
        }

        return ((RubyData<Object>) value).getData();

    }
}

