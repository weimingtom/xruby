/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.parser.symboltable;

import java.util.ArrayList;

class ModuleHolder extends ClassHolder
{
	private ArrayList<RubyModule> modules_ = new ArrayList<RubyModule>();
	
	public RubyModule addModule()
	{
		RubyModule m = new RubyModule();
		modules_.add(m);
		return m;
	}

	public RubyModule getModule(String name)
	{
		assert(name.length() > 0);
		
		for (RubyModule m : modules_)
		{
			if (m.getName() == name)
			{
				return m;
			}
		}
		
		return null;
	}
}

