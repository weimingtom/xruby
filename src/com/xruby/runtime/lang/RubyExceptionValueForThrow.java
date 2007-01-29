/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public class RubyExceptionValueForThrow extends RubyExceptionValue {

	private RubySymbol symbol_;
	private RubyValue returnValue_;
	
	public RubyExceptionValueForThrow(RubySymbol symbol, RubyValue returnValue) {
		super(RubyRuntime.NameErrorClass, "uncaught throw `" + symbol.toString() + "'");
		symbol_= symbol;
		returnValue_ = returnValue;
	}
	
	public boolean isSameSymbol(RubySymbol another) {
		return symbol_.toString() == another.toString();
	}

	public RubyValue getReturnValue() {
		return returnValue_;
	}
}
