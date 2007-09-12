/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.ObjectFactory;
import junit.framework.TestCase;

public class RubyValueTest extends TestCase {
    public void test_equals() {
        assertFalse(ObjectFactory.FIXNUM1.equals(RubyConstant.QNIL));
        assertFalse(RubyConstant.QNIL.equals(ObjectFactory.FIXNUM1));
    }
    
    public void testTrue() {
    	assertTrue(RubyConstant.QTRUE.isTrue());
    	assertFalse(RubyConstant.QFALSE.isTrue());
    	assertFalse(RubyConstant.QNIL.isTrue());
    	assertTrue(ObjectFactory.FIXNUM0.isTrue());
    	assertTrue(ObjectFactory.FIXNUM1.isTrue());
    	assertTrue(ObjectFactory.createString("").isTrue());
    	assertTrue((ObjectFactory.createString("XXX").isTrue()));
    }
    
    public void testRespondTo() {
    	RubyValue v = RubyConstant.QNIL;
    	assertTrue(v.respondTo(RubyID.RESPOND_TO_P));
    	assertFalse(v.respondTo(RubyID.intern("balabala")));
    }
    
    public void testConvertoInt() {
    	RubyValue v = ObjectFactory.createFixnum(0);
    	assertEquals(0, v.toInt());
    	    	
    	v = RubyConstant.QTRUE;
    	try {
    		v.toInt();
    		fail("true can't be convert to true");
    	} catch (RubyException e) {    		
    	}
    }
}
