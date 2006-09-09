/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.core.lang;

import com.xruby.core.builtin.*;

import java.io.*;
import junit.framework.TestCase;

class TestingProgram implements RubyProgram {
	
	public static void main(String[] args) {
		try {
			new TestingProgram().run(); 
		} catch (RubyException e) {
			e.printStackTrace();
		}
	}
	
	public RubyValue run() throws RubyException {

		//puts nil, "abC", "5432"
		RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue, new RubyValue[] {ObjectFactory.nilValue,
				ObjectFactory.createString("ABCD"),
				ObjectFactory.createFixnum(5432)},
									null, "print");

		//puts "hello world"
		RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue, new RubyValue[] {ObjectFactory.createString("hello, world!")},
									null, "print");

		//puts 123
		RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue, new RubyValue[] {ObjectFactory.createFixnum(123)},
									null, "print");

		//puts 1.2
		RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue, new RubyValue[] {ObjectFactory.createFloat((float)1.2)},
									null, "print");

		//return 123 + 456
		return RubyRuntime.callPublicMethod(ObjectFactory.createFixnum(123),
				new RubyValue[] {ObjectFactory.createFixnum(456)},
									null, "+");
	}
}

public class RubyProgramTest extends TestCase {

	public void test_output() throws RubyException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream original = System.out;
		System.setOut(new PrintStream(output));
		
		RubyProgram p = new TestingProgram();
		RubyValue r = p.run();
		
		System.setOut(original);
		
		Integer i = (Integer)r.getValue();
		assertEquals(579, i.intValue());

		String expected = 
			"nil" +
			"ABCD" +
			"5432" +
			"hello, world!" +
			"123" +
			"1.2";
		assertEquals(expected, output.toString());
	}

}
