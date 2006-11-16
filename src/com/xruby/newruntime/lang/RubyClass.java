package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.*;

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
