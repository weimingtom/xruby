/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Symbol_id2name extends RubyMethod {
	public Symbol_id2name() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		return ObjectFactory.createString(value);
	}
}

class Symbol_inspect extends RubyMethod {
	public Symbol_inspect() {
		super(0);
	}

	protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		return ObjectFactory.createString(":" + value);
	}
}

public class SymbolClassBuilder {
	
	public static RubyClass create() {
		RubyClass c = RubyRuntime.GlobalScope.defineNewClass("Symbol", RubyRuntime.ObjectClass);
		c.defineMethod("id2name", new Symbol_id2name());
		c.defineMethod("inspect", new Symbol_inspect());
		return c;
	}
}
