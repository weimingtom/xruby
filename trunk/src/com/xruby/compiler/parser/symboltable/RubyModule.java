/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;

class RubyModule extends ClassHolder
{
	private String name_;

	public void setName(String name)
	{
		assert(name.length() > 0);
		name_ = name;
	}

	public String getName()
	{
		return name_;
	}
}
