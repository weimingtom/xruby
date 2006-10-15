/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;

import java.util.ArrayList;

class MethodHolder extends LocalVariableHolder
{
	private ArrayList<RubyMethod> methods_ = new ArrayList<RubyMethod>();

	public RubyMethod addMethod()
	{
		RubyMethod m = new RubyMethod();
		methods_.add(m);
		return m;
	}
	
	public RubyMethod getMethod(String name)
	{
		assert(name.length() > 0);
		
		for (RubyMethod m : methods_)
		{
			if (m.getName() == name)
			{
				return m;
			}
		}
		
		return null;
	}
}
