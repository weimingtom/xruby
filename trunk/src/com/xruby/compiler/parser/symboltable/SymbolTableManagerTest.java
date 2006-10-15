/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;


import junit.framework.TestCase;

class TestingSymbolTableManager extends SymbolTableManager
{
	public RubyModule getModule(String name)
	{
		return symbol_table_.getModule(name);
	}
	
	public RubyClass getClass(String name)
	{
		if (null != current_module_)
		{
			return current_module_.getClass(name);
		}
		else
		{
			return symbol_table_.getClass(name);
		}
	}
	
	public RubyMethod getMethod(String name)
	{
		if (null != current_class_)
		{
			return current_class_.getMethod(name);
		}
		else if (null != current_module_)
		{
			return current_module_.getMethod(name);
		}
		else
		{
			return symbol_table_.getMethod(name);
		}
	}
	
	public RubyMethodParameter getParameter(String name)
	{
		return current_method_.getParameter(name);
	}
	
}

public class SymbolTableManagerTest extends TestCase {

	private TestingSymbolTableManager symbol_table_manager_ = new TestingSymbolTableManager();
	
	public void test_SymbolTable()
	{
		SymbolTable s = new SymbolTable();

		assertEquals(null, s.getModule("Module"));

		s.addModule().setName("Module");
		assertEquals("Module", s.getModule("Module").getName());
	}
	
	public void test_addModule()
	{
		symbol_table_manager_.enterModule().setName("MyModule");
		assertEquals("MyModule", symbol_table_manager_.getModule("MyModule").getName());
		assertEquals(null, symbol_table_manager_.getModule("MyModule2"));

		symbol_table_manager_.enterModule().setName("MyModule2");
		assertEquals("MyModule", symbol_table_manager_.getModule("MyModule").getName());
		assertEquals("MyModule2", symbol_table_manager_.getModule("MyModule2").getName());
	}
	
	public void test_addClass()
	{
		symbol_table_manager_.enterClass().setName("MyClass");
		assertEquals(null, symbol_table_manager_.getClass("MyClass2"));
		assertEquals("MyClass", symbol_table_manager_.getClass("MyClass").getName());		

		symbol_table_manager_.enterClass().setName("MyClass2");
		assertEquals(null, symbol_table_manager_.getClass("NoSuchClass"));
		assertEquals("MyClass2", symbol_table_manager_.getClass("MyClass2").getName());		

		symbol_table_manager_.enterModule().setName("MyModule2");
		symbol_table_manager_.enterClass().setName("MyClass2");
		assertEquals(null, symbol_table_manager_.getClass("MyClass"));
		assertEquals("MyClass2", symbol_table_manager_.getClass("MyClass2").getName());		
	}
	
	public void test_addMethod()
	{
		symbol_table_manager_.enterModule().setName("MyModule");
		symbol_table_manager_.enterClass().setName("MyClass");
		symbol_table_manager_.enterMethod().setName("myMethod");
		symbol_table_manager_.enterMethod().setName("myMethod2");
		symbol_table_manager_.enterMethod().setName("myMethod3");
		assertEquals(null, symbol_table_manager_.getMethod("noSuchMethod"));
		assertEquals("myMethod", symbol_table_manager_.getMethod("myMethod").getName());
		assertEquals("myMethod2", symbol_table_manager_.getMethod("myMethod2").getName());
		assertEquals("myMethod3", symbol_table_manager_.getMethod("myMethod3").getName());
		
		symbol_table_manager_.enterClass().setName("MyClass2");
		symbol_table_manager_.enterMethod().setName("newMethod");
		assertEquals(null, symbol_table_manager_.getMethod("noSuchMethod"));
		assertEquals(null, symbol_table_manager_.getMethod("myMethod"));
		assertEquals(null, symbol_table_manager_.getMethod("myMethod2"));
		assertEquals(null, symbol_table_manager_.getMethod("myMethod3"));
		assertEquals("newMethod", symbol_table_manager_.getMethod("newMethod").getName());
	}

	public void test_addParameter()
	{
		symbol_table_manager_.enterModule().setName("MyModule");
		symbol_table_manager_.enterClass().setName("MyClass");
		symbol_table_manager_.enterMethod().setName("myMethod");
		symbol_table_manager_.addParameter("a");
		symbol_table_manager_.addParameter("b");
		assertEquals(null, symbol_table_manager_.getParameter("noSuchParameter"));
		assertEquals("a", symbol_table_manager_.getParameter("a").getName());
		assertEquals("b", symbol_table_manager_.getParameter("b").getName());
		assertEquals(null, symbol_table_manager_.getVariable("noSuchParameter"));
		assertEquals("a", symbol_table_manager_.getVariable("a").getName());
		assertEquals("b", symbol_table_manager_.getVariable("b").getName());
	}
	
	public void test_addLocalVarible()
	{
		symbol_table_manager_.enterModule().setName("MyModule");
		symbol_table_manager_.enterClass().setName("MyClass");
		symbol_table_manager_.enterMethod().setName("myMethod");
		symbol_table_manager_.addParameter("c");
		symbol_table_manager_.addLocalVarible("a");
		symbol_table_manager_.addLocalVarible("b");
		symbol_table_manager_.addLocalVarible("c");
		assertEquals(null, symbol_table_manager_.getVariable("noSuchParameter"));
		assertEquals("a", symbol_table_manager_.getVariable("a").getName());
		assertEquals("b", symbol_table_manager_.getVariable("b").getName());
		assertEquals("c", symbol_table_manager_.getVariable("c").getName());
		assertTrue(symbol_table_manager_.getVariable("a") instanceof RubyMethodLocalVariable);
		assertTrue(symbol_table_manager_.getVariable("b") instanceof RubyMethodLocalVariable);
		assertTrue(symbol_table_manager_.getVariable("c") instanceof RubyMethodParameter);
	}
}
