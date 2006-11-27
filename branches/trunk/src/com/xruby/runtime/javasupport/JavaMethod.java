package com.xruby.runtime.javasupport;

import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.value.RubyArray;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

/**
 * Java Method Wrapper for both public method and constructor
 *
 * @author yu su (beanworms@gmail.com)
 */
public class JavaMethod extends RubyMethod {
    private Method method;
    private Constructor constructor;
    private boolean isConstructor;

    /**
     * Public method
     *
     *  @param method method instance
     */
    public JavaMethod(Method method) {
        super(-1);

        this.method = method;
    }

    /**
     *  Public constructor
     *  @param constructor Constructor instance
     */
    public JavaMethod(Constructor constructor) {
        super(-1);

        this.constructor = constructor;
        this.isConstructor = true;
    }

    protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
        Object object = receiver.getValue();
        Object[] arguments = JavaUtil.convertToJavaValues(args);

        try {
            if(!isConstructor) {
                Object retValue = method.invoke(object, arguments);

                return JavaUtil.convertToRubyValue(retValue);
            }
            else {
                Object instance = constructor.newInstance(arguments);
                receiver.setValue(instance);
            }
        } catch (Exception e) {          // IllegalAccessException and InvocationTargetException
            throw new RubyException(e.getMessage());
        }

        return null;
    }
}
