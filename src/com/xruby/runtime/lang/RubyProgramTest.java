/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby.runtime.lang;

import com.xruby.runtime.value.*;

import java.io.*;
import junit.framework.TestCase;

class TestingProgram extends RubyProgram {
	
	public static void main(String[] args) {
		try {
			new TestingProgram().run(); 
		} catch (RubyException e) {
			e.printStackTrace();
		}
	}
	
	public RubyValue run(RubyValue receiver, RubyArray args, RubyBlock block, RubyModule scope) {
		
		//puts nil, "abC", "5432"
		RubyArray a = new RubyArray(3, true);
		a.add(ObjectFactory.nilValue);
		a.add(ObjectFactory.createString("ABCD"));
		a.add(ObjectFactory.createFixnum(5432));
		RubyAPI.callMethod(ObjectFactory.topLevelSelfValue,
								a,
								null,
								"print");

		//puts "hello world"
		RubyAPI.callMethod(ObjectFactory.topLevelSelfValue,
								new RubyArray(ObjectFactory.createString("hello, world!")),
								null,
								"print");

		//puts 123
		RubyAPI.callMethod(ObjectFactory.topLevelSelfValue,
								new RubyArray(ObjectFactory.createFixnum(123)),
								null,
								"print");

		//puts 1.2
		RubyAPI.callMethod(ObjectFactory.topLevelSelfValue,
								new RubyArray(ObjectFactory.createFloat(1.2)),
								null,
								"print");

		//return 123 + 456
		return RubyAPI.callPublicMethod(ObjectFactory.createFixnum(123),
								new RubyArray(ObjectFactory.createFixnum(456)),
								null,
								"+");
	}
}

public class RubyProgramTest extends TestCase {

	public void test_output() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream original = System.out;
		System.setOut(new PrintStream(output));
		
		RubyProgram p = new TestingProgram();
		RubyValue r = p.run();
		
		System.setOut(original);
		
		RubyFixnum i = (RubyFixnum)r;
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
