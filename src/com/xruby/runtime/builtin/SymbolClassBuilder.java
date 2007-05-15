/** 
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.builtin;

import com.xruby.runtime.lang.*;
import com.xruby.runtime.value.*;

class Symbol_toI extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		RubyID id = ((RubySymbol)receiver).toID();
		return id.toFixnum();
	}
}

class Symbol_inspect extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		return ObjectFactory.createString(":" + value);
	}
}

class Symbol_toS extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		return ObjectFactory.createString(value);
	}
}

class Symbol_id2name extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		String value = ((RubySymbol)receiver).toString();
		return ObjectFactory.createString(value);
	}
}

class Symbol_toSym extends RubyNoArgMethod {
	protected RubyValue run(RubyValue receiver, RubyBlock block) {
		return receiver;
	}
}

public class SymbolClassBuilder {	
	public static void initialize() {
		RubyClass c = RubyRuntime.SymbolClass;

		c.defineMethod("to_i", new Symbol_toI());
		c.defineMethod("to_int", new Symbol_toI());
		c.defineMethod("inspect", new Symbol_inspect());
		c.defineMethod("to_s", new Symbol_toS());
		c.defineMethod("id2name", new Symbol_id2name());
		c.defineMethod("to_sym", new Symbol_toSym());
	}
}
