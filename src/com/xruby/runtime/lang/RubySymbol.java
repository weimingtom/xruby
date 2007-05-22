/**
 * Copyright 2005-2007 Xue Yong Zhi, Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

public class RubySymbol extends RubyValue {
	private RubyID id;
    
    public RubySymbol(RubyID id) {
    	this.id = id;
    }

    public void setRubyClass(RubyClass klass) {
        throw new RubyException(RubyRuntime.TypeErrorClass, "symbol can't be set class");
    }

    public RubyClass getRubyClass() {
        return RubyRuntime.SymbolClass;
    }

    public RubyClass getSingletonClass() {
    	throw new RubyException(RubyRuntime.TypeErrorClass, "can't define singleton");
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
