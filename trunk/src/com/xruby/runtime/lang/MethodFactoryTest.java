/**
 * Copyright 2006-2007 Ye Zheng
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import com.xruby.runtime.value.RubyArray;

import junit.framework.TestCase;

public class MethodFactoryTest extends TestCase {
	private MethodFactory f;
	
	protected void setUp() throws Exception {
		this.f = MethodFactory.createMethodFactory(RubyTestValue.class);
	}

	protected void tearDown() throws Exception {
		this.f = null;
	}
	
	public void testNoArgMethod() {
		RubyMethod m = f.getMethod("noArgMethod", 0);
		RubyTestValue v = new RubyTestValue();
		RubyValue result = m.invoke(v, null);
		assertEquals(RubyConstant.QNIL, result);
	}
	
	public void testOneArgMethod() {
		RubyMethod m = f.getMethod("oneArgMethod", 1);
		RubyTestValue v = new RubyTestValue();
		RubyValue result = m.invoke(v, v, null);
		assertEquals(v, result);
	}
	
	public void testNoArgMethodWithBlock() {	
		RubyMethod m = f.getMethodWithBlock("noArgMethod", 0);
		RubyTestValue v = new RubyTestValue();
		RubyValue result = m.invoke(v, new RubyTestBlock());
		assertEquals(RubyConstant.QNIL, result);		
	}
	
	public void testOneArgMethodWithBlock() {
		RubyMethod m = f.getMethodWithBlock("oneArgMethod", 1);
		RubyTestValue v = new RubyTestValue();
		RubyValue result = m.invoke(v, v, new RubyTestBlock());
		assertEquals(v, result);
	}
	
	public void testVarArgMethod() {
		RubyMethod m = f.getMethod("varArgMethod", -1);
		RubyTestValue v = new RubyTestValue();
		RubyArray a = ObjectFactory.createArray(1, v);
		RubyValue result = m.invoke(v, a, null);
		assertEquals(v, result);
	}
	
	public void testVarArgMethodWithBlock() {
		RubyMethod m = f.getMethodWithBlock("varArgMethod", -1);
		RubyTestValue v = new RubyTestValue();
		RubyArray a = ObjectFactory.createArray(1, v);
		RubyValue result = m.invoke(v, a, null);
		assertEquals(v, result);
	}
	
	public void testTryLoadMethodTwice() {
		RubyMethod m0 = f.getMethod("loadTwiceMethod", 0);
		RubyMethod m1 = f.getMethod("loadTwiceMethod", 0);
		assertNotSame(m0, m1);
	}
	
	public static class RubyTestValue extends RubyValue {
		public RubyClass getRubyClass() {
			return null;
		}

		public void setRubyClass(RubyClass klass) {
		}
		
		public RubyValue noArgMethod() {
			return RubyConstant.QNIL;
		}
		
		public RubyValue oneArgMethod(RubyValue v) {
			return v;
		}
		
		public RubyValue noArgMethod(RubyBlock block) {
			return RubyConstant.QNIL;
		}
		
		public RubyValue oneArgMethod(RubyValue v, RubyBlock block) {
			return v;
		}
		
		public RubyValue varArgMethod(RubyArray a) {
			return a.get(0);
		}
		
		public RubyValue varArgMethod(RubyArray a, RubyBlock block) {
			return a.get(0);
		}
		
		public RubyValue loadTwiceMethod() {
			return RubyConstant.QNIL;
		}
	}
	
	private static class RubyTestBlock extends RubyNoArgBlock {
		public RubyTestBlock() {
			super(null, null, null, null, null, false);
		}

		protected RubyValue run(RubyValue receiver) {
			return receiver;
		}
	}
}
