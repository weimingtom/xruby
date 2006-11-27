/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.parser.symboltable;

import java.util.HashMap;
import java.util.Map;

class RubyMethodVariable
{
	protected String name_;

	public RubyMethodVariable(String name)
	{
		assert(null != name);
		name_ = name;
	}

	public String getName()
	{
		return name_;
	}
}

class RubyMethodLocalVariable extends RubyMethodVariable
{	
	public RubyMethodLocalVariable(String name)
	{
		super(name);
	}
}

class RubyMethodParameter extends RubyMethodVariable
{	
	public RubyMethodParameter(String name)
	{
		super(name);
	}
}

class LocalVariableHolder
{
	private Map<String, RubyMethodLocalVariable> local_variable_ = new HashMap<String, RubyMethodLocalVariable>();

	public void addLocalVariable(String name)
	{
		assert(null != name);
		RubyMethodLocalVariable v = new RubyMethodLocalVariable(name);
		local_variable_.put(name, v);
	}

	public RubyMethodLocalVariable getLocalVariable(String name)
	{
		assert(null != name);
		return local_variable_.get(name);
	}
}
