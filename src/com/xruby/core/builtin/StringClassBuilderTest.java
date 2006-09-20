/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.builtin;

import junit.framework.TestCase;
import com.xruby.core.lang.*;
import com.xruby.core.value.*;

public class StringClassBuilderTest extends TestCase {
	
	public void test_to_s() throws RubyException {
		RubyValue str = ObjectFactory.createString("abc");
		StringBuilder value = (StringBuilder)str.getValue();
		assertEquals("abc", value.toString());
		RubyMethod m = str.findPublicMethod("to_s");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result == str);
		assertTrue(str.getValue() == result.getValue());
	}
	
	public void test_to_str() throws RubyException {
		RubyValue str = ObjectFactory.createString("abc");
		StringBuilder value = (StringBuilder)str.getValue();
		assertEquals("abc", value.toString());
		RubyMethod m = str.findPublicMethod("to_str");
		RubyValue result = m.invoke(str, null, null);
		assertEquals((Object)str.getValue(), (Object)result.getValue());
	}

	public void test_to_i() throws RubyException {
		RubyValue str = ObjectFactory.createString("1234");
		StringBuilder value = (StringBuilder)str.getValue();
		assertEquals("1234", value.toString());
		RubyMethod m = str.findPublicMethod("to_i");
		RubyValue result = m.invoke(str, null, null);
		Integer result_value = (Integer)result.getValue();
		assertEquals(1234, result_value.intValue());
	}
	
	public void test_to_f() throws RubyException {
		RubyValue str = ObjectFactory.createString("0.1234");
		StringBuilder value = (StringBuilder)str.getValue();
		assertEquals("0.1234", value.toString());
		RubyMethod m = str.findPublicMethod("to_f");
		RubyValue result = m.invoke(str, null, null);
		Float result_value = (Float)result.getValue();
		assertEquals((float)0.1234, result_value.floatValue());
	}
	
	public void test_upcase() throws RubyException {
		RubyValue str = ObjectFactory.createString("abcDe");
		StringBuilder value = (StringBuilder)str.getValue();
		assertEquals(value.toString(), "abcDe");
		RubyMethod m = str.findPublicMethod("upcase");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		StringBuilder result_value = (StringBuilder)result.getValue();
		assertEquals("ABCDE", result_value.toString());
		
		str = ObjectFactory.createString("abcDe");
		value = (StringBuilder)str.getValue();
		assertEquals(value.toString(), "abcDe");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		result_value = (StringBuilder)result.getValue();
		assertEquals("ABCDE", result_value.toString());
	}
	
	public void test_upcase_dangers() throws RubyException {
		RubyValue str = ObjectFactory.createString("abcDe");
		StringBuilder value = (StringBuilder)str.getValue();
		assertEquals("abcDe", value.toString());
		RubyMethod m = str.findPublicMethod("upcase!");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result == str);
		StringBuilder result_value = (StringBuilder)result.getValue();
		assertEquals("ABCDE", result_value.toString());
		
		str = ObjectFactory.createString("ABC");
		value = (StringBuilder)str.getValue();
		assertEquals("ABC", value.toString());
		result = m.invoke(str, null, null);
		assertEquals("ABC", value.toString());
		assertEquals(ObjectFactory.nilValue, result);
	}

	public void test_downcase() throws RubyException {
		RubyValue str = ObjectFactory.createString("abcDe");
		StringBuilder value = (StringBuilder)str.getValue();
		assertEquals(value.toString(), "abcDe");
		RubyMethod m = str.findPublicMethod("downcase");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		StringBuilder result_value = (StringBuilder)result.getValue();
		assertEquals("abcde", result_value.toString());
		
		str = ObjectFactory.createString("abcDe");
		value = (StringBuilder)str.getValue();
		assertEquals(value.toString(), "abcDe");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		result_value = (StringBuilder)result.getValue();
		assertEquals("abcde", result_value.toString());
	}
	
	public void test_downcase_dangers() throws RubyException {
		RubyValue str = ObjectFactory.createString("abcDe");
		StringBuilder value = (StringBuilder)str.getValue();
		assertEquals("abcDe", value.toString());
		RubyMethod m = str.findPublicMethod("downcase!");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result == str);
		StringBuilder result_value = (StringBuilder)result.getValue();
		assertEquals("abcde", result_value.toString());
		
		str = ObjectFactory.createString("abc");
		value = (StringBuilder)str.getValue();
		assertEquals("abc", value.toString());
		result = m.invoke(str, null, null);
		assertEquals("abc", value.toString());
		assertEquals(ObjectFactory.nilValue, result);
	}

	public void test_capitalize() throws RubyException {
		RubyValue str = ObjectFactory.createString("abc");
		RubyMethod m = str.findPublicMethod("capitalize");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("Abc", ((StringBuilder)result.getValue()).toString());
		
		str = ObjectFactory.createString("HELLO");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("Hello", ((StringBuilder)result.getValue()).toString());

		str = ObjectFactory.createString("123ABC");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("123abc", ((StringBuilder)result.getValue()).toString());
		
		str = ObjectFactory.createString("Hello");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("Hello", ((StringBuilder)result.getValue()).toString());
	}
	
	public void test_capitalize_danger() throws RubyException {
		RubyValue str = ObjectFactory.createString("abc");
		RubyMethod m = str.findPublicMethod("capitalize!");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result == str);
		assertEquals("Abc", ((StringBuilder)result.getValue()).toString());
		
		str = ObjectFactory.createString("HELLO");
		result = m.invoke(str, null, null);
		assertTrue(result == str);
		assertEquals("Hello", ((StringBuilder)result.getValue()).toString());

		str = ObjectFactory.createString("123ABC");
		result = m.invoke(str, null, null);
		assertTrue(result == str);
		assertEquals("123abc", ((StringBuilder)result.getValue()).toString());
		
		str = ObjectFactory.createString("Hello");
		result = m.invoke(str, null, null);
		assertEquals(ObjectFactory.nilValue, result);
		assertEquals("Hello", ((StringBuilder)str.getValue()).toString());
	}
}
