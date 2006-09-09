/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.codedom;

import java.util.*;

public class UndefStatement extends Statement {
	private ArrayList<String> names_ = new ArrayList<String>();

	public void add(String name) {
		names_.add(name);//TODO duplication?
	}
	
	public void accept(CodeVisitor visitor) {
		for (String name : names_) {
			visitor.visitUndef(name);
		}
		
	}
	
	
}
