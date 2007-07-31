/** 
 * Copyright 2005-2007 Xue Yong Zhi, Yu Zhang
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.lang.annotation.RubyAllocMethod;
import com.xruby.runtime.lang.annotation.RubyLevelClass;

@RubyLevelClass(name="Object", superclass="")
public class RubyObject extends RubyBasic {
	public RubyObject(RubyClass c) {
		super(c);
	}
	
	@RubyAllocMethod
	public static RubyValue alloc(RubyValue receiver) {
		return new RubyObject((RubyClass)receiver);
	}
}
