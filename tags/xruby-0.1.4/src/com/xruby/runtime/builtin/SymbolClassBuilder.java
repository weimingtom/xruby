/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Symbol_id2name extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		return ObjectFactory.createString(value);
	}
}

class Symbol_inspect extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		return ObjectFactory.createString(":" + value);
	}
}

public class SymbolClassBuilder {
	
	public static void initialize() {
		RubyClass c = RubyRuntime.SymbolClass;
		c.defineMethod("id2name", new Symbol_id2name());
		c.defineMethod("inspect", new Symbol_inspect());
	}
}
