/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.builtin.ObjectFactory;
import com.xruby.runtime.builtin.RubyArray;

import junit.framework.TestCase;

public class RubyAPITest extends TestCase {
    public void test_testCaseEqual() {
        assertTrue(RubyAPI.testCaseEqual(RubyConstant.QTRUE, RubyConstant.QTRUE));
        assertTrue(RubyAPI.testCaseEqual(RubyConstant.QFALSE, RubyConstant.QFALSE));
        assertFalse(RubyAPI.testCaseEqual(RubyConstant.QTRUE, RubyConstant.QFALSE));
        assertTrue(RubyAPI.testCaseEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(88)));
        assertFalse(RubyAPI.testCaseEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(89)));
    }

    public void test_isKindOf() {
        assertTrue(RubyAPI.isKindOf(RubyRuntime.TrueClassClass, RubyConstant.QTRUE));
        assertTrue(RubyAPI.isKindOf(RubyRuntime.ObjectClass, RubyConstant.QTRUE));
        assertTrue(RubyAPI.isKindOf(RubyRuntime.FalseClassClass, RubyConstant.QFALSE));
        assertFalse(RubyAPI.isKindOf(RubyRuntime.FalseClassClass, RubyConstant.QTRUE));
        assertTrue(RubyAPI.isKindOf(RubyRuntime.FixnumClass, ObjectFactory.createFixnum(88)));
        assertFalse(RubyAPI.isKindOf(RubyRuntime.FloatClass, ObjectFactory.createFixnum(88)));
        assertTrue(RubyAPI.isKindOf(RubyRuntime.KernelModule, RubyRuntime.ObjectClass));
    }

    public void test_testExceptionType() {
        assertTrue(RubyAPI.testExceptionType(new RubyArray(RubyRuntime.StandardErrorClass), new RubyException(RubyRuntime.ArgumentErrorClass, "")));
        assertFalse(RubyAPI.testExceptionType(new RubyArray(RubyRuntime.RuntimeErrorClass), new RubyException(RubyRuntime.ArgumentErrorClass, "")));
    }

}
