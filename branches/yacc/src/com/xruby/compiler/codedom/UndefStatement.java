/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codedom;

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
