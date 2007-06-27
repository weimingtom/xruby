package com.xruby.runtime.javasupport;

import com.xruby.runtime.value.RubyData;

/**
 * Delegation for all the java objects
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class RubyJavaObject<T> extends RubyData {
    public RubyJavaObject(JavaClass clazz, T obj) {
        super(clazz, obj);
    }
}
