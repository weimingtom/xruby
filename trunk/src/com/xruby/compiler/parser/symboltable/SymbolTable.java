/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;

class Class_Object extends RubyClass 
{
	public Class_Object()
	{
		setName("Object");
		addMethod().setName("puts");
		//TODO more
	}
}


class SymbolTable extends ModuleHolder
{
	private Class_Object object_ = new Class_Object();

	public SymbolTable()
	{
		addClass(object_);
	}

	/// When you declare a function outside of any module,
	/// the function becomes the private method of class "Object".
	public RubyMethod addMethod()
	{
		RubyMethod m = object_.addMethod();
		m.setAccess(RubyMethod.PRIVATE);
		return m;
	}
}
