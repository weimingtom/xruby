/** 
 * Copyright (c) 2005-2006 Xue Yong Zhi. All rights reserved.
 */

package com.xruby;

import junit.framework.TestCase;

public class CommandLineOptionsTest extends TestCase {
	public void test_null() {
		CommandLineOptions options = new CommandLineOptions(null);
		assertTrue(!options.isCompileOnly());
		assertTrue(!options.isHelp());
		assertEquals(0, options.getFiles().size());
	}

	public void test_null_array() {
		CommandLineOptions options = new CommandLineOptions(new String[] {});
		assertTrue(!options.isCompileOnly());
		assertTrue(!options.isHelp());
		assertEquals(0, options.getFiles().size());
	}

	public void test_compile_onlu() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-c"});
		assertTrue(options.isCompileOnly());
		assertTrue(!options.isHelp());
		assertEquals(0, options.getFiles().size());
	}
	
	public void test_help() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-h"});
		assertTrue(!options.isCompileOnly());
		assertTrue(options.isHelp());
		assertEquals(0, options.getFiles().size());
	}

	public void test_one_file() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"test2.rb"});
		assertTrue(!options.isCompileOnly());
		assertTrue(!options.isHelp());
		assertEquals(1, options.getFiles().size());
		assertEquals("test2.rb", options.getFiles().get(0));
	}
	
	public void test_more_than_one() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-c", "c:\\test1", "test2.rb"});
		assertTrue(options.isCompileOnly());
		assertTrue(!options.isHelp());
		assertEquals(2, options.getFiles().size());
		assertEquals("c:\\test1", options.getFiles().get(0));
		assertEquals("test2.rb", options.getFiles().get(1));
	}
	
	public void test_eval_one_line() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-e", "'print \"foobar\"'"});
		assertTrue(options.isEvalOneLine());
		assertEquals("print \"foobar\"", options.getEvalScript());
	}
	
	public void test_eval_one_line_2() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-e", "'print", "\"foobar\"'"});
		assertTrue(options.isEvalOneLine());
		assertEquals("print \"foobar\"", options.getEvalScript());
	}
	
	public void test_dash_s() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-s", "filename", "-zzz"});
		assertEquals(1, options.getFiles().size());
		assertEquals("filename", options.getFiles().get(0));
		assertEquals(1, options.getVars().size());
		assertEquals("zzz", options.getVars().get(0));
	}
}
