/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import com.xruby.runtime.lang.*;

/**
 * TODO right now RuySymbol does not behave like c ruby.
 * Two ':symbol' may be two diffrence instances.
 */
public class RubySymbol extends RubyBasic {

    private String value_;

    RubySymbol(String s) {
        super(RubyRuntime.SymbolClass);
        value_ = s.intern();
    }

    public String toString() {
        return value_;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RubySymbol)) {
            return false;
        } else if (value_.equals(((RubySymbol)obj).value_)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return value_.hashCode();
    }

}
