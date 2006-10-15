/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;

import junit.framework.TestCase;

public class RubyModuleTest extends TestCase {

	public void test_RubyModule()
	{
		RubyModule m = new RubyModule();
		m.setName("Module");
		assertEquals("Module", m.getName());

		m.addClass().setName("Class");
		assertEquals("Class", m.getClass("Class").getName());
		
		m.addClass().setName("method");
		assertEquals("method", m.getClass("method").getName());
	}
}
