package com.xruby.runtime.lang;

import java.util.HashMap;
import java.util.Map;

public abstract class RubyIvBase extends RubyBasic {
	protected Map<RubyID, RubyValue> ivTable;

	protected RubyValue getIvar(RubyID id) {
		ensureIvTableNotNull();
		
		return this.ivTable.get(id);
	}

	protected void setInstanceVariable(RubyID id, RubyValue value) {
		ensureIvTableNotNull();
		
		this.ivTable.put(id, value);
	}
	
	protected void removeIvar(RubyID id) {
		if (this.ivTable != null) {
			this.ivTable.remove(id);
		}
	}
	
	protected void ensureIvTableNotNull() {
		if (this.ivTable == null) {
			this.ivTable = new HashMap<RubyID, RubyValue>();
		}
	}
	
	public int getIvSize() {
		return this.ivTable == null ? 0 : this.ivTable.size();
	}
}
