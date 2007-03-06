/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import junit.framework.TestCase;
import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

public class StringClassBuilderTest extends TestCase {

	public void test_to_i() {
		RubyValue str = ObjectFactory.createString("1234");
		RubyString value = (RubyString)str;
		assertEquals("1234", value.toString());
		RubyValue result = RubyAPI.callMethod(str, null, null, "to_i");
		RubyFixnum result_value = (RubyFixnum)result;
		assertEquals(1234, result_value.intValue());
	}
	
	public void test_to_f() {
		RubyValue str = ObjectFactory.createString("0.1234");
		RubyString value = (RubyString)str;
		assertEquals("0.1234", value.toString());
		RubyValue result = RubyAPI.callMethod(str, null, null, "to_f");
		RubyFloat result_value = (RubyFloat)result;
		assertEquals((double)0.1234, result_value.doubleValue());
	}
	
	public void test_upcase() {
		RubyValue str = ObjectFactory.createString("abcDe");
		RubyString value = (RubyString)str;
		assertEquals(value.toString(), "abcDe");
		RubyValue result = RubyAPI.callMethod(str, null, null, "upcase");
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		RubyString result_value = (RubyString)result;
		assertEquals("ABCDE", result_value.toString());
		
		str = ObjectFactory.createString("abcDe");
		value = (RubyString)str;
		assertEquals(value.toString(), "abcDe");
		result = RubyAPI.callMethod(str, null, null, "upcase");
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		result_value = (RubyString)result;
		assertEquals("ABCDE", result_value.toString());
	}
	
	public void test_upcase_dangers() {
		RubyValue str = ObjectFactory.createString("abcDe");
		RubyString value = (RubyString)str;
		assertEquals("abcDe", value.toString());
		RubyValue result = RubyAPI.callMethod(str, null, null, "upcase!");
		assertTrue(result == str);
		RubyString result_value = (RubyString)result;
		assertEquals("ABCDE", result_value.toString());
		
		str = ObjectFactory.createString("ABC");
		value = (RubyString)str;
		assertEquals("ABC", value.toString());
		result = RubyAPI.callMethod(str, null, null, "upcase!");
		assertEquals("ABC", value.toString());
		assertEquals(ObjectFactory.nilValue, result);
	}

	public void test_downcase() {
		RubyValue str = ObjectFactory.createString("abcDe");
		RubyString value = (RubyString)str;
		assertEquals(value.toString(), "abcDe");
		RubyValue result = RubyAPI.callMethod(str, null, null, "downcase");
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		RubyString result_value = (RubyString)result;
		assertEquals("abcde", result_value.toString());
		
		str = ObjectFactory.createString("abcDe");
		value = (RubyString)str;
		assertEquals(value.toString(), "abcDe");
		result = RubyAPI.callMethod(str, null, null, "downcase");
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		result_value = (RubyString)result;
		assertEquals("abcde", result_value.toString());
	}
	
	public void test_downcase_dangers() {
		RubyValue str = ObjectFactory.createString("abcDe");
		RubyString value = (RubyString)str;
		assertEquals("abcDe", value.toString());
		RubyValue result = RubyAPI.callMethod(str, null, null, "downcase!");
		assertTrue(result == str);
		RubyString result_value = (RubyString)result;
		assertEquals("abcde", result_value.toString());
		
		str = ObjectFactory.createString("abc");
		value = (RubyString)str;
		assertEquals("abc", value.toString());
		result = RubyAPI.callMethod(str, null, null, "downcase!");
		assertEquals("abc", value.toString());
		assertEquals(ObjectFactory.nilValue, result);
	}

	public void test_capitalize() {
		RubyValue str = ObjectFactory.createString("abc");
		RubyValue result = RubyAPI.callMethod(str, null, null, "capitalize");
		assertTrue(result != str);
		assertEquals("Abc", ((RubyString)result).toString());
		
		str = ObjectFactory.createString("HELLO");
		result = RubyAPI.callMethod(str, null, null, "capitalize");
		assertTrue(result != str);
		assertEquals("Hello", ((RubyString)result).toString());

		str = ObjectFactory.createString("123ABC");
		result = RubyAPI.callMethod(str, null, null, "capitalize");
		assertTrue(result != str);
		assertEquals("123abc", ((RubyString)result).toString());
		
		str = ObjectFactory.createString("Hello");
		result = RubyAPI.callMethod(str, null, null, "capitalize");
		assertTrue(result != str);
		assertEquals("Hello", ((RubyString)result).toString());
	}
	
	public void test_capitalize_danger() {
		RubyValue str = ObjectFactory.createString("abc");
		RubyValue result = RubyAPI.callMethod(str, null, null, "capitalize!");
		assertTrue(result == str);
		assertEquals("Abc", ((RubyString)result).toString());
		
		str = ObjectFactory.createString("HELLO");
		result = RubyAPI.callMethod(str, null, null, "capitalize!");
		assertTrue(result == str);
		assertEquals("Hello", ((RubyString)result).toString());

		str = ObjectFactory.createString("123ABC");
		result = RubyAPI.callMethod(str, null, null, "capitalize!");
		assertTrue(result == str);
		assertEquals("123abc", ((RubyString)result).toString());
		
		str = ObjectFactory.createString("Hello");
		result = RubyAPI.callMethod(str, null, null, "capitalize!");
		assertEquals(ObjectFactory.nilValue, result);
		assertEquals("Hello", ((RubyString)str).toString());
	}
	
	public void test_operator_compare() {
		RubyValue str1 = ObjectFactory.createString("abc");
		RubyValue str2 = ObjectFactory.createString("abd");
		RubyValue result = RubyAPI.callOneArgMethod(str1, str2, null, "<=>");
		assertEquals(result, ObjectFactory.createFixnum(-1));
		
		str2 = ObjectFactory.createString("abb");
		result = RubyAPI.callOneArgMethod(str1, str2, null, "<=>");
		assertEquals(result, ObjectFactory.fixnum1);
		
		str2 = ObjectFactory.createString("abc");
		result = RubyAPI.callOneArgMethod(str1, str2, null, "<=>");
		assertEquals(result, ObjectFactory.fixnum0);
		
		str2 = ObjectFactory.createString("a");
		result = RubyAPI.callOneArgMethod(str1, str2, null, "<=>");
		assertEquals(result, ObjectFactory.fixnum1);
		
		str2 = ObjectFactory.createString("b");
		result = RubyAPI.callOneArgMethod(str1, str2, null, "<=>");
		assertEquals(result, ObjectFactory.createFixnum(-1));
		
		result = RubyAPI.callOneArgMethod(str1, ObjectFactory.fixnum1, null, "<=>");
		assertTrue(result == ObjectFactory.nilValue);
	}
}
