/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

public class RubyFloat extends RubyBasic {
	private double value_;
	
	RubyFloat(double value) {
		super(RubyRuntime.FloatClass);
		value_ = value;
	}

	public double doubleValue() {
		return value_;
	}
	
	public int toInt() {
		return (int)this.value_;
	}
}
