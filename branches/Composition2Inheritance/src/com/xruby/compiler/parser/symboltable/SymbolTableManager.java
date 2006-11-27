/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.parser.symboltable;

public class SymbolTableManager
{
	protected SymbolTable symbol_table_ = new SymbolTable();
	protected RubyModule current_module_ = null;
	protected RubyClass current_class_ = null;
	protected RubyMethod current_method_ = null;
	protected RubyBlock current_block_ = null;

	public SymbolTableManager(){
		//Add builtin types to symbol table
		addLocalVarible("Object");
		addLocalVarible("NilClass");
		addLocalVarible("TrueClass");
		addLocalVarible("FalseClass");
		addLocalVarible("Numeric");
		addLocalVarible("Integer");
		addLocalVarible("Fixnum");
		addLocalVarible("Float");
		addLocalVarible("String");
		addLocalVarible("Exception");
		addLocalVarible("RuntimeError");
		addLocalVarible("Array");
		addLocalVarible("Hash");
		addLocalVarible("Class");
	}
	
	public RubyModule enterModule()
	{
		current_module_ = symbol_table_.addModule();
		return current_module_;
	}

	public void leaveBlock()
	{
		//assert(null != current_block_);
		current_block_ = null;
	}

	public void leaveMethod()
	{
		assert(null != current_method_);
		current_method_ = null;
	}

	public void leaveClass()
	{
		assert(null != current_class_);
		current_class_ = null;
	}

	public void leaveModule()
	{
		//assert(null != current_module_);
		current_module_ = null;
	}

	public RubyClass enterClass()
	{
	
		if (null != current_module_)
		{
			current_class_ = current_module_.addClass();
			return current_class_;
		}
		else
		{
			current_class_ = symbol_table_.addClass();
			return current_class_;
		}
	}

	public void enterBlock()
	{
		//TODO error checking: block can not be in another block
		//For now, block belongs to nobody.
		current_block_ = new RubyBlock();
	}

	public RubyMethod enterMethod()
	{
		if (null != current_class_)
		{
			current_method_ = current_class_.addMethod();
			return current_method_;
		}
		else if (null != current_module_)
		{
			current_method_ = current_module_.addMethod();
			return current_method_;
		}
		else
		{
			current_method_ = symbol_table_.addMethod();
			return current_method_;
		}
	}

	public void addBlockParameter(String name)
	{
		if (null != current_block_)
		{
			current_block_.addParameter(name);
		}
	}

	public void addParameter(String name)
	{
		if (null != current_method_)
		{
			current_method_.addParameter(name);
		}
	}

	//If not declared as parameter yet, add as local varible.
	public void addLocalVarible(String name)
	{
		if (null != current_method_)
		{
			//System.out.println("Add " + name + " to current method");
			current_method_.addLocalVariable(name);
			return;
		}
		else if(null != current_class_)
		{
			//System.out.println("Add " + name + " to current class");
			current_class_.addLocalVariable(name);
			return;
		}
		else
		{
			//System.out.println("Add " + name + " to symbol table");
			symbol_table_.addLocalVariable(name);
			return;
		}
		
	}
	
	public RubyMethodVariable getVariable(String name)
	{
		if (null != current_block_)
		{
			RubyMethodVariable v = current_block_.getVariable(name);
			if (null != v)
			{
				return v;
			}
		}

		if (null != current_method_)
		{
			return current_method_.getVariable(name);
		}
		else if (null != current_class_)
		{
			return current_class_.getLocalVariable(name);
		}
		else if (null != current_module_)
		{
			return current_module_.getLocalVariable(name);
		}
		else
		{
			return symbol_table_.getLocalVariable(name);
		}
	}

}

