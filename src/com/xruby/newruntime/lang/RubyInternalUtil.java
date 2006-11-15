package com.xruby.newruntime.lang;

import com.xruby.newruntime.value.*;

class RubyInternalUtil {
	static RubyClass createMetaClass(RubyBasic obj, RubyClass superclass) {
		return RubyRuntime.coreBuilder.createMetaClass(obj, superclass);
	}
	
	static void nameError(RubyID id, String fmt, Object... args) {
		String msg = String.format(fmt, args);
		RubyValue e = RubyRuntime.nameError.newInstance(
				new RubyArray(ObjectFactory.createString(msg), id.toSymbol())
				);
		throw new RubyException(e, msg);
	}
	
	private RubyInternalUtil() {		
	}
}