package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyID;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

public abstract class RubyNumeric extends RubyValue {
	public RubyArray coerce(RubyValue v) {
		if (this.getRubyClass() == v.getRubyClass()) {
			return new RubyArray(v, this);
		}
		
		return new RubyArray(v.toRubyFloat(), this.toRubyFloat());
	}
	
	protected final RubyValue coerceBin(RubyID id, RubyValue v) {
		RubyArray array = doDoerce(v, true);
		return RubyAPI.callOneArgMethod(array.get(0), array.get(1), null, id);
	}
	
	private RubyArray doDoerce(RubyValue v, boolean err) {
		RubyValue result;
        try {
            result = coerceBody(v);
        } catch (RubyException e) {
        	if (err) {
        		throw new RubyException(RubyRuntime.TypeErrorClass,	
        				v.getRubyClass().getName() + " can't be coerced into " + this.getRubyClass().getName());
        	}
        	return null;
        }
    
        if (!(result instanceof RubyArray) || ((RubyArray) result).size() != 2) {
        	throw new RubyException(RubyRuntime.TypeErrorClass, "coerce must return [x, y]");
        }
        
        return (RubyArray) result;
	}
	
	private RubyValue coerceBody(RubyValue v) {
		return RubyAPI.callOneArgMethod(v, this, null, RubyID.coerceID);
	}
}
