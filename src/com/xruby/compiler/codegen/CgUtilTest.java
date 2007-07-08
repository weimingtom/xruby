package com.xruby.compiler.codegen;

import junit.framework.TestCase;

public class CgUtilTest extends TestCase {
	public void testGetClassInternalName() {
		assertEquals("com/xruby/compiler/codegen/CgUtil", CgUtil.getInternalName(CgUtil.class));
	}
	
	public void testGetMethodName() {
		String methodName = CgUtil.getMethodName("test", String.class, new Class[] {String.class, Object.class});
		assertEquals("java.lang.String test(java.lang.String, java.lang.Object)", methodName);
		
		methodName = CgUtil.getMethodName("test", String.class);
		assertEquals("java.lang.String test()", methodName);
		
		methodName = CgUtil.getMethodName("test", String.class, String.class);
		assertEquals("java.lang.String test(java.lang.String)", methodName);
		
		methodName = CgUtil.getMethodName("test", String.class, String.class, Object.class);
		assertEquals("java.lang.String test(java.lang.String, java.lang.Object)", methodName);
		
		methodName = CgUtil.getMethodName("test", String.class, String.class, String.class, Object.class);
		assertEquals("java.lang.String test(java.lang.String, java.lang.String, java.lang.Object)", methodName);
	}
}
