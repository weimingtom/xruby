/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Exception_to_s extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = receiver.toString();
		return ObjectFactory.createString(value);
	}
}

public class ExceptionClassBuilder {
	public static void initialize() {
		RubyClass c = RubyRuntime.ExceptionClass;
		c.defineMethod("to_s", new Exception_to_s());
	}
}
