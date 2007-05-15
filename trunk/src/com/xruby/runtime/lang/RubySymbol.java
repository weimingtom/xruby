/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.lang.*;

/**
 * TODO right now RuySymbol does not behave like c ruby.
 * Two ':symbol' may be two diffrence instances.
 */
public class RubySymbol extends RubyBasic {
	private RubyID id;
	
    RubySymbol(String s) {
    	this(StringMap.intern(s));
    }
    
    public RubySymbol(RubyID id) {
    	super(RubyRuntime.SymbolClass);
    	this.id = id;
    }

    public String toString() {
        return StringMap.id2name(this.id);
    }

    public boolean equals(Object obj) {
    	if (this == obj) {
    		return true;
    	} else if (!(obj instanceof RubySymbol)) {
            return false;
        } else if (this.id == ((RubySymbol)obj).id) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.id.hashCode();
    }
    
    public RubyID toID() {
    	return this.id;
    }
}
