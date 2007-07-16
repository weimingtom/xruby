/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;
import junit.framework.TestCase;

public class RubyAPITest extends TestCase {
    public void test_testCaseEqual() {
        assertTrue(RubyAPI.testCaseEqual(ObjectFactory.TRUE_VALUE, ObjectFactory.TRUE_VALUE));
        assertTrue(RubyAPI.testCaseEqual(ObjectFactory.FALSE_VALUE, ObjectFactory.FALSE_VALUE));
        assertFalse(RubyAPI.testCaseEqual(ObjectFactory.TRUE_VALUE, ObjectFactory.FALSE_VALUE));
        assertTrue(RubyAPI.testCaseEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(88)));
        assertFalse(RubyAPI.testCaseEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(89)));
    }

    public void test_isKindOf() {
        assertTrue(RubyAPI.isKindOf(RubyRuntime.TrueClassClass, ObjectFactory.TRUE_VALUE));
        assertTrue(RubyAPI.isKindOf(RubyRuntime.ObjectClass, ObjectFactory.TRUE_VALUE));
        assertTrue(RubyAPI.isKindOf(RubyRuntime.FalseClassClass, ObjectFactory.FALSE_VALUE));
        assertFalse(RubyAPI.isKindOf(RubyRuntime.FalseClassClass, ObjectFactory.TRUE_VALUE));
        assertTrue(RubyAPI.isKindOf(RubyRuntime.FixnumClass, ObjectFactory.createFixnum(88)));
        assertFalse(RubyAPI.isKindOf(RubyRuntime.FloatClass, ObjectFactory.createFixnum(88)));
    }

    public void test_testExceptionType() {
        assertTrue(RubyAPI.testExceptionType(new RubyArray(RubyRuntime.StandardErrorClass), new RubyException(RubyRuntime.ArgumentErrorClass, "")));
        assertFalse(RubyAPI.testExceptionType(new RubyArray(RubyRuntime.RuntimeErrorClass), new RubyException(RubyRuntime.ArgumentErrorClass, "")));
    }

}
