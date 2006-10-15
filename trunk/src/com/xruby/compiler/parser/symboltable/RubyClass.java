/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;

class RubyClass extends MethodHolder
{
	private String name_;
	private RubyClass parent_class_;

	public void setName(String name)
	{
		assert(null != name);
		name_ = name;
	}
	
	public String getName()
	{
		return name_;
	}

	public void setParentClass(RubyClass parent_class)
	{
		assert(null != parent_class);
		parent_class_ = parent_class;
	}

	public RubyMethod getMethod(String name)
	{
		return getMethod(name, false);
	}

	private RubyMethod getMethod(String name, boolean exclude_private_method)
	{
		assert(name.length() > 0);
		RubyMethod m = super.getMethod(name);
		if (null != m)
		{
			if (!exclude_private_method || !m.isPrivate())
			{
				return m;
			}
		}

		if (null != parent_class_)
		{
			return parent_class_.getMethod(name, true);//recursive
		}
		
		return null;
	}
}
