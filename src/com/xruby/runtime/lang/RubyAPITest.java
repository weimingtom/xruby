/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import junit.framework.TestCase;
import com.xruby.runtime.value.*;

public class RubyAPITest extends TestCase {
	public void test_testTrueFalse() {
		assertTrue(RubyAPI.testTrueFalse(ObjectFactory.trueValue));
		assertFalse(RubyAPI.testTrueFalse(ObjectFactory.falseValue));
		assertFalse(RubyAPI.testTrueFalse(ObjectFactory.nilValue));
		assertTrue(RubyAPI.testTrueFalse(ObjectFactory.fixnum0));
		assertTrue(RubyAPI.testTrueFalse(ObjectFactory.fixnum1));
		assertTrue(RubyAPI.testTrueFalse(ObjectFactory.createString("")));
		assertTrue(RubyAPI.testTrueFalse(ObjectFactory.createString("XXX")));
	}
	
	public void test_testCaseEqual() {
		assertTrue(RubyAPI.testCaseEqual(ObjectFactory.trueValue, ObjectFactory.trueValue));
		assertTrue(RubyAPI.testCaseEqual(ObjectFactory.falseValue, ObjectFactory.falseValue));
		assertFalse(RubyAPI.testCaseEqual(ObjectFactory.trueValue, ObjectFactory.falseValue));
		assertTrue(RubyAPI.testCaseEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(88)));
		assertFalse(RubyAPI.testCaseEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(89)));
	}

	public void test_isKindOf() {
		assertTrue(RubyAPI.isKindOf(RubyRuntime.TrueClassClass, ObjectFactory.trueValue));
		assertTrue(RubyAPI.isKindOf(RubyRuntime.ObjectClass, ObjectFactory.trueValue));
		assertTrue(RubyAPI.isKindOf(RubyRuntime.FalseClassClass, ObjectFactory.falseValue));
		assertFalse(RubyAPI.isKindOf(RubyRuntime.FalseClassClass, ObjectFactory.trueValue));
		assertTrue(RubyAPI.isKindOf(RubyRuntime.FixnumClass, ObjectFactory.createFixnum(88)));
		assertFalse(RubyAPI.isKindOf(RubyRuntime.FloatClass, ObjectFactory.createFixnum(88)));
	}

	public void test_testExceptionType() {
		assertTrue(RubyAPI.testExceptionType(new RubyArray(RubyRuntime.StandardErrorClass), new RubyException(RubyRuntime.ArgumentErrorClass, "")));
		assertFalse(RubyAPI.testExceptionType(new RubyArray(RubyRuntime.RuntimeErrorClass), new RubyException(RubyRuntime.ArgumentErrorClass, "")));
	}

}
