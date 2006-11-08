package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyArray;
import com.xruby.newruntime.value.RubyString;

import junit.framework.TestCase;

public class KernelMethodTest extends TestCase {
	public void testEqualMethod() {
		RubyClass objectClass = RubyRuntime.objectClass;
		RubyValue value = objectClass.newInstance();
		assertEquals(RubyConstant.QTRUE, value.callMethod("==", new RubyValue[] {value}));
		assertEquals(RubyConstant.QTRUE, value.callMethod("equal?", new RubyValue[] {value}));
		assertEquals(RubyConstant.QTRUE, value.callMethod("===", new RubyValue[] {value}));
		assertEquals(RubyConstant.QTRUE, value.callMethod("eql?", new RubyValue[] {value}));
		
		RubyValue value2 = objectClass.callMethod("new");
		assertEquals(RubyConstant.QFALSE, value.callMethod("==", new RubyValue[] {value2}));
		assertEquals(RubyConstant.QFALSE, value.callMethod("equal?", new RubyValue[] {value2}));
		assertEquals(RubyConstant.QFALSE, value.callMethod("===", new RubyValue[] {value2}));
		assertEquals(RubyConstant.QFALSE, value.callMethod("eql?", new RubyValue[] {value2}));
	}
	
	public void testClassMethod() {
		RubyClass objectClass = RubyRuntime.objectClass;
		RubyValue value = objectClass.callMethod("new");
		assertEquals(objectClass, value.callMethod("class"));
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
		assertEquals(RubyConstant.QTRUE, value.callMethod("instance_of?", new RubyValue[]{objectClass}));
		RubyClass classClass = RubyRuntime.classClass;
		assertEquals(RubyConstant.QFALSE, value.callMethod("instance_of?", new RubyValue[]{classClass}));
		
		assertEquals(RubyConstant.QTRUE, value.callMethod("kind_of?", new RubyValue[] {objectClass}));
		assertEquals(RubyConstant.QFALSE, value.callMethod("kind_of?", new RubyValue[] {classClass}));
		assertEquals(RubyConstant.QTRUE, value.callMethod("is_a?", new RubyValue[] {objectClass}));
		assertEquals(RubyConstant.QFALSE, value.callMethod("is_a?", new RubyValue[] {classClass}));
		
		assertEquals(RubyConstant.QTRUE, objectClass.callMethod("kind_of?", new RubyValue[] {classClass}));
		assertEquals(RubyConstant.QTRUE, objectClass.callMethod("is_a?", new RubyValue[] {classClass}));
		assertEquals(RubyConstant.QTRUE, objectClass.callMethod("kind_of?", new RubyValue[] {objectClass}));
		assertEquals(RubyConstant.QTRUE, objectClass.callMethod("is_a?", new RubyValue[] {objectClass}));
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
			System.out.println(str.getString());
			if ("methods".equals(str.getString())) {
				found = true;
			}
		}
		
		assertTrue(found);
	}
}
