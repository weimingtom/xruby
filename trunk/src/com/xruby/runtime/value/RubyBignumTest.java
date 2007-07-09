/** 
 * Copyright 2006-2007 Jie Li
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.runtime.value;

import java.math.BigInteger;

import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

import junit.framework.TestCase;

public class RubyBignumTest extends TestCase {
	
	public void testToStringLittle() throws Exception{
		RubyBignum v = new RubyBignum("0");
		for (int i=2; i<=36; ++i){
			String s = v.to_s();
			assertEquals(s, "0");
		}
		
		v = new RubyBignum("1");
		for (int i=2; i<=36; ++i){
			String s = v.to_s();
			assertEquals(s, "1");
		}
		
		v = new RubyBignum("-1");
		for (int i=2; i<=36; ++i){
			String s = v.to_s();
			assertEquals(s, "-1");
		}
	}
	
	public void testToStringBig(){
		RubyBignum v = new RubyBignum("123456789abcdef0", 16);
		String s = v.to_s();
		assertEquals(s, "1311768467463790320");
		
		v = new RubyBignum("123456789abcdef0987654321fedcab0", 16);
		s = v.to_s();
		assertEquals(s, "24197857203266734874467610118318836400");
	}
	
	public void testMultiply() {
		// Bignum * Fixnum == Fixnum ( < Integer.MAX_VALUE )
		RubyBignum v = new RubyBignum("100");
		RubyValue a = ObjectFactory.createFixnum(30);
		RubyValue result = v.op_mul(a);
		assertEquals(result.getRubyClass(), RubyRuntime.FixnumClass);
		RubyFixnum fixnumValue = (RubyFixnum)result;
		assertEquals(fixnumValue.intValue(), 3000);
		
		// Bignum * Bignum == Fixnum ( < Integer.MAX_VALUE )
		a = ObjectFactory.createBignum(BigInteger.valueOf(30));
		result = v.op_mul(a);
		assertEquals(result.getRubyClass(), RubyRuntime.FixnumClass);
		fixnumValue = (RubyFixnum)result;
		assertEquals(fixnumValue.intValue(), 3000);
		
		// Bignum * Fixnum == Bignum ( > Integer.MAX_VALUE )
		a = ObjectFactory.createFixnum(0x7fffffff);
		result = v.op_mul(a);
		assertEquals(result.getClass(), RubyBignum.class);
		RubyBignum bignumValue = (RubyBignum)result;
		assertEquals(bignumValue.getInternal().compareTo(BigInteger.valueOf(0x7fffffffL * 100)), 0);	
		
		// Bignum * Fixnum == Bignum ( < Integer.MIN_VALUE )
		v.setValue(BigInteger.valueOf(-100));
		a = ObjectFactory.createFixnum(0x7fffffff);
		result = v.op_mul(a);
		assertEquals(result.getClass(), RubyBignum.class);
		bignumValue = (RubyBignum)result;
		assertEquals(bignumValue.getInternal().compareTo(BigInteger.valueOf(0x7fffffffL * -100)), 0);
		
		//  Bignum * Float = Float
		a = ObjectFactory.createFloat(0.1);
		result = v.op_mul(a);
		assertEquals(result.getClass(), RubyFloat.class);
		RubyFloat floatValue = (RubyFloat)result;
		assertEquals(floatValue.doubleValue(), -100 * 0.1);
		
		// Bignum * Float = Float
		v.setValue(new BigInteger("100000000000000000000"));
		a = ObjectFactory.createFloat(0.1);
		result = v.op_mul(a);
		assertEquals(result.getClass(), RubyFloat.class);
		floatValue = (RubyFloat)result;
		assertEquals(floatValue.doubleValue(), 1.0e19);
	}
}
