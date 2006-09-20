/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import junit.framework.TestCase;
import com.xruby.core.value.*;

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
	
	public void test_testEqual() throws RubyException {
		assertTrue(RubyRuntime.testEqual(ObjectFactory.trueValue, ObjectFactory.trueValue));
		assertTrue(RubyRuntime.testEqual(ObjectFactory.falseValue, ObjectFactory.falseValue));
		assertFalse(RubyRuntime.testEqual(ObjectFactory.trueValue, ObjectFactory.falseValue));
		assertTrue(RubyRuntime.testEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(88)));
		assertFalse(RubyRuntime.testEqual(ObjectFactory.createFixnum(88), ObjectFactory.createFixnum(89)));
	}

	public void test_testInstanceOf() {
		assertTrue(RubyRuntime.testInstanceOf(ObjectFactory.createClass(RubyRuntime.TrueClassClass), ObjectFactory.trueValue));
		assertTrue(RubyRuntime.testInstanceOf(ObjectFactory.createClass(RubyRuntime.ObjectClass), ObjectFactory.trueValue));
		assertTrue(RubyRuntime.testInstanceOf(ObjectFactory.createClass(RubyRuntime.FalseClassClass), ObjectFactory.falseValue));
		assertFalse(RubyRuntime.testInstanceOf(ObjectFactory.createClass(RubyRuntime.FalseClassClass), ObjectFactory.trueValue));
		assertTrue(RubyRuntime.testInstanceOf(ObjectFactory.createClass(RubyRuntime.FixnumClass), ObjectFactory.createFixnum(88)));
		assertFalse(RubyRuntime.testInstanceOf(ObjectFactory.createClass(RubyRuntime.FloatClass), ObjectFactory.createFixnum(88)));
	}

}
