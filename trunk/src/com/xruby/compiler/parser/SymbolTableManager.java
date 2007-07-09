/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.parser;

import java.util.*;

public class SymbolTableManager {
	private Stack<SymbolTable> stack_ = new Stack<SymbolTable>();
	
	public SymbolTableManager(String[] pre_defined) {
		enterScope();
		
		if (null == pre_defined) {
			return;
		}
		for (String s : pre_defined) {
			addVariable(s);
		}
	}
	
	public void enterScope() {
		stack_.add(new SymbolTable());
	}
	
	public void enterBlockScope() {
		stack_.add(new SymbolTableForBlock(stack_.peek()));
	}
	
	public void leaveScope() {
		stack_.pop();
	}
	
	public boolean isDefinedInCurrentScope(String s) {
		return stack_.peek().findVariable(s);
	}
	
	public void addVariable(String s) {
		stack_.peek().addVariable(s);
	}
}
