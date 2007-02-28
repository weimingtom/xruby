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
		RubyMethod m = str.findPublicMethod("to_i");
		RubyValue result = m.invoke(str, null, null);
		RubyFixnum result_value = (RubyFixnum)result;
		assertEquals(1234, result_value.intValue());
	}
	
	public void test_to_f() {
		RubyValue str = ObjectFactory.createString("0.1234");
		RubyString value = (RubyString)str;
		assertEquals("0.1234", value.toString());
		RubyMethod m = str.findPublicMethod("to_f");
		RubyValue result = m.invoke(str, null, null);
		RubyFloat result_value = (RubyFloat)result;
		assertEquals((double)0.1234, result_value.doubleValue());
	}
	
	public void test_upcase() {
		RubyValue str = ObjectFactory.createString("abcDe");
		RubyString value = (RubyString)str;
		assertEquals(value.toString(), "abcDe");
		RubyMethod m = str.findPublicMethod("upcase");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		RubyString result_value = (RubyString)result;
		assertEquals("ABCDE", result_value.toString());
		
		str = ObjectFactory.createString("abcDe");
		value = (RubyString)str;
		assertEquals(value.toString(), "abcDe");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		result_value = (RubyString)result;
		assertEquals("ABCDE", result_value.toString());
	}
	
	public void test_upcase_dangers() {
		RubyValue str = ObjectFactory.createString("abcDe");
		RubyString value = (RubyString)str;
		assertEquals("abcDe", value.toString());
		RubyMethod m = str.findPublicMethod("upcase!");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result == str);
		RubyString result_value = (RubyString)result;
		assertEquals("ABCDE", result_value.toString());
		
		str = ObjectFactory.createString("ABC");
		value = (RubyString)str;
		assertEquals("ABC", value.toString());
		result = m.invoke(str, null, null);
		assertEquals("ABC", value.toString());
		assertEquals(ObjectFactory.nilValue, result);
	}

	public void test_downcase() {
		RubyValue str = ObjectFactory.createString("abcDe");
		RubyString value = (RubyString)str;
		assertEquals(value.toString(), "abcDe");
		RubyMethod m = str.findPublicMethod("downcase");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		RubyString result_value = (RubyString)result;
		assertEquals("abcde", result_value.toString());
		
		str = ObjectFactory.createString("abcDe");
		value = (RubyString)str;
		assertEquals(value.toString(), "abcDe");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("abcDe", value.toString());
		result_value = (RubyString)result;
		assertEquals("abcde", result_value.toString());
	}
	
	public void test_downcase_dangers() {
		RubyValue str = ObjectFactory.createString("abcDe");
		RubyString value = (RubyString)str;
		assertEquals("abcDe", value.toString());
		RubyMethod m = str.findPublicMethod("downcase!");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result == str);
		RubyString result_value = (RubyString)result;
		assertEquals("abcde", result_value.toString());
		
		str = ObjectFactory.createString("abc");
		value = (RubyString)str;
		assertEquals("abc", value.toString());
		result = m.invoke(str, null, null);
		assertEquals("abc", value.toString());
		assertEquals(ObjectFactory.nilValue, result);
	}

	public void test_capitalize() {
		RubyValue str = ObjectFactory.createString("abc");
		RubyMethod m = str.findPublicMethod("capitalize");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("Abc", ((RubyString)result).toString());
		
		str = ObjectFactory.createString("HELLO");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("Hello", ((RubyString)result).toString());

		str = ObjectFactory.createString("123ABC");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("123abc", ((RubyString)result).toString());
		
		str = ObjectFactory.createString("Hello");
		result = m.invoke(str, null, null);
		assertTrue(result != str);
		assertEquals("Hello", ((RubyString)result).toString());
	}
	
	public void test_capitalize_danger() {
		RubyValue str = ObjectFactory.createString("abc");
		RubyMethod m = str.findPublicMethod("capitalize!");
		RubyValue result = m.invoke(str, null, null);
		assertTrue(result == str);
		assertEquals("Abc", ((RubyString)result).toString());
		
		str = ObjectFactory.createString("HELLO");
		result = m.invoke(str, null, null);
		assertTrue(result == str);
		assertEquals("Hello", ((RubyString)result).toString());

		str = ObjectFactory.createString("123ABC");
		result = m.invoke(str, null, null);
		assertTrue(result == str);
		assertEquals("123abc", ((RubyString)result).toString());
		
		str = ObjectFactory.createString("Hello");
		result = m.invoke(str, null, null);
		assertEquals(ObjectFactory.nilValue, result);
		assertEquals("Hello", ((RubyString)str).toString());
	}
	
	public void test_operator_compare() {
		RubyValue str1 = ObjectFactory.createString("abc");
		RubyValue str2 = ObjectFactory.createString("abd");
		RubyArray args = new RubyArray();
		args.add(str2);
		RubyMethod m = str1.findPublicMethod("<=>");
		RubyValue result = m.invoke(str1, args, null);
		assertEquals(result, ObjectFactory.createFixnum(-1));
		
		str2 = ObjectFactory.createString("abb");
		args = new RubyArray();
		args.add(str2);
		result = m.invoke(str1, args, null);
		assertEquals(result, ObjectFactory.fixnum1);
		
		str2 = ObjectFactory.createString("abc");
		args = new RubyArray();
		args.add(str2);
		result = m.invoke(str1, args, null);
		assertEquals(result, ObjectFactory.fixnum0);
		
		str2 = ObjectFactory.createString("a");
		args = new RubyArray();
		args.add(str2);
		result = m.invoke(str1, args, null);
		assertEquals(result, ObjectFactory.fixnum1);
		
		str2 = ObjectFactory.createString("b");
		args = new RubyArray();
		args.add(str2);
		result = m.invoke(str1, args, null);
		assertEquals(result, ObjectFactory.createFixnum(-1));
		
		args = new RubyArray();
		args.add(ObjectFactory.fixnum1);
		result = m.invoke(str1, args, null);
		assertTrue(result == ObjectFactory.nilValue);
	}
}