/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

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
		ArrayValue args = new ArrayValue(3, true);
		args.add(ObjectFactory.nilValue);
		args.add(ObjectFactory.createString("ABCD"));
		args.add(ObjectFactory.createFixnum(5432));
		RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue,
								args,
								null,
								"print");

		//puts "hello world"
		RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue,
								new ArrayValue(ObjectFactory.createString("hello, world!")),
								null,
								"print");

		//puts 123
		RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue,
								new ArrayValue(ObjectFactory.createFixnum(123)),
								null,
								"print");

		//puts 1.2
		RubyRuntime.callMethod(ObjectFactory.topLevelSelfValue,
								new ArrayValue(ObjectFactory.createFloat(1.2)),
								null,
								"print");

		//return 123 + 456
		return RubyRuntime.callPublicMethod(ObjectFactory.createFixnum(123),
								new ArrayValue(ObjectFactory.createFixnum(456)),
								null,
								"+");
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
		
		IntegerValue i = (IntegerValue)r.getValue();
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
