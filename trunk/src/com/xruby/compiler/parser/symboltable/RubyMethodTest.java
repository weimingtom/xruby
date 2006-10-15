/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;


import junit.framework.TestCase;

public class RubyMethodTest extends TestCase {

	public void test_RubyMethodVarible()
	{
		RubyMethodVariable v = new RubyMethodVariable("var");
		assertTrue(v.getName() == "var");
	}
	
	public void test_RubyMethodLocalVarible()
	{
		RubyMethodLocalVariable v = new RubyMethodLocalVariable("var1");
		assertTrue(v.getName() == "var1");
	}
	
	public void test_RubyMethodParameter()
	{
		RubyMethodParameter v = new RubyMethodParameter("param");
		assertTrue(v.getName() == "param");
	}
	
	public void test_RubyMethod_access()
	{
		RubyMethod m = new RubyMethod();
		m.setName("my_method");
		assertTrue(m.getName() == "my_method");

		assertTrue(m.isPublic());
		assertTrue(!m.isProtected());
		assertTrue(!m.isPrivate());

		m.setAccess(RubyMethod.PRIVATE);
		assertTrue(m.isPrivate());
		assertTrue(!m.isPublic());
		assertTrue(!m.isProtected());

		m.setAccess(RubyMethod.PROTECTED);
		assertTrue(m.isProtected());
		assertTrue(!m.isPublic());
		assertTrue(!m.isPrivate());
		
		m.setAccess(RubyMethod.PUBLIC);
		assertTrue(m.isPublic());
		assertTrue(!m.isProtected());
		assertTrue(!m.isPrivate());
	}
	
	public void test_RubyMethod_parameter()
	{
		RubyMethod m = new RubyMethod();
		m.setName("my_method");
		assertTrue(m.getName() == "my_method");
	
		assertEquals(0, m.getNumberOfParameter());
		assertTrue(null == m.getParameter("f"));
		m.addParameter("f");
		assertEquals(1, m.getNumberOfParameter());
		RubyMethodParameter p = m.getParameter("f");
		assertEquals("f", p.getName());

		assertTrue(null == m.getParameter("b2"));
		m.addParameter("b2");
		m.addParameter("b2");
		m.addParameter("b2");
		assertEquals(2, m.getNumberOfParameter());
		p = m.getParameter("b2");
		assertEquals("b2", p.getName());
	}
	
	public void test_RubyMethod_localvarible()
	{
		RubyMethod m = new RubyMethod();
		m.setName("my_method");
		assertTrue(m.getName() == "my_method");
	
		assertTrue(null == m.getLocalVariable("f"));
		m.addLocalVariable("f");
		RubyMethodLocalVariable v = m.getLocalVariable("f");
		assertEquals("f", v.getName());

		assertTrue(null == m.getLocalVariable("b2"));
		m.addLocalVariable("b2");
		v = m.getLocalVariable("b2");
		assertEquals("b2", v.getName());
	}
	
	public void test_RubyMethod_varible()
	{
		RubyMethod m = new RubyMethod();
		m.setName("my_method");
		assertTrue(m.getName() == "my_method");
	
		assertTrue(null == m.getVariable("v"));
		assertTrue(null == m.getVariable("p"));
		m.addLocalVariable("v");
		m.addParameter("p");
		RubyMethodVariable v = m.getVariable("v");
		RubyMethodVariable p = m.getVariable("p");
		assertEquals("v", v.getName());
		assertEquals("p", p.getName());
	}
}
