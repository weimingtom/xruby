/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import junit.framework.TestCase;
import com.xruby.runtime.value.*;

public class RubyRuntimeTest extends TestCase {
	public void test_testTrueFalse() {
		assertTrue(RubyRuntime.testTrueFalse(ObjectFactory.trueValue));
		assertFalse(RubyRuntime.testTrueFalse(ObjectFactory.falseValue));
		assertFalse(RubyRuntime.testTrueFalse(ObjectFactory.nilValue));
		assertTrue(RubyRuntime.testTrueFalse(ObjectFactory.createFixnum(0)));
		assertTrue(RubyRuntime.testTrueFalse(ObjectFactory.createFixnum(1)));
		assertTrue(RubyRuntime.testTrueFalse(ObjectFactory.createString("")));
		assertTrue(RubyRuntime.testTrueFalse(ObjectFactory.createString("XXX")));
	}
	
	public void test_testCaseEqual() throws RubyException {
		assertTrue(RubyRuntime.testCaseEqual(ObjectFactory.trueValue, ObjectFactory.trueValue));
		assertTrue(RubyRuntime.testCaseEqual(ObjectFactory.falseValue, ObjectFactory.falseValue));
		assertFalse(RubyRuntime.testCaseEqual(ObjectFactory.trueValue, ObjectFactory.falseValue));
		assertTrue(RubyRuntime.testCaseEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(88)));
		assertFalse(RubyRuntime.testCaseEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(89)));
	}

	public void test_isKindOf() {
		assertTrue(RubyRuntime.isKindOf(ObjectFactory.createClass(RubyRuntime.TrueClassClass), ObjectFactory.trueValue));
		assertTrue(RubyRuntime.isKindOf(ObjectFactory.createClass(RubyRuntime.ObjectClass), ObjectFactory.trueValue));
		assertTrue(RubyRuntime.isKindOf(ObjectFactory.createClass(RubyRuntime.FalseClassClass), ObjectFactory.falseValue));
		assertFalse(RubyRuntime.isKindOf(ObjectFactory.createClass(RubyRuntime.FalseClassClass), ObjectFactory.trueValue));
		assertTrue(RubyRuntime.isKindOf(ObjectFactory.createClass(RubyRuntime.FixnumClass), ObjectFactory.createFixnum(88)));
		assertFalse(RubyRuntime.isKindOf(ObjectFactory.createClass(RubyRuntime.FloatClass), ObjectFactory.createFixnum(88)));
	}

}
