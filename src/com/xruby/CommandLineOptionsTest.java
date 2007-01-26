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
		assertEquals(null, options.getFilename());
	}

	public void test_null_array() {
		CommandLineOptions options = new CommandLineOptions(new String[] {});
		assertTrue(!options.isCompileOnly());
		assertTrue(!options.isHelp());
		assertEquals(null, options.getFilename());
	}

	public void test_compile_onlu() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-c"});
		assertTrue(options.isCompileOnly());
		assertTrue(!options.isHelp());
		assertEquals(null, options.getFilename());
	}
	
	public void test_help() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-h"});
		assertTrue(!options.isCompileOnly());
		assertTrue(options.isHelp());
		assertEquals(null, options.getFilename());
	}

	public void test_one_file() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"test2.rb"});
		assertTrue(!options.isCompileOnly());
		assertTrue(!options.isHelp());
		assertEquals("test2.rb", options.getFilename());
		assertEquals(0, options.getArgs().length);
	}
	
	public void test_more_than_one() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-c", "c:\\test1", "xxx"});
		assertTrue(options.isCompileOnly());
		assertTrue(!options.isHelp());
		assertEquals("c:\\test1", options.getFilename());
		assertEquals(1, options.getArgs().length);
		assertEquals("xxx", options.getArgs()[0]);
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
		CommandLineOptions options = new CommandLineOptions(new String[] {"-s", "filename", "-zzz", "-yyy=555"});
		assertEquals("filename", options.getFilename());
		assertEquals(2, options.getVars().length);
		assertEquals("zzz", options.getVars()[0]);
		assertEquals("yyy=555", options.getVars()[1]);
		assertEquals(0, options.getArgs().length);
	}
	
	public void test_dash_s_2() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-s", "filename", "zzz", "-yyy=555"});
		assertEquals("filename", options.getFilename());
		assertEquals(1, options.getVars().length);
		assertEquals("yyy=555", options.getVars()[0]);
		assertEquals(1, options.getArgs().length);
		assertEquals("zzz", options.getArgs()[0]);
	}
	
	public void test_dash_i() {
		CommandLineOptions options = new CommandLineOptions(new String[] {"-i.bak", "-pe", "print 1", "filename"});
		assertEquals(".bak", options.getBackupExtension());
		assertEquals("filename", options.getFilename());
		assertEquals("while gets();print 1;end", options.getEvalScript());
	}
}
