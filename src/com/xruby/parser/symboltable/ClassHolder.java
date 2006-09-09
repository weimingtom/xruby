/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;

import java.util.ArrayList;

class ClassHolder extends MethodHolder
{
	private ArrayList<RubyClass> classes_ = new ArrayList<RubyClass>();

	public RubyClass addClass()
	{
		RubyClass c = new RubyClass();
		return addClass(c);
	}

	public RubyClass addClass(RubyClass c)
	{
		assert(null != c);
		classes_.add(c);
		return c;
	}
	
	public RubyClass getClass(String name)
	{
		assert(name.length() > 0);
		
		for (RubyClass c : classes_)
		{
			if (c.getName() == name)
			{
				return c;
			}
		}

		return null;
	}
}
