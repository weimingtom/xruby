/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import junit.framework.TestCase;
import com.xruby.runtime.value.*;

public class RubyRuntimeTest extends TestCase {
	public void test_testTrueFalse() {
		assertTrue(RubyAPI.testTrueFalse(ObjectFactory.trueValue));
		assertFalse(RubyAPI.testTrueFalse(ObjectFactory.falseValue));
		assertFalse(RubyAPI.testTrueFalse(ObjectFactory.nilValue));
		assertTrue(RubyAPI.testTrueFalse(ObjectFactory.createFixnum(0)));
		assertTrue(RubyAPI.testTrueFalse(ObjectFactory.createFixnum(1)));
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
		assertTrue(RubyAPI.isKindOf(ObjectFactory.createClass(RubyRuntime.TrueClassClass), ObjectFactory.trueValue));
		assertTrue(RubyAPI.isKindOf(ObjectFactory.createClass(RubyRuntime.ObjectClass), ObjectFactory.trueValue));
		assertTrue(RubyAPI.isKindOf(ObjectFactory.createClass(RubyRuntime.FalseClassClass), ObjectFactory.falseValue));
		assertFalse(RubyAPI.isKindOf(ObjectFactory.createClass(RubyRuntime.FalseClassClass), ObjectFactory.trueValue));
		assertTrue(RubyAPI.isKindOf(ObjectFactory.createClass(RubyRuntime.FixnumClass), ObjectFactory.createFixnum(88)));
		assertFalse(RubyAPI.isKindOf(ObjectFactory.createClass(RubyRuntime.FloatClass), ObjectFactory.createFixnum(88)));
	}

}
