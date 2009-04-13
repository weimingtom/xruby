/**
 * Copyright 2007 Ye Zheng
 * Distributed under the Apache License
 */

package com.xruby.runtime.lang.util;

import com.xruby.runtime.builtin.ObjectFactory;
import com.xruby.runtime.builtin.RubyArray;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyMethod;
import com.xruby.runtime.lang.RubyNoArgBlock;
import com.xruby.runtime.lang.RubyValue;

import junit.framework.TestCase;

public class MethodFactoryTest extends TestCase {
    private MethodFactory f;

    protected void setUp() throws Exception {
        this.f = MethodFactory.createMethodFactory(RubyTestValue.class);
    }

    protected void tearDown() throws Exception {
        this.f = null;
    }

    public void testNoArgMethod() {
        RubyMethod m = f.getMethod("noArgMethod", MethodType.NO_ARG);
        RubyTestValue v = new RubyTestValue();
        RubyValue result = m.invoke(v, null);
        assertEquals(RubyConstant.QNIL, result);
    }

    public void testOneArgMethod() {
        RubyMethod m = f.getMethod("oneArgMethod", MethodType.ONE_ARG);
        RubyTestValue v = new RubyTestValue();
        RubyValue result = m.invoke(v, v, null);
        assertEquals(v, result);
    }

    public void testNoArgMethodWithBlock() {
        RubyMethod m = f.getMethodWithBlock("noArgMethod", MethodType.NO_ARG);
        RubyTestValue v = new RubyTestValue();
        RubyValue result = m.invoke(v, new RubyTestBlock());
        assertEquals(RubyConstant.QNIL, result);
    }

    public void testOneArgMethodWithBlock() {
        RubyMethod m = f.getMethodWithBlock("oneArgMethod", MethodType.ONE_ARG);
        RubyTestValue v = new RubyTestValue();
        RubyValue result = m.invoke(v, v, new RubyTestBlock());
        assertEquals(v, result);
    }

    public void testVarArgMethod() {
        RubyMethod m = f.getMethod("varArgMethod", MethodType.VAR_ARG);
        RubyTestValue v = new RubyTestValue();
        RubyArray a = ObjectFactory.createArray(1, v);
        RubyValue result = m.invoke(v, a, null);
        assertEquals(v, result);
    }

    public void testVarArgMethodWithBlock() {
        RubyMethod m = f.getMethodWithBlock("varArgMethod", MethodType.VAR_ARG);
        RubyTestValue v = new RubyTestValue();
        RubyArray a = ObjectFactory.createArray(1, v);
        RubyValue result = m.invoke(v, a, null);
        assertEquals(v, result);
    }

    public void testTryLoadMethodTwice() {
        RubyMethod m0 = f.getMethod("loadTwiceMethod", MethodType.NO_ARG);
        RubyMethod m1 = f.getMethod("loadTwiceMethod", MethodType.NO_ARG);
        assertNotSame(m0, m1);
    }

    public void testNoOrOneArgMethod() {
        RubyMethod m = f.getMethod("noOrOneArg", MethodType.NO_OR_ONE_ARG);
        RubyTestValue v = new RubyTestValue();
        RubyValue noArgResult = m.invoke(v, null);
        assertEquals(RubyConstant.QNIL, noArgResult);
        RubyValue oneArgResult = m.invoke(v, v, null);
        assertEquals(v, oneArgResult);
    }
    
    public void testTwoArgMethod() {
    	RubyMethod m = f.getMethod("twoArgMethod", MethodType.TWO_ARG);
    	RubyTestValue v0 = new RubyTestValue();
    	RubyTestValue v1 = new RubyTestValue();
    	RubyValue twoArgResult = m.invoke(v0, v0, v1, null);
    	assertEquals(v1, twoArgResult);
    }
    
    public void testOneOrTwoArgMethod() {
    	RubyMethod m = f.getMethod("oneOrTwoArg", MethodType.ONE_OR_TWO_ARG);
    	RubyTestValue v0 = new RubyTestValue();
    	RubyValue oneArgResult = m.invoke(v0, v0, null);
    	assertEquals(v0, oneArgResult);
    	
    	RubyTestValue v1 = new RubyTestValue();
    	RubyValue twoArgResult = m.invoke(v0, v0, v1, null);
    	assertEquals(v1, twoArgResult);
    }
    
    public void testSingletonMethod() {
    	RubyMethod m = f.getSingletonMethod("singleton", MethodType.NO_ARG);
    	RubyTestValue v = new RubyTestValue();
    	RubyValue result = m.invoke(v, null);
    	assertEquals(RubyConstant.QNIL, result);
    }
    
    public static class RubyTestValue extends RubyValue {
        public RubyClass getRubyClass() {
            return null;
        }

        public void setRubyClass(RubyClass klass) {
        }

        public RubyValue noArgMethod() {
            return RubyConstant.QNIL;
        }

        public RubyTestValue oneArgMethod(RubyValue v) {
            return (RubyTestValue)v;
        }

        public RubyValue noArgMethod(RubyBlock block) {
            return RubyConstant.QNIL;
        }

        public RubyValue oneArgMethod(RubyValue v, RubyBlock block) {
            return v;
        }

        public RubyValue varArgMethod(RubyArray a) {
            return a.get(0);
        }

        public RubyValue varArgMethod(RubyArray a, RubyBlock block) {
            return a.get(0);
        }

        public RubyValue loadTwiceMethod() {
            return RubyConstant.QNIL;
        }

        public RubyValue noOrOneArg() {
            return RubyConstant.QNIL;
        }

        public RubyValue noOrOneArg(RubyValue v) {
            return v;
        }
        
        public RubyValue twoArgMethod(RubyValue value0, RubyValue value1) {
        	return value1;
        }
        
        public RubyValue oneOrTwoArg(RubyValue v) {
        	return v;
        }
        
        public RubyValue oneOrTwoArg(RubyValue v0, RubyValue v1) {
        	return v1;
        }
        
        public static RubyValue singleton(RubyValue receiver) {
        	return RubyConstant.QNIL;
        }
    }

    private static class RubyTestBlock extends RubyNoArgBlock {
        public RubyTestBlock() {
            super(null, null, null, null, null, null, false);
        }

        protected RubyValue run(RubyValue receiver) {
            return receiver;
        }
    }
}
