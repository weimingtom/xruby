package com.xruby.runtime.lang;

import junit.framework.TestCase;
import com.xruby.runtime.value.RubyArray;

public class RubyClassTest extends TestCase {
	private CoreBuilder builer;

	/*
	protected void setUp() throws Exception {
		this.builer = new CoreBuilder();
		this.builer.initialize();
	}

	protected void tearDown() throws Exception {
		this.builer = null;
	}
	*/
	
	public void testDefineMethod() {
		RubyClass testClass = RubyAPI.defineClass("TestClass", RubyRuntime.objectClass);
		testClass.defineMethod("test_method", new NoBlockRubyMethod() {
			public RubyValue run(RubyValue receiver, RubyArray args) {
				return RubyConstant.QNIL;
			}			
		}, 0);
		RubyValue value = testClass.callMethod("new");
		RubyValue reuslt = value.callMethod("test_method");
		assertEquals(RubyConstant.QNIL, reuslt);
	}
	
	public void testClasName() {
		RubyClass testClass = RubyAPI.defineClass("TestClass", RubyRuntime.objectClass);
		assertEquals("TestClass", testClass.getName().getString());
	}
	
	public void testCallMissingMethod() {
		RubyClass testClass = RubyAPI.defineClass("TestClass", RubyRuntime.objectClass);
		try {
			testClass.callMethod("nothing");
			fail();
		} catch (RubyException e) {			
		}
	}
	
	public void testCallMethodWithWrongArguments() {
		RubyClass testClass = RubyAPI.defineClass("TestClass", RubyRuntime.objectClass);
		testClass.defineMethod("test", RubyMethod.DUMMY_METHOD, 2);
		try {
			testClass.callMethod("test");
		} catch (RubyException e) {			
		}
	}
}
