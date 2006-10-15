/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

public interface RubyProgram {
	
	public RubyValue run() throws RubyException;
}
