package com.xruby.runtime.lang.util;

import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyID;
import com.xruby.runtime.lang.RubyModule;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelMethod;
import com.xruby.runtime.lang.annotation.RubyLevelModule;

import junit.framework.TestCase;

public class RubyTypeFactoryTest extends TestCase {
	public void testDefineClass() {
		RubyModule module = RubyTypeFactory.getModule(ClassFactoryModule.class);
		assertNotNull(module);
		
		RubyClass klass = RubyTypeFactory.getClass(ClassFactoryValue.class);
		assertNotNull(klass);
		
		ClassFactoryValue value = new ClassFactoryValue();
		RubyValue result = RubyAPI.callNoArgMethod(value, null, RubyID.intern("test"));
		assertEquals(RubyConstant.QNIL, result);
		
		result = RubyAPI.callNoArgMethod(value, null, RubyID.intern("test_module"));
		assertEquals(result, result);
	}
	
	public void testLoadFactoryTwice() {
		RubyTypeFactory.getModule(ClassFactoryModule.class);
		RubyTypeFactory.getModule(ClassFactoryModule.class);
	}
	
	@RubyLevelClass(name="ClassFactory", modules="ClassFactoryModule")
	public static class ClassFactoryValue extends RubyValue {
		public RubyClass getRubyClass() {
            return (RubyClass)RubyRuntime.ObjectClass.getConstant("ClassFactory");
        }

        public void setRubyClass(RubyClass klass) {
        	
        }
        
		@RubyLevelMethod(name="test", type=MethodType.NO_ARG)
		public RubyValue test() {
			return RubyConstant.QNIL;
		}
	}
	
	@RubyLevelModule(name="ClassFactoryModule")
	public static class ClassFactoryModule {
		@RubyLevelMethod(name="test_module", type=MethodType.NO_ARG)
		public static RubyValue testModule(RubyValue receiver) {
			return receiver;
		}
	}
}