package com.xruby.runtime.value;

import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyException;
import com.xruby.runtime.lang.RubyModule;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.lang.annotation.RubyLevelObject;

@RubyLevelObject(objectClass="Object")
public class RubyTopSelf {
	@RubyLevelMethod(name="include", singleton=true)
	public static RubyValue include(RubyValue receiver) {
        assert(RubyRuntime.TOP_LEVEL_SELF_VALUE == receiver);
        return RubyRuntime.ObjectClass;
    }
	
	@RubyLevelMethod(name="include", singleton=true)
	public static RubyValue include(RubyValue receiver, RubyValue arg) {
		assert(RubyRuntime.TOP_LEVEL_SELF_VALUE == receiver);
		
		RubyClass c = arg.getRubyClass().getRealClass();
		if (c != RubyRuntime.ModuleClass) {
			throw new RubyException(RubyRuntime.TypeErrorClass, "wrong argument type " + c.getName() + " (expected Module)");
		}
		RubyRuntime.ObjectClass.includeModule((RubyModule)arg);

		return RubyRuntime.ObjectClass;
    }
	
	@RubyLevelMethod(name="include", singleton=true)
	public static RubyValue include(RubyValue receiver, RubyArray args) {
        assert(RubyRuntime.TOP_LEVEL_SELF_VALUE == receiver);

        for (RubyValue v : args) {
            RubyClass c = v.getRubyClass().getRealClass();
            if (c != RubyRuntime.ModuleClass) {
                throw new RubyException(RubyRuntime.TypeErrorClass, "wrong argument type " + c.getName() + " (expected Module)");
            }
            RubyRuntime.ObjectClass.includeModule((RubyModule) v);
        }

        return RubyRuntime.ObjectClass;
    }
}
