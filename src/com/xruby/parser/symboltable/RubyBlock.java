/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.parser.symboltable;

import java.util.HashMap;
import java.util.Map;

class RubyBlock extends LocalVariableHolder
{
	protected Map<String, RubyMethodParameter> parameters_ = new HashMap<String, RubyMethodParameter>();

	public void addParameter(String name)
	{
		assert(null != name);
		RubyMethodParameter p = new RubyMethodParameter(name);
		parameters_.put(name, p);
	}

	public int getNumberOfParameter()
	{
		return parameters_.size();
	}
	
	public RubyMethodParameter getParameter(String name)
	{
		assert(null != name);
		return parameters_.get(name);
	}
	
	public RubyMethodVariable getVariable(String name)
	{
		assert(null != name);
		RubyMethodVariable v = getLocalVariable(name);
		if (null != v)
		{
			return v;
		}

		return getParameter(name);
	}
	
	/// override addLocalVariable(), do not add if @name is a parameter
	public void addLocalVariable(String name)
	{
		assert(null != name);
		
		if (null == getParameter(name))
		{
			super.addLocalVariable(name);
		}
	}
}
