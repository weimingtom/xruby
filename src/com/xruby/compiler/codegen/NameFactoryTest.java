/**
 * Copyright 2005-2007 Xue Yong Zhi
 * Distributed under the GNU General Public License 2.0
 */

package com.xruby.compiler.codegen;

import java.io.*;
import junit.framework.TestCase;

public class NameFactoryTest extends TestCase {

	public void setUp() {
		NameFactory.reset();
	}

	public void test_createClassName() {
		assertEquals("STDIN/main", NameFactory.createClassName(null, null));
		assertEquals("test/main", NameFactory.createClassName("test.rb", null));
		assertEquals("test/test$0", NameFactory.createClassName("test.rb", "test"));
		assertEquals("builtin/test$1", NameFactory.createClassName("src/builtin.rb", "test"));
	}

	public void test_createClassNameForBlock() {
		assertEquals("test/BLOCK$0", NameFactory.createClassNameForBlock("test.rb", ""));
		assertEquals("test/BLOCK$1", NameFactory.createClassNameForBlock("test.rb", ""));
	}

	public void test_createClassFileName () {
		assertEquals("main.class", NameFactory.createClassFileName("main"));
		assertEquals("to_s$1234.class", NameFactory.createClassFileName("to_s$1234"));
		assertEquals("empty?$4.class", NameFactory.createClassFileName("empty?$4"));
	}

	public void test_createJarFileName() {
		assertEquals((new File("test.jar")).toString(), NameFactory.createJarFileName("test.rb.bak").toString());
		assertEquals((new File("STDIN.jar")).toString(), NameFactory.createJarFileName(null).toString());
		assertEquals(new File("test.jar").toString(), NameFactory.createJarFileName("c:/ruby/lib/test.rb").toString());
	}

	public void test_change_suffix_to_jar() {
		assertEquals((new File("stringio.jar")).toString(), NameFactory.change_filename_suffix_to_jar("stringio").toString());
		assertEquals((new File("time.jar")).toString(), NameFactory.change_filename_suffix_to_jar("time.rb").toString());
		assertEquals((new File("openssl.jar")).toString(), NameFactory.change_filename_suffix_to_jar("openssl.so").toString());
		assertEquals((new File("test/unit.jar")).toString(), NameFactory.change_filename_suffix_to_jar("test/unit.rb").toString());
	}

	public void test_createMainClass() {
		assertEquals("test.main", NameFactory.createMainClass("test.rb"));
		assertEquals("builtin.main", NameFactory.createMainClass("src/builtin.rb"));
	}

	public void test_convertSlashToDot() {
		assertEquals("test.main", NameFactory.convertSlashToDot("test/main"));
		assertEquals("xruby.test.main", NameFactory.convertSlashToDot("xruby/test/main"));
	}

	public void test_filename2classname() {
		assertEquals("test.main", NameFactory.filename2classname("test/main.class"));
	}

	public void test_Character_isJavaIdentifierPart() {
		assertFalse(Character.isJavaIdentifierPart('?'));
		assertFalse(Character.isJavaIdentifierPart('!'));
	}
}
