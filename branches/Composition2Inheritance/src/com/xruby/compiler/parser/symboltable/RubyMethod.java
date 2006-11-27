/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.parser.symboltable;

class RubyMethod extends RubyBlock
{
	public static final int PUBLIC = 1;
	public static final int PROTECTED = 2;
	public static final int PRIVATE = 3;

	private String name_;
	int access_ = PUBLIC;

	public void setName(String name)
	{
		assert(null != name);
		name_ = name;
	}

	public boolean isPublic()
	{
		return PUBLIC == access_;
	}

	public boolean isProtected()
	{
		return PROTECTED == access_;
	}
	
	public boolean isPrivate()
	{
		return PRIVATE == access_;
	}
	
	public void setAccess(int access)
	{
		access_ = access;
	}

	public String getName()
	{
		return name_;
	}
}
