package com.xruby.runtime.value;

import java.math.BigInteger;

import com.xruby.runtime.lang.RubyRuntime;
import com.xruby.runtime.lang.RubyValue;

import junit.framework.TestCase;

public class BignumValueTest extends TestCase {
	
	public void testToStringLittle() throws Exception{
		BignumValue v = new BignumValue("0");
		for (int i=2; i<=36; ++i){
			String s = v.to_s();
			assertEquals(s, "0");
		}
		
		v = new BignumValue("1");
		for (int i=2; i<=36; ++i){
			String s = v.to_s();
			assertEquals(s, "1");
		}
		
		v = new BignumValue("-1");
		for (int i=2; i<=36; ++i){
			String s = v.to_s();
			assertEquals(s, "-1");
		}
	}
	
	public void testToStringBig(){
		BignumValue v = new BignumValue("123456789abcdef0", 16);
		String s = v.to_s();
		assertEquals(s, "1311768467463790320");
		
		v = new BignumValue("123456789abcdef0987654321fedcab0", 16);
		s = v.to_s();
		assertEquals(s, "24197857203266734874467610118318836400");
	}
	
	public void testMultiply() {
		// Bignum * Fixnum == Fixnum ( < Integer.MAX_VALUE )
		BignumValue v = new BignumValue("100");
		RubyValue a = ObjectFactory.createFixnum(30);
		RubyValue result = v.op_mul(a);
		assertEquals(result.getRubyClass(), RubyRuntime.FixnumClass);
		IntegerValue fixnumValue = (IntegerValue)result.getValue();
		assertEquals(fixnumValue.intValue(), 3000);
		
		// Bignum * Bignum == Fixnum ( < Integer.MAX_VALUE )
		a = ObjectFactory.createBignum(BigInteger.valueOf(30));
		result = v.op_mul(a);
		assertEquals(result.getRubyClass(), RubyRuntime.FixnumClass);
		fixnumValue = (IntegerValue)result.getValue();
		assertEquals(fixnumValue.intValue(), 3000);
		
		// Bignum * Fixnum == Bignum ( > Integer.MAX_VALUE )
		a = ObjectFactory.createFixnum(0x7fffffff);
		result = v.op_mul(a);
		assertEquals(result.getValue().getClass(), BignumValue.class);
		BignumValue bignumValue = (BignumValue)result.getValue();
		assertEquals(bignumValue.getValue().compareTo(BigInteger.valueOf(0x7fffffffL * 100)), 0);	
		
		// Bignum * Fixnum == Bignum ( < Integer.MIN_VALUE )
		v.setValue(BigInteger.valueOf(-100));
		a = ObjectFactory.createFixnum(0x7fffffff);
		result = v.op_mul(a);
		assertEquals(result.getValue().getClass(), BignumValue.class);
		bignumValue = (BignumValue)result.getValue();
		assertEquals(bignumValue.getValue().compareTo(BigInteger.valueOf(0x7fffffffL * -100)), 0);
		
		//  Bignum * Float = Float
		a = ObjectFactory.createFloat(0.1);
		result = v.op_mul(a);
		assertEquals(result.getValue().getClass(), RubyFloat.class);
		RubyFloat floatValue = (RubyFloat)result.getValue();
		assertEquals(floatValue.doubleValue(), -100 * 0.1);
		
		// Bignum * Float = Float
		v.setValue(new BigInteger("100000000000000000000"));
		a = ObjectFactory.createFloat(0.1);
		result = v.op_mul(a);
		assertEquals(result.getValue().getClass(), RubyFloat.class);
		floatValue = (RubyFloat)result.getValue();
		assertEquals(floatValue.doubleValue(), 1.0e19);
	}
}
