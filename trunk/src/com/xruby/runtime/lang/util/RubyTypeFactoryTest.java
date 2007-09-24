/**
 * Copyright 2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang.util;

import com.xruby.runtime.builtin.RubyArray;
import com.xruby.runtime.lang.RubyAPI;
import com.xruby.runtime.lang.RubyBlock;
import com.xruby.runtime.lang.RubyClass;
import com.xruby.runtime.lang.RubyConstant;
import com.xruby.runtime.lang.RubyID;
import com.xruby.runtime.lang.RubyModule;
import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;
import com.xruby.runtime.lang.RubyVarArgMethod;
import com.xruby.runtime.lang.annotation.RubyAllocMethod;
import com.xruby.runtime.lang.annotation.RubyLevelClass;
import com.xruby.runtime.lang.annotation.RubyLevelConstant;
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
		
		result = RubyAPI.callNoArgMethod(value, null, RubyID.intern("another_test"));
		assertEquals(RubyConstant.QNIL, result);
		
		result = RubyAPI.callNoArgMethod(value, null, RubyID.intern("test_module"));
		assertEquals(result, result);
		
		RubyValue nil = value.getRubyClass().getConstant("NIL");
		assertEquals(RubyConstant.QNIL, nil);
	}
	
	public void testLoadFactoryTwice() {
		RubyTypeFactory.getModule(ClassFactoryModule.class);
		RubyTypeFactory.getModule(ClassFactoryModule.class);
	}
	
	public void testLoadKlassMethod() {
		RubyTypeFactory.getClass(ClassFactoryValue.class);
		ClassFactoryValue value = new ClassFactoryValue();
		RubyValue result = RubyAPI.callNoArgMethod(value, null, RubyID.intern("klassMethod"));
		assertEquals(RubyConstant.QNIL, result);
	}
	
	@RubyLevelClass(name="ClassFactory", modules="ClassFactoryModule")
	public static class ClassFactoryValue extends RubyValue {
		
		@RubyLevelConstant(name="NIL")		
		public static RubyValue nil = RubyConstant.QNIL;
		
		public RubyClass getRubyClass() {
            return (RubyClass)RubyRuntime.ObjectClass.getConstant("ClassFactory");
        }

        public void setRubyClass(RubyClass klass) {
        	
        }
        
        @RubyAllocMethod
        public static RubyValue alloc(RubyValue receiver) {
        	return RubyConstant.QNIL;
        }
        
        @RubyAllocMethod
        public static RubyValue alloc(RubyValue receiver, RubyValue v) {
        	return RubyConstant.QNIL;
        }
        
		@RubyLevelMethod(name="test", alias="another_test")
		public RubyValue test() {
			return RubyConstant.QNIL;
		}
		
		@RubyLevelMethod(name="noOrOne")
		public RubyValue testNoOrOne() {
			return RubyConstant.QNIL;
		}
		
		@RubyLevelMethod(name="noOrOne")
		public RubyValue testNoOrOne(RubyValue v) {
			return RubyConstant.QNIL;
		}
		
		@RubyLevelMethod(name="klassMethod") 
		public static class MethodClass extends RubyVarArgMethod {
			protected RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block) {
				return RubyConstant.QNIL;
			}
		}
	}
	
	@RubyLevelModule(name="ClassFactoryModule")
	public static class ClassFactoryModule {
		@RubyLevelMethod(name="test_module")
		public static RubyValue testModule(RubyValue receiver) {
			return receiver;
		}
	}
}