package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.RubyString;

public class RubyClass extends RubyClassModuleBase {
	public RubyValue newInstance() {
		return this.newInstance(new RubyValue[0]);
	}
	public RubyValue newInstance(RubyValue[] args) {
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
	
	RubyString getName() {
		// FIXME: classname
		
		RubySymbol symbol = (RubySymbol)this.getIv("__classid__");
		RubyID id = symbol.toID();
		String path = StringMap.id2name(id);
		return RubyString.newString(path);
	}
}
