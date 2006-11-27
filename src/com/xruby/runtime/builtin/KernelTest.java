package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubySymbol;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.StringMap;
import com.xruby.runtime.value.RubyArray;
import com.xruby.runtime.value.RubyString;

import junit.framework.TestCase;

public class KernelTest extends TestCase {
	public void testSend() {
		RubySymbol classSymbol = StringMap.intern("class").toSymbol();
		RubyValue objectClass = RubyRuntime.objectClass.callMethod("send", classSymbol);
		assertEquals(RubyRuntime.classClass, objectClass);		
	}
	
	public void testEqualMethod() {
		RubyClass objectClass = RubyRuntime.objectClass;
		RubyValue value = objectClass.newInstance();
		assertEquals(RubyConstant.QTRUE, value.callMethod("==", new RubyArray(value)));
		assertEquals(RubyConstant.QTRUE, value.callMethod("equal?", new RubyArray(value)));
		assertEquals(RubyConstant.QTRUE, value.callMethod("===", new RubyArray(value)));
		assertEquals(RubyConstant.QTRUE, value.callMethod("eql?", new RubyArray(value)));
		
		RubyValue value2 = objectClass.callMethod("new");
		assertEquals(RubyConstant.QFALSE, value.callMethod("==", new RubyArray(value2)));
		assertEquals(RubyConstant.QFALSE, value.callMethod("equal?", new RubyArray(value2)));
		assertEquals(RubyConstant.QFALSE, value.callMethod("===", new RubyArray(value2)));
		assertEquals(RubyConstant.QFALSE, value.callMethod("eql?", new RubyArray(value2)));
	}
	
	public void testClassMethod() {
		RubyClass objectClass = RubyRuntime.objectClass;
		RubyValue value = objectClass.newInstance();
		assertEquals(objectClass, value.callMethod("class"));
		assertEquals(objectClass, value.callMethod("type"));
	}
	
	public void testToA() {
		RubyValue value = RubyRuntime.topSelf.callMethod("to_a");
		assertTrue(value instanceof RubyArray);
		RubyArray array = (RubyArray)value;
		assertEquals(RubyRuntime.topSelf, array.get(0));
	}
	
	public void testToS() {
		RubyClass objectClass = RubyRuntime.objectClass;
		RubyString s = (RubyString)objectClass.callMethod("to_s");
		assertEquals("Class", s.getString().substring(2, 7));
		RubyValue value = objectClass.newInstance();
		s = (RubyString)value.callMethod("to_s");
		assertEquals("Object", s.getString().substring(2, 8));
	}
	
	public void testInstance() {
		RubyClass objectClass = RubyRuntime.objectClass;
		RubyValue value = objectClass.newInstance();
		assertEquals(RubyConstant.QTRUE, value.callMethod("instance_of?", new RubyArray(objectClass)));
		RubyClass classClass = RubyRuntime.classClass;
		assertEquals(RubyConstant.QFALSE, value.callMethod("instance_of?", new RubyArray(classClass)));
		
		assertEquals(RubyConstant.QTRUE, value.callMethod("kind_of?", new RubyArray(objectClass)));
		assertEquals(RubyConstant.QFALSE, value.callMethod("kind_of?", new RubyArray(classClass)));
		assertEquals(RubyConstant.QTRUE, value.callMethod("is_a?", new RubyArray(objectClass)));
		assertEquals(RubyConstant.QFALSE, value.callMethod("is_a?", new RubyArray(classClass)));
		
		assertEquals(RubyConstant.QTRUE, objectClass.callMethod("kind_of?", new RubyArray(classClass)));
		assertEquals(RubyConstant.QTRUE, objectClass.callMethod("is_a?", new RubyArray(classClass)));
		assertEquals(RubyConstant.QTRUE, objectClass.callMethod("kind_of?", new RubyArray(objectClass)));
		assertEquals(RubyConstant.QTRUE, objectClass.callMethod("is_a?", new RubyArray(objectClass)));
	}
	
	public void testMethods() {
		RubyClass objectClass = RubyRuntime.objectClass;
		RubyValue result = objectClass.callMethod("methods");
		assertTrue(result instanceof RubyArray);
		RubyArray resultArray = (RubyArray)result;
		boolean found = false;
		for (RubyValue value : resultArray) {
			assertTrue(value instanceof RubyString);
			RubyString str = (RubyString)value;
			if ("methods".equals(str.getString())) {
				found = true;
			}
		}
		
		assertTrue(found);
	}
}
