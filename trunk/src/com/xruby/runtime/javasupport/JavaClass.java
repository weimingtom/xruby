/**
 * Copyright 2006-2007 Yu Su
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.javasupport;

import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.value.RubyArray;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Wrapper for Java Class
 *
 * @author Yu Su (beanworms@gmail.com)
 */
public class JavaClass extends RubyClass {

    // --------- Const fields ---------
    
    private static final String INIT_METHOD = "initialize";
    private static final String NEW_METHOD = "new";

    // ----- end of const fields ------

    // ----- Cache of methods (and constructors) --------
    private Map<String, List<Method>> methodMap
            = new HashMap<String, List<Method>>();

    private Map<Integer, List<Constructor>> initMap
            = new HashMap<Integer, List<Constructor>>();

    private Map<Method, JavaMethod> javaMethods
            = new HashMap<Method, JavaMethod>();

    private Map<Constructor, JavaMethod> initMethods
            = new HashMap<Constructor, JavaMethod>();
    // --------- End of cache ---------

    
    // Actual constructor
    private JavaClass(String name) {
        super(name, RubyRuntime.ObjectClass, RubyRuntime.GlobalScope);
    }

    /**
     * Constructor
     *
     * @param clazz Class instance
     */
    public JavaClass(Class clazz) {
        this(clazz.getName());

        // Initialize public constructors and methods
        initConstructors(clazz);
        initMethods(clazz);
    }

    // Collect public methods of given class
    private void initMethods(Class clazz) {
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                categoryByName(method);
            }
        }
    }

    // Collect public constructors of given class
    private void initConstructors(Class clazz) {
        Constructor[] constructors = clazz.getConstructors();

        for (Constructor constructor : constructors) {
            int modifiers = constructor.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                categoryByParams(constructor);
            }
        }
    }

    // Helper class, catalogue the method
    private void categoryByName(Method method) {
        String name = method.getName();

        List<Method> list = methodMap.get(name);
        if (null == list) {
            list = new ArrayList<Method>();
            list.add(method);
            methodMap.put(name, list);
        } else {
            list.add(method);
        }
    }

    private void categoryByParams(Constructor constructor) {
        Class[] types = constructor.getParameterTypes();
        int size = types.length;
        List<Constructor> list = initMap.get(size);

        if (null == list) {
            list = new ArrayList<Constructor>();
            list.add(constructor);
            initMap.put(size, list);
        } else {
            list.add(constructor);
        }

    }

    /**
     * Find method according to given method, if it's "new"
     * return an "init" fake method
     *
     * @param methodName Name of the method
     * @return wrapper of the method, otherwise null
     */
    public RubyMethod findPublicMethod(String methodName) {
        if (methodName.equals(NEW_METHOD)) {
            return new FakeInitMethod();
        }

        if (methodMap.containsKey(methodName)) {
            return new FakeMethod(methodName);
        }

        return null;
    }

    /**
     * In JavaClass, it's just an alias for findPublicMethod
     *
     * @param methodName method's name
     * @return Method instance
     */
    public RubyMethod findMethod(String methodName) {
        return findPublicMethod(methodName);
    }

    /**
     * This is the actual method which will be invoked
     *
     * @param name method's name
     * @return method instance
     */
    protected RubyMethod findOwnPublicMethod(String name) {
        return findPublicMethod(name);
    }

    JavaMethod getJavaMethod(Method method) {
        JavaMethod jMethod = javaMethods.get(method);

        if (null == jMethod) {
            jMethod = new JavaMethod(method);
            javaMethods.put(method, jMethod);
        }

        return jMethod;
    }


    // TODO: InComplete, method cache is required(indexed by params' number)
    JavaMethod findJavaMethod(String methodName, RubyArray args) {
        int size = args == null ? 0 : args.size();
        List<Method> list = methodMap.get(methodName);
        if (null == list) {
            return null;
        }

        if (list.size() == 1) {
            Method method = list.get(0);
            Class[] params = method.getParameterTypes();
            if (size != params.length) {
                throw new RubyException("Illegal arguments");
            }

            return getJavaMethod(method);
        } else {
            List<Method> tmpList = new ArrayList<Method>();
            for (Method method : list) {
                if (method.getParameterTypes().length == size) {
                    tmpList.add(method);
                }
            }
            if (tmpList.size() == 1) {
                return getJavaMethod(tmpList.get(0));
            } else {
                // Go on Analyzing args

                return null;
            }
        }
    }

    JavaMethod getJavaConstructor(Constructor constructor) {
        JavaMethod jMethod = initMethods.get(constructor);

        if (null == jMethod) {
            jMethod = new JavaMethod(constructor);
            initMethods.put(constructor, jMethod);
        }

        return jMethod;
    }

    // TODO: InComplete
    JavaMethod findInitMethod(RubyArray args) {
        int size = args == null ? 0 : args.size();
        List<Constructor> list = initMap.get(size);

        if (null == list) {
            return null;
        }

        if (list.size() == 1) {
            Constructor constructor = list.get(0);
            return getJavaConstructor(constructor);
        } else {
            return null;
        }
    }

    private class FakeMethod extends RubyMethod {
        private String methodName;

        public FakeMethod(String methodName) {
            super(-1);

            this.methodName = methodName;
        }

        protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
            JavaClass clazz = (JavaClass) receiver.getRubyClass();
            JavaMethod method = clazz.findJavaMethod(methodName, args);

            if (null == method) {
                throw new RubyException("Signature of method " + methodName + " is illegal");
            }

            return method.run(receiver, args, block);
        }
    }

    private class FakeInitMethod extends RubyMethod {

        public FakeInitMethod() {
            super(-1);
        }

        protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
            JavaClass clazz = (JavaClass) receiver;
            JavaMethod method = clazz.findInitMethod(args);

            if (null == method) {
                throw new RubyException("Signature is illegal");
            }

            return method.run(receiver, args, block);
        }
    }
}



