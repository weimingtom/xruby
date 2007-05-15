/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

public class RubySymbol extends RubyBasic {
	private RubyID id;
    
    public RubySymbol(RubyID id) {
    	super(RubyRuntime.SymbolClass);
    	this.id = id;
    }

    public String toString() {
        return StringMap.id2name(this.id);
    }

    public int hashCode() {
        return this.id.hashCode();
    }
    
    public RubyID toID() {
    	return this.id;
    }
}
