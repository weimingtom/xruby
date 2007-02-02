package com.xruby.compiler;

import com.xruby.runtime.lang.RubyRuntime;

public class TestUnitTest extends CompilerTestCase {
	
	public void setUp() {
		RubyRuntime.initBuiltin(null);
	}
	
	public void test_StandardError() {
		String[] program_texts = {
				"require 'test/unit/assertionfailederror'",
				"print Test::Unit::AssertionFailedError.superclass",
		};
		
		String[] outputs = {
				"",
				"StandardError",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_Failure() {
		String[] program_texts = {
				"require 'test/unit/failure'",
				"print Test::Unit::Failure.new('x', 'y', 'z').single_character_display",
		};
		
		String[] outputs = {
				"",
				"F",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
}
