/** 
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyID;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public class RubyFloat extends RubyNumeric {
	private RubyClass klass;
	private double value_;
	
	RubyFloat(double value) {
		value_ = value;
		this.klass = RubyRuntime.FloatClass;
	}
	
	public RubyClass getRubyClass() {
		return this.klass;
	}

	public void setRubyClass(RubyClass klass) {
		this.klass = klass;
	}

	public double doubleValue() {
		return value_;
	}
	
	public int toInt() {
		return (int)this.value_;
	}

	public double toFloat() {
		return this.value_;
	}

	public RubyFloat toRubyFloat() {
		return this;
	}
	
	public RubyArray coerce(RubyValue v) {
		return new RubyArray(v.toRubyFloat(), this);
	}
	
	public RubyValue opPlus(RubyValue v) {
		if (v instanceof RubyFixnum) {
			return ObjectFactory.createFloat(this.value_ + v.toFloat());
		} else if (v instanceof RubyBignum) {
			return ObjectFactory.createFloat(this.value_ + v.toFloat());
		} else if (v instanceof RubyFloat) {
			return ObjectFactory.createFloat(this.value_ + v.toFloat());
		} else {
			return this.coerceBin(RubyID.plusID, v);
		}
	}
	
	public RubyValue opMinus(RubyValue v) {
		if (v instanceof RubyFixnum) {
			return ObjectFactory.createFloat(this.value_ - v.toFloat());
		} else if (v instanceof RubyBignum) {
			return ObjectFactory.createFloat(this.value_ - v.toFloat());
		} else if (v instanceof RubyFloat) {
			return ObjectFactory.createFloat(this.value_ - v.toFloat());
		} else {
			return this.coerceBin(RubyID.subID, v);
		}
	}
	
	public RubyValue opMul(RubyValue v) {	
		if (v instanceof RubyFixnum) {
			return ObjectFactory.createFloat(this.value_ * v.toFloat());
		} else if (v instanceof RubyBignum) {
			return ObjectFactory.createFloat(this.value_ * v.toFloat());
		} else if (v instanceof RubyFloat) {
			return ObjectFactory.createFloat(this.value_ * v.toFloat());
		} else {
			return this.coerceBin(RubyID.mulID, v);
		}
	}
	
	public RubyValue opDiv(RubyValue v) {	
		if (v instanceof RubyFixnum) {
			return ObjectFactory.createFloat(this.value_ / v.toFloat());
		} else if (v instanceof RubyBignum) {
			return ObjectFactory.createFloat(this.value_ / v.toFloat());
		} else if (v instanceof RubyFloat) {
			return ObjectFactory.createFloat(this.value_ / v.toFloat());
		} else {
			return this.coerceBin(RubyID.divID, v);
		}
	}
}
