package com.xruby.compiler;

import com.xruby.runtime.lang.RubyRuntime;

/**
 * Test if ruby's standand lib work under xruby
 */
public class StdlibTest extends CompilerTestCase {
	
	public void setUp() {
		RubyRuntime.initBuiltin(null);
	}
	
	public void test_test_unit_StandardError() {
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
	
	public void test_test_unit_Failure() {
		String[] program_texts = {
				"require 'test/unit/failure'",
				"print Test::Unit::Failure.new('x', 'y', 'z').single_character_display",
				"print Test::Unit::Failure.new('x', 'y', 'z').short_display",
				"print Test::Unit::Failure.new('x1', [1, 2], 'z1').long_display",
		};
		
		String[] outputs = {
				"",
				"F",
				"x: z",
				"Failure:\nx1\n    [1\n     2]:\nz1",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
}
