/** 
 * Copyright 2006-2007 Yu Su, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.javasupport;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyVarArgMethod;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyData;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Java Method Wrapper for both public method and constructor
 *
 * @author yu su (beanworms@gmail.com)
 */
public class JavaMethod extends RubyVarArgMethod {
    private Method method;
    private Constructor constructor;
    private boolean isConstructor;

    /**
     * Public method
     *
     *  @param method method instance
     */
    public JavaMethod(Method method) {
        this.method = method;
    }

    /**
     *  Public constructor
     *  @param constructor Constructor instance
     */
    public JavaMethod(Constructor constructor) {
        this.constructor = constructor;
        this.isConstructor = true;
    }

    @SuppressWarnings("unchecked")
	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        Object[] arguments = JavaUtil.convertToJavaValues(args);

        try {
            if(!isConstructor) {
                Object object = ((RubyData<Object>)receiver).getData();
                Object retValue = method.invoke(object, arguments);

                return JavaUtil.convertToRubyValue(retValue);
            }
            else {
                Object instance = constructor.newInstance(arguments);
                RubyData<Object> value = new RubyJavaObject<Object>((JavaClass) receiver, instance);
                return value;
            }
        } catch (Exception e) {          // IllegalAccessException and InvocationTargetException
            throw new RubyException(e.getMessage());
        }
    }
}