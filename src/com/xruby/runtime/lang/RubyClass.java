package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

public class RubyClass extends RubyClassModuleBase {
	public RubyValue newInstance() {
		return this.newInstance(RubyMethod.NULL_ARG);
	}

	public RubyValue newInstance(RubyArray args) {
		return this.callMethod("new", args);
	}
	
	void attachSingletonClass(RubyValue obj) {
		if (this.isSingleton()) {
			ensureIvTableNotNull();
			RubyID id = StringMap.intern("__attached__");
			this.ivTable.put(id, obj);			
		}
	}
	
	void setName(RubyID id) {
		this.setIv("__classid__", id.toSymbol());
	}
}
