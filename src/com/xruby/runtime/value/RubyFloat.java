/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyBasic;
import com.xruby.runtime.lang.RubyRuntime;

public class RubyFloat extends RubyBasic {
    private double value_;

    RubyFloat(double value) {
        super(RubyRuntime.FloatClass);
        value_ = value;
    }

    public double doubleValue() {
        return value_;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //if (!super.equals(o)) return false;

        RubyFloat rubyFloat = (RubyFloat) o;

        if (Double.compare(rubyFloat.value_, value_) != 0) return false;

        return true;
    }

    public int hashCode() {
        long temp = value_ != +0.0d ? Double.doubleToLongBits(value_) : 0L;
        return (int) (temp ^ (temp >>> 32));
    }

}
