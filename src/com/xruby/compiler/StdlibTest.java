package com.xruby.compiler;

import com.xruby.runtime.lang.RubyRuntime;

/**
 * Test if ruby's standand lib work under xruby
 */
public class StdlibTest extends CompilerTestCase {
	
	public void setUp() {
		RubyRuntime.init(null);
	}
	
	public void test_test_unit_assertionfailederror() {
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
	
	public void test_test_unit_failure() {
		String[] program_texts = {
				"require 'test/unit/failure'",
				"print Test::Unit::Failure.new('x', 'y', 'z').single_character_display",
				"print Test::Unit::Failure.new('x', 'y', 'z').short_display",
				"print Test::Unit::Failure.new('x1', [1, 2], 'z1').long_display",
				"print Test::Unit::Failure.new('x1', ['y'], 'z1').long_display",
				"print Test::Unit::Failure.new('x1', ['y'], 'z1').to_s",
		};
		
		String[] outputs = {
				"",
				"F",
				"x: z",
				"Failure:\nx1\n    [1\n     2]:\nz1",
				"Failure:\nx1y:\nz1",
				"Failure:\nx1y:\nz1",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_test_unit_util_backtracefilter() {
		String[] program_texts = {
				"print(require('test/unit/util/backtracefilter'))",
				"print Test::Unit::Util::BacktraceFilter",
		};
		
		String[] outputs = {
				"true",
				"Test::Unit::Util::BacktraceFilter",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_test_unit_util_procwrapper() {
		String[] program_texts = {
				"print(require('test/unit/util/procwrapper'))",
		};
		
		String[] outputs = {
				"true",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_test_unit_util_observable() {
		String[] program_texts = {
				"print(require('test/unit/util/observable'))",
		};
		
		String[] outputs = {
				"true",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_test_unit_testresult() {
		String[] program_texts = {
				"print(require('test/unit/testresult'))",
				"print Test::Unit::TestResult.new.to_s",
				"print Test::Unit::TestResult.new.passed?",
				"print Test::Unit::TestResult.new.failure_count",
				"print Test::Unit::TestResult.new.error_count",
				"print Test::Unit::TestResult.new.add_run",
				"a=Test::Unit::TestResult.new; print a.add_failure('xxx'), a.failure_count",
				"a=Test::Unit::TestResult.new; print a.add_error('xxx'), a.add_error('yyy'), a.error_count",
				"a=Test::Unit::TestResult.new; print a.add_assertion",
		};
		
		String[] outputs = {
				"true",
				"0 tests, 0 assertions, 0 failures, 0 errors",
				"true",
				"0",
				"0",
				"0",
				"01",
				"002",
				"0",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_test_unit_error() {
		String[] program_texts = {
				"print(require('test/unit/error'))",
				"print Test::Unit::Error.new('name', 'excepton').single_character_display",
				"print Test::Unit::Error.new('excepton', NameError.new('message')).message",
		};
		
		String[] outputs = {
				"true",
				"E",
				"NameError: message",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_test_unit_testsuite() {
		String[] program_texts = {
				"print(require('test/unit/testsuite'))",
				"print Test::Unit::TestSuite.new.to_s",
				"print Test::Unit::TestSuite.new('name').to_s",
				"print Test::Unit::TestSuite.new.empty?",
				"a = Test::Unit::TestSuite.new; a << 1; print a.empty?; a.delete 1; print a.empty?",
				"a = Test::Unit::TestSuite.new; a << 'x'; print a.size",
				"a = Test::Unit::TestSuite.new; b = Test::Unit::TestSuite.new; a << 1; print a == b",
				"a = Test::Unit::TestSuite.new; b = Test::Unit::TestSuite.new; print a == b",
				"Test::Unit::TestSuite.new('x').run('z') {|x, y| print x, y}",
		};
		
		String[] outputs = {
				"true",
				"Unnamed TestSuite",
				"name",
				"true",
				"falsetrue",
				"1",
				"false",
				"true",
				"Test::Unit::TestSuite::STARTEDxTest::Unit::TestSuite::FINISHEDx",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_test_unit_collector() {
		String[] program_texts = {
				"print(require('test/unit/collector'))",
		};
		
		String[] outputs = {
				"true",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
	
	public void test_rational() {
		String[] program_texts = {
				"require 'rational'",
				"print Rational(3,4).to_s",
				
				"print Rational(+7,4).to_i",
				"print Rational(-7,4).to_i",
				
				"print Rational(+7,4).to_f",
				
				"print Rational(3,4) / 2",
				"print Rational(3,4) / 2.0",
				
				"print Rational(3,4) * 2",
				
				"print Rational(7,4) % Rational(1,2)",
				"print Rational(3,4) % 1",
				"print Rational(3,4) % Rational(1,7)",
				
				"print Rational(3,4) ** 2",
				
				"print Rational(-3,5).abs",
				
				"print Rational(-3,2) == Rational(-3,2) ",
				
				"print Rational(-3,2) <=> Rational(-3,2) ",
		};
		
		String[] outputs = {
				"",
				"3/4",
				
				"1",
				"-2",
				
				"1.75",
				
				"3/8",
				"0.375",
				
				"3/2",
				
				"1/4",
				"3/4",
				"1/28",
				
				"9/16",
				
				"3/5",
				
				"true",
				
				"0",
		};
		
		compile_run_and_compare_output(program_texts, outputs);
	}
}
