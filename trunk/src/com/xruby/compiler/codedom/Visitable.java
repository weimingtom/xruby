/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.compiler.codedom;

interface Visitable {
	public void accept(CodeVisitor visitor);
}
