/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;

import junit.framework.TestCase;

public class RubyClassTest extends TestCase {
	
	public void test_RubyClass()
	{
		RubyClass c = new RubyClass();
		c.setName("Test");
		assertEquals("Test", c.getName());
		c.addMethod().setName("method");
		RubyMethod m = c.getMethod("method");
		assertEquals("method", m.getName());

		c.addMethod().setName("method2");
		c.addMethod().setName("method3");
		assertEquals("method2", c.getMethod("method2").getName());
		assertEquals("method3", c.getMethod("method3").getName());
	}
	
	public void test_parent_class()
	{
		RubyClass c = new RubyClass();
		c.setName("Test");
		RubyMethod m = c.addMethod();
		m.setName("method");
		m.setAccess(RubyMethod.PRIVATE);
		
		RubyClass b = new RubyClass();
		b.setName("Base");
		b.addMethod().setName("public_base_method");
		m = b.addMethod();
		m.setName("private_base_method");
		m.setAccess(RubyMethod.PRIVATE);
		m = b.addMethod();
		m.setName("protected_base_method");
		m.setAccess(RubyMethod.PROTECTED);
		c.setParentClass(b);
		
		assertEquals("method", c.getMethod("method").getName());
		assertEquals("public_base_method", c.getMethod("public_base_method").getName());
		assertTrue(null == c.getMethod("private_base_method"));
		assertEquals("protected_base_method", c.getMethod("protected_base_method").getName());
	}
}
